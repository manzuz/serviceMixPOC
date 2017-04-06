-- Grant ${persistence.db.admin.name} user
GRANT ALL ON DATABASE "${persistence.db.name.test}" TO ${persistence.db.admin.name};
-- Grant ${persistence.user.name.test} user
GRANT CONNECT ON DATABASE "${persistence.db.name.test}" TO "${persistence.user.name.test}";
-- Grant ${persistence.user.name.select.test} user
GRANT CONNECT ON DATABASE "${persistence.db.name.test}" TO "${persistence.user.name.select.test}";
-- Grant user configured for server monitoring
--GRANT CONNECT ON DATABASE "${persistence.db.name.test}" TO zabbix;

REVOKE ALL ON DATABASE "${persistence.db.name.test}" FROM public;
