package experiments;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(6));
        System.out.println(recrsiveFactorial(6));
    }

    public static int iterativeFactorial(int num){
        if(num==0)
            return 1;

        int factorial = 1;

        for (int i=1; i<=num; i++)
            factorial *= i;

        return factorial;
    }

    public static int recrsiveFactorial(int num) {
        if (num==0)
            return 1;
        return num * recrsiveFactorial(num-1);
    }
}
