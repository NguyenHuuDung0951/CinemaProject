package entity;

import java.util.Objects;

public class Room {
	private String scheduleID;
	private String roomName;
	private int numberOfseats;
	public Room(String scheduleID, String roomName, int numberOfseats) {
		super();
		this.scheduleID = scheduleID;
		this.roomName = roomName;
		this.numberOfseats = numberOfseats;
	}
	public String getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getNumberOfseats() {
		return numberOfseats;
	}
	public void setNumberOfseats(int numberOfseats) {
		this.numberOfseats = numberOfseats;
	}
	@Override
	public String toString() {
		return "Room [scheduleID=" + scheduleID + ", roomName=" + roomName + ", numberOfseats=" + numberOfseats + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(scheduleID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(scheduleID, other.scheduleID);
	}
	
	
}
