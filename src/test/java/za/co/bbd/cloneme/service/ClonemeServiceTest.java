//package za.co.bbd.cloneme.service;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.mock.web.MockMultipartFile;
//import za.co.bbd.cloneme.controller.dto.ErrandDto;
//import za.co.bbd.cloneme.controller.dto.QuoteDto;
//import za.co.bbd.cloneme.controller.mapper.ClonemeMapperImpl;
//import za.co.bbd.cloneme.infrastructure.data.entity.QuoteDao;
//import za.co.bbd.cloneme.service.errand.ErrandService;
//import za.co.bbd.cloneme.service.quote.QuoteService;
//import za.co.bbd.cloneme.infrastructure.data.entity.ErrandDao;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//import static za.co.bbd.cloneme.Utils.getQuoteDto;
//
//@ExtendWith(MockitoExtension.class)
//public class ClonemeServiceTest {
//
//    @InjectMocks
//    private ClonemeServiceImpl mockService;
//
//    @Mock
//    private QuoteService mockQuoteService;
//
//    @Mock
//    private ErrandService mockErrandService;
//
//    @Mock
//    private ClonemeMapperImpl mockMapper;
//
//    @Test
//    void whenGetErrand_success() {
//        when(mockErrandService.getErrand(anyLong()))
//                .thenReturn(List.of(new ErrandDao()));
//
//        when(mockMapper.errandDtoListFromErrandDaoList(any()))
//                .thenReturn(List.of(new ErrandDto()));
//
//        assertEquals(List.of(new ErrandDto()), mockService.getErrand(1L));
//    }
//
//    @Test
//    void whenCreateErrand_success() {
//        // Create a mock MultipartFile
//        byte[] content = "testContent".getBytes();
//        MockMultipartFile mockMultipartFile = new MockMultipartFile("TestFile", "MockFileName.m4a", "audio/m4a", content);
//
//        when(mockErrandService.createErrand(any(), anyString()))
//                .thenReturn(new ErrandDao());
//
//        when(mockMapper.errandDtoFromErrandDao(any(ErrandDao.class)))
//                .thenReturn(new ErrandDto());
//
//        assertEquals(new ErrandDto(), mockService.createErrand(mockMultipartFile, "filename"));
//    }
//
//    @Test
//    void whenUpdateErrand_success() {
//        when(mockMapper.errandDtoFromErrandDao(any()))
//                .thenReturn(new ErrandDto());
//
//        assertEquals(new ErrandDto(), mockService.updateErrand(1L, "CLOSED"));
//    }
//
//    @Test
//    void whenCreateQuote_success() {
//        when(mockQuoteService.createQuote(any()))
//                .thenReturn(BigDecimal.TEN);
//
//        assertEquals(BigDecimal.TEN, mockService.createQuote(getQuoteDto()));
//    }
//
//    @Test
//    void whenGetQuote_success() {
//        when(mockQuoteService.getQuoteByErrandId(any()))
//                .thenReturn(List.of(new QuoteDao()));
//
//        when(mockMapper.quoteDtoListFromQuoteDaoList(any()))
//                .thenReturn(List.of(new QuoteDto()));
//
//        assertEquals(List.of(new QuoteDto()), mockService.getQuote(1L));
//    }
//
//}
