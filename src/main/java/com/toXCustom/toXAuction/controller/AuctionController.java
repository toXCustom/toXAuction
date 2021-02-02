package com.toXCustom.toXAuction.controller;

import com.toXCustom.toXAuction.model.Auction;
import com.toXCustom.toXAuction.service.AuctionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuctionController {

    private final AuctionService auctionService;

    @GetMapping("/auctions/{id}")
    public Auction getSingleAuction(@PathVariable long id) {
        return auctionService.getSingleAuction(id);
    }
}
