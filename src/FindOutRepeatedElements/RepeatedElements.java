package FindOutRepeatedElements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedElements {
	public static void main(String[] args)
	{
		//Created ArrayList with some Elements
		List<Integer>li=Arrays.asList(1,2,3,4,5,6,7,8,9,2,4,6,8);
		Set<Integer>Re=li.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		System.out.println("Repeated Elements Are: "+Re);
	}

}

























//collect()-group the