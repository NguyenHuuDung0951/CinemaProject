package collection;

import java.util.ArrayList;
import java.util.List;

import entity.SeatType;


public class SeatTypeCollection {
private ArrayList<SeatType> seattype;
	
	public SeatTypeCollection() {
		seattype = new ArrayList<SeatType>();
}
public ArrayList<SeatType> getdanhsachnhanvien(){
return seattype;
}
public boolean them(SeatType se) {
if( se == null) {
	return false;
}
if(seattype.contains(se)) {
	return false;
}
seattype.add(se);
return true;
}
public boolean xoa(String maSeat)
{
return seattype.removeIf(tv->tv.getSeatTypeID().equals(maSeat));
}

public List<SeatType> tim(String maSeatType)
{
return seattype.stream()
		.filter(tv->tv.getSeatTypeID().equalsIgnoreCase(maSeatType))
		.toList();
}
public void sua(SeatType se)
{
	seattype.forEach(accmoi->
			{
				accmoi.setDescriptionSeat(se.getDescriptionSeat());
				accmoi.setSeatTypeID(se.getSeatTypeID());
				accmoi.setSeatTypeName(se.getSeatTypeName());
			}
			);
}

}
