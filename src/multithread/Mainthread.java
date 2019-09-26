package multithread;

import java.util.*;

public class Mainthread {
	
	public static Integer RandomValue;
	
	public static void main(String[] args) {
		Firstthread t1;
		Secondthread t2;
		Random r;
		
			t1=new Firstthread();
			t2=new Secondthread();
			
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


