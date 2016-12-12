package orz.xuchao.test.lesson19;

public class Customer19_2 {
	private Person19_2 person;

	public Customer19_2() {
	}
	
	
	public Customer19_2(Person19_2 person) {
		this.person = person;
	}

	public void setPerson(Person19_2 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer==>" + person.toString();
	}
}
