-- Conztanz LOCK table creation
CREATE TABLE ${persistence.schema.name}.LOCK
(
   LOCK_NAME VARCHAR,
   
   CONSTRAINT "LOCK.PRIMARY_KEY" PRIMARY KEY (LOCK_NAME)
) 
WITH
(
  OIDS = FALSE
);

ALTER TABLE ${persistence.schema.name}.LOCK OWNER TO ${persistence.db.admin.name};