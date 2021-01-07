package sort;


// public class MergeSort {
//     public static void main(String[] args){

//         int arr[]={4,3,5,6,1,8,7};

//         merge(arr,0,arr.length);
//         for(int p=0;p<arr.length;p++){
//             System.out.println(arr[p]);

//         }

       


       

//     }
    
//     static void   merge(int [] arr,int start,int end){

//         if(start<end){
//             return;

//         }

//            int mid=end/2;
//             merge(arr,start,mid);
//             merge(arr,mid+1,end);

//             mergeSort(arr,start,mid,end);

        
       


//     }
//     static void mergeSort(int[] arr,int start,int mid,int end){

//        int i=start;
//        int j=mid+1;
//        int k=start;
//        int [] b=new int[end];

//        while(i<=mid && j<=end){
//            if(arr[i]<arr[j]){
//                b[k]=arr[i];
//                i++;
//                k++;


//            }else{
//                b[k]=arr[j];
//                j++;
//                k++;

//            }
//            if(i>mid){
//                while(j<=end){
//                 b[k]=arr[j];
//                 j++;
//                 k++;

//                }
//                while(i<=mid){
//                 b[k]=arr[i];
//                 i++;
//                 k++;


//            }


//        }


            
//     }

//     for(int p=0;p<arr.length;p++){
//        arr[p]=b[p];

//     }
    



// }

// }


// public class MergeSort{
//     public static void main(String[]aa){
        
//         int arr[]={4,3,5,2,6};
//         MyMergeSort ob=new MyMergeSort();
//         ob.sort(arr,0,arr.length-1);

//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }



//     }


// }


 public class MergeSort{

   static  void merge(int arr[],int start,int mid,int end){
        
        int l=mid-start+1;
        int r=end-mid;

        int LeftArray[]=new int[l];
        int RightArray[]=new int[r];

        for(int i=0;i<l;i++)
        LeftArray[i]=arr[start+i];

        for(int j=0;j<r;j++)
        RightArray[j]=arr[mid+1+j];


        int i=0;
        int j=0;
        int k=start;


        while(i<l&&j<r){
            if(LeftArray[i]<=RightArray[j]){
                arr[k]=LeftArray[i];
                i++;

            }else{
                arr[k]=RightArray[j];
                j++;

            }
            k++;


        }
        while(i<l){
            arr[k]=LeftArray[i];
            i++;
            k++;
        }
        while(j<r){
            arr[k]=RightArray[j];
            j++;
            k++;
        }
       

 }

 static void sort(int arr[],int start,int end){
     if(start<end){
         int mid=(start+end)/2;
         sort(arr,start,mid);
         sort(arr,mid+1,end);

         merge(arr,start,mid,end);
     }
 }

 public static void main(String []aa){
     int arr[]={3,2,7,5,4};
     sort(arr,0,arr.length-1);

     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");

     }


 }
}