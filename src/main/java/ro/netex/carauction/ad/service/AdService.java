package ro.netex.carauction.ad.service;

import java.util.List;
import ro.netex.carauction.ad.Ad;
import ro.netex.carauction.ad.AdDto;

public interface AdService {

    Ad addAd(AdDto adDto);

    List<Ad> getAllAds();

    Ad getAdDetails(Long adId);
}
