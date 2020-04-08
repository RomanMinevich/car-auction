package ro.netex.carauction.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.netex.carauction.ad.AdDto;
import ro.netex.carauction.ad.service.AdService;

@Controller
@RequestMapping("/newAd")
public class SellerController {
    @Autowired
    private AdService adService;

    @GetMapping
    public String showAddAdPage(){
        return "newAd";
    }

    @PostMapping("/add")
    public String addAd(@Valid @ModelAttribute AdDto adDto) {
        adService.addAd(adDto);
        return "index";
    }
}
