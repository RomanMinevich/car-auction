package ro.netex.carauction.bid;

import static javax.persistence.GenerationType.IDENTITY;

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
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long bidId;
    private Long adId;
    @Column(columnDefinition = "DECIMAL")
    private Double price;
    private String bidderName;
    private String bidderPhoneNumber;
}
