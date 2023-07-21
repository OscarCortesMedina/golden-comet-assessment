SELECT
    e.id AS employee_id,
    e.first_name AS employee_first_name,
    e.last_name AS employee_last_name,
    c.phone_number,
    c.email,
    rt.description AS relationship_type
FROM
    employee e
        JOIN
    contact_info c ON e.id = c.employee_id
        JOIN
    contact_relationship_type rt ON c.relationship_type = rt.id
WHERE
        EXTRACT(YEAR FROM c.date_created) = EXTRACT(YEAR FROM CURRENT_DATE);