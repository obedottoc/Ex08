/*created by kaarthikeyan
 * email:gk81299@gmail.com
 * 
 */
package multithreading;

import multithreading.Mainthread;

public class Secondthread extends Thread {

	public void run()
	{
		try
		{
			System.out.println("Second thread started...");
			while(true)
			{
				synchronized(Mainthread.RandomValue)
				{
					if(Mainthread.RandomValue%2!=0&&Mainthread.RandomValue!=-1)
					{
						System.out.println("Value is odd");
						System.out.println("Cube is ="+Math.pow(Mainthread.RandomValue, 3));
						Mainthread.RandomValue=-1;
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
