package sort;
import java.util.Scanner;

// public class TowerOfBabelRecursion {

//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);

//         int t=sc.nextInt();
//         for(int i=0;i<t;i++){
//             int n;
//             n=sc.nextInt();

//             TowerOfHanoi han=new TowerOfHanoi();

//             han.hanoi(1,0,2);


//         }

//     }
// }

// class TowerOfHanoi{
//     void hanoi(int disks,int startPeg,int endPeg){

//         if(disks<=0){

//             return;

//         }else{
//             int unused=findUnusedPeg(startPeg,endPeg);

//             hanoi(disks-1,startPeg,unused);
//             System.out.println(disks+":"+pegChar(startPeg)+"->"+pegChar(endPeg));

//             hanoi(disks-1,unused,endPeg);
//         }


//     }

//     int findUnusedPeg(int startPeg,int endPeg){

//         // int arr[]={1,1,1};
//         // arr[startPeg]=0;
//         // arr[endPeg]=0;
//         // int i;
//         // for(i=0;i<3;i++)
//         // if(arr[i]==1){

//         // }

       
 
//         // return i;
//         return (3-startPeg-endPeg);
//      }

//    char pegChar(int peg){

//     if(peg==0)
//     return 'A';

//    else if(peg==1)
//     return 'B';

//     else
//     return 'C';


//    }
// }

public  class TowerOfBabelRecursion{

    public static void main(String []aa){

       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++){
           int n;
           n=sc.nextInt();

           TowerOfHanoi han =new TowerOfHanoi();
           han.hanoi(n,0,2);

        
           sc.close();
       }

    }
}

class TowerOfHanoi{

    void hanoi(int disks,int startPeg,int endPeg){

        if(disks<=0){
            return;

        }
        else{

            int unused=findUnusedPeg(startPeg,endPeg);

            hanoi(disks-1,startPeg,unused);

            System.out.println(disks+":" +pegChar(startPeg)+"->"+pegChar(endPeg));

            hanoi(disks-1,unused,endPeg);




        }



    }

   int  findUnusedPeg(int startPeg ,int endPeg){

    return (3-startPeg-endPeg);

   }
   char pegChar(int peg){
       if(peg==0)
    return 'A';
    else if(peg==1)
    return 'B';
    else 
    return 'C';

   }

}