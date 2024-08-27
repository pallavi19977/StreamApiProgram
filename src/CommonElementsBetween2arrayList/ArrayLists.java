package CommonElementsBetween2arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLists {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(101);
		list1.add(201);
		list1.add(301);
		list1.add(401);
		list1.add(501);
		list1.add(601);
		list1.add(701);
		list1.add(801);

		List<Integer> list2=new ArrayList<>();
		list2.add(101);
		list2.add(201);
		list2.add(305);
		list2.add(401);
		list2.add(501);
		list2.add(601);
		list2.add(708);
		list2.add(801);
		list2.add(901);
		
		List<Integer> CE=list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		System.out.println("Common Elements Are: "+CE);
	}

}







//contain method se common elemet finds hote hai 
