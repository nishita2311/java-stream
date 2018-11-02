package dayThree;


import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("vinita");
		list1.add("vinita");
		list1.add("nishita");
		list1.add(null);
		System.out.println(list1);
		List<String> list2=new ArrayList<>();
		list2.add("Nishita");
		list2.add("Prathiksha");
		list2.add("harish");
		
		list1.remove("vinita");
		list1.remove(1);
		list1.removeAll(list1);
		list1.add(0, "ABC");
		list1.add(1,"YUMMY");
		list1.addAll(list2);
		System.out.println(list1);
		list1.retainAll(list2);
		System.out.println(list1);
		}
}
