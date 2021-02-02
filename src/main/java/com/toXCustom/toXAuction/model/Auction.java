package com.toXCustom.toXAuction.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Auction {
    @Id
    private long id;
    private String title;
    private String description;
    private String category;
    private long minimumCost;
    private long buyNow;
    private boolean promo;
    private String localization;
    private Timestamp auctionPutUp;
    private Timestamp auctionPutDown;
    private long visited;
}
