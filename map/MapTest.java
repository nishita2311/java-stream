package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Employee {

	private String name;
	private double salary;
	
	public Employee(String n)
	{
		name=n;
		salary=0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class MapTest {
	public static void main(String[] args) {
		
		Map staff=new LinkedHashMap();
		staff.put("144-25-5462", new Employee("Angela Hung"));
		staff.put("567-24-2546", new Employee("Harry Hacker"));
		staff.put("157-62-7935", new Employee("Gary Cooper"));
		staff.put("456-62-5527", new Employee("Francesca Cruz"));
		
		//System.out.println(staff);

		staff.remove("567-24-2546");
		//System.out.println(staff);
		staff.put("456-62-5527", new Employee("Francesca Miller"));
		//System.out.println(staff);
		
		//System.out.println(staff.get("157-62-7935"));
		
		//System.out.println(staff);

		Set entries=staff.entrySet();
		
		Iterator itr=entries.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println("key : "+key+" ,value : "+value);
		}
	}

}
