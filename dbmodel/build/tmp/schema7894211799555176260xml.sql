
-----------------------------------------------------------------------------
-- Item
-----------------------------------------------------------------------------
DROP TABLE Item CASCADE;


CREATE TABLE Item
(
    className TEXT,
    identifier TEXT,
    id INTEGER NOT NULL,
    implementations TEXT,
    CONSTRAINT Item_pkey UNIQUE (id)
);


-----------------------------------------------------------------------------
-- Attribute
-----------------------------------------------------------------------------
DROP TABLE Attribute CASCADE;


CREATE TABLE Attribute
(
    name TEXT,
    intermine_value TEXT,
    itemId INTEGER
);


-----------------------------------------------------------------------------
-- ReferenceList
-----------------------------------------------------------------------------
DROP TABLE ReferenceList CASCADE;


CREATE TABLE ReferenceList
(
    name TEXT,
    refIds TEXT,
    itemId INTEGER
);


-----------------------------------------------------------------------------
-- Reference
-----------------------------------------------------------------------------
DROP TABLE Reference CASCADE;


CREATE TABLE Reference
(
    refId TEXT,
    name TEXT,
    itemId INTEGER
);


-----------------------------------------------------------------------------
-- intermine_metadata
-----------------------------------------------------------------------------
DROP TABLE intermine_metadata CASCADE;


CREATE TABLE intermine_metadata
(
    key TEXT,
    value TEXT,
    blob_value BYTEA,
    CONSTRAINT intermine_metadata_key UNIQUE (key)
);


-----------------------------------------------------------------------------
-- osbag_int
-----------------------------------------------------------------------------
DROP TABLE osbag_int CASCADE;


CREATE TABLE osbag_int
(
    bagid INTEGER,
    value INTEGER,
    CONSTRAINT osbag_int_index1 UNIQUE (bagid, value)
);
CREATE INDEX osbag_int_index2 ON osbag_int (value, bagid);


-----------------------------------------------------------------------------
-- clob
-----------------------------------------------------------------------------
DROP TABLE clob CASCADE;


CREATE TABLE clob
(
    clobid INTEGER,
    clobpage INTEGER,
    value TEXT,
    CONSTRAINT clob_index UNIQUE (clobid, clobpage)
);


----------------------------------------------------------------------
-- clob                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Item                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Attribute                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- ReferenceList                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- Reference                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- intermine_metadata                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- osbag_int                                                      
----------------------------------------------------------------------

