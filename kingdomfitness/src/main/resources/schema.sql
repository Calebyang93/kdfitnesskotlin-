-- schema sql 
CREATE TABLE IF NOT EXISTS messages (
    id  VARCHAR PRIMARY KEY, 
    text VARCHAR NOT NULL 
);

CREATE TABLE IF NOT EXISTS supplements (
    id VARCHAR PRIMARY KEY, 
    prdt VARCHAR NOT NULL, 
    brand VARCHAR NOT NULL, 
    price FLOAT NOT NULL, 
    currency VARCHAR NOT NULL, 
)

CREATE TABLE IF NOT EXISTS racquets (
    id VARCHAR PRIMARY KEY,
    brand VARCHAR NOT NULL,
    prdtmodel VARCHAR NOT NULL, 
    price FLOAT NOT NULL,
    currency VARCHAR NOT NULL,
)