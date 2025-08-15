CREATE TABLE users (
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255),
    email VARCHAR(255),
    name VARCHAR(100),
    role VARCHAR(50)
);