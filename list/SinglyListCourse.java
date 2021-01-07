package list;

public class SinglyListCourse {

    public static void main(String []aa){
    Employe sam=new Employe("sam","john",9000);
    Employe sammie=new Employe("sammie","john",437323);
    Employe johny=new Employe("johny","john",123);

    EmployeList listt=new EmployeList();
    listt.addAtStart(sam);
    listt.addAtStart(sammie);
    listt.addAtStart(johny);
    listt.print();




    }

    
}

class Employe{
    private String firstName;
    private String lastName;
    private int id;

    Employe(String firstName,String lastName,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;


    }
    @Override
    public String toString(){

     return firstName+" "+lastName+" "+ id;

    }

}
 class EmployeNode{
    Employe emp;
    EmployeNode nextt;
    EmployeNode(Employe emp){
        this.emp=emp;

    }
    
    public  String toString(){
        return emp.toString();

     }

}

class EmployeList{
    EmployeNode head;

    public void addAtStart(Employe data){
        EmployeNode node=new  EmployeNode(data);
        node.nextt=head;
        head=node;


    }
    public void print(){
        EmployeNode temp =head;
        while(temp!=null){
            System.out.println(temp);   
            temp=temp.nextt;

        }

    }
}