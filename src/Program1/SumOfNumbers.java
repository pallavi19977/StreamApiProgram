package Program1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Print The SumOf Given Numbers

public class SumOfNumbers {
	public static void main(String args[])
	{
		List<Integer>list=Arrays.asList(10,5,5,20);
		Optional<Integer>sum=list.stream().reduce((a,b)->a+b);//stream()is method present in jdk 1.8
		System.out.println("Sum Of Number is: "+sum.get());
	}
}
