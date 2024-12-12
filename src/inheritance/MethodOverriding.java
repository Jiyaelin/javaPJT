package inheritance;
class ParentC{
	public void job() {
		System.out.println("Teacher");	
		}
	public void phone() {
		System.out.println("iphone");
	}
}
class ChildC extends ParentC{
	@Override
	public void job() {
		System.out.println("Doctor");
		super.job();
	}
	@Override
	public void phone() {
		System.out.println("Samsang");
		super.phone();
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		ChildC ob=new ChildC();
		ob.job();
		ob.phone();

	}

}
