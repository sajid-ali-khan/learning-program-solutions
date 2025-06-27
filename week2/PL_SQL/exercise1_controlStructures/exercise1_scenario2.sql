BEGIN
    FOR customer in (
        SELECT customer_id
        from CUSTOMERS
        where balance > 10000
    ) LOOP
        UPDATE CUSTOMERS
        set is_vip = 1
        where customer_id = customer.customer_id;
    END LOOP;
    commit;
END;
/

select * from CUSTOMERS;
        