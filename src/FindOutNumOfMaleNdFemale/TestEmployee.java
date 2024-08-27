package FindOutNumOfMaleNdFemale;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(1,"A",38,"Female",45000));//Here we Passed values in paramater from Const of Emp class
		elist.add(new Employee(2,"B",28,"Male",35000));//i.e id,name,Gender.salary
		elist.add(new Employee(3,"C",25,"Female",55000));
		elist.add(new Employee(4,"D",45,"Male",40000));
		elist.add(new Employee(5,"E",55,"Female",48000));
		elist.add(new Employee(6,"F",27,"Female",45000));
		
		//This will give No.Of Male And Females
		Map<String,Long>collect1=elist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(collect1);
		
		//This Will Pring Average of SAlaries Of Male And Female
		Map<String, Double>collect=elist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect);
		
		//To Sort Employee With Their Age
		List<Employee>sortemp=elist.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		sortemp.forEach(emplist->System.out.println("Age= "+emplist.getAge()+"Name= "+emplist.getName()));
		
		
	}
}
