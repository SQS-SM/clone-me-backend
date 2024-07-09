//package za.co.bbd.cloneme.controller.mapper;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import za.co.bbd.cloneme.controller.dto.ErrandDto;
//import za.co.bbd.cloneme.controller.dto.QuoteDto;
//import za.co.bbd.cloneme.infrastructure.data.entity.ErrandDao;
//import za.co.bbd.cloneme.infrastructure.data.entity.QuoteDao;
//import za.co.bbd.cloneme.model.ErrandStatus;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//@ExtendWith(MockitoExtension.class)
//public class ClonemeMapperTest {
//
//    @InjectMocks
//    private ClonemeMapperImpl mockMapper;
//
//    @Test
//    void whenQuoteDtoListFromQuoteDaoList_success() {
//        assertNull(mockMapper.quoteDtoListFromQuoteDaoList(null));
//        assertEquals(List.of(getQuoteDto()), mockMapper.quoteDtoListFromQuoteDaoList(List.of(getQuoteDao())));
//    }
//
//    @Test
//    void whenQuoteDtoFromQuoteDao_success() {
//        assertNull(mockMapper.quoteDtoFromQuoteDao(null));
//        assertEquals(getQuoteDto(), mockMapper.quoteDtoFromQuoteDao(getQuoteDao()));
//    }
//
//    @Test
//    void whenErrandDtoListFromErrandDaoList_success() {
//        assertNull(mockMapper.errandDtoListFromErrandDaoList(null));
//        assertEquals(List.of(getErrandDto()), mockMapper.errandDtoListFromErrandDaoList(List.of(getErrandDao())));
//    }
//
//    @Test
//    void whenErrandDtoFromErrandDao_success() {
//        assertNull(mockMapper.errandDtoFromErrandDao(null));
//        assertEquals(getErrandDto(), mockMapper.errandDtoFromErrandDao(getErrandDao()));
//    }
//
//    private QuoteDto getQuoteDto() {
//        return QuoteDto.builder()
//                .errandId(1L)
//                .cost(BigDecimal.TEN)
//                .time(BigDecimal.ONE)
//                .distance(BigDecimal.ZERO)
//                .build();
//    }
//
//    private QuoteDao getQuoteDao() {
//        return QuoteDao.builder()
//                .id(1L)
//                .errandId(1L)
//                .cost(BigDecimal.TEN)
//                .timeEstimate(BigDecimal.ONE)
//                .distanceEstimate(BigDecimal.ZERO)
//                .dateCreated(LocalDateTime.of(2000, 12, 10, 11, 20, 30))
//                .build();
//    }
//
//    private ErrandDto getErrandDto() {
//        return ErrandDto.builder()
//                .id(1L)
//                .voicenoteId("filename")
//                .status("OPEN")
//                .build();
//    }
//
//    private ErrandDao getErrandDao() {
//        return ErrandDao.builder()
//                .id(1L)
//                .voicenoteId("filename")
//                .status(ErrandStatus.OPEN)
//                .dateCreated(LocalDateTime.of(2000, 12, 10, 11, 20, 30))
//                .build();
//    }
//}
