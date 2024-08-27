package EmployeeTask;

public class Employee {
	private int eid;
	private String ename;
	private long econtact;
	private double esalary;
	private String department;
	private int age;
	
	
	public Employee(int eid, String ename, long econtact, double esalary, String department, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.econtact = econtact;
		this.esalary = esalary;
		this.department = department;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", econtact=" + econtact + ", esalary=" + esalary
				+ ", department=" + department + ", age=" + age + "]";
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getEcontact() {
		return econtact;
	}
	public void setEcontact(long econtact) {
		this.econtact = econtact;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
