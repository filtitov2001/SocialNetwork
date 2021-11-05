 create table user_subscribtions (
     channel_id int8 not null references users,
     subscriber_id int8 not null references users,
     primary key(channel_id, subscriber_id)


 )