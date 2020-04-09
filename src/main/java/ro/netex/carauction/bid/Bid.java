package ro.netex.carauction.bid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "bids")
public class Bid {
    @Id
    @Column(name = "ad_id")
    private Long adId;
    @Column(columnDefinition = "DECIMAL")
    private Double price;
    @Column(name = "bidder_name")
    private String bidderName;
    @Column(name = "bidder_phone_number")
    private String bidderPhoneNumber;
}
