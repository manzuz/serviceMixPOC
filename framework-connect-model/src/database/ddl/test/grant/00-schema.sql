-- Grant ${persistence.db.admin.name} user
ALTER SCHEMA ${persistence.schema.name} OWNER TO ${persistence.db.admin.name};
GRANT ALL ON SCHEMA ${persistence.schema.name} TO ${persistence.db.admin.name};
-- Grant ${persistence.user.name.test} user
GRANT USAGE ON SCHEMA ${persistence.schema.name} TO "${persistence.user.name.test}";
-- Grant ${persistence.user.name.select.test} user
GRANT USAGE ON SCHEMA ${persistence.schema.name} TO "${persistence.user.name.select.test}";
-- User configured for server monitoring (read only)
--GRANT USAGE ON SCHEMA ${persistence.schema.name} TO zabbix;

REVOKE ALL ON SCHEMA ${persistence.schema.name} FROM public;
