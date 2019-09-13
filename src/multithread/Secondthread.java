package multithread;

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
						System.out.println("Answer="+(Mainthread.RandomValue*Mainthread.RandomValue*Mainthread.RandomValue));
						Mainthread.RandomValue=-1;
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
