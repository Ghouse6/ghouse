package bhai12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class xxx 
{
	public static void main(String[] args) {
		List<String>n=new ArrayList<String>();
n.add("sony");
n.add("aony");
n.add("dony");
n.add("tony");
n.add("gony");
n.add("mony");
n.add("swny");
//List<String>flt=n.Stream().filter(dt->dt.length()>4).collect(Collectors.toList());
//List<String>flt=n.Stream().filter(dt->dt.startsWith("a"))collect(Collectors.toList());
//List<String>flt=n.stream().distinct().collect(Collectors.toList());
List<String>flt=n.stream().sorted().collect(Collectors.toList());
flt.forEach(s->System.out.println(s));
	}

}
