CREATE TABLE tbl_board(
    boardId Long auto_increment,
    title varchar (30) not null,
    content varchar (30) not null,
    name varchar (30) not null,
    read integer default 0,
    primary key(boardId)
);

INSERT INTO tbl_board(title, name, content) VALUES('title1', 'name1', 'content1');