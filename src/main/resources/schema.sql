

CREATE TABLE IF not exist public.employee_details (
    employee_id serial NOT NULL,
    employee_name character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    employee_designation character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
); 