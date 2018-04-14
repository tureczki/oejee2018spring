CREATE TABLE Profiles (
	username CHARACTER VARYING(100) NOT NULL UNIQUE,
	picture CHARACTER VARYING(100),
	description CHARACTER VARYING(100),
	email  CHARACTER VARYING(100) NOT NULL UNIQUE,
	CONSTRAINT PK_PROFILES_USERNAME PRIMARY KEY (username)
);

ALTER TABLE Profiles OWNER TO postgres;

CREATE TABLE Users (
	email CHARACTER VARYING(100) NOT NULL UNIQUE,
	passwordhash CHARACTER VARYING(100) NOT NULL,
	experience CHARACTER VARYING(100) NOT NULL,
	subscriber  CHARACTER VARYING(100) NOT NULL,
	theme CHARACTER VARYING(100) NOT NULL,
	currency CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_USERS_EMAIL PRIMARY KEY (email)
);

ALTER TABLE Users OWNER TO postgres;

CREATE TABLE Products (
	name CHARACTER VARYING(100) NOT NULL UNIQUE,
	description CHARACTER VARYING(100),
	releasedate CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_PRODUCTS_NAME PRIMARY KEY (name)
);

ALTER TABLE Products OWNER TO postgres;

CREATE TABLE Currencies (
	name CHARACTER VARYING(100) NOT NULL UNIQUE,
	unit CHARACTER VARYING(100) NOT NULL UNIQUE,
	tousd CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_CURRENCIES_NAME PRIMARY KEY (name)
);

ALTER TABLE Currencies OWNER TO postgres;

CREATE TABLE Paymentoptions (
	productname CHARACTER VARYING(100) NOT NULL,
	pricecurrency CHARACTER VARYING(100) NOT NULL,
	price REAL NOT NULL,
	CONSTRAINT PK_PAYMENTOPTIONS_PRODUCTNAMEANDPRICECURRENCY PRIMARY KEY (productname, pricecurrency)
);

ALTER TABLE Paymentoptions OWNER TO postgres;

CREATE TABLE Purchases (
	email CHARACTER VARYING(100) NOT NULL,
	productname CHARACTER VARYING(100) NOT NULL,
	date CHARACTER VARYING(100) NOT NULL,
	amount REAL NOT NULL,
	price REAL NOT NULL,
	currencyname CHARACTER VARYING(100) NOT NULL,
	id SERIAL,
	CONSTRAINT PK_PURCHASES_ID PRIMARY KEY (id)
);

ALTER TABLE Purchases OWNER TO postgres;

CREATE TABLE Files (
	email CHARACTER VARYING(100) NOT NULL,
	path CHARACTER VARYING(100) NOT NULL,
	date CHARACTER VARYING(100) NOT NULL,
	name CHARACTER VARYING(100) NOT NULL,
	id SERIAL,
	CONSTRAINT PK_FILES_ID PRIMARY KEY (id)
);

ALTER TABLE Files OWNER TO postgres;

CREATE TABLE Blacklist (
	email CHARACTER VARYING(100) NOT NULL,
	reason CHARACTER VARYING(100) NOT NULL,
	date CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_BLACKLIST_EMAIL PRIMARY KEY (email)
);

ALTER TABLE Blacklist TO postgres;