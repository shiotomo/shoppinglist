create table if not exists product (
    id int AUTO_INCREMENT,
    name text not null,
    status varchar(256),
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp on update current_timestamp,
    INDEX (id)
) ENGINE=InnoDB;