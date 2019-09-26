package multithread;

public class FirstThread extends Thread {
		
	public void run()
	{
		
		try
		{
			System.out.println("First thread started...");
			while(true)
			{
				synchronized(mainThread.RandomValue)
				{
					if(mainThread.RandomValue>=100&&mainThread.RandomValue!=-2)
					{
						System.out.println("Value is greater than or equal to hundred");
						System.out.println("Answer="+(mainThread.RandomValue+10));
						mainThread.RandomValue=-2;
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
