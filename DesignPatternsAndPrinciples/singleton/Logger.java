package singleton;

public class Logger {

    private static Logger instance;

    private Logger(){
        System.out.println("instance is created");
    }
    public static Logger getInstance()
    {
        if(instance==null)
        {
            instance=new Logger();
        }
        return instance;
    }

    public void log(String s)
    {
        System.out.println(s);
    }
}
