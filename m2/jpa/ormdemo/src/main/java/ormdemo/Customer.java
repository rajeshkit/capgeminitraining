package ormdemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer { // POJO class or Entity class
	private String name;
	@Id
	private int id;
	private long phone;
	private String email;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, int id, long phone, String email) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
