package com.toXCustom.toXAuction.repository;

import com.toXCustom.toXAuction.model.Auction;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Long> {

    @Query("SELECT a FROM Auction a")
    List<Auction> findAllAuctions(Pageable page);
}
