//*************Q2****************************************
public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee() {

    }

    //cons
    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //set مانحتاجها
   //    public void setId(String id){
//        this.id=id;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setSalary(int salary){
//        this.salary=salary();
//    }
//
//    private int salary() {
//        return salary;
//    }


    //get
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
//method

    public int getAnnualSalary(){
        return this.salary*12;
    }
   public int raisedSalary(int percent){
       this.salary += this.salary * percent / 100;
       return this.salary;
   }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
