package ro.netex.carauction.bid.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.netex.carauction.bid.Bid;
import ro.netex.carauction.bid.BidDto;
import ro.netex.carauction.bid.BidRepository;

@Service
public class BidServiceImplementation implements BidService {
    @Autowired
    private BidRepository bidRepository;

    @Override
    public Bid addBid(Long adId, BidDto bidDto) {
        Bid bid = new Bid();
        bid.setAdId(adId);
        bid.setPrice(bidDto.getPrice());
        bid.setBidderName(bidDto.getBidderName());
        bid.setBidderPhoneNumber(bidDto.getBidderPhoneNumber());
        return updateBid(bid);
    }

    @Override
    public List<Bid> getWinningBids() {
        return bidRepository.findAll();
    }

    private Bid updateBid(Bid newBid) {
        return bidRepository.findById(newBid.getAdId())
                .filter(oldBid -> oldBid.getPrice() >= newBid.getPrice())
                .orElseGet(() -> bidRepository.save(newBid));
    }
}
