import java.io.IOException;

public class ExceptionDemo {
    public static void show() throws IOException{
        try{
            Account account = new Account();
            account.deposit(-1);
        }
        catch (IOException e){
            System.out.println("Logging");
            throw e;
        }
    }
}
