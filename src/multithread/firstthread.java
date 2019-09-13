package multithread;



public class firstthread extends Thread {
		
	public void run()
	{
		
		try
		{
			System.out.println("First thread started...");
			while(true)
			{
				synchronized(mainthread.RandomValue)
				{
					if((mainthread.RandomValue%2)==0&&mainthread.RandomValue!=-1)
					{
						System.out.println("Value is even");
						System.out.println("Answer="+(mainthread.RandomValue*mainthread.RandomValue));
						mainthread.RandomValue=-1;
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



