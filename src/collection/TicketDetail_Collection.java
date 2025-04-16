package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.TicketDetail;

public class TicketDetail_Collection {
	private ArrayList<TicketDetail> dsTicket;

	public TicketDetail_Collection() {
		dsTicket = new ArrayList<TicketDetail>();
	}

	public boolean them(TicketDetail ticket) {
		if (ticket == null) {
			return false;
		}
		if (dsTicket.contains(ticket)) {
			return false;
		}
		dsTicket.add(ticket);
		return true;
	}

	public List<TicketDetail> tim(String maTicket) {
		return dsTicket.stream()
				.filter(tk -> tk.getTiketID().equalsIgnoreCase(maTicket))
				.toList();
	}

	public void xoa(String maTicket) {
		dsTicket.removeIf(tk -> tk.getTiketID().equalsIgnoreCase(maTicket));
	}

	public void sua(TicketDetail ticket) {
		dsTicket.forEach(tkmoi -> {
			tkmoi.setTiketID(ticket.getTiketID());
			tkmoi.setPrintTime(ticket.getPrintTime());
			tkmoi.setMovie(ticket.getMovie());
			tkmoi.setShowDate(ticket.getShowDate());
			tkmoi.setSeat(ticket.getSeat());
			tkmoi.setRoom(ticket.getRoom());
			tkmoi.setTiketPrice(ticket.getTiketPrice());
		});
	}
}
