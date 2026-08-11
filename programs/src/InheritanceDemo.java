class Person{
	String name, addr;
	int age;
	Person(String name, int age, String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	public String toString() {
		return "Name: "+name+" Addr: "+addr;
		
	}
}
class Employe extends Person {
	int empid;
	String dept;
	Employe(Person p, int empid, String dept){
		super(p.name,p.age,p.addr);
		this.empid=empid;
		this.dept=dept;
	}
	void getDetails() {
		System.out.println("Emp id: "+empid+" Dept: "+dept);
	}
	
}
public class InheritanceDemo {
	public static void main(String[] args) {
		Person p=new Person("ABC",21,"wgl");
		Employe e=new Employe(p,123,"sales");
		System.out.println(p);
		e.getDetails();
	}
}
