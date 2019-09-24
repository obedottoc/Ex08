//*created by roopesh
//*1roopesh3@gmai.com
//*this program is written to implement a multithreaded application that has three threads.


package multithread;

import java.util.*;

public class MainThread {
	
	public static Integer RandomValue;
	
	public static void main(String[] args) {
		A a=new A("one");
		a.start();
	}
}
class A extends Thread
{  
	String tname;
	Random r;
	Thread t1,t2;
	A(String x)
	{
		this.tname=x;
		
	}
	public void run()
	{
		try
		{
			int num=0;
			r=new Random();
			num=r.nextInt(100);
			for(int i=0;i<10;i++)
			{
				if(num%2==0)
				{
					t1=new Thread(new even(num));
					t1.start();
				}
				else
				{
					t2=new Thread(new odd11(num));
					t2.start();
				}
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception is"+e);
		}	
		catch(Exception a)
		{
			System.out.println("Exception is"+a);
		}
	}
}
class even implements Runnable
{
	int x;
	even(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("num is even"+x+"its square is"+(x*x));
	}}
class odd11 implements Runnable
{
	int x1;
	public int x;
	public odd11(int num) {
		// TODO Auto-generated constructor stub
	}
	 void odd1(int x)
	{
		this.x=x;
	}
	public void run1()
	{
		System.out.println("num is odd"+x+"its cube is"+(x*x*x));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

				
				
					
			
		
		
	}
	


