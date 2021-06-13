-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE public.candidates
(
    id integer NOT NULL,
    first_name character varying(35),
    last_name character varying(35),
    identity_number character varying(11),
    birth_year integer,
    verifed_id integer,
    PRIMARY KEY (id)
);

CREATE TABLE public.personel
(
    id integer NOT NULL,
    first_name character varying(35) NOT NULL,
    last_name character varying(35) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employers
(
    id integer NOT NULL,
    company_name character varying(255) NOT NULL,
    web_address character varying(50) NOT NULL,
    phone_number character varying(12) NOT NULL,
    jobs_id integer,
    PRIMARY KEY (id)
);

CREATE TABLE public.job_title
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    title character varying(255),
    city_id integer,
    "position" character varying(255),
    last_date integer,
    salary integer,
    PRIMARY KEY (id)
);

CREATE TABLE public.users
(
    id integer NOT NULL GENERATED BY DEFAULT AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    email character varying(320) NOT NULL,
    password character varying(25) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.cities
(
    city_id integer NOT NULL,
    city_name character,
    PRIMARY KEY (city_id)
);

CREATE TABLE public.verifed
(
    verifed_id integer NOT NULL,
    verifed boolean,
    verifed_date character,
    PRIMARY KEY (verifed_id)
);

ALTER TABLE public.employers
    ADD FOREIGN KEY (jobs_id)
    REFERENCES public.job_title (id)
    NOT VALID;


ALTER TABLE public.job_title
    ADD FOREIGN KEY (city_id)
    REFERENCES public.cities (city_id)
    NOT VALID;


ALTER TABLE public.candidates
    ADD FOREIGN KEY (verifed_id)
    REFERENCES public.verifed (verifed_id)
    NOT VALID;

END;