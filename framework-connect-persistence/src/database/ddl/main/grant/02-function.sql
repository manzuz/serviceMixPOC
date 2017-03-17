-- Grant ${persistence.user.name} user
GRANT EXECUTE ON ALL FUNCTIONS IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name}";
-- Grant ${persistence.user.name.select} user
GRANT EXECUTE ON ALL FUNCTIONS IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name.select}";

REVOKE ALL ON ALL FUNCTIONS IN SCHEMA ${persistence.schema.name} FROM public;