package problems;

class Nodeee{
    int data;
    Nodeee nextLink;
    Nodeee prevLink;

    Nodeee(int data){
        this.data=data;

    }

}

public class QuickSortDoublyLinkedList {
    Nodeee head;
    private int size;
    Nodeee lastNode;
    public static void main(final String[] aa) {
        QuickSortDoublyLinkedList listt =new QuickSortDoublyLinkedList();
        listt.add(1);
        listt.add(2);
        listt.add(4);
        listt.add(5);
        listt.add(6);
        listt.add(7);
        listt.add(6);
        listt.print();
      //  System.out.println(listt.size());
      System.out.println();
 //  System.out.println(quickSort.lastNode.data);
        listt.quickSort(listt.head,listt.lastNode);
        listt.print();




    }



    void add(int data){
        Nodeee new_node=new Nodeee(data);
        if(head==null){
          head=new_node;
          size++;
          lastNode=new_node;   //to send last node as in parameter in Main method
          return;
          
        }
        new_node.nextLink=head;
        head.prevLink=new_node;
        new_node.prevLink=null;

        head=new_node;
        size++;
        

    }

    public void print(){
        Nodeee temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nextLink;

        }
    }
    public int size(){
        return size;
    }

    public void quickSort(Nodeee start,Nodeee end){
        if(start!=end && end!=null && start!=end.nextLink){
            Nodeee par= partition(start,end);
            quickSort(start,par.prevLink);
            quickSort(par.nextLink,end);

            

        }


    }
    Nodeee partition(Nodeee start,Nodeee end){
        
        int pivot=end.data;                                // set pivot as end element
        Nodeee i=start.prevLink; 
        // similar to i = l-1 in array
       
        for(Nodeee j=start;j!=end; j=j.nextLink){             // Similar to "for (int j = l; j <= h- 1; j++)" 
            if(j.data<pivot){
                   
            // Similar to i++                                  in array 
              i=(i==null)?start:i.nextLink;
                
               
              int temp=i.data;    //swap(i,j);
              i.data=j.data;
              j.data=temp;
            
            }

        }
        i=(i==null) ?start:i.nextLink;   // Similar to i++ 

        int temp=i.data;
        i.data=end.data;
        end.data=temp;
        
        return i;

    }

    
}
