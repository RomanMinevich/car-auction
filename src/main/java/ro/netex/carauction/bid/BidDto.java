package ro.netex.carauction.bid;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BidDto {
    @Positive
    @Digits(integer = Integer.MAX_VALUE, fraction = 2)
    private Double price;
    @Size(max = 255)
    private String bidderName;
    @NotBlank
    @Digits(integer = 12, fraction = 0)
    @Size(min = 12)
    private String bidderPhoneNumber;
}
