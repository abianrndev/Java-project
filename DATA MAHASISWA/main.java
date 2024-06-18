package praktikum4;

class Person {
    private String name;
    private int age;

//constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

            public String getName() {
                return name;
            }

    //method setName
    public void setName(String name) {
        this.name = name;
    }

            public int getAge() {
                return age;
            }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
            public String toString() {
                return "Name: " + name + ", Age: " + age;
            }
}

// Kelas Employee yang mewarisi dari Person
class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Department: " + department + ", " + super.toString();
    }
}

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Abian", 24);
        System.out.println(person1.toString());

        Employee employee1 = new Employee("Rahmat", 40, "220510011", "Informatika");
        System.out.println(employee1.toString());
    }
}