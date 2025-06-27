CREATE OR REPLACE PROCEDURE TRANSFERFUNDS (
    FROMACCOUNTID IN NUMBER,
    TOACCOUNTID   IN NUMBER,
    AMOUNT        IN NUMBER
) AS
    FROMBALANCE NUMBER; -- variable to store the from balance
BEGIN
    SELECT
        BALANCE
    INTO FROMBALANCE
    FROM
        ACCOUNTS
    WHERE
        ACCOUNT_ID = FROMACCOUNTID
    FOR UPDATE;

    IF FROMBALANCE < AMOUNT THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;
    UPDATE ACCOUNTS
    SET
        BALANCE = BALANCE - AMOUNT
    WHERE
        ACCOUNT_ID = FROMACCOUNTID;

    UPDATE ACCOUNTS
    SET
        BALANCE = BALANCE + AMOUNT
    WHERE
        ACCOUNT_ID = TOACCOUNTID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transferred '
                         || AMOUNT
                         || ' from Account '
                         || FROMACCOUNTID
                         || ' to Account '
                         || TOACCOUNTID);

END;
/

SELECT
    *
FROM
    ACCOUNTS;

exec transferfunds(5, 2, 2000.04);