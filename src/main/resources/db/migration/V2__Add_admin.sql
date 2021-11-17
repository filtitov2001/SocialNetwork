insert into users(id, active, password, username)
    values (0,true,'123','admin');

insert into user_role(user_id, roles)
    values (0, 'USER'), (0, 'ADMIN');
