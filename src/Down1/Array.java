package Down1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Array {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);
		System.out.println(list.size());
		Integer a=128;
		Integer b=128;
		System.out.println(a.intValue()==b.intValue());
		LinkedList linklist=new LinkedList();
		HashSet<Integer> set=new HashSet();
		HashMap<Integer,String> map=new HashMap();
		map.put(10, "ÕÅÈı");
		System.out.println(map.get(10));
		
	}
}
