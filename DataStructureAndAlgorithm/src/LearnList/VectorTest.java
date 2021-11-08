package LearnList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones",123));
        employeeList.add(new Employee("John", "Doe",4567));
        employeeList.add(new Employee("Marry", "Smith",22));

        employeeList.add(new Employee("Mike", "Willson",3245));
    }
}
