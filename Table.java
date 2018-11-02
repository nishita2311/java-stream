package threadsDayOne;

class UseTable
{
	 void printTable(int n)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
 class Table1 extends Thread{
	UseTable t;
	Table1 (UseTable t)
	{
		this.t=t;
	}
	public void run() {
		t.printTable(5);
		
	}

}
 class Table2 extends Thread{
		UseTable t;
		Table2 (UseTable t)
		{
			this.t=t;
		}
		public void run() {
			t.printTable(2);
			
		}

	}
 public class Table
 {
	 public static void main(String[] args) {
		UseTable obj=new UseTable();//only one object
		Table1 t1=new Table1(obj);
		Table2 t2=new Table2(obj);
		t1.start();
		t2.start();
	 }
 
	}
 

