﻿CREATE TABLE Recipe
(
RID 		INT		NOT NULL	UNIQUE,
name 		VARCHAR(50)	NOT NULL,
stars 		INT,

CONSTRAINT pk_RID PRIMARY KEY (RID)
)

