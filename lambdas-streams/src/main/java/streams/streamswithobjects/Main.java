package streams.streamswithobjects;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Eric", 8));
        employees.add(new Employee(2, "Milo", 5));
        employees.add(new Employee(3, "Melissa", 12));
        employees.add(new Employee(4, "Elijah", 1));
        employees.add(new Employee(5, "Adil", 24));
        employees.add(new Employee(6, "Enrique", 1));
        employees.add(new Employee(7, "Chad", 18));
        //Problem 1
        //How many Employee’s have over 10 years of experience?
        //Old Way
        /*
        int employeeYearsAboveTen=0;
        for(Employee e:employees)
        {
            if(e.getYerarOfService()>10)
            {
                employeeYearsAboveTen++;
            }
        }
        System.out.println(employeeYearsAboveTen);
         */

        //New Way
//        long employeeYearsAboveTen = employees.stream()
//                                    .filter(e -> e.getYerarOfService() > 10)
//                                    .count();
        //Problem 2
        //Print the name of each employee who has a name that starts with an “E”
        //old way
//        List<Employee>namesStartWithE=new ArrayList<>();
//        for(Employee e:employees)
//        {
//            if(e.getFirstName().startsWith("E"))
//            {
//                namesStartWithE.add(e);
//            }
//        }
//        for(Employee e:namesStartWithE)
//        {
//            System.out.println(e.getFirstName());
//        }
        //new way
        List<Employee> namesStartWithE = new ArrayList<>();
        namesStartWithE = employees.stream()
                .filter(e -> e.getFirstName().startsWith("E"))
                .toList();
        namesStartWithE.forEach(e-> System.out.println(e.getFirstName()));



    }
}
