--liquibase formatted sql
--changeset pmroz:1
CREATE TABLE AUCTION (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(400) NOT NULL,
    description VARCHAR(2000) NULL,
    category VARCHAR(200) NULL,
    minimumCost BIGINT NULL,
    buyNow BIGINT NULL,
    promo BOOLEAN,
    localization VARCHAR(200),
    auctionPutUp TIMESTAMP,
    auctionPutDown TIMESTAMP,
    visited BIGINT NULL
);