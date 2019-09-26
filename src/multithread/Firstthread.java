package multithread;
 
public class Firstthread extends Thread {
		
	public void run()
	{
		
		try
		{
			System.out.println("First thread started...");
			while(true)
			{
				synchronized(Mainthread.RandomValue)
				{
					if(Mainthread.RandomValue%2==0&&Mainthread.RandomValue!=-1)
					{
						System.out.println("Value is even");
						System.out.println("Answer="+(Mainthread.RandomValue*Mainthread.RandomValue));
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
