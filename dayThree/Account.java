package dayThree;

import java.util.HashSet;
import java.util.Set;
public class Account {
	public static void main(String[] args) {
		Set<String> a1=new HashSet<>();
		a1.add("230041988");
		a1.add("230019090");
		a1.add("230091191");
		a1.add("230187110");
		a1.add("230032498");
		
		System.out.println(a1);
		a1.forEach((n)->{System.out.println(n);});
	}
	
	
	
	

}
