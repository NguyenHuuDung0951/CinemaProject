package entity;

import java.util.Objects;

public class MovieScheduleSeat {
	private MovieSchedule schedule;
	private Seat seat;
	private boolean isAvaliable;
	public MovieScheduleSeat() {
		super();
	}
	public MovieScheduleSeat(MovieSchedule schedule, Seat seat, boolean isAvaliable) {
		super();
		this.schedule = schedule;
		this.seat = seat;
		this.isAvaliable = isAvaliable;
	}
	public MovieSchedule getSchedule() {
		return schedule;
	}
	public void setSchedule(MovieSchedule schedule) {
		this.schedule = schedule;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public boolean isAvaliable() {
		return isAvaliable;
	}
	public void setAvaliable(boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}
	@Override
	public String toString() {
		return "MovieScheduleSeat [schedule=" + schedule + ", seat=" + seat + ", isAvaliable=" + isAvaliable + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(schedule, seat);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieScheduleSeat other = (MovieScheduleSeat) obj;
		return Objects.equals(schedule, other.schedule) && Objects.equals(seat, other.seat);
	}



	
}
