BEGIN
    FOR loan_rec IN (
        SELECT l.loan_id, l.customer_id, l.due_date, c.name
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.loan_id ||
                             ' for customer ' || loan_rec.name ||
                             ' (Customer ID: ' || loan_rec.customer_id || ') ' ||
                             'is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
