-- ${persistence.db.name.test} database creation
CREATE DATABASE "${persistence.db.name.test}"
WITH OWNER = ${persistence.db.admin.name}
     ENCODING = 'UTF8'
     TABLESPACE = pg_default
     LC_COLLATE = '${persistence.db.encoding.local}'
     LC_CTYPE = '${persistence.db.encoding.local}'
     CONNECTION LIMIT = -1;
