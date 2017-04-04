-- Conztanz SIMPLE_ENTITY table creation
CREATE TABLE ${persistence.schema.name}.simple_entity
(
   ID SERIAL NOT NULL, 
   VERSION SMALLINT NOT NULL, 
   CREATE_DATE TIMESTAMP WITHOUT TIME ZONE NOT NULL, 
   UPDATE_DATE TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   UUID_MOST BIGINT,
   UUID_LEAST BIGINT,
   NAME VARCHAR NOT NULL,
   CONSTRAINT "simple_entity.PRIMARY_KEY" PRIMARY KEY (ID),
   CONSTRAINT "simple_entity.UNIQUE_UUID" UNIQUE (UUID_MOST, UUID_LEAST)
) 
WITH
(
  OIDS = FALSE
);
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.ID IS 'Entity technical identifier';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.VERSION IS 'Entity version';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.CREATE_DATE IS 'Entity creation date';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UPDATE_DATE IS 'Entity update date';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UUID_MOST IS 'Entity UUID most significant bits';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UUID_LEAST IS 'Entity UUID least significant bits';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.NAME IS 'Entity test field';

ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY OWNER TO ${persistence.db.admin.name};
