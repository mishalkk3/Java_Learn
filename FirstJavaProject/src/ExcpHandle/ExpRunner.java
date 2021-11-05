package ExcpHandle;


import java.util.Scanner;

public class ExpRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //int[] numbers = {12, 3, 4, 5};
            //int number = numbers[2];
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException ex){
            System.out.println("Pointing to null value");
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Before Scanner close");
            scanner.close();
        }
        System.out.println("End of main method");
    }
}
