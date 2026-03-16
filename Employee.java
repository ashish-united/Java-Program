public class Employee {
    int Employee_id;
    String Employee_name;
    String Employee_designation;

    public Employee(int id, String name, String designation) {
        Employee_id = id;
        Employee_name = name;
        Employee_designation = designation;
    }

    public void display() {
        System.out.println("Employee ID: " + Employee_id);
        System.out.println("Employee Name: " + Employee_name);
        System.out.println("Enter your designation :"+ Employee_designation);   
     }

    public static void main(String[] args) {
        Employee e1=new Employee(22,"Ashish","student");
        Employee e2=new Employee(32,"Aru","classmate");
        Employee e3=new Employee(42,"Aryan","classmate");
        e1.display();
        e2.display();
        e3.display();
    }
}