package multithread;

import java.util.*;

public class mainthread {
	
	public static Integer RandomValue;
	
	public static void main(String[] args) {
		firstthread t1;
		secondthread t2;
		Random r;
		
			t1=new firstthread();
			t2=new secondthread();
			
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
						RandomValue=r.nextInt(200);
						System.out.println("Placed a new number "+RandomValue);
					}
				}
				Thread.sleep(1000);
			}
			}catch(InterruptedException ex)
			{
				System.out.println("Error:"+ex);
			}
		
	}

}
