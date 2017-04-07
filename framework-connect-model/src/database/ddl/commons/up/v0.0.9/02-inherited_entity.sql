-- Conztanz INHERITED_ENTITY table creation
CREATE TABLE ${persistence.schema.name}.INHERITED_ENTITY
(
   ID SERIAL NOT NULL, 
   VERSION SMALLINT NOT NULL, 
   CREATE_TIMESTAMP_DB TIMESTAMP WITHOUT TIME ZONE NOT NULL, 
   UPDATE_TIMESTAMP_DB TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   UUID_MOST BIGINT,
   UUID_LEAST BIGINT,
   
   TYPE VARCHAR NOT NULL,
   SIMPLE_ID INTEGER NOT NULL,
   PARENT_FIELD VARCHAR NOT NULL,
   SHARE_FIELD VARCHAR NOT NULL,
   CHILD1_FIELD VARCHAR,
   CHILD2_FIELD VARCHAR,
   
   CONSTRAINT "INHERITED_ENTITY.PRIMARY_KEY" PRIMARY KEY (ID),
   CONSTRAINT "INHERITED_ENTITY.UNIQUE_UUID" UNIQUE (UUID_MOST, UUID_LEAST),
   CONSTRAINT "INHERITED_ENTITY.SIMPLE.FK" FOREIGN KEY (SIMPLE_ID) REFERENCES ${persistence.schema.name}.SIMPLE_ENTITY (ID)
) 
WITH
(
  OIDS = FALSE
);

ALTER TABLE ${persistence.schema.name}.INHERITED_ENTITY OWNER TO ${persistence.db.admin.name};