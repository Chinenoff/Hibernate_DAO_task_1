DROP TABLE IF EXISTS persons;

CREATE TABLE persons
    (
        id             int generated by default as identity primary key,
        name           varchar(50)   not null,
        surname        varchar(50)   not null,
        age            bigint        not null,
        phone_number   varchar(50),
        city_of_living varchar(50),
        CHECK (Age > 0 AND Age < 100)
    );