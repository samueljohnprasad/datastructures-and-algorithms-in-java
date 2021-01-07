package problems;

public class MergeSortSLL {

        Nod head;
    
        public static void main(String []aa){
            MergeSortSLL list =new MergeSortSLL();
            list.add(14);
            list.add(573);
            list.add(79);
            list.add(54);
            list.add(365);
            list.add(75);
            list.add(53);
            list.add(354);
            list.add(395);
            list.add(7);
            list.add(583);
    
            list.print(list.head);
            System.out.println();
            Nod x=list.mergeSort(list.head);
            list.print(x);
        
                
        
            }
        
            public void add(int data){
                Nod newnode=new Nod(data);
                newnode.nextLink=head;
                head=newnode;
                
        
            }
    
            public void print(Nod head){
                Nod temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.nextLink;
    
                }
            }
    
            Nod mergeSort(Nod node){
                if(node==null ||node.nextLink==null){
                    return node;
    
                }
                Nod mid=find_mid(node);
                Nod mid_next=mid.nextLink;
                mid.nextLink=null;
    
                Nod left =mergeSort(node);
                Nod right= mergeSort(mid_next);
    
                return Merge(left,right);
    
            }
    
            Nod Merge(Nod left,Nod right){
    
                if(left==null){
                   return right;
                }
                if(right==null){
                    return left;
                 }
                 if(left.data<right.data){
                     left.nextLink=Merge(left.nextLink, right);
                     return left;
    
    
                 }else{
                     right.nextLink=Merge(left, right.nextLink);
                     return right;
                 }
    
            }
            Nod find_mid(Nod head){
    
                Nod fast=head,slow=head;
                while(fast.nextLink!=null && fast.nextLink.nextLink!=null){
                    slow=slow.nextLink;
                    fast=fast.nextLink.nextLink;
    
                }
    
                return slow;
    
    
    
            }
            
            
        }
        class Nod{
            int data;
            Nod nextLink;
        
            Nod(int data){
              this.data=data;  
            }
        
        }