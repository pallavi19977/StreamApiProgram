package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestToLowestNumbers {
	public static void main(String[] args) 
	{
		List<Integer> no=new ArrayList<>();
		no.add(10);
		no.add(20);
		no.add(35);
		no.add(48);
		no.add(5);
		no.add(90);
		no.add(16);
		List<Integer>sortNos=no.stream().sorted((n1,n2)->n2-n1).collect(Collectors.toList());
		System.out.println("ArrayList From HighestToLowestNumbers: "+no);
		sortNos.forEach(System.out::println);
	}
}
