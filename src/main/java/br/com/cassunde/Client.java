package br.com.cassunde;

public class Client {

	private String name;
	private int age;
	private boolean debit;
	private double salary;

	public Client(String name, int age, boolean debit, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.debit = debit;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDebit() {
		return debit;
	}

	public void setDebit(boolean debit) {
		this.debit = debit;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
