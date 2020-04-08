package ro.netex.carauction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.netex.carauction.bid.service.BidService;

@Controller
@RequestMapping("/winners")
public class ManagerController {
    @Autowired
    private BidService bidService;

    @GetMapping
    public String showAllBids(ModelMap modelMap) {
        modelMap.put("bids", bidService.getWinningBids());
        return "winningBids";
    }
}
