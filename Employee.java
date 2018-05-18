
public class Employee {

	private String name;
	private String lastname;
	private int code;
	private double misthos;
	
	
	public Employee(String name, String lastname, int code, double misthos) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.code = code;
		this.misthos = misthos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getMisthos() {
		return misthos;
	}
	public void setMisthos(double misthos) {
		this.misthos = misthos;
	}
	

	@Override
	public String toString() {
		return getName() + " "+ getLastname() +" "+getCode()+" " +getMisthos();
	}
	
}
