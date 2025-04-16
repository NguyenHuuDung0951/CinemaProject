package Entity;

import java.util.Objects;

public class OrderDetail {
	private String oderDetailID;
	private TicketDetail detail;
	private Order order;
	private Product product;
	private MovieSchedule schedule;
	private int quantity;
	public OrderDetail() {
		super();
	}
	public OrderDetail(String oderDetailID, TicketDetail detail, Order order, Product product, MovieSchedule schedule,
			int quantity) {
		super();
		this.oderDetailID = oderDetailID;
		this.detail = detail;
		this.order = order;
		this.product = product;
		this.schedule = schedule;
		this.quantity = quantity;
	}
	public String getOderDetailID() {
		return oderDetailID;
	}
	public void setOderDetailID(String oderDetailID) {
		this.oderDetailID = oderDetailID;
	}
	public TicketDetail getDetail() {
		return detail;
	}
	public void setDetail(TicketDetail detail) {
		this.detail = detail;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public MovieSchedule getSchedule() {
		return schedule;
	}
	public void setSchedule(MovieSchedule schedule) {
		this.schedule = schedule;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(oderDetailID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetail other = (OrderDetail) obj;
		return Objects.equals(oderDetailID, other.oderDetailID);
	}
	@Override
	public String toString() {
		return "OderDetail [oderDetailID=" + oderDetailID + ", detail=" + detail + ", order=" + order + ", product="
				+ product + ", schedule=" + schedule + ", quantity=" + quantity + "]";
	}
	
}
