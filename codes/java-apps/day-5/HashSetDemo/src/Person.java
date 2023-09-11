import java.security.InvalidParameterException;

public class Person {
	private Integer id;
	private String name;
	private Double salary;

	public Person() {

	}

	public Person(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id.intValue();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary.doubleValue();
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", Id: " + this.id.intValue() + ", Salary: " + this.salary.doubleValue();
	}

	@Override
	public int hashCode() {
		final int seed = 31;
		int hash = 0;
		hash = this.id.hashCode() * seed;
		hash = this.salary.hashCode() * hash;
		hash = this.name.hashCode() * hash;
		System.out.println("in hashCode, " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method");
		if (obj != null) {

			if (this == obj)
				return true;

			if (obj instanceof Person) {

				Person other = (Person) obj;

				if (!this.id.equals(other.id))
					return false;

				if (!this.name.equals(other.name))
					return false;

				if (!this.salary.equals(other.salary))
					return false;

				return true;
			} else
				throw new InvalidParameterException("obj is not of type Person");
		} else
			throw new NullPointerException("null reference");
	}

}
