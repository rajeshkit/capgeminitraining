import java.io.Serializable;

import com.sun.source.doctree.SerialDataTree;

public class Cart implements Serializable{ //POJO - Plain Old Java Object - all variables are private getters and setters
	private String userId;
	private String productName;
	private String Quantity;
	private Integer cost;
	 
	public Cart() {
		super();
	}

	public Cart(String userId, String productName, String quantity, Integer cost) {
		super();
		this.userId = userId;
		this.productName = productName;
		Quantity = quantity;
		this.cost = cost;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getUserId() {
		return userId;
	}
	public String getProductName() {
		return productName;
	}
	public String getQuantity() {
		return Quantity;
	}
	public Integer getCost() {
		return cost;
	}
	
		
	 
}
