BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "BUSES" (
    "Id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
                                       "Proizvodjac"	TEXT NOT NULL,
                                       "Serija"	INTEGER NOT NULL,
                                       "BrojSjedista"	TEXT NOT NULL,
                                       "Vozac0"	INTEGER,
                                       "Vozac1"	INTEGER,
                                       "Vozac2"	INTEGER
    );
CREATE TABLE IF NOT EXISTS "DRIVERS" (
    "Id"	INTEGER NOT NULL PRIMARY KEY UNIQUE,
                                         "Ime"	TEXT NOT NULL,
                                         "Prezime"	TEXT NOT NULL,
                                         "JMB"	TEXT NOT NULL UNIQUE,
                                         "DatumRodjenja"	TEXT NOT NULL,
                                         "DatumZaposlenja"	TEXT NOT NULL
    );
DELETE FROM BUSES;
DELETE FROM DRIVERS;
COMMIT;