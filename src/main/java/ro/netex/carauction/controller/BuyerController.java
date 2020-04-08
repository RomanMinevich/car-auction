package ro.netex.carauction.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.netex.carauction.ad.service.AdService;
import ro.netex.carauction.bid.BidDto;
import ro.netex.carauction.bid.service.BidService;

@Controller
@RequestMapping("/ads")
public class BuyerController {
    @Autowired
    private AdService adService;
    @Autowired
    private BidService bidService;

    @GetMapping
    public String showAllAds(ModelMap modelMap){
        modelMap.put("ads", adService.getAllAds());
        return "allAds";
    }

    @GetMapping("/{id}/details")
    public String showAdDetails(@PathVariable Long id, ModelMap modelMap) {
        modelMap.put("ad", adService.getAdDetails(id));
        return "adDetails";
    }

    @GetMapping("/{id}/newBid")
    public String showBidPage(@PathVariable Long id, ModelMap modelMap){
        modelMap.put("ad", adService.getAdDetails(id));
        return "newBid";
    }

    @PostMapping("/{id}/newBid/add")
    public String addBid(
            @PathVariable Long id, @Valid @ModelAttribute BidDto bidDto) {
        bidService.addBid(id,bidDto);
        return "index";
    }
}
