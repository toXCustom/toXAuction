--liquibase formatted sql
--changeset pmroz:1
UPDATE `databasechangelog` SET `MD5SUM`=`7:bde7b076d47aefe8278d126cde26b172` WHERE `ID`=`00000000000001`;
CREATE TABLE AUCTION (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(400) NOT NULL,
    description VARCHAR(2000) NULL,
    category VARCHAR(200) NULL,
    minimum_cost BIGINT NULL,
    buy_now BIGINT NULL,
    promo BOOLEAN,
    localization VARCHAR(200),
    auction_put_up TIMESTAMP,
    auction_put_down TIMESTAMP,
    visited BIGINT NULL
);