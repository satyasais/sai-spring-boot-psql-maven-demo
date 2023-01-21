-- Table: public.tutorials
-- Database: testdb

-- DROP DATABASE IF EXISTS testdb;

CREATE DATABASE testdb
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_India.1252'
    LC_CTYPE = 'English_India.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


-- DROP TABLE IF EXISTS public.tutorials;

CREATE TABLE IF NOT EXISTS public.tutorials
(
    id numeric NOT NULL,
    published boolean,
    description character(32) COLLATE pg_catalog."default",
    title character(32) COLLATE pg_catalog."default",
    CONSTRAINT p_id PRIMARY KEY (id)
        INCLUDE(id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tutorials
    OWNER to postgres;