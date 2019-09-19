/***
 * @author vijayakumarkaranam
 * 
 */
package multithread;

public class SecondThread extends Thread {

	public void run()
	{
		try
		{
			System.out.println("Second thread started...");
			while(true)
			{
				synchronized(MainThread.RandomValue)
				{
					if((MainThread.RandomValue<100)&&MainThread.RandomValue!=-1)
					{
						System.out.println("Value is an odd number");
						System.out.println("Answer="+(MainThread.RandomValue*MainThread.RandomValue*MainThread.RandomValue));
						MainThread.RandomValue=-1;
						System.out.println("bye bye");
					}
				}
			
				Thread.sleep(500);
			}
		}catch(InterruptedException ex)
		{
			System.out.println("Error:"+ex);
		}
	}
}