package exercicio;

public class Bank {
	
	private String name;
	private double value;
	private int accountNumber;

	public Bank(String name, double value, int accountNumber) {
		this.name = name;
		this.value = value;
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double depositValue(double dep) {
		double aux = dep+ value;
		setValue(aux);
		return aux;
	}
	
	public double withdrawValue(double dep) {
		double aux = value - dep;
		setValue(aux);
		return aux;
	}
	
	public String toString() {
		return "NOME: " + name + ", NUMACC: " + accountNumber + "SALDO: " + value;
	}
	

}
