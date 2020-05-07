package ComparableVSComparator;

import java.util.*;

public class ComparableEmployee {

    public static Comparator<Employee> idComparator = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o1.compareTo(o2);
        }
    };

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o2.compareTo(o1);
        }
    };

    public static Comparator<Employee> phoneComparator = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o2.compareTo(o1);
        }
    };

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sumit",1,10));
        employeeList.add(new Employee("Nidhi",2,9));
        employeeList.add(new Employee("Viaan",3,8));
        employeeList.add(new Employee("GD Ojha",4,7));
        employeeList.add(new Employee("Savita",5,6));

        Collections.sort(employeeList);
        System.out.println(Arrays.toString(employeeList.toArray()));

        Collections.sort(employeeList,idComparator);
        System.out.println(Arrays.toString(employeeList.toArray()));

        Collections.sort(employeeList,nameComparator);
        System.out.println(Arrays.toString(employeeList.toArray()));

        Collections.sort(employeeList,phoneComparator);
        System.out.println(Arrays.toString(employeeList.toArray()));

    }
}
