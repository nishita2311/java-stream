package threadsDayOne;

 class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("running!!!!");
	}
}

public class ThreadExecution{
	public static void main(String[] args) {
		ThreadDemo th=new ThreadDemo();
		th.start();
		System.out.println(th.getName());
		th.setName("Nishita Thread");
		System.out.println(th.getName());
		System.out.println(th.isAlive());
		System.out.println(th.getPriority());
		System.out.println(th.isDaemon());
	}
}
