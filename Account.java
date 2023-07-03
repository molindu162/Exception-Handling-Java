import java.io.IOException;

public class Account {
    public void deposit(float amount) throws IOException{
        if (amount <= 0){
            throw new IOException();
        }
        else System.out.println("$ " + Float.toString(amount) + " deposited");
    }

    public void withdraw(float amount){
        if (amount <= 0)
            throw new IllegalArgumentException();

        else System.out.println("$ " + Float.toString(amount) + " received");
    }
}
