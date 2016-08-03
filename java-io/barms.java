import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class barms {
  public static void main(String args[]) throws IOException  {
      long startTime = System.currentTimeMillis();

      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      long Sum=0, num=Long.parseLong(bf.readLine());
      String n; int T; boolean f=false;
      while(num!=0) {
    	n=num+"";
        T = n.length();
        if  (T >= 2 && T <= 9)
	        for(int i=0;i<T;i++) {
		    	Sum+=Math.pow(Integer.parseInt(n.charAt(i)+""),T);
		        if (Sum==num) {
		        	System.out.println(T);
		            f=true;
		            Sum=0;
		            break;
		        }
	        }
        if(!f) System.out.println("N");
        Sum=0; 
        f=false;
        num=Long.parseLong(bf.readLine());
      }
      
      long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime);
   } 
} 