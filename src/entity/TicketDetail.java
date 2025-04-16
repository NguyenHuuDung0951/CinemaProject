package Entity;

import java.time.LocalDate;
import java.util.Objects;

public class TicketDetail {
	private String tiketID;
	private LocalDate printTime;
	private Movies movie;
	private LocalDate showDate;
	private Seat seat;
	private Room room;
	private double tiketPrice;
	public TicketDetail() {
		super();
	}
	public TicketDetail(String tiketID, LocalDate printTime, Movies movie, LocalDate showDate, Seat seat, Room room,
			double tiketPrice) {
		super();
		this.tiketID = tiketID;
		this.printTime = printTime;
		this.movie = movie;
		this.showDate = showDate;
		this.seat = seat;
		this.room = room;
		this.tiketPrice = tiketPrice;
	}
	public String getTiketID() {
		return tiketID;
	}
	public void setTiketID(String tiketID) {
		this.tiketID = tiketID;
	}
	public LocalDate getPrintTime() {
		return printTime;
	}
	public void setPrintTime(LocalDate printTime) {
		this.printTime = printTime;
	}
	public Movies getMovie() {
		return movie;
	}
	public void setMovie(Movies movie) {
		this.movie = movie;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public double getTiketPrice() {
		return tiketPrice;
	}
	public void setTiketPrice(double tiketPrice) {
		this.tiketPrice = tiketPrice;
	}
	@Override
	public int hashCode() {
		return Objects.hash(tiketID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketDetail other = (TicketDetail) obj;
		return Objects.equals(tiketID, other.tiketID);
	}
	@Override
	public String toString() {
		return "TicketDetail [tiketID=" + tiketID + ", printTime=" + printTime + ", movie=" + movie + ", showDate="
				+ showDate + ", seat=" + seat + ", room=" + room + ", tiketPrice=" + tiketPrice + "]";
	}
	
}
