CREATE TABLE real_estate
(
    id              SERIAL PRIMARY KEY,
    type            VARCHAR(200) NOT NULL,
    country         VARCHAR(200) NOT NULL,
    district        VARCHAR(200) NOT NULL,
    city            VARCHAR(200) NOT NULL,
    street          VARCHAR(200) NOT NULL,
    address_number  INT          NOT NULL,
    number_of_rooms INT          NOT NULL,
    area            INT          NOT NULL,
    price           INT          NOT NULL,
    floor           INT          NOT NULL
);