package multithread;

public class SecondThread extends Thread {

	public void run()
	{
		try
		{
			System.out.println("Second thread started...");
			while(true)
			{
				synchronized(mainThread.RandomValue)
				{
					if(mainThread.RandomValue<100&&mainThread.RandomValue!=-1)
					{
						System.out.println("Value is less than hundred");
						System.out.println("Answer="+(mainThread.RandomValue-10));
						mainThread.RandomValue=-1;
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
