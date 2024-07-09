package za.co.bbd.cloneme.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import za.co.bbd.cloneme.controller.dto.ErrandDto;
import za.co.bbd.cloneme.controller.dto.QuoteDto;
import za.co.bbd.cloneme.service.ClonemeService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@CrossOrigin
public class ClonemeController {

    @Autowired
    private ClonemeService clonemeService;

    @GetMapping("/errand")
    public List<ErrandDto> getErrand(@RequestParam(required = false) Long errandId) {
        log.info("Getting errands");
        return clonemeService.getErrand(errandId);
    }
    @PostMapping(value = "/errand", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ErrandDto postErrand(@RequestParam("file") MultipartFile file, @RequestParam("fileName") String fileName) {
        log.info("Creating errand with voicenote: {}", fileName);
        return clonemeService.createErrand(file, fileName);
    }

    @PutMapping("/errand")
    public ErrandDto putErrand(@RequestBody ErrandDto errandDto) {
        log.info("Updating errand status {} ", errandDto);
        return clonemeService.updateErrand(errandDto.getId(), errandDto.getStatus());
    }

    @PostMapping("/estimate")
    public BigDecimal postQuote(@RequestBody QuoteDto quote) {
        log.info("Estimates received for new quote: {}", quote);
        return clonemeService.createQuote(quote);
    }

    @GetMapping("/quote")
    public List<QuoteDto> getQuote(@RequestParam Long errandId) {
        log.info("Getting quote for errand: {}", errandId);
        return clonemeService.getQuote(errandId);
    }

}
