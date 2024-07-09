package za.co.bbd.cloneme.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import za.co.bbd.cloneme.controller.dto.ErrandDto;
import za.co.bbd.cloneme.controller.dto.QuoteDto;
import za.co.bbd.cloneme.service.errand.ErrandService;
import za.co.bbd.cloneme.service.quote.QuoteService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ClonemeServiceImpl implements ClonemeService {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private ErrandService errandService;

//    @Autowired
//    private ClonemeMapperImpl mapper;

    @Override
    public List<ErrandDto> getErrand(Long errandId) {
        return new ArrayList<>();
//        List<ErrandDao> errandDaos = errandService.getErrand(errandId);
//        return mapper.errandDtoListFromErrandDaoList(errandDaos);
    }

    @Override
    public ErrandDto createErrand(MultipartFile voicenote, String fileName) {
        return new ErrandDto();
//        ErrandDao dao = errandService.createErrand(voicenote, fileName);
//        return mapper.errandDtoFromErrandDao(dao);
    }

    @Override
    public ErrandDto updateErrand(Long errandId, String status) {
        return new ErrandDto();
//        ErrandDao errandDao = errandService.updateErrand(errandId, status);
//        return mapper.errandDtoFromErrandDao(errandDao);
    }

    @Override
    public BigDecimal createQuote(QuoteDto quote) {
        return BigDecimal.ZERO;
        //return quoteService.createQuote(quote);
    }

    @Override
    public List<QuoteDto> getQuote(Long errandId) {
        return new ArrayList<>();
//        List<QuoteDao> quoteDao = quoteService.getQuoteByErrandId(errandId);
//        return mapper.quoteDtoListFromQuoteDaoList(quoteDao);
    }

}
