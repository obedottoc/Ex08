/*****
 * To create a program in MultiThread
 * Created by Rositha V
 * rosithav1@gmail.com
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
					if(MainThread.RandomValue%2!=0&&MainThread.RandomValue!=-1)
					{
						System.out.println("Value is ODD");
						System.out.println("Answer="+(MainThread.RandomValue*MainThread.RandomValue*MainThread.RandomValue));
						MainThread.RandomValue=-1;
					}
				}
			
				Thread.sleep(2000);
			}
		}catch(InterruptedException ex)
		{
			System.out.println("Error:"+ex);
		}
	}
}
