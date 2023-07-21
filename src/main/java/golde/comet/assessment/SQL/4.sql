INSERT INTO employee (first_name, last_name, date_created, date_hired, salary)
VALUES ('Oscar', 'Cortes', NOW(), '2023-01-01', 150000);

INSERT INTO contact_info (employee_id, phone_number, email, relationship_type, date_created)
VALUES (LAST_INSERT_ID(), '300-1000-000', 'john.doe@example.com', 2, NOW());

