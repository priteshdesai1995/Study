package section11_oop;

public class Product {
	private int productNo;
	private String productName;
	
	private double price;
	private double quantity;
	
	public int getProductNo() {
		return productNo;
	}
	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Product(int productNo, String productName, double price, double quantity) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	

}
