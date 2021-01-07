package problems;

class Node{
    int data;
    Node nextLink;

    Node(int data){
        this.data=data;

   }
}

public class InsertionSortSinglyLinkedList {
    Node head;
    Node sorted;
    public static void main(String []aa){
        InsertionSortSinglyLinkedList list = new InsertionSortSinglyLinkedList(); 
        list.push(5); 
        list.push(20); 
        list.push(4); 
        list.push(3); 
        list.push(30); 
        System.out.println("Linked List before Sorting.."); 
        list.printlist(); 

        list.insertionsort(); 
        System.out.println("\nLinkedList After sorting"); 
        list.printlist(); 


    }

    public void push(int data){
        Node newnode=new Node(data);
        newnode.nextLink=head;
        head=newnode;

    }
    void printlist()  
    {  
        Node temp=head;
        while (temp != null)  
        { 
            System.out.print(temp.data + " "); 
            temp = temp.nextLink; 
        } 
    }



    void insertionsort(){  

        sorted =null;
        Node current=head;

        while(current !=null){
            Node currnextlink=current.nextLink;
           // System.out.println(current.data + " lol");

            sorrt(current);
            current=currnextlink;




        }

        head=sorted;  //after sort assigning sort ref to head
       // System.out.println(sorted+"s");


    }
    void sort(Node newnode) {  //
         
         if(sorted==null||sorted.data>=newnode.data){   //
           // System.out.println(sorted);  //sorted.data+">"+
            newnode.nextLink=sorted;
            sorted=newnode;    //sorted becomes headnode
           // System.out.println(newnode.data + " new");
           

        }else{
            Node current=sorted;   //current starts from head
           // System.out.println(current.data + "curr ");
            while (current.nextLink != null && current.nextLink.data < newnode.data)  {
                current=current.nextLink;
              //  System.out.println(current.nextLink.data + "c ");
          }
            newnode.nextLink=current.nextLink;
            current.nextLink=newnode;

        }


    }
    void sorrt(Node unsort){
        if(sorted==null|| sorted.data>=unsort.data){
            unsort.nextLink=sorted;
            sorted=unsort;

        }else{
            Node sortedList =sorted;
            while(sortedList.nextLink!=null && sortedList.nextLink.data<unsort.data){
                sortedList=sortedList.nextLink;

            }
            unsort.nextLink=sortedList.nextLink;
            //  System.out.println( unsort.nextLink + "uns ");
            sortedList.nextLink=unsort;
        }


    }
    

    
}


