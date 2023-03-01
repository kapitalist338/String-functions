import java.util.Date;

public class Methods {
    protected static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // throw new RuntimeException(e);
        }
    }

    protected static void print(String a){
        System.out.println(a);
    }

    protected static void DateNow(){
        Date date = new Date();
        System.out.println(date);
    }
}
