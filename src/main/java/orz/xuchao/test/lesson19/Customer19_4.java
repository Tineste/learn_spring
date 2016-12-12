package orz.xuchao.test.lesson19;

public class Customer19_4 {
	private Person19_4 person;

	public Customer19_4() {
	}
	
	
	public Customer19_4(Person19_4 person) {
		this.person = person;
	}

	public void setPerson(Person19_4 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer==>" + person.toString();
	}
}
