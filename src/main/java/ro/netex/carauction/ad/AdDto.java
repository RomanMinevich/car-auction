package ro.netex.carauction.ad;

import java.time.Year;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AdDto {
    @NotBlank(message = "Cannot be blank!")
    @Size(max = 255, message = "Bad credentials!")
    private String adTitle;
    @NotBlank(message = "Cannot be blank!")
    @Size(max = 255, message = "Bad credentials!")
    private String manufacturer;
    @NotBlank(message = "Cannot be blank!")
    @Size(max = 255, message = "Bad credentials!")
    private String model;
    @Past(message = "Bad credentials!")
    private Year yearOfIssue;
    @Size(max = 4000, message = "Bad credentials!")
    private String description;
    @Size(max = 255, message = "Bad credentials!")
    private String ownerName;
    @Size(min = 12, message = "Bad credentials!")
    @Digits(integer = 12, fraction = 0, message = "Bad credentials!")
    private String ownerPhoneNumber;
}
