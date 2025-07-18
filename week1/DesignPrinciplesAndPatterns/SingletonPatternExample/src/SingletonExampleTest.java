public class SingletonExampleTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("logger1 = "+logger1);
        System.out.println("logger2 = "+logger2);

        if(logger1 == logger2){
            System.out.println("Both logger instances are same.");
        }else{
            System.out.println("The logger instances are not same.");
        }

        logger1.log("Main", "End of execution.");
    }
}