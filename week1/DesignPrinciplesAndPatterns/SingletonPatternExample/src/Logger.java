public class Logger {
    private static Logger logger;
    private Logger(){

    }

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String context, String message){
        System.out.println(context + ": " + message);
    }

}
