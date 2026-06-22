package DesignPatternsAndPrinciples.singleton;
public class SingletonTest {

    public static void main(String[] args) {
        
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();

        l1.log("hellloooo  l1");
        l2.log("holaa");

        if(l1==l2)
        {
            System.out.println("same instance");
        }
        else{
            System.out.println("differenttt");
        }
    }
}