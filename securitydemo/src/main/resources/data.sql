INSERT INTO users (username,password,enabled)
values ('user','pass',true);

INSERT INTO users (username,password,enabled)
values ('admin','pass',true);

INSERT INTO authorities(username,authority)
VALUES ('user', 'ROLE_USER');

INSERT INTO authorities(username,authority)
VALUES ('admin', 'ROLE_ADMIN')