package Logger.Abstract;

public abstract class BaseLogger {

    protected String loggerName;



    public void log(String logMessage)
    {
        System.out.println(loggerName+" loglandı : "+logMessage);
    }
}
