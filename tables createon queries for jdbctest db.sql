
 create table private_information (pi_id int not null primary key auto_increment);

 create table phone (phone_id int not null primary key auto_increment, phones varchar(40), pi_id int not null, foreign key (pi_id) 
 references private_information(pi_id));

 create table link (link_id int not null primary key auto_increment, links varchar(240), pi_id int not null,  foreign key (pi_id) 
 references private_information(pi_id));

 create table deleted (deleted_id int not null auto_increment primary key, deleted_time timestamp not null);

 create table user (user_id int not null auto_increment primary key, user_name varchar(30), sur_name varchar(40), 
 email varchar(50) not null, user_password varchar(60), about text, age date, add_date timestamp not null, update_date timestamp,
 is_online tinyint not null, deleted_id int, pi_info_id int, foreign key (deleted_id) references deleted (deleted_id), foreign key(pi_info_id) 
 references private_information(pi_id) );

 create table nationality (nat_id int not null primary key auto_increment, birth_place varchar(150), country varchar(50), user_id int not null, 
 foreign key(user_id) references user(user_id));

-- alter table user if not exists add constraint user_private_information foreign key (user_id) references private_information(pi_id);

create table address (address_id int not null primary key auto_increment, city varchar(50), town varchar(80), street varchar (90));
create table skill (skill_id int not null primary key auto_increment, skills_name varchar(50), power int(2));

create table user_address(ua_id int not null primary key auto_increment, address_id int not null, user_id int not null, 
foreign key(address_id) references address(address_id), foreign key (user_id) references user(user_id));

create table user_skill(us_id int not null primary key auto_increment, skill_id int not null, user_id int not null, 
foreign key(skill_id) references skill(skill_id), foreign key (user_id) references user(user_id));


