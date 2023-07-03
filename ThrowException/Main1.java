import java.io.IOException;

public class Main1 {
    public static void main(String[] args){
        Account account = new Account();
        try {
            account.deposit(-1);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Leave the bank");
        }
        System.out.println("Left");

        account.withdraw(-2);
        System.out.println("Done");
    }
}
