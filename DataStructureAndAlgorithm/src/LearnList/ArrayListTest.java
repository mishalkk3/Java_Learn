package LearnList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones",123));
        employeeList.add(new Employee("John", "Doe",4567));
        employeeList.add(new Employee("Marry", "Smith",22));
        employeeList.add(new Employee("Mike", "Willson",3245));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();

        System.out.println(employeeList.get(1));
        System.out.println();

        employeeList.set(1, new Employee("John","Adams",4568));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());
        System.out.println();

        employeeList.add(3, new Employee("John", "Doe", 4567));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());
        System.out.println();

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]); //
        for (Employee employee : employeeArray)
            System.out.println(employee);
        System.out.println(employeeList.contains(new Employee("Marry","Smith",22)));
        System.out.println();


    }
}
