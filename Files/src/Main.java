import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String s1 = "welcome to Java";
        String s2 = "Welcome to Java";
        if (s1 == s2){
            System.out.println("Points to same loc");
        } else {
            System.out.println("Points to different loc");
        }
        System.out.println("----------------------------------------------------------");
        String s3 = new String("Welcome to Java");
        String s4 = new String("Welcome to Java");
        if (s3 == s4){
            System.out.println("Points to same loc");
        } else {
            System.out.println("Points to different loc");
        }
        System.out.println("----------------------------------------------------------");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.length());
        System.out.println(s1.replace("av", "-"));
        System.out.println(s1.substring(5,12));
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println("----------------------------------------------------------------------");
        StringBuilder s5 = new StringBuilder("Welcome to Java");
        s5.append(", Hellow");
        System.out.println(s3);
        s5.insert(5, "ooooooo");
        System.out.println(s5);
    }
}
