package problems;

import java.util.*;

public class sellcar {

/* package codechef; // don't place package name! */



  
public static void main(String[] args) throws java.lang.Exception {
     
	  short depth[]=new short[98765433];
      int queue[]=new int[1000000];
      int prime[]=new int[18];
      int head,tail,val,newVal,i,j,k,temp,t,a[][];
      a=new int[3][3];
      prime[2]=prime[3]=prime[5]=prime[7]=prime[11]=prime[13]=prime[17]=1;
      depth[12345678]=1;
      queue[0]=123456789;
      head=0;
	  tail=1;
	  

      while(head<tail)
        {
          val=queue[head];
          for(i=2;i>=0;i--)
    	for(j=2;j>=0;j--)
    	  {
			//System.out.println(" a[i][j]=val%10 "+a[i][j]+"="+val+"%"+10);
			a[i][j]=val%10;
			//System.out.println(" a[i][j] "+a[i][j]);
			
			
			//System.out.println(" val/=10 "+val+"/"+10);
			val/=10;
			//System.out.println(" val "+ val);
			

		  }
		 // System.out.println(" val "+ val);

		  



                val=queue[head];
          for(i=0;i<3;i++)
    	for(j=0;j<3;j++)
    	  {
    	    if(i+1<3 && prime[a[i][j]+a[i+1][j]]==1)
    	      {
    		for(k=0,temp=1;k<5-i*3-j;k++,temp*=10);
    		newVal=val+(a[i+1][j]-a[i][j])*temp*1000+(a[i][j]-a[i+1][j])*temp;
    		if(depth[newVal/10]==0)
    		  {
    		    queue[tail++]=newVal;
    		    depth[newVal/10]=(short)(depth[val/10]+1);
    		  }
    	      }
    	    if(j+1<3 && prime[a[i][j]+a[i][j+1]]==1)
    	      {
    		for(k=0,temp=1;k<7-i*3-j;k++,temp*=10);
    		newVal=val+(a[i][j+1]-a[i][j])*temp*10+(a[i][j]-a[i][j+1])*temp;
    				if(depth[newVal/10]==0)
    		  {
    		    queue[tail++]=newVal;
    		    depth[newVal/10]=(short)(depth[val/10]+1);
    		  }
    	      }
    	  }
          head++;
        }
	  t=0;
	  


      Scanner scan = new Scanner(System.in);
	  t = scan.nextInt();
	  System.out.println();
      while(t-->0)
        {
          k=0;
          for(i=0;i<3;i++)
    	  for(j=0;j<3;j++)
    	  {
    	    a[i][j]=scan.nextInt();;
			k=k*10+a[i][j];
			
		  }
		  System.out.println(" k "+k);
		  
		  System.out.println(" k/=10 "+k+"/"+10);
		  k/=10;
		  System.out.println(" k/10 "+k);
		 
          if(depth[k]>0)
    	  System.out.println(depth[k]-1);
          else
    	  System.out.println("-1");
        }
}
} 