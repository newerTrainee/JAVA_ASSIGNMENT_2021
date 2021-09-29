interface EmployeeInterface{
    Employee getDetails(String s,int a,String p);
}

public class Employee {
    private String name;
      private int age;
     private String city;

    Employee(String name,int age,String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args){
        EmployeeInterface t = Employee::new;
        Employee emp = t.getDetails("Sumit",22,"Agra");
        System.out.println(emp);
    }
}
