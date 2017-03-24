-- Conztanz SIMPLE_ENTITY table creation
CREATE TABLE ${persistence.schema.name}.simple_entity
(
   ID SERIAL NOT NULL, 
   VERSION SMALLINT NOT NULL, 
   CREATE_TIMESTAMP_DB TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   UPDATE_TIMESTAMP_DB TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   UUID_DB UUID,
   
   PHONE_COUNTRY_CODE VARCHAR(2),
   PHONE_COUNTRY_CODE_NUMBER VARCHAR(5),
   PHONE_NUMBER VARCHAR(15),
   PHONE_TAGS VARCHAR(100),
   
   NAME VARCHAR NOT NULL,
   JSON_FIELD JSONB,
   
   CONSTRAINT "simple_entity.PRIMARY_KEY" PRIMARY KEY (ID),
   CONSTRAINT "simple_entity.UNIQUE_UUID" UNIQUE (UUID_DB)
) 
WITH
(
  OIDS = FALSE
);
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.ID IS 'Entity technical identifier';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.VERSION IS 'Entity version';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.CREATE_TIMESTAMP_DB IS 'Entity creation timestamp';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UPDATE_TIMESTAMP_DB IS 'Entity update timestamp';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UUID_DB IS 'Entity UUID ';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.NAME IS 'Entity test field';

ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY OWNER TO ${persistence.db.admin.name};
