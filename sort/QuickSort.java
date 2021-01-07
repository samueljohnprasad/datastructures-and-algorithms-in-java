// package app.sort;

// public class sort {

//     public static void main(String[] arg){

//         int arr[]={5,6,3,7,2};

//        quickSort(arr,0,arr.length);
//        for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");

//     }
// }
// public static void quickSort(int []arr,int start,int end){
//     if(end-start<2){
//         return;

//     }
//     int pivot=partition(arr,start,end);
//     quickSort(arr,start,pivot);
//     quickSort(arr,pivot+1,end);

// }
// static  int partition(int[] arr,int start,int end){

//     int pivot=arr[start];
//     int i=start;
//     int j=end;

//     while(i<j){
//         while(i<j && arr[--j]>=pivot);
//         if(i<j){
//             arr[i]=arr[j];

//         }
//         while(i<j && arr[++i]<=pivot);
//         if(i<j){
//             arr[j]=arr[i];

//         }

//     }
//     arr[j]=pivot;


//     return i;

// }
// }



package sort;

public class QuickSort {
    public static void main(String[]aa){
        int arr[]={1,6,3,5,2,4,8,23,10};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        

    }

    static void quickSort(int[] arr,int start,int end){

        if(start<end){
        int par=partition(arr,start,end);

        quickSort(arr,start,par-1);
        quickSort(arr,par+1,end);

    }
}

    static int partition(int[] arr,int start,int end){
        int pivot=end;
        int i=start-1;  //to track previous element which r lower than pivot to swap

        for(int j=start;j<end;j++){
            if(arr[j]<arr[pivot]){
                i++;
                swap(arr,i,j);

            }
            
        }
        i++;
       swap(arr,i,pivot);
        return i;

    }
   static void  swap(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

    }

}