create table if not exists candidacy (
    id int AUTO_INCREMENT,
    product_id int not null,
    url text,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp on update current_timestamp,
    INDEX (id),
    FOREIGN KEY (product_id) REFERENCES product(id)
) ENGINE=InnoDB;