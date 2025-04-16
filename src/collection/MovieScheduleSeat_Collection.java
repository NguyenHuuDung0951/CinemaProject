package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.MovieScheduleSeat;

public class MovieScheduleSeat_Collection {
	private ArrayList<MovieScheduleSeat> dsScheduleSeat;

	public MovieScheduleSeat_Collection() {
		dsScheduleSeat = new ArrayList<MovieScheduleSeat>();
	}

	public boolean them(MovieScheduleSeat mss) {
		if (mss == null) {
			return false;
		}
		if (dsScheduleSeat.contains(mss)) {
			return false;
		}
		dsScheduleSeat.add(mss);
		return true;
	}

	public List<MovieScheduleSeat> timTheoSchedule(String maSchedule) {
		return dsScheduleSeat.stream()
				.filter(item -> item.getSchedule().getScheduleID().equalsIgnoreCase(maSchedule))
				.toList();
	}

	public List<MovieScheduleSeat> timTheoSeat(String maSeat) {
		return dsScheduleSeat.stream()
				.filter(item -> item.getSeat().getSeatID().equalsIgnoreCase(maSeat))
				.toList();
	}

	public void xoa(MovieScheduleSeat mss) {
		dsScheduleSeat.remove(mss);
	}

	public void sua(MovieScheduleSeat mss) {
		for (MovieScheduleSeat item : dsScheduleSeat) {
			if (item.equals(mss)) {
				item.setAvaliable(mss.isAvaliable());
				break;
			}
		}
	}
}
