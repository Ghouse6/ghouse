package bhai12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class dsaa {

	public static void main(String[] args) {
		Set n=new HashSet();
		n.add("sony");
		n.add("aony");
		n.add("dony");
		n.add("tony");
		n.add("gony");
		n.add("mony");
		n.add("swny");
		boolean d=n.add(20);
		System.out.println(d);
		System.out.println(n);
		LinkedHashSet t=new LinkedHashSet();
		t.add("sogg");
		t.add("aodd");
		t.add("doss");
		t.add("toaa");
		t.add("goee");
		t.add("morr");
		t.add("swyy");
		System.out.println(t);
		Iterator r=t.iterator();
		while (r.hasNext())
		{
			System.out.println(r.next());
		}
	}

}
