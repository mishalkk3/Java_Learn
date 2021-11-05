public class Exercise {

    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        String input = "91-044 56 9877 2976545"; //910-445-698-772-976-545
        input = input.replaceAll(" ","").replaceAll("-","");
        int ctr = 1;
        char[] inputArray = input.toCharArray();
        int arrlen = input.length() + ((input.length()/3)-1);
        char[] temp = new char[arrlen];
        for(int i=1;i<=inputArray.length;i++){
            temp[ctr-1]=inputArray[i-1];
            if(i%3==0 && !(i == inputArray.length)){
                temp[ctr]='-';
                ctr++;
            }
            ctr++;
        }
        return String.valueOf(temp);
    }
}