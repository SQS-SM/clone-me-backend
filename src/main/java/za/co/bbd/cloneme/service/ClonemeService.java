package za.co.bbd.cloneme.service;

import org.springframework.web.multipart.MultipartFile;
import za.co.bbd.cloneme.controller.dto.ErrandDto;
import za.co.bbd.cloneme.controller.dto.QuoteDto;

import java.math.BigDecimal;
import java.util.List;

public interface ClonemeService {

    List<ErrandDto> getErrand(Long errandId);

    ErrandDto createErrand(MultipartFile voicenote, String fileName);

    ErrandDto updateErrand(Long errandId, String status);

    BigDecimal createQuote(QuoteDto quote);

    List<QuoteDto> getQuote(Long errandId);
}
