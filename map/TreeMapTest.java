package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		//TreeMap<Integer,String> tmap=new TreeMap<>();
		HashMap<Integer,String> tmap=new HashMap<>();
		System.out.println(tmap.isEmpty());
		tmap.put(12,"Nishita");
		tmap.put(13, "Prathiksha");
		tmap.put(13, "Mahima");
		tmap.put(14, "Supriya");
		tmap.put(14, "aaa");
		tmap.put(15,"bbb");
		
		System.out.println(tmap.isEmpty());
		
		for(Map.Entry m:tmap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
