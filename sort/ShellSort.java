package sort;

// public class ShellSort {

//     //variation insertion sort..gap value reduce it ..till gad is >0..final iteration shud be 1

//     public static void main(String []aa){
//         int arr[]={5,9,4,3,8,2,1,6,7};

//         for(int gap=arr.length/2;gap>0;gap/=2){

//             for(int unsortIndex=gap;unsortIndex<arr.length;unsortIndex+=gap){
//                 int unsort=arr[unsortIndex];
//                 int sort=unsortIndex-gap;  

//                 while(sort>=0 && arr[sort]>unsort){
//                     arr[sort+gap]=arr[sort];
//                     sort-=gap;

//                 }
//                 arr[sort+gap]=unsort;


//             }



//         }

//         for(int i=0; i<arr.length;i++){

//             System.out.print(arr[i]+" ");

//         }


//     }


// }

public class ShellSort{
    public static void main(String[] aa){

        int arr[]={1,3,4,5,3,7};

        for(int gap=arr.length/2;gap>0;gap/=2){

            for(int unsortIndex=gap;unsortIndex<arr.length;unsortIndex+=gap){

                int sort=unsortIndex-gap;
                int unsort=arr[unsortIndex];

                while(sort>0 && arr[sort]>unsort){

                    arr[sort+gap]=arr[sort];
                    sort-=gap;

                }
                arr[sort+gap]=unsort;

            }

        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

     }
}
}