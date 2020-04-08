package ro.netex.carauction.ad;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.Year;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ad_id")
    private Long adId;
    @Column(name = "ad_title")
    private String adTitle;
    private String manufacturer;
    private String model;
    @Column(name = "year_of_issue")
    private Year yearOfIssue;
    private String description;
    @Column(name = "owner_name")
    private String ownerName;
    @Column(name = "owner_phone_number")
    private String ownerPhoneNumber;
}
