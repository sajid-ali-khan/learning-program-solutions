CREATE OR REPLACE PROCEDURE UPDATEEMPLOYEEBONUS (
    DEPTID          IN NUMBER,
    BONUSPERCENTAGE IN NUMBER
) AS
BEGIN
    FOR EMP IN (
        SELECT
            EMPLOYEE_ID,
            SALARY
        FROM
            EMPLOYEES
        WHERE
            DEPARTMENT_ID = DEPTID
    ) LOOP
        UPDATE EMPLOYEES
        SET
            SALARY = EMP.SALARY + EMP.SALARY * BONUSPERCENTAGE
        WHERE
            EMPLOYEE_ID = EMP.EMPLOYEE_ID;

    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Updated salaries with bonus for department ID: ' || DEPTID);
END;
/

exec UPDATEEMPLOYEEBONUS(2, 17);

select * from employees;