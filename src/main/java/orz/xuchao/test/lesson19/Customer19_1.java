package orz.xuchao.test.lesson19;

public class Customer19_1 {
	private Person19_1 person;

	public Customer19_1() {
	}
	
	
	public Customer19_1(Person19_1 person) {
		this.person = person;
	}

	public void setPerson(Person19_1 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer==>" + person.toString();
	}
}
