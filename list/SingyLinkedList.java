package list;

// public class SingyLinkedList {

//     public static void main(String []arg){
//         linklist list =new linklist();
//         list.insert(10);
//         // list.insert(2);
//         // list.insert(5);
//         // list.insert(8);
//         // list.insert(5);

//         list.show();
        


//     }


    
// }

// class  node{
//     int data;
//     node nextptr;

//     node(int data){
//     this.data=data;
//     }
// }


// class linklist{
//     node head;  //head of the list . head stores the reference of node

//     public void insert(int data){
//         node new_node= new node(data);  //or node new_node=new node();
                                            // new_node.data=data;
//        new_node.nextptr=null;
    

//         if(head==null){
//             head=new_node;

//         }else{
//             node temp=head;   //temp is pointer/reference
//             while(temp.nextptr!=null){
//                 temp=temp.nextptr;  //changing the nodes if not null

//             }
//             temp.nextptr=new_node;
//         }
       



//     }
//     public void show(){
//         node temp=head;
//             while(temp.nextptr!=null){
//                 System.out.println(temp.data);
//                 temp=temp.nextptr;


                

//             }
//             System.out.println(temp.data);
//         }


// }

public class SingyLinkedList{
    public static void main(String []arg){
        linklist list=new linklist();
        list.insert("sam");
        list.insert("sammie");
        list.insert("johnny");

        list.removeByData("sam");
        list.insertAt(1,"hey");
        
        list.insertAtStart("haha");

      
        list.deleteAtPosition(1);
      
        list.show();
       // System.out.println(list.getIndex());



    }

}

class node{
    String data;
    node nextptr;

    node(String data){
        this.data=data;

    }

}

class linklist{
    node head;
  // int count=0;

    public void insert(String data){

        node new_node=new node(data);
      
    
        if(head==null){
            head=new_node;

        }
        else{

            node temp=head;
            while(temp.nextptr!=null){
                temp=temp.nextptr;

            }
            temp.nextptr=new_node;

        }
       }

    public void show(){

        node temp=head;
        while(temp.nextptr!=null){
            System.out.println(temp.data);
            temp=temp.nextptr;
           
        
        }
        System.out.println(temp.data);
      

    }
    
   

    public  void removeByData(String data){
        node currNode=head;
       // System.out.println(currNode);
        node prev=null;
       


        if(currNode!=null && currNode.data==data){
            head=currNode.nextptr;
            System.out.println(data+" data found and deleted");
            return;
          
         }
         while(currNode!=null && currNode.data!=data){
             prev=currNode;
             currNode=currNode.nextptr;
             
            
      }
    
         
         if(currNode!=null){
             prev.nextptr=currNode.nextptr;
             System.out.println(data+" data found and deleted");


         }
         if(currNode==null){  //last node next is null
            System.out.println(data+" data not found");
          //  System.out.println(currNode);

         }


    }
    public void insertAtStart(String data){
        //node new_node= new node();
      //  new_node.data=data;
      //  new_node.nextptr=null;
     //   new_node.nextptr=head;
        //head=new_node;
        node node= new node(data);
        node.nextptr=null;
        node.nextptr=head;
        head=node;



    }
    public void insertAt(int index,String data){

        node newnode=new node(data);
        node temp=head;
        if(index<=getIndex() && index >-1){
            if(index==0){
                newnode.nextptr=head;
                head=newnode;
                return;

            }
  
        for(int i=0;i<index-1;i++){
            temp=temp.nextptr;


        }
        newnode.nextptr=temp.nextptr;
        temp.nextptr=newnode;
    }else{
        System.out.println("size is " +getIndex());
    }
    
        
        
    }
      public  int getIndex(){
        int count=0;
        node temp=head;
        while(temp.nextptr!=null){
            temp=temp.nextptr;
            count++;
            

        }

        return count;
    }

    public void deleteAtPosition(int index){
        node currNode=head;
        node prev=null;
        //case :0 if index is 1

        if(index==0 && currNode.nextptr!=null){
            head=currNode.nextptr;   //change head to nxet node
            System.out.println(index + " position element deleted");
         return;
        }
        //case:1 if index >0
        int counter=0;
        while(currNode!=null){
            if(counter ==index){
                prev.nextptr=currNode.nextptr;
                System.out.println(index + " position element deleted");

                break;

            }else{
                prev=currNode;
                currNode=currNode.nextptr;
                counter++;
            }


        }
        //currNode becomes null  if index not found
        if(currNode==null){
            System.out.println(index + " position element not found");


       }
        


    }

}