package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.MovieSchedule;

public class MovieSchedule_Collection {
	private ArrayList<MovieSchedule> dsSchedule;

	public MovieSchedule_Collection() {
		dsSchedule = new ArrayList<MovieSchedule>();
	}

	public boolean them(MovieSchedule schedule) {
		if (schedule == null) {
			return false;
		}
		if (dsSchedule.contains(schedule)) {
			return false;
		}
		dsSchedule.add(schedule);
		return true;
	}

	public List<MovieSchedule> tim(String maSchedule) {
		return dsSchedule.stream()
				.filter(sch -> sch.getScheduleID().equalsIgnoreCase(maSchedule))
				.toList();
	}

	public void xoa(String maSchedule) {
		dsSchedule.removeIf(sch -> sch.getScheduleID().equalsIgnoreCase(maSchedule));
	}

	public void sua(MovieSchedule schedule) {
		for (MovieSchedule schMoi : dsSchedule) {
			if (schMoi.getScheduleID().equalsIgnoreCase(schedule.getScheduleID())) {
				schMoi.setMovie(schedule.getMovie());
				schMoi.setRoom(schedule.getRoom());
				schMoi.setStarttime(schedule.getStarttime());
				schMoi.setEndtime(schedule.getEndtime());
				break;
			}
		}
	}
}
