package Entity;

import java.time.LocalDate;
import java.util.Objects;

public class SeatType {
	private String seatTypeID;
	private String seatTypeName;
	private String descriptionSeat;
	public SeatType(String seatTypeID, String seatTypeName, String descriptionSeat) {
		super();
		this.seatTypeID = seatTypeID;
		this.seatTypeName = seatTypeName;
		this.descriptionSeat = descriptionSeat;
	}
	public String getSeatTypeID() {
		return seatTypeID;
	}
	public void setSeatTypeID(String seatTypeID) {
		this.seatTypeID = seatTypeID;
	}
	public String getSeatTypeName() {
		return seatTypeName;
	}
	public void setSeatTypeName(String seatTypeName) {
		this.seatTypeName = seatTypeName;
	}
	public String getDescriptionSeat() {
		return descriptionSeat;
	}
	public void setDescriptionSeat(String descriptionSeat) {
		this.descriptionSeat = descriptionSeat;
	}
	@Override
	public String toString() {
		return "SeatType [seatTypeID=" + seatTypeID + ", seatTypeName=" + seatTypeName + ", descriptionSeat="
				+ descriptionSeat + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(seatTypeID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeatType other = (SeatType) obj;
		return Objects.equals(seatTypeID, other.seatTypeID);
	}
	
	
	
}
