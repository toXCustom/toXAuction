--liquibase formatted sql
--changeset pmroz:2
INSERT INTO auction(id, auctionPutDown, auctionPutUp, buyNow, category, description, localization, minimumCost, promo, title, visited) VALUES (1, '2020-02-10T15:10:10.381556900', '2020-02-12T08:13:32.381556900', 30, 'car', 'used car', 'Sosnowiec', 10, false, 'used car from Sosnowiec', 1);