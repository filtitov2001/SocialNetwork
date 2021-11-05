delete from user_role;
delete from users;

insert into users(id, active, password, username) values
    (1, true, '$2a$08$d5tEnSZXpcPitkNWeKhRTuc2BbWFn20oWcyM8XJAlH4/jqG6ZKVUe', 'elza'),
    (2, true, '$2a$08$d5tEnSZXpcPitkNWeKhRTuc2BbWFn20oWcyM8XJAlH4/jqG6ZKVUe', 'felix');

insert into user_role(user_id, roles) values
    (1, 'USER'), (1, 'ADMIN'),
    (2, 'USER');
