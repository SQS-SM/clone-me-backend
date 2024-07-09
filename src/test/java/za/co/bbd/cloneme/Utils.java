package za.co.bbd.cloneme;

import za.co.bbd.cloneme.controller.dto.QuoteDto;

import java.math.BigDecimal;

public class Utils {

    public static QuoteDto getQuoteDto() {
        return QuoteDto.builder()
                .errandId(1L)
                .distance(BigDecimal.TEN)
                .time(BigDecimal.ONE)
                .build();
    }
}
