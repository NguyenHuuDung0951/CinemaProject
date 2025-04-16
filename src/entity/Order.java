package Entity;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
	private String orderID;
	private LocalDate orderDate;
	private double totalPrice;
	private Customer customer;
	private Employee employee;
	public Order(String orderID, LocalDate orderDate, double totalPrice, Customer customer, Employee employee) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.customer = customer;
		this.employee = employee;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", totalPrice=" + totalPrice + ", customer="
				+ customer + ", employee=" + employee + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(orderID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(orderID, other.orderID);
	}
	
	
}
