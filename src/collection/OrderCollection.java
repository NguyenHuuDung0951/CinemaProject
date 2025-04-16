package collection;

import java.util.ArrayList;
import java.util.List;
import entity.Order;



public class OrderCollection {
private ArrayList<Order> order;
	
	public OrderCollection() {
		order = new ArrayList<Order>();
}
public ArrayList<Order> getdanhsachnhanvien(){
return order;
}
public boolean them(Order or) {
if( or == null) {
	return false;
}
if(order.contains(or)) {
	return false;
}
order.add(or);
return true;
}
public boolean xoa(String maOrder)
{
return order.removeIf(tv->tv.getOrderID().equals(maOrder));
}

public List<Order> tim(String maOrderr)
{
return order.stream()
		.filter(tv->tv.getOrderID().equalsIgnoreCase(maOrderr))
		.toList();
}
public void sua(Order or)
{
	order.forEach(accmoi->
			{
				accmoi.setCustomer(or.getCustomer());
				accmoi.setEmployee(or.getEmployee());
				accmoi.setOrderDate(or.getOrderDate());
				accmoi.setOrderID(or.getOrderID());	
				accmoi.setTotalPrice(or.getTotalPrice());	

			}
			);
}

}
