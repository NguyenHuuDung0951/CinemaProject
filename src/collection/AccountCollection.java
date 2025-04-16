package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.Account;

public class AccountCollection {
	private ArrayList<Account> acount;
	
	public AccountCollection() {
		acount = new ArrayList<Account>();
}
	public ArrayList<Account> getdanhsachnhanvien(){
		return acount;
	}
	public boolean them(Account ac) {
		if( ac == null) {
			return false;
		}
		if(acount.contains(ac)) {
			return false;
		}
		acount.add(ac);
		return true;
	}
	public boolean xoa(String maAcc)
	{
		return acount.removeIf(tv->tv.getAccountID().equals(maAcc));
	}

	public List<Account> tim(String maAccount)
	{
		return acount.stream()
		.filter(tv->tv.getAccountID().equalsIgnoreCase(maAccount))
		.toList();
	}
	public void sua(Account ac)
	{
	acount.forEach(accmoi->
			{
				accmoi.setAccountID(ac.getAccountID());
				accmoi.setPassword(ac.getPassword());
				accmoi.setStatus(ac.getStatus());
				accmoi.setUsername(ac.getUsername());	
			}
			);
}

}