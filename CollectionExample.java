package dayThree;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class CollectionExample {
public static void main(String[] args) {
	HashSet<String> a1=new HashSet<>();
	Collection<String> a2=new HashSet<>();
	Set<String> a3=new HashSet<>();
	Set<String> a4=new LinkedHashSet<String>();
	TreeSet<String> a5=new TreeSet<String>();
	
	a5.add("Ravi");
	//a5.add(null);
	a5.add("23");
	a5.add("Ravi");
	
	System.out.println(a5);
	
	
	
	
	
}
}
