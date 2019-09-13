package multithread;

public class secondthread extends Thread {

	public void run()
	{
		try
		{
			System.out.println("Second thread started...");
			while(true)
			{
				synchronized(mainthread.RandomValue)
				{
					if((mainthread.RandomValue%2)!=0&&mainthread.RandomValue!=-1)
					{
						System.out.println("Value is odd");
						System.out.println("Answer="+(mainthread.RandomValue*mainthread.RandomValue*mainthread.RandomValue));
						mainthread.RandomValue=-1;
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
