package orz.xuchao.test.lesson19;

public class Customer19_3 {
	private Person19_3 person;

	public Customer19_3() {
	}
	
	
	public Customer19_3(Person19_3 person) {
		this.person = person;
	}

	public void setPerson(Person19_3 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer==>" + person.toString();
	}
}
