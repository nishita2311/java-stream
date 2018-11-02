package exceptions;

public class WelcomeUsers {
	public static void main(String[] args) {
		Greeting greeting=(name)->{System.out.println("welcome "+name);};
		greeting.newGreeting("Seeta");
	}

}
