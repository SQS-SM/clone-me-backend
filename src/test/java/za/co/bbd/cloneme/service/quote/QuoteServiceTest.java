//package za.co.bbd.cloneme.service.quote;
//
//import jakarta.persistence.EntityNotFoundException;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import za.co.bbd.cloneme.infrastructure.data.entity.QuoteDao;
//import za.co.bbd.cloneme.infrastructure.data.repository.QuoteRepository;
//import za.co.bbd.cloneme.model.exception.ClonemeException;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static za.co.bbd.cloneme.Utils.getQuoteDto;
//
//@ExtendWith(MockitoExtension.class)
//public class QuoteServiceTest {
//
//    @InjectMocks
//    private QuoteServiceImpl mockQuoteService;
//
//    @Mock
//    private QuoteRepository mockQuoteRepository;
//
//    @Test
//    void whenGetQuoteByErrandId_success() {
//        when(mockQuoteRepository.findByErrandId(anyLong()))
//                .thenReturn(List.of(new QuoteDao()));
//
//        List<QuoteDao> actual = mockQuoteService.getQuoteByErrandId(1L);
//
//        assertEquals(List.of(new QuoteDao()), actual);
//    }
//
//    @Test
//    void whenGetQuoteByErrandId_failEntityNotFound_throwsException() {
//        when(mockQuoteRepository.findByErrandId(anyLong()))
//                .thenThrow(new EntityNotFoundException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockQuoteService.getQuoteByErrandId(1L));
//
//        assertEquals("No quote found with errandId: 1", exception.getMessage());
//    }
//
//    @Test
//    void whenGetQuoteByErrandId_failException_throwsException() {
//        when(mockQuoteRepository.findByErrandId(anyLong()))
//                .thenThrow(new RuntimeException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockQuoteService.getQuoteByErrandId(1L));
//
//        assertEquals("Failed to get quotes: fail", exception.getMessage());
//    }
//
//    @Test
//    void whenCreateQuote_success() {
//        when(mockQuoteRepository.save(any(QuoteDao.class)))
//                .thenReturn(new QuoteDao());
//
//        BigDecimal actual = mockQuoteService.createQuote(getQuoteDto());
//
//        assertEquals(new BigDecimal("200.00"), actual);
//        verify(mockQuoteRepository, times(1)).save(any(QuoteDao.class));
//    }
//
//    @Test
//    void whenCreateQuote_failSaveQuote_throwsException() {
//        when(mockQuoteRepository.save(any(QuoteDao.class)))
//                .thenThrow(new RuntimeException("fail"));
//
//        ClonemeException exception =
//                assertThrows(ClonemeException.class, () -> mockQuoteService.createQuote(getQuoteDto()));
//
//        assertEquals("Failed to store Quote in DB: fail", exception.getMessage());
//    }
//
//
//}
