-- ${persistence.user.name.test} user creation
CREATE ROLE "${persistence.user.name.test}"
WITH LOGIN
     UNENCRYPTED PASSWORD '${persistence.user.password.test}';
-- ${persistence.user.name.select.test} user creation
CREATE ROLE "${persistence.user.name.select.test}"
WITH LOGIN
     UNENCRYPTED PASSWORD '${persistence.user.password.select.test}';

-- User configured for server monitoring
--CREATE ROLE "zabbix"
--WITH LOGIN
--     UNENCRYPTED PASSWORD 'ZabbiX';

