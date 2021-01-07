package queues;

public class CircularQueLL {
    nodee front;
    nodee rear;

    public static void main(String aa[]){

       CircularQueLL q=new CircularQueLL();

       q.add(10);
       q.add(5);
       q.add(3);
       q.add(87);
       q.add(5);

       q.remove();

       q.print();
        
    }

    public void add(int x){
        nodee newnode=new nodee(x);

        if(front==null && rear==null){
            front=rear=newnode;
            return;

        }
        rear.nextLink=newnode;
        rear=newnode;
        rear.nextLink=front;


    }

    void remove(){
        if(front==null &&rear==null){
           System.out.println("empty");
           return;

        }
        if(rear==front){

            front=rear=null;
          }else{
            front=front.nextLink;
          }
        }



    void print(){
        if(front==null&rear==null)
        return;
        nodee temp=front;
        while(temp!=rear){
            System.out.println(temp.data);
            temp=temp.nextLink;
        }
        System.out.println(rear.data);


    }
    
}

class nodee{
    int data;
    nodee nextLink;
    nodee(int data){
        this.data=data;
    }

}