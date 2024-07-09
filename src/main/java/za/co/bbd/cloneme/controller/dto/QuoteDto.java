package za.co.bbd.cloneme.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuoteDto {

    /* The id of the errand that this quote is for */
    Long errandId;

    /* distance in kilometers */
    BigDecimal distance;

    /* time in minutes */
    BigDecimal time;

    /* the cost to the requester */
    BigDecimal cost;
}
