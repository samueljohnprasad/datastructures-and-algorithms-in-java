package list;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
  

   public static void main(String []aa){
    
     List<Employee> employeeList= new ArrayList<>();
     employeeList.add(new Employee("sam","john",9000));
     employeeList.add(new Employee("sammie","john",437323));
     employeeList.add(new Employee("johnny","sam",8688));
     employeeList.add(new Employee("johnnie","john",143));

     
     System.out.println(employeeList.get(1));
     System.out.println(employeeList.isEmpty());

     employeeList.set(1,new Employee("happy","hello",999));
    // employeeList.forEach(i->System.out.println(i));

     System.out.println(employeeList.size());
     System.out.println(employeeList.contains(new Employee("johnni", "john",143)));


    //  Employee[] arra= employeeList.toArray(new Employee[employeeList.size()]);  //  Employee[] arr=new Employee[4];  toArray converts  employeeList to array..
    //                                                                             //employeeList.size() gives size
    //  for(Employee i:arra){
    //      System.out.println(i +"array");

    //  }
    System.out.println(employeeList.contains(new Employee("sam", "john",9000)));  // creating new object and comparing it with the already existing object
    System.out.println(employeeList.indexOf(new Employee("sam","john",9000)));


    

     
    
           
    }
        
}
    
     class Employee{
         private String firstName;
         private String lastName;
         private int id;
    
         Employee(String firstName,String lastName,int id){
             this.firstName=firstName;
             this.lastName=lastName;
             this.id=id;
    
         }
    
      public  void setfirstName(String firstName){
           this.firstName=firstName;
    
    
         }
    
         public String getfirstName(){
             return this.firstName;
         }
    
        public  void setlast(String last){
            this.lastName=last;
    
        }
        public String getlastname( ){
            return this.lastName;
    
        }
        public void setid(int id){
            this.id=id;
        }
        public int getid(){
            return this.id;
        }

        @Override
       public String toString(){

        return firstName+" "+lastName+" "+ id;

       }

       public boolean equals (Object o){
           if(this==o) return true;
           if(o==null || getClass()!=o.getClass()) return false;
           Employee emp=(Employee) o; //typecasting o Object to emp Employee
           if(this.id!=emp.id)return false;
           if(!this.firstName.equals(emp.firstName)) return false;
           
           return lastName.equals(emp.lastName); //if this true then returns true otherwise false
       }

    
        
    
         }
    
    