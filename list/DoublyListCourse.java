package list;

public class DoublyListCourse {
    public static void main(String []aa){
        Employ sam=new Employ("sam","john",900);
        Employ john=new Employ("kkk","hai",200);
        Employ yo=new Employ("hehe","haha",10);

        EmployList list=new EmployList();
        list.addAtStart(sam);
        list.addAtStart(john);
        list.addAtStart(yo);

        // list.print();

        // list.addAtEnd(sam);
        // list.addAtEnd(john);
        // list.addAtEnd(yo);
        // list.addAtEnd(sam);
      // list.removeEnd();
       list.addbefore(new Employ("sa","jo",90), sam);
     //  list.addbefore(yo, sam);
        list.print();

        





    }

    
}
class Employ{
    String firstName;
    String lastName;
    int id;

    Employ(String firstName,String lastname,int id){
        this.firstName=firstName;
        this.lastName=lastname;
        this.id=id;

    }
    public String toString(){
        return firstName+" "+lastName+" "+id;
    }

}

class EmployNode{
     Employ emp;
     EmployNode nextNode;
     EmployNode prevNode;

    EmployNode(Employ emp){
        this.emp=emp;
     

    }
    public String toString(){
        return emp.toString();
    }

    public void setEmploy(Employ emp){
        this.emp=emp;
    }
    public Employ getEmploy(){
        return this.emp;
    }
    public void setnextNode(EmployNode nextNode){
        this.nextNode=nextNode;
    }
    public EmployNode getnextNode(){
        return this.nextNode;
    }
    public void setprevNode(EmployNode prevNode){
        this.prevNode=prevNode;
    }
    public EmployNode getprevNode(){
        return this.prevNode;
    }
    

}


class EmployList{
    EmployNode head;
    EmployNode tail;

    int size;

    public void addAtStart(Employ emp){
        EmployNode node=new EmployNode(emp);
        node.nextNode=head;
        
        if(head==null){
            head=tail=node;

        }else{
            head.prevNode=node;
            
        }
        head=node;
        size++;


    }


    public void addAtEnd(Employ data){
        EmployNode node=new EmployNode(data);
        if(tail==null){
           tail= head=node;

        }else{
            tail.nextNode=node;
            node.prevNode=tail;
        }
        tail=node;
        size++;
    }



    public void print(){
        EmployNode temp=head;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.nextNode;

        }
    }

    public void removeEnd(){
        if(head==null){
            return;
        }

         // EmployNode remove=tail;
        if(tail.prevNode==null){
            head=null;

        }else{
            tail.prevNode.nextNode=null;
        }
        tail=tail.prevNode;
       

    }

    public boolean addbefore(Employ newEmp,Employ existingEmp){
        if(head==null){
            return false;
         }
         EmployNode curr=head;
        while(curr!=null && !curr.getEmploy().equals(existingEmp)){
           // curr=curr.getnextNode();
           curr=curr.nextNode;

        }
        if(curr==null){
           return false;

        }
        EmployNode newnode =new EmployNode(newEmp);
        newnode.prevNode=curr.prevNode;
        newnode.nextNode=curr;
        curr.prevNode=newnode;

        // newnode.setprevNode(curr.getnextNode());
        // newnode.setnextNode(curr);
        // curr.setprevNode(newnode);

        if(head==curr){
            head=newnode;

        }else{
           // newnode.getprevNode().setnextNode(newnode);
            newnode.prevNode.nextNode=newnode;
        }
        size++;

     return true;
    }
}