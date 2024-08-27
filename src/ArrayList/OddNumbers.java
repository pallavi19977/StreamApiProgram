package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
	public static void main(String[] args) {
		List<Integer> ln=new ArrayList<>();
		ln.add(1);
		ln.add(2);
		ln.add(3);
		ln.add(4);
		ln.add(5);
		ln.add(6);
		ln.add(7);
		ln.add(8);
		ln.add(9);
		ln.add(10);
		List<Integer> on=ln.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("Even numbers are: "+on);

	}
}
