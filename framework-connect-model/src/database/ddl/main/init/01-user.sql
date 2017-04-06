-- ${persistence.user.name} user creation
CREATE ROLE "${persistence.user.name}"
WITH LOGIN
     UNENCRYPTED PASSWORD '${persistence.user.password}';
-- ${persistence.user.name.select} user creation
CREATE ROLE "${persistence.user.name.select}"
WITH LOGIN
     UNENCRYPTED PASSWORD '${persistence.user.password.select}';

-- User configured for server monitoring
--CREATE ROLE "zabbix"
--WITH LOGIN
--     UNENCRYPTED PASSWORD 'ZabbiX';
