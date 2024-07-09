package za.co.bbd.cloneme.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import za.co.bbd.cloneme.controller.dto.ErrandDto;
import za.co.bbd.cloneme.controller.dto.QuoteDto;
import za.co.bbd.cloneme.model.ErrandStatus;
import za.co.bbd.cloneme.service.ClonemeServiceImpl;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClonemeControllerTest {

    @InjectMocks
    private ClonemeController mockController;

    @Mock
    private ClonemeServiceImpl mockService;

    @Test
    void whenGetErrand_success() {
        when(mockService.getErrand(anyLong()))
                .thenReturn(List.of(new ErrandDto()));

        assertEquals(List.of(new ErrandDto()), mockController.getErrand(1L));
    }

    @Test
    void whenPostErrand_success() {
        byte[] content = "testContent".getBytes();
        MockMultipartFile mockMultipartFile = new MockMultipartFile("MockFileName", "MockFileName.m4a", "audio/m4a", content);

        when(mockService.createErrand(any(), anyString()))
                .thenReturn(new ErrandDto());

        assertEquals(new ErrandDto(), mockController.postErrand(mockMultipartFile, "filename"));
    }

    @Test
    void whenUpdateErrand_success() {
        when(mockService.updateErrand(anyLong(), anyString()))
                .thenReturn(new ErrandDto());
        ErrandDto errandDto = ErrandDto.builder()
                .id(1L)
                .status(ErrandStatus.CLOSED.name())
                .build();
        assertEquals(new ErrandDto(), mockController.putErrand(errandDto));
    }

    @Test
    void whenPostQuote_success() {
        when(mockService.createQuote(any(QuoteDto.class)))
                .thenReturn(BigDecimal.TEN);

        assertEquals(BigDecimal.TEN, mockController.postQuote(new QuoteDto()));
    }

    @Test
    void whenGetQuote_success() {
        when(mockService.getQuote(anyLong()))
                .thenReturn(List.of(new QuoteDto()));

        assertEquals(List.of(new QuoteDto()), mockController.getQuote(1L));
    }

}
