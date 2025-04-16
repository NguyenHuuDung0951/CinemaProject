package collection;

import java.util.ArrayList;
import java.util.List;
import entity.Payment;



public class PaymentCollection {
private ArrayList<Payment> payment;
	
	public PaymentCollection() {
		payment = new ArrayList<Payment>();
}
public ArrayList<Payment> getdanhsachnhanvien(){
return payment;
}
public boolean them(Payment pa) {
if( pa == null) {
	return false;
}
if(payment.contains(pa)) {
	return false;
}
payment.add(pa);
return true;
}
public boolean xoa(String maPay)
{
return payment.removeIf(tv->tv.getPaymenID().equals(maPay));
}

public List<Payment> tim(String maPayment)
{
return payment.stream()
		.filter(tv->tv.getPaymenID().equalsIgnoreCase(maPayment))
		.toList();
}
public void sua(Payment pa)
{
	payment.forEach(accmoi->
			{
				accmoi.setPaymenID(pa.getPaymenID());
				accmoi.setPaymentMethod(pa.getPaymentMethod());
				accmoi.setPaymentSatus(pa.isPaymentSatus());
			}
			);
}
}
