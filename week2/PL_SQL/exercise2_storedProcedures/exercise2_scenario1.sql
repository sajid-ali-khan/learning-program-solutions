CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR acc IN (
        SELECT account_id, balance
        FROM accounts
        WHERE account_type = 'savings'
    ) LOOP
        UPDATE accounts
        SET balance = acc.balance * 1.01  -- applying 1% interest
        WHERE account_id = acc.account_id;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Updated balances of all savings accounts with 1% interest.');
END;
/

exec PROCESSMONTHLYINTEREST;

SELECT
    ACCOUNT_ID,
    CUSTOMER_ID,
    ACCOUNT_TYPE,
    BALANCE
FROM
    ACCOUNTS;