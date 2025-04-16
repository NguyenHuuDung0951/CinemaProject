package entity;

import java.util.Objects;

public class Payment {
	private String paymenID;
	private String paymentMethod;
	private boolean paymentSatus;
	public Payment(String paymenID, String paymentMethod, boolean paymentSatus) {
		super();
		this.paymenID = paymenID;
		this.paymentMethod = paymentMethod;
		this.paymentSatus = paymentSatus;
	}
	public String getPaymenID() {
		return paymenID;
	}
	public void setPaymenID(String paymenID) {
		this.paymenID = paymenID;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public boolean isPaymentSatus() {
		return paymentSatus;
	}
	public void setPaymentSatus(boolean paymentSatus) {
		this.paymentSatus = paymentSatus;
	}
	@Override
	public String toString() {
		return "Payment [paymenID=" + paymenID + ", paymentMethod=" + paymentMethod + ", paymentSatus=" + paymentSatus
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(paymenID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(paymenID, other.paymenID);
	}
	
	
}
