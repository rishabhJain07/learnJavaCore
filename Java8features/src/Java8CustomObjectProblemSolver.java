import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CustomObjectProblemSolver {
    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String toString()
        {
            return "Employee Name: "+name+" age: "+age;
        }
    }

    static List<Employee> empLst = new ArrayList<>();
    static{
        empLst.add(new Employee("RK J",29));
        empLst.add(new Employee("Nim K",19));
        empLst.add(new Employee("KIM L",9));
        empLst.add(new Employee("Ron A",59));
        empLst.add(new Employee("shawn D",59));
        empLst.add(new Employee("shawn Z",39));
        empLst.add(new Employee("Den L",89));
        empLst.add(new Employee("Ram I",60));
    }

    public static void main(String[] args) {
        //filter all the employee whose age is greater than 20 and print the employee names
        printQuestion("filter all the employee whose age is greater than 20 and print the employee names");
        empLst.stream().filter(e->e.getAge()>20).forEach(System.out::println);

        //count number of employees with age 25
        printQuestion("count number of employees with age 59");
        System.out.println(empLst.stream().filter(e->e.getAge()==59).count());

        //find the employee with name “Mary”
        printQuestion("find the employee with name “shawn");
        empLst.stream().filter(e->e.getName().equals("shawn")).forEach(System.out::println);

        //find maximum age of employee
        printQuestion("find maximum age of employee");
        empLst.stream().map(Employee::getAge).max(Integer::compare).ifPresent(System.out::println);

        //sort all the employee on the basis of age
        printQuestion("sort all the employee on the basis of age");
        empLst.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).collect(Collectors.toList()).forEach(System.out::println);

        //Join the all employee names with “,”
        printQuestion("Join the all employee names with “,” ");
        List<String> joinNames = empLst.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(String.join(",",joinNames));

        //find the lowest and highest age
        empLst.stream().map(Employee::getAge).max(Integer::compare).ifPresent(System.out::println);
        empLst.stream().map(Employee::getAge).min(Integer::compare).ifPresent(System.out::println);

        //find last name of each employee
        printQuestion("find last name of each employee");
        empLst.stream().map(Employee::getName).flatMap(e->Stream.of(e.substring(e.lastIndexOf(' ')))).forEach(System.out::println);



    }

    private static void printQuestion(String q) {
        System.out.println(q);
    }
}
