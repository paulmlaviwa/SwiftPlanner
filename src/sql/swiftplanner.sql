-- Drop the swiftplanner schema if it already exists
DROP DATABASE IF EXISTS swiftplanner;

-- Create a new swiftplanner db
CREATE DATABASE IF NOT EXISTS swiftplanner;

-- Switch to the swiftplanner db
USE swiftplanner;


-- Create a table for tasks
CREATE TABLE tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    due_date DATE,
    status ENUM('Not Started', 'In Progress', 'Completed') DEFAULT 'Not Started',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Add index on title for faster searching
CREATE INDEX idx_title ON tasks(title);

-- Create a table for users
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Add app users
INSERT INTO users (username, email) VALUES
('paulmlaviwa', 'mlaviwa.paul@gmail.com'),
('zinniazimba', 'zimba.zinnia@gmail.com');


-- Add a foreign key constraint for referencing user_id from a users table
ALTER TABLE tasks
ADD COLUMN user_id INT,
ADD CONSTRAINT fk_user_id
    FOREIGN KEY (user_id)
    REFERENCES users(user_id);
