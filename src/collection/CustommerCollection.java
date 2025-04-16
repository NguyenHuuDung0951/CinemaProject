package collection;

import java.util.ArrayList;
import java.util.List;


import entity.Customer;
 
public class CustommerCollection {
private ArrayList<Customer> customer;
	
	public CustommerCollection() {
		customer = new ArrayList<Customer>();
}
public ArrayList<Customer> getdanhsachnhanvien(){
return customer;
}
public boolean them(Customer cu) {
if( cu == null) {
	return false;
}
if(customer.contains(cu)) {
	return false;
}
customer.add(cu);
return true;
}
public boolean xoa(String maCustomer)
{
return customer.removeIf(tv->tv.getCustomerID().equals(maCustomer));
}

public List<Customer> tim(String maCus)
{
return customer.stream()
		.filter(tv->tv.getCustomerID().equalsIgnoreCase(maCus))
		.toList();
}
public void sua(Customer cu)
{
	customer.forEach(accmoi->
			{
				accmoi.setCustomerID(cu.getCustomerID());
				accmoi.setEmail(cu.getEmail());
				accmoi.setFullname(cu.getFullname());
				accmoi.setPhoneNumber(cu.getPhoneNumber());
				accmoi.setRegisDate(cu.getRegisDate());

			}
			);
}

}
