BEGIN
    FOR loan_rec IN (
        SELECT loan_id, interest_rate
        FROM loans
        WHERE customer_id IN (
            SELECT customer_id FROM customers WHERE age > 60
        )
    ) LOOP
        UPDATE loans
        SET interest_rate = interest_rate - 1
        WHERE loan_id = loan_rec.loan_id;
    END LOOP;

    COMMIT;
END;
/

select * from customers