import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    static BankAccount bankAccount = null;
    double currentBalance = 0;
    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount("user1");
        bankAccount.activate();
        currentBalance = bankAccount.getBalance();
    }

    @Test
    void checkInvalidWithdraw(){
        //Arrange
        double withDrawAmount = 20;

        //Act + Assert
        assertThrows(RuntimeException.class, () -> bankAccount.withDraw(withDrawAmount));
        assertEquals(currentBalance, bankAccount.getBalance());
    }

    @Test
    void checkValidWithdraw(){
        //Arrange
        double withdrawAmount = 2;
        bankAccount.deposit(10);

        //Act
        double gotAmount = bankAccount.withDraw(withdrawAmount);

        //Assert
        assertEquals(withdrawAmount, gotAmount);
        assertEquals(currentBalance + 10 - withdrawAmount, bankAccount.getBalance());

    }

    @Test
    void checkInvalidDeposit(){
        //Arrange
        double depositAmount = 0;

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(depositAmount));
    }

    @Test
    void checkValidDeposit(){
        //Arrange
        double depositAmount = 200;

        //Act
        bankAccount.deposit(depositAmount);

        //Assert
        assertEquals(currentBalance + depositAmount, bankAccount.getBalance());
    }





    @AfterAll
    static void tearDown(){
        System.out.println("Successfully deactivated account");
        bankAccount.deactivate();
    }
}