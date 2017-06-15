-- Conztanz SIMPLE_ENTITY table creation
CREATE TABLE ${persistence.schema.name}.SBR_INCOMING_MESSAGE
(
   ID SERIAL NOT NULL, 
   VERSION SMALLINT NOT NULL, 
   CREATE_TIMESTAMP_DB TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   UPDATE_TIMESTAMP_DB TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   UUID_DB UUID,
   
   MESSAGE_VERSION VARCHAR(10) NOT NULL,
   OBJECT_ID VARCHAR(50) NOT NULL,
   ORIGINAL_PAYLOAD bytea NOT NULL,
   TRANSFORMED_PAYLOAD xml,
	   
   
   
   CONSTRAINT "SBR_INCOMING_MESSAGE.PRIMARY_KEY" PRIMARY KEY (ID),
   CONSTRAINT "SBR_INCOMING_MESSAGE.UNIQUE_UUID" UNIQUE (UUID_DB)
) 
WITH
(
  OIDS = FALSE
);

ALTER TABLE ${persistence.schema.name}.SBR_INCOMING_MESSAGE OWNER TO ${persistence.db.admin.name};
