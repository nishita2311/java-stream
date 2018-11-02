package dayOne;



public class MultivariableArguments {

	public void display(String... parameters)
	{
		for (String str:parameters) {
			System.out.println("Parameters: "+str);
		}
	}
	public static void main(String[] args) {
		MultivariableArguments a=new MultivariableArguments();
		a.display("Nishita","Prathiksha");
	}
}
