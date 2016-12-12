package orz.xuchao.test.lesson19;

public class Customer19_5 {
	private Person19_5 person;

	public Customer19_5() {
	}
	
	
	public Customer19_5(Person19_5 person) {
		this.person = person;
	}

	public void setPerson(Person19_5 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer==>" + person.toString();
	}
}
