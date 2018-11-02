package threadsDayOne;

//class runnableDemo implements Runnable
//{
	/*@Override
	public void run() {
		System.out.println("in runnable thread running ~!!");
		
	}*/
//}
public class RunnableThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
				System.out.println(i);
		}
		System.out.println("in runnable thread running ~!!");
		
	}
	public static void main(String[] args) {
		RunnableThread t3=new RunnableThread();
		t3.start();
		System.out.println("isalive :"+t3.isAlive());

		try {
			t3.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("is alive? ::"+t3.isAlive());
	/*public static void main(String[] args) {
	//	Runnable thread=new runnableDemo();implementing using runnable 
		//Thread t1=new Thread(thread);
		Thread t1=new Thread(new Runnable() //if the class above was commented!!
				{
			public void run() {
				for(int i=0;i<5;i++)
				{
					try {Thread.sleep(2000);}catch(InterruptedException e) {System.out.println(e);}
						System.out.println(i);
				}
				System.out.println("in runnable thread running ~!!");
				
			}
				});
		t1.start();
		Thread t2=new Thread(()->System.out.println("Thread 2 is created"));
		t2.start();*/
	}

	 
	

}
