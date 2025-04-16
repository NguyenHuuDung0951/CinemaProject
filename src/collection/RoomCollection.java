package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.Room;



public class RoomCollection {
private ArrayList<Room> room;
	
	public RoomCollection() {
		room = new ArrayList<Room>();
}
public ArrayList<Room> getdanhsachnhanvien(){
return room;
}
public boolean them(Room ro) {
if( ro == null) {
	return false;
}
if(room.contains(ro)) {
	return false;
}
room.add(ro);
return true;
}
public boolean xoa(String maRoom)
{
return room.removeIf(tv->tv.getScheduleID().equals(maRoom));
}

public List<Room> tim(String maRooms)
{
return room.stream()
		.filter(tv->tv.getScheduleID().equalsIgnoreCase(maRooms))
		.toList();
}
public void sua(Room ro)
{
	room.forEach(accmoi->
			{
				accmoi.setNumberOfseats(ro.getNumberOfseats());
				accmoi.setRoomName(ro.getRoomName());
				accmoi.setScheduleID(ro.getScheduleID());
			}
			);
}

}
