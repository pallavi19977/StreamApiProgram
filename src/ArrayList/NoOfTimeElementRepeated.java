package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfTimeElementRepeated {
	public static void main(String[] args) {
		List<Integer> no=new ArrayList<>();
		no.add(10);
		no.add(20);
		no.add(35);
		no.add(48);
		no.add(5);
		no.add(90);
		no.add(16);
		no.add(20);
		no.add(35);
		no.add(20);
		no.add(35);
		no.add(35);
		no.add(35);
		no.add(16);
		Map<Object, Long>repNo=no.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		repNo.forEach((key,value)->System.out.println("Number "+ key +" is repeated "+ value +"times."));
		//Collectors.counting()=>It counts the occurence of each no.
		
		List<Integer>oddNoSquare=no.stream().filter(n->n%2!=0).map(n->n*n).distinct().collect(Collectors.toList());
		System.out.println("Square of Odd Numbers: "+oddNoSquare);
	}
}//filter(n->n%2!=0)=>Will filter the list to get only odd nos.
//map(n->n*n)=>With this each odd no.will get  squared.
