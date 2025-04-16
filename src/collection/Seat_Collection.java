package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.Seat;

public class Seat_Collection {
	private ArrayList<Seat> dsSeat;
	public Seat_Collection() {
		// TODO Auto-generated constructor stub
		dsSeat=new ArrayList<Seat>();
	}
	public boolean them(Seat s)
	{
		if(s==null)
		{
			return false;
		}
		if(dsSeat.contains(s))
		{
			return false;
		}
		dsSeat.add(s);
		return true;
	}
	public List<Seat> tim(String maSeat)
	{
		return dsSeat.stream()
				.filter(s->s.getSeatID().equalsIgnoreCase(maSeat))
				.toList();
	}
	public void xoa(String maSeat)
	{
		dsSeat.removeIf(s->s.getSeatID().equalsIgnoreCase(maSeat));
	}
	public void sua(Seat s)
	{
		dsSeat.forEach(smoi->
		{
			smoi.setSeatID(s.getSeatID());
			smoi.setRoom(s.getRoom());
			smoi.setSeatLocation(s.getSeatLocation());
			smoi.setSeatType(s.getSeatType());
		}
				);
		
	}
}


	


