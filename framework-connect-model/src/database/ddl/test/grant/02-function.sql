-- Grant ${persistence.user.name.test} user
GRANT EXECUTE ON ALL FUNCTIONS IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name.test}";
-- Grant ${persistence.user.name.select.test} user
GRANT EXECUTE ON ALL FUNCTIONS IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name.select.test}";

REVOKE ALL ON ALL FUNCTIONS IN SCHEMA ${persistence.schema.name} FROM public;