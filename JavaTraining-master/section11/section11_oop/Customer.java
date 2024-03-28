	package section11_oop;

public class Customer {
	private int customerId;
	private String customerName;
	private String address;
	private int phoneNo;
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Customer(int customerId, String customerName, String address, int phoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", phoneNo=" + phoneNo + "]";
	}

	
}
