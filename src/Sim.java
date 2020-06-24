
public class Sim {
	int id ;
	String name ;
	double balance ;
	double rate ;
	String circle ;
	public Sim(int id, String name, double balance, double rate, String circle) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.rate = rate;
		this.circle = circle;
	}
	public int getId() {
		return id;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	
}
