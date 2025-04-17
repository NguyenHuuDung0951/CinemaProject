package entity;

import java.util.Objects;

public class Product {
	private String productID;
	private String productName;
	private int quantity;
	private String productType;
	private boolean promotion;
	private double price;
	public Product() {
		this("","",0,"",true,0.0);
	}
	public Product(String productID, String productName, int quantity, String productType, boolean promotion,
			double price) {
		this.productID = productID;
		this.productName = productName;
		this.quantity = quantity;
		this.productType = productType;
		this.promotion = promotion;
		this.price = price;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public boolean isPromotion() {
		return promotion;
	}
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, productID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productID, other.productID);
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", quantity=" + quantity
				+ ", productType=" + productType + ", promotion=" + promotion + ", price=" + price + "]";
	}
	
}
