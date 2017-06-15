-- ${persistence.user.name.test} user removal
DROP ROLE "${persistence.user.name.test}";
-- ${persistence.user.name.select.test} user removal
DROP ROLE IF EXISTS "${persistence.user.name.select.test}";
-- User configured for server monitoring removal
--DROP ROLE IF EXISTS "zabbix";
