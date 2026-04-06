import java.util.ArrayList;

 class Employee1 {
    String name;
    int id;
    int age;

    public Employee1(String name , int id ,int age) {
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<>();
        Employee1 e1 = new Employee1("Ashish", 212, 20);
        Employee1 e2 = new Employee1("Asutosh", 213, 21);
        Employee1 e3 = new Employee1("Ayan", 214, 22);
        Employee1 e4 = new Employee1("Anupam", 215, 23);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        for(Employee1 xy:list){
            System.out.println(xy.name);
            System.out.println(xy.id);
             System.out.println(xy.age);
            
        }
    }
    }
    
