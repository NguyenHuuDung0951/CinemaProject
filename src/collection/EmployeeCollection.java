package collection;

import java.util.ArrayList;
import java.util.List;

import entity.Employee;


public class EmployeeCollection {
private ArrayList<Employee> employee;
	
	public EmployeeCollection() {
		employee = new ArrayList<Employee>();
}
public ArrayList<Employee> getdanhsachnhanvien(){
return employee;
}
public boolean them(Employee em) {
if( em == null) {
	return false;
}
if(employee.contains(em)) {
	return false;
}
employee.add(em);
return true;
}
public boolean xoa(String maEmp)
{
return employee.removeIf(tv->tv.getEmployeeID().equals(maEmp));
}

public List<Employee> tim(String maEmployee)
{
return employee.stream()
		.filter(tv->tv.getEmployeeID().equalsIgnoreCase(maEmployee))
		.toList();
}
public void sua(Employee em)
{
	employee.forEach(accmoi->
			{
				accmoi.setDateOfBirth(em.getDateOfBirth());
				accmoi.setEmail(em.getEmail());
				accmoi.setEmployeeID(em.getEmployeeID());
				accmoi.setFullname(em.getFullname());
				accmoi.setGender(em.isGender());
				accmoi.setPhoneNumber(em.getPhoneNumber());
				accmoi.setSalary(em.getSalary());	
			}
			);
}
}
