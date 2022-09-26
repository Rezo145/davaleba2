create table if not exists Users (
    id         int         not null,
    name       varchar(60) not null,
    password   varchar(60) not null,
    email      varchar(60) not null,
    persona int         not null
);

create table if not exists Personas (
    id int not null,
    first_name varchar(60) not null,
    last_name varchar(60) not null,
    private_number int not null,
    date_of_birth date not null,
    organization int not null
);

alter table Users
    add foreign key (persona) references Personas(id);


create table if not exists Roles (
    id int not null,
    name varchar(60) not null
);

create table if not exists Users_Roles (
    user int not null,
    role int not null
);

alter table Users_Roles
    add foreign key (user) references Users(id);
alter table Users_Roles
    add foreign key (role) references Roles(id);

create table if not exists Rights (
    id int not null,
    name varchar(60) not null
);

create table if not exists Users_Rights (
    user int not null,
    right int not null
);

alter table Users_Rights
    add foreign key (user) references Users(id);
alter table Users_Rights
    add foreign key (right) references Rights(id);

create table if not exists Organizations (
    id int not null,
    name varchar(60) not null,
    address varchar(60) not null
);

alter table Personas
    add foreign key (organization) references Organizations(id);

create table if not exists Menus (
    id int not null,
    name varchar(60) not null
);

create table if not exists Users_Menus (
  user int not null,
  menu int not null
);

alter table Users_Menus
    add foreign key (user) references Users(id);
alter table Users_Menus
    add foreign key (menu) references Menus(id);








