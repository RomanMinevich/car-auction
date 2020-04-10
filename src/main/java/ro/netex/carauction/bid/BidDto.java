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
    @Positive(message = "Bad credentials!")
    @Digits(integer = Integer.MAX_VALUE, fraction = 2, message = "Bad credentials!")
    private Double price;
    @Size(max = 255, message = "Bad credentials!")
    private String bidderName;
    @NotBlank(message = "Cannot be blank")
    @Size(min = 12, message = "Bad credentials!")
    @Digits(integer = 12, fraction = 0, message = "Bad credentials!")
    private String bidderPhoneNumber;
}
