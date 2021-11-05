package ClassRoom;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ranga",99,98,100);
        int number = student.getNumberOfMarks();
        System.out.println(number);
        int sum = student.getTotalSumOfMarks();
        System.out.println(sum);
        int maximumMark = student.getMaximumMark();
        System.out.println(maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println(minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println(average);

        student.addMark(35);
        student.removeMarkAtIndex(1);

        System.out.println(student.toString());

    }
}
