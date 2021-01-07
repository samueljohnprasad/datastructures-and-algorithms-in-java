package queues;



// public class QueuesArray {
//     public static void main(String []aa){
//         Employee sam=new Employee("sam", "john",9000);
//         Employee john=new Employee("john", "sam",437323);
//         Employee sammie=new Employee("sammie", "johnny",1243);
//         Employee samm=new Employee("sajvm", "john",5848);
//         Employee johnn=new Employee("jovdshn", "sam",7499);

//         ArrayQueue queue= new ArrayQueue(10);
//         queue.add(sam);
//         // queue.add(john);
//         // queue.add(sammie);
//         // queue.add(samm);
//         // queue.add(johnn);
        

//         // queue.remove();
//         // queue.remove();
//         // queue.remove();

//         // queue.remove();

//         queue.print();


       

//     }
    
// }

//  class ArrayQueue{
//      private Employee[] queue;
//      int front;
//      int rear;

//      public ArrayQueue(int capacity){
//          this.queue=new Employee[capacity];
//      }

//      public void add(Employee emp){
//          if(rear==queue.length){
//              Employee[] newArray=new Employee[2*queue.length];
//              System.arraycopy(queue,0,newArray,0,queue.length);

//          }else{
//              queue[rear]=emp;
//              rear++;
//          }
//      }

//      public void remove(){
//          if(size()==0){
//             //  throw new NoSuchElementException();
//             System.out.println("NoElement to remove");



//          }else if(front==rear){
//              front=rear=0;


//          }
//              else{
//          queue[front]=null;
//          front++;
//          }
//      }

//      public int size(){
//          return rear-front;
//      }

//      void print(){
//          if(front==0&&rear==0){
//             System.out.println("empty");
             

//          }else{
//          for(int i=front;i<rear;i++){
//              System.out.println(queue[i]);
//          }

//          }

//      }

//     public  String toString(){
//          return queue.toString();
//      }

     

// }

// class Employee{
//     String firstName;
//     String lastName;
//     int id;
//     Employee(String firstName,String lastName,int id){
//         this.firstName=firstName;
//         this.lastName=lastName;
//         this.id=id;


//     }

//    public String toString(){
//         return firstName+" "+lastName+" "+id;
//     }
// }

public class QueuesArray {
    public static void main(String []aa){
        Employee sam=new Employee("sam","john",900);
        Employee john=new Employee("john","sammie",4343);

        arrayQ Q=new arrayQ(3);

        Q.add(sam);
        Q.add(john);
        Q.add(sam);
        Q.add(john);
        Q.add(sam);
        Q.add(john);
        Q.remove();

        Q.print();
    }

    
}
class arrayQ{
    Employee[] queue;
    int front;
    int back;

    arrayQ(int capacity){
        this.queue=new Employee[capacity];

    }

    public void add(Employee emp){
        if(size()==queue.length){
        //    Employee[] newArr=new Employee[2*queue.length];
        //    System.arraycopy(queue,0,newArr,0,queue.length);
          return;
        }
        queue[back]=emp;
        back++;

    }
    public void remove(){
        if(size()==0){
            System.out.println("empty");

        }else{
            queue[front]=null;
            front++;
        }
    }

    int size(){
        return back-front;
    }

    public void print(){
        if(size()==0){
            System.out.println("empty");

        }else{
            for(int i=front;i<back;i++){
                System.out.println(queue[i]);

            }
        }
    }

}

class Employee{
    String firstName;
    String lastName;
    int id;
    Employee(String firstName,String lastName,int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;


    }

   public String toString(){
        return firstName+" "+lastName+" "+id;
    }
}