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
    @NotBlank
    @Size(max = 255)
    private String adTitle;
    @NotBlank
    @Size(max = 255)
    private String manufacturer;
    @NotBlank
    @Size(max = 255)
    private String model;
    @Past
    private Year yearOfIssue;
    @Size(max = 4000)
    private String description;
    @Size(max = 255)
    private String ownerName;
    @Size(min = 12)
    @Digits(integer = 12, fraction = 0)
    private String ownerPhoneNumber;
}
