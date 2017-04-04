-- Conztanz SIMPLE_ENTITY table upgrade
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY RENAME COLUMN CREATE_DATE TO CREATE_TIMESTAMP;
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY RENAME COLUMN UPDATE_DATE TO UPDATE_TIMESTAMP;

COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.CREATE_TIMESTAMP IS 'Entity creation timestamp';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UPDATE_TIMESTAMP IS 'Entity update timestamp';

