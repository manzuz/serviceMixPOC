-- ${persistence.user.name} user removal
DROP ROLE IF EXISTS "${persistence.user.name}";
-- ${persistence.user.name.select} user removal
DROP ROLE IF EXISTS "${persistence.user.name.select}";
-- User configured for server monitoring removal
--DROP ROLE IF EXISTS "zabbix";
