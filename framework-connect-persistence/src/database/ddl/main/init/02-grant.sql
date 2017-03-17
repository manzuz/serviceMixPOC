-- Grant ${persistence.db.admin.name} user
GRANT ALL ON DATABASE "${persistence.db.name}" TO ${persistence.db.admin.name};
-- Grant ${persistence.user.name} user
GRANT CONNECT ON DATABASE "${persistence.db.name}" TO "${persistence.user.name}";
-- Grant ${persistence.user.name.select} user
GRANT CONNECT ON DATABASE "${persistence.db.name}" TO "${persistence.user.name.select}";
-- Grant user configured for server monitoring
--GRANT CONNECT ON DATABASE "${persistence.db.name}" TO zabbix;

REVOKE ALL ON DATABASE "${persistence.db.name}" FROM public;
