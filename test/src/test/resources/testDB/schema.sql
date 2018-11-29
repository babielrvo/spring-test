CREATE TYPE TEXT AS VARCHAR(1000000);

create table exampleModel
(
  id int IDENTITY  primary key,
  text TEXT null,
);
