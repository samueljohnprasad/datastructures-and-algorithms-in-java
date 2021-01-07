package problems;

public class MergeSortDLL {
    Nodee head;

    public  static void main(String []arg){
        MergeSortDLL list=new MergeSortDLL();
        list.add(7);
        list.add(34);
        list.add(44);
        list.add(14);
        list.add(9);
        list.add(10);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(43);
        list.add(103);
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(66);
        list.add(13);
        list.add(93);

        list.print(list.head);

       // list.mergerSort(list.head);
   //list.find_Mid(list.head);
  // System.out.println(list.mergerSort(list.head).toString());
    Nodee x= list.mergerSort(list.head);
    System.out.println();
    list.print(x);


    }

    public void add(int data){
        Nodee newnode=new Nodee(data);
        if(head==null){
            head=newnode;
            return;

        }
        newnode.nextLink=head;
        head.prevLink=newnode;
        newnode.prevLink=null;
        head=newnode;


    }

    public void print(Nodee head){
        Nodee temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.nextLink;

        }
    }

    public Nodee find_Mid(Nodee head){
        Nodee fast=head,slow=head;
        while(fast.nextLink!=null && fast.nextLink.nextLink!=null){
            fast=fast.nextLink.nextLink;
            slow=slow.nextLink;

        }
     // System.out.print(slow.data);
        
      
      return slow;
    }

    public Nodee mergerSort(Nodee node){
        if(node==null || node.nextLink==null){  //not head 
           return node;
        }
        // get the middle of the list
        Nodee mid=find_Mid(node);      //node is head
        Nodee mid_next=mid.nextLink;   //mid is start of second part
        mid.nextLink=null;             //spliting into two parts by making
                                       //mid next as null
        Nodee first= mergerSort(node);
        Nodee sec=  mergerSort(mid_next);
        return merge_list(first,sec);
        
        }

    public Nodee merge_list(Nodee first,Nodee second){
        if(first==null){  
        //System.out.println(second.data+"a");      
            return second;

        }
        if(second==null){
           // System.out.println(first.data +"b"); 
            return first;

        }
        if(first.data<second.data){
           // System.out.println(first.data +"c"); 
            first.nextLink=merge_list(first.nextLink,second);
            first.nextLink.prevLink=first;
            first.prevLink=null;
            return first;



        }else{
           // System.out.println(first.data +"d");
           // System.out.println(second.nextLink +"d"); 

            second.nextLink=merge_list(first,second.nextLink);
            second.nextLink.prevLink=second;
            second.prevLink=null;
            return second;
        }


    }
    
}

class Nodee{

    int data;
    Nodee nextLink;
    Nodee prevLink;

    Nodee(int data){
        this.data=data;

    }

}