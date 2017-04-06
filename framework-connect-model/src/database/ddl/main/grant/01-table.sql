-- Grant ${persistence.user.name} user
GRANT SELECT, UPDATE, INSERT, DELETE ON ALL TABLES IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name}";
GRANT USAGE ON ALL SEQUENCES IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name}";
-- Grant ${persistence.user.name.select} user
GRANT SELECT ON ALL TABLES IN SCHEMA ${persistence.schema.name} TO "${persistence.user.name.select}";
-- User configured for server monitoring (read only)
--GRANT SELECT ON ALL TABLES IN SCHEMA ${persistence.schema.name} TO zabbix;

REVOKE ALL ON ALL TABLES IN SCHEMA ${persistence.schema.name} FROM public;
REVOKE ALL ON ALL SEQUENCES IN SCHEMA ${persistence.schema.name} FROM public;