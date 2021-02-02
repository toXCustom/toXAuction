package com.toXCustom.toXAuction.service;

import com.toXCustom.toXAuction.model.Auction;
import com.toXCustom.toXAuction.repository.AuctionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuctionService {

    public static final int PAGE_SIZE = 20;
    private final AuctionRepository auctionRepository;

    public Auction getSingleAuction(long id) {
        return auctionRepository.findById(id)
                .orElseThrow();
    }
}
