import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class EmployeeImmutable {
    private final String name;
    private final int age;
    private final Date dob;
    private final List<String> address;

    public EmployeeImmutable(String name, int age, Date dob, List<String> address) {
        this.name = name;
        this.age = age;
        this.dob = new Date(dob.getTime());
        List<String> tempList = new ArrayList<>();
        for (String element : address) {
            tempList.add(element);
        }
        this.address = tempList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDob() {
        return dob;
    }

    public List<String> getAddress() {
        return address;
    }

    public static void main(String[] args) {
        List<String> address = new ArrayList<>();
        address.add("address1");
        address.add("address2");

        EmployeeImmutable obj1 = new EmployeeImmutable("TestName", 25, new Date(), address);
        System.out.println(obj1);
        System.out.println(obj1.getAddress());
        obj1.getAddress().add("address3");
        System.out.println(obj1.getAddress());
        System.out.println(obj1);

    }
}
