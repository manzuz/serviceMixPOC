-- Conztanz SIMPLE_ENTITY table upgrade
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY ADD COLUMN UUID_DB UUID;
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY DROP COLUMN UUID_MOST; 
ALTER TABLE ${persistence.schema.name}.SIMPLE_ENTITY DROP COLUMN UUID_LEAST; 
