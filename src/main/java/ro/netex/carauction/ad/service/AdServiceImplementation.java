package ro.netex.carauction.ad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.netex.carauction.ad.Ad;
import ro.netex.carauction.ad.AdDto;
import ro.netex.carauction.ad.AdRepository;

@Service
public class AdServiceImplementation implements AdService {
    @Autowired
    private AdRepository adRepository;

    //@Transactional("adTransactionManager")
    @Override
    public Ad addAd(AdDto adDto) {
        Ad ad = new Ad();
        ad.setAdTitle(adDto.getAdTitle());
        ad.setManufacturer(adDto.getManufacturer());
        ad.setModel(adDto.getModel());
        ad.setYearOfIssue(adDto.getYearOfIssue());
        ad.setDescription(adDto.getDescription());
        ad.setOwnerName(adDto.getOwnerName());
        ad.setOwnerPhoneNumber(adDto.getOwnerPhoneNumber());
        return adRepository.save(ad);
    }

    //@Transactional("adTransactionManager")
    @Override
    public List<Ad> getAllAds() {
        return adRepository.findAll();
    }

    //@Transactional("adTransactionManager")
    @Override
    public Ad getAdDetails(Long adId) {
        return adRepository.getOne(adId);
    }
}
