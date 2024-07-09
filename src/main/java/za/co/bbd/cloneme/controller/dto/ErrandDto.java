package za.co.bbd.cloneme.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrandDto {

    /* The id of the errand */
    Long id;

    /* The id/filename for the voicenote associated with this errand */
    String voicenoteId;

    /* The status of this errand, (open/closed) */
    String status;
}
