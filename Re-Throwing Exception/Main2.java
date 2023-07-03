import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            ExceptionDemo.show();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}
