package EmployeeTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;




public class TestEmployee 
{
	public static void main(String[] args) {
		ArrayList<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(1,"Saloni",9876567654l,45000.100,"HR",30));
		elist.add(new Employee(2,"Amruta",7656765498l,35000.890,"IT",27));
		elist.add(new Employee(3,"Pooja",8767898767l,70000.100,"Finance",29));
		elist.add(new Employee(4,"Viraj",9988551123l,85000.100,"HR",35));
		elist.add(new Employee(5,"Anjali",9876567654l,15000.100,"HR",30));
		elist.add(new Employee(6,"Sankalp",9087654123l,32000.100,"IT",30));
		elist.add(new Employee(7,"Aniket",7062374658l,90000.100,"Testing",31));
		elist.add(new Employee(8,"Vinaya",8076427364l,45000.100,"IT",28));
		elist.add(new Employee(9,"Kirti",98377437467l,70000.100,"Finance",38));
		elist.add(new Employee(10,"Mayank",9487487846l,45000.100,"Testing",26));
		
		//1)For All Departments
		Set<String>allDepartments=elist.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		System.out.println("All Depatments are: "+allDepartments);
		
		//2)For All employess with Department Count
		Map<String,Long>depCount=elist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println("Depatment Count is : "+depCount);
		
		//3)Sort Employess by Name in Ascending order
		List<Employee>sortByName=elist.stream().sorted(Comparator.comparing(Employee::getEname))
				.collect(Collectors.toList());
		System.out.println("Employess Sorted By Name are: "+sortByName);
		
		//4)Sort Employess by Age in Descending order(H to L)
		List<Employee>sortByAge=elist.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println("Employess Sorted By Age are: "+sortByAge);
		
		//5)Sort Employess with Salary wise Ascending order(L to H)
		List<Employee>sortBySalaryAsc=elist.stream().sorted(Comparator.comparing(Employee::getEsalary))
				.collect(Collectors.toList());
		System.out.println("Employess Sorted With Salary Ascending order are: "+sortBySalaryAsc);
		
		//6)Sort Employess with Salary wise Descending order(L to H)
		List<Employee>sortBySalaryDes=elist.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed())
						.collect(Collectors.toList());
				System.out.println("Employess Sorted With Salary Descending Order are: "+sortBySalaryDes);
				
		//7)Get Employee with Max Salary
		Optional<Employee> maxSalaryEmp=elist.stream().max(Comparator.comparingDouble(Employee::getEsalary));
				
		System.out.println("Employee with Maximum Salary: "+maxSalaryEmp);
		
		//8)Get Employee with Max Salary
		Optional<Employee> minSalaryEmp=elist.stream().min(Comparator.comparingDouble(Employee::getEsalary));
						
				System.out.println("Employee with Maximum Salary: "+minSalaryEmp);
				
		//9)Find Sum Of All Salaries
		double totalSalary=elist.stream().mapToDouble(Employee::getEsalary).sum();
		System.out.println("Sum of All Salaries: "+totalSalary);
		//mapToDouble=>Convert elements of stream in numeric values.
		//Returns OptionalDouble
		
		//9)Find Average Of Salaries
		double averageSalary=elist.stream().mapToDouble(Employee::getEsalary).average().orElse(0);
		System.out.println("Average Salary is: "+averageSalary);
		
		//10)Find Total Employee Count
		long totalEmpCount=elist.stream().count();
		System.out.println("Total Employee Count is: "+totalEmpCount);
		
		//11)Find Second Highest Salary Employee
		List<Employee> topSalaries=elist.stream().sorted(Comparator.comparingDouble(Employee::getEsalary).reversed())
				.distinct().collect(Collectors.toList());
		Employee secondHighSalaryEmp=(topSalaries.size()>1)? topSalaries.get(1):null;
		System.out.println("Second Highest Salary  Employee: "+secondHighSalaryEmp);
		
		
		//12)Find top 3 highest Salary Employee
		List<Employee> topThreeSalaries=elist.stream().sorted(Comparator.comparingDouble(Employee::getEsalary).reversed())
				.limit(3).collect(Collectors.toList());
		System.out.println("top 3 highest Salary Employee are: "+topThreeSalaries);
		
	}
}
