package sort;

public class CountingSort {
    public static void main(String [] aa){
        int arr[]={2,3,4,5,6,7,1};
               counting(arr,1,arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }


    }
    static void counting(int arr[],int min,int max){
        int [] count=new int[max-min+1];

       for(int i=0;i<arr.length;i++){

           count[arr[i]-min]++;
         // System.out.print(arr[1]+"-"+min+" ");
         System.out.print(count[arr[i]-1]+" ");
           
        }
         System.out.println();
         for(int i=0;i<arr.length;i++){

          System.out.print(count[i]+" ");
         }
       
       System.out.println();
        int j=0;

        for(int i=min;i<=max;i++){
            while(count[i-min]>0){
                arr[j++]=i;
                
                count[i-min]--;
     

            }
         

        }


    }

}