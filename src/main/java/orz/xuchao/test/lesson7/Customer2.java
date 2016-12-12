package orz.xuchao.test.lesson7;

public class Customer2 {
	private Person person;

	public Customer2(Person person) {
		this.person = person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}
