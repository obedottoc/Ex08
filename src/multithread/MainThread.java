/***
* EXPERIMENT-08
*developed by Nithishkumar
*Saveetha Engineering College
*jpnithishkumar@gmail.com
*/
package multithread;

import java.util.*;

public class MainThread {
	
	public static Integer RandomValue;
	
	public static void main(String[] args) {
		EvenThread t1;
		OddThread t2;
		Random r;
		
			t1=new EvenThread();
			t2=new OddThread();
			
			r=new Random();
			RandomValue=-1;
			
			t1.start();
			t2.start();
			
			try
			{
			while(true)
			{								
				synchronized(RandomValue)
				{
					if(RandomValue==-1)
					{
						RandomValue=r.nextInt(10);
						System.out.println("Placed a new number "+RandomValue);
					}
				}
				Thread.sleep(4000);
			}
			}catch(InterruptedException ex)
			{
				System.out.println("Error:"+ex);
			}
		
	}

}

