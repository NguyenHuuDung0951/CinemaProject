package entity;

import java.time.LocalDate;
import java.util.Objects;

public class MovieSchedule {
	private String scheduleID;
	private Movies movie;
	private Room room;
	private LocalDate starttime;
	private LocalDate endtime;
	public MovieSchedule() {
		super();
	}
	public MovieSchedule(String scheduleID, Movies movie, Room room, LocalDate starttime, LocalDate endtime) {
		super();
		this.scheduleID = scheduleID;
		this.movie = movie;
		this.room = room;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	public String getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}
	public Movies getMovie() {
		return movie;
	}
	public void setMovie(Movies movie) {
		this.movie = movie;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public LocalDate getStarttime() {
		return starttime;
	}
	public void setStarttime(LocalDate starttime) {
		this.starttime = starttime;
	}
	public LocalDate getEndtime() {
		return endtime;
	}
	public void setEndtime(LocalDate endtime) {
		this.endtime = endtime;
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
		MovieSchedule other = (MovieSchedule) obj;
		return Objects.equals(scheduleID, other.scheduleID);
	}
	@Override
	public String toString() {
		return "MovieSchedule [scheduleID=" + scheduleID + ", movie=" + movie + ", room=" + room + ", starttime="
				+ starttime + ", endtime=" + endtime + "]";
	}
	
}
