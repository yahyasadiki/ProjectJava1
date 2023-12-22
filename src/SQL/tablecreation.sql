create table role(
                     id int not null,
                     nom varchar(255) not null,
                     primary key(id)
);

create table utilisateur(
                            id int not null,
                            nom varchar(255) not null,
                            age varchar(255) not null,
                            role_id int not null,
                            biliotheque_id int not null,
                            foreign key (biliotheque_id) references bibliotheque(id),
                            primary key(id),
                            foreign key(role_id) references role(id)
);

create table bibliotheque
(
    id      int          not null,
    nom     varchar(255) not null,
    adresse varchar(255) not null,
    primary key (id)

);

create table livre
(
    id             int          not null,
    titre          varchar(255) not null,
    auteur         varchar(255) not null,
    bibliotheque_id int          not null,
    primary key (id),
    foreign key (bibliotheque_id) references bibliotheque(id)
);

create table emprunt
(
    id          int not null,
    date_debut  date not null,
    date_fin    date not null,
    utilisateur_id int not null,
    livre_id int not null,
    primary key (id),
    foreign key (utilisateur_id) references utilisateur(id),
    foreign key (livre_id) references livre(id)
);