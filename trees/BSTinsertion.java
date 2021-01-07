package trees;


// public class BSTinsertion {
//     public static  void main(String []aa){
//         Tree t=new Tree();
//         t.insert(10);
//         t.insert(5);
//         t.insert(21);
//         t.insert(6);
//         t.insert(43);
//         t.insert(17);
//         t.insert(4);

//         t.traverse();


//     }
    
// }


// class Tree{
//     private TreeNode root;

//     public void insert(int value){
//         if(root==null){
//             root=new TreeNode(value);

//         }else{
//             root.insertt(value);
//         }

//     }

//     public void traverse(){
//         if(root!=null){
//             root.traverseInorder();

//         }
//     }


// }

// class TreeNode{
//     private int data;
//     private TreeNode leftChild;
//     private TreeNode rightChild;


//     TreeNode(int data){
//         this.data=data;
//     }

//     public void insertt(int value){
//         if(value ==data){
//             return;

//         }
//         if(value<data){
//             if(leftChild==null){
//                 leftChild=new TreeNode(value);

//             }else{
//                 leftChild.insertt(value);
//             }

//         }else{
//             if(rightChild==null){
//                 rightChild=new TreeNode(value);

//             }else{
//                 rightChild.insertt(value);
//             }
//         }


//     }
//     public void traverseInorder(){
//         if(leftChild!=null){
//             leftChild.traverseInorder();

//         }
//         System.out.print(data+" ");
//         if(rightChild!=null){
//             rightChild.traverseInorder();
//         }
//     }


//     public void setData(int data){
//         this.data=data;

//     }
//     public int getData(){
//         return this.data;
//     }

//     public void setLeftChild(TreeNode leftChild){
//         this.leftChild=leftChild;

//     }
//     public TreeNode GetLeftChild(){
//         return this.leftChild;
//     }

//     public void setRightChild(TreeNode rightChild){
//         this.rightChild=rightChild;

//     }
//     public TreeNode getRightChild(){
//         return this.rightChild;
//     }
// }


class Main{
    public static void main(String aa[]){

        Tree t=new Tree();
        t.insert(656);
        t.insert(5);
        t.insert(6);
        t.insert(56);
        t.insert(77);
        t.insert(334);
        t.insert(56);
        t.insert(769);
        
        t.traversee();
        System.out.println();

       //System.out.println(t.get(5));
       //System.out.println(t.get(334));
       //System.out.println(t.get(75));

      // System.out.println(t.min());
       //System.out.println(t.max());
       t.delete(769);
       t.traversee();
      //t.root();






    }

    
}
class Tree{
    private TreeNode root;
    

    public void insert(int value){
        if(root==null){
            root= new TreeNode(value);

        }else{
            root.insertt(value);
        }
       


    }
    public void root(){
        System.out.println(root.getData());
    }
    public TreeNode get(int value){
        if(root!=null){
            return root.gett(value);

        }
        return null;

    }

    public void delete(int value){
        root=deleteRec(root,value);

       }

    private TreeNode deleteRec(TreeNode subTreeRoot,int value){
        if(subTreeRoot==null){
          return subTreeRoot;
        }
    
        if(value < subTreeRoot.data){
            subTreeRoot.leftChild=deleteRec(subTreeRoot.leftChild,value);
            //subTreeRoot.leftChild=delete(subTreeRoot.leftChild,value);
        }
        else if(value > subTreeRoot.data){
           // subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),value));
            subTreeRoot.rightChild=deleteRec(subTreeRoot.rightChild,value);
         }
         else{

             if(subTreeRoot.leftChild==null){
                 return subTreeRoot.rightChild;
    
             }else if(subTreeRoot.rightChild==null){
                 return subTreeRoot.leftChild;
    
             }

              //replacing min value in the place of node that to deleted 
         subTreeRoot.data =subTreeRoot.rightChild.min();
         // System.out.println(subTreeRoot.getRightChild().min());
     
     
            //deleteing the min node 
          subTreeRoot.rightChild=deleteRec(subTreeRoot.rightChild,subTreeRoot.data);
     
         }
         
        
    
         return subTreeRoot;
    
    
    }
    public void traversee(){
        if(root!=null){
          root.traverse();

    }
    
}

public int min(){
    if(root==null){
        return Integer.MIN_VALUE;

    }else{
       return root.min();
    }
}
public int max(){
    if(root==null){
        return Integer.MAX_VALUE;
    }else{
        return root.max();
    }
}







}


class TreeNode{
       int data;
     TreeNode leftChild;
     TreeNode rightChild;

    TreeNode(int data){
        this.data=data;

    }

    public void traverse(){
        if(leftChild!=null){
            leftChild.traverse();

        }
        System.out.print(data+" ");

        if(rightChild!=null){
            rightChild.traverse();

        }
    }

    public void insertt(int value){
        if(value==data){
            return;

        }

        if(value<data){
               if(leftChild==null){
                   leftChild=new TreeNode(value);
               }else{
                   leftChild.insertt(value);
               }

        }else{
            if(rightChild==null){
                rightChild=new TreeNode(value);

            }else{
                rightChild.insertt(value);
            }
        }

    }

    public TreeNode gett(int value){
        if(value ==data){
            return this;

        }

        if(value<data){
           if(leftChild!=null){
           return leftChild.gett(value);
           }

        }else{
            if(rightChild!=null){
               return rightChild.gett(value);

            }
        }
        return null;

    }

   


    public int min(){
        if(leftChild==null){
            return data;
        }else{
            return leftChild.min();
        }
    }

    public int max(){
        if(rightChild==null){
            return data;
        }else{
            return rightChild.max();
        }
    }

    public int getData(){
        return this.data;
    }

    public TreeNode getLeftChild(){
        return this.leftChild;
    }
    public TreeNode getRightChild(){
        return this.rightChild;
    }


    public void setData(int data){
         this.data=data;
    }
    public void setLeftChild(TreeNode leftChild){
        this.leftChild =leftChild;
    }
    public void setRightChild(TreeNode rightChild){
        this.rightChild=rightChild;
    }

    public String toString(){
        return this.data+" ";
    }

}