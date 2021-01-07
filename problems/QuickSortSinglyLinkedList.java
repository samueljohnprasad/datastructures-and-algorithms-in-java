package problems;

public class QuickSortSinglyLinkedList {
    nodees head;
    public static  void main(String [] aa){

        

        QuickSortSinglyLinkedList list = new QuickSortSinglyLinkedList(); 
    list.addNode(56); 
    list.addNode(3); 
    list.addNode(-23); 
    list.addNode(14); 
    list.addNode(0); 
    list.addNode(44);
   // list.addNode(9); 
  
   nodees n = list.head; 
    while(n.nextLink != null) 
        n= n.nextLink; 
  
    System.out.println("Linked List before sorting"); 
    list.printlist(); 
  
    list.sort(list.head , n); 
  
    System.out.println("\nLinked List after sorting"); 
    list.printlist(); 

  } 

  nodees paritionLast(nodees start,nodees end){
      if(start==end)  //start==null||end==null
        return start;

           
        nodees curr = start;  //start is j
        nodees pivot_prev = start; //i
          int pivot = end.data; 

        while(start != end ) { 
        if(start.data < pivot) 
        {  
            // keep tracks of last modified item 
           //  System.out.println(start.data); 
            pivot_prev = curr;  
           // System.out.println(pivot_prev.data+"in"); 
            int temp = curr.data;   //swap
            curr.data = start.data;  
            start.data = temp;  

            curr = curr.nextLink;  // curr is i
        } 
        start = start.nextLink; //j
    } 

   //System.out.println(pivot_prev.data+"wh"); 

      
    // swap the position of curr i.e. 
    // next suitable index and pivot 
   // System.out.println( pivot+"p");  
//System.out.println( curr.data+"c");  



    int temp = curr.data;  //swap
    curr.data = pivot;  
    end.data = temp;
    // System.out.println(pivot_prev.data+"ret"); 


//we take pivot_previour bz we cannot access back element 
//of pivot in singlylinked list like 
//par(arr,start,pivot-1); par(arrr,pivot+1,end);
return pivot_prev;
    
}

void sort(nodees start, nodees end) 
{ 
    if(start == end ) 
        return; 
          
    // split list and partion recurse 
    nodees pivot_prev = paritionLast(start, end); 
    System.out.println(pivot_prev.data+"ret"); 

    sort(start, pivot_prev); 
      
    // if pivot_prev is next to last element(end), 
    // that means start and pivot is same  
    // so pick from next of pivot 
    if( pivot_prev != null &&  
        pivot_prev.nextLink == end ) 
        sort(pivot_prev.nextLink, end); 
          
    // if pivot is in between of the list, 
    // start from next of pivot,  
    // since we have pivot_prev, so we move two nodes 
    else if(pivot_prev != null &&  
            pivot_prev.nextLink != null) 
        sort(pivot_prev.nextLink.nextLink, end); 
} 

  void addNode(int data) 
{ 
    if(head == null) 
    { 
        head = new nodees(data); 
        return; 
    } 
  
    nodees curr = head; 
    while(curr.nextLink != null) 
        curr = curr.nextLink; 
  
        nodees newNode = new nodees(data); 
    curr.nextLink = newNode; 
}

void printlist()  
{  
    nodees temp=head;
    while (temp != null)  
    { 
        System.out.print(temp.data + " "); 
        temp = temp.nextLink; 
    } 
    System.out.println(); 
}




}
    

class nodees{
    int data;
    nodees nextLink;

    nodees(int data){
        this.data=data;

   }
}