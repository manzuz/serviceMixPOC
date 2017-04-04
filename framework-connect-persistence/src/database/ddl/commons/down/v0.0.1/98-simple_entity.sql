-- Conztanz SIMPLE_ENTITY table downgrade
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY RENAME COLUMN CREATE_TIMESTAMP TO CREATE_DATE;
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY RENAME COLUMN UPDATE_TIMESTAMP TO UPDATE_DATE;

COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.CREATE_DATE IS 'Entity creation date';
COMMENT ON COLUMN ${persistence.schema.name}.SIMPLE_ENTITY.UPDATE_DATE IS 'Entity update date';
