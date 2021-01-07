package sort;

public class InsertioRecursiveSort {
    public static void main(String[] arg){
        int arr[]={7,1,454454,63,55,6456,456,7,74,47,4,74,74,7};

        recursive(arr,arr.length);
        for (int i:arr){
            System.out.println(i);
    
        }
        

    }
    static void recursive(int[] arr,int items){
        if(items<2){
            return;

        }
       recursive(arr, items-1); //2
        int newElement=arr[items-1]; //then 2-1=element index 1
        // System.out.print(newElement+" ");
        int i;
       

        for( i=items-1;i>0&&arr[i-1]>newElement;i--){
         arr[i]=arr[i-1];
          
        }
       arr[i]=newElement;   //i is where condition fails i.e i-1;



    }
    
}