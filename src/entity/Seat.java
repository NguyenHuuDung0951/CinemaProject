package Entity;

import java.util.Objects;

public class Seat {
	private String seatID;
	private String seatLocation;
	private Room room;
	private SeatType seatType;
	public Seat() {
		
	}
	public Seat(String seatID, String seatLocation, Room room, SeatType seatType) {
	
		this.seatID = seatID;
		this.seatLocation = seatLocation;
		this.room = room;
		this.seatType = seatType;
	}
	public String getSeatID() {
		return seatID;
	}
	public void setSeatID(String seatID) {
		this.seatID = seatID;
	}
	public String getSeatLocation() {
		return seatLocation;
	}
	public void setSeatLocation(String seatLocation) {
		this.seatLocation = seatLocation;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(seatID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return Objects.equals(seatID, other.seatID);
	}
	@Override
	public String toString() {
		return "Seat [seatID=" + seatID + ", seatLocation=" + seatLocation + ", room=" + room + ", seatType=" + seatType
				+ "]";
	}
	
	
}
