package inheritance;

class Employeenew{
	private String empname;
	private String empdesignation;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
public class Encapsulationpgm {

	public static void main(String[] args) {
		Employeenew ob=new Employeenew();
		ob.setEmpname("jiya");
		ob.setEmpdesignation("tester");
		ob.setEmpid(101);
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpdesignation());
		System.out.println(ob.getEmpid());

	}

}
