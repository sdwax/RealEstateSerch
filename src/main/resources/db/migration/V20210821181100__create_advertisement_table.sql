CREATE TABLE advertisement
(
    id              SERIAL PRIMARY KEY,
    address         VARCHAR(200) NOT NULL,
    number_of_rooms INT          NOT NULL,
    square          INT          NOT NULL,
    price           INT          NOT NULL,
    floor           INT          NOT NULL
);