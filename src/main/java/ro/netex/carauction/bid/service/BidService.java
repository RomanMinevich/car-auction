package ro.netex.carauction.bid.service;

import java.util.List;
import ro.netex.carauction.bid.Bid;
import ro.netex.carauction.bid.BidDto;

public interface BidService {

    Bid addBid(Long adId, BidDto bidDto);

    List<Bid> getWinningBids();
}
