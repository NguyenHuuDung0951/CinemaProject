package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.OrderDetail;
import Entity.Product;

public class OrderDetail_Collection {
		private ArrayList<OrderDetail> dsOrder;
			public OrderDetail_Collection() {
				// TODO Auto-generated constructor stub
			dsOrder=new ArrayList<OrderDetail>();
			}
			public boolean them(OrderDetail or)
			{
				if(or==null)
				{
					return false;
				}
				if(dsOrder.contains(or))
				{
					return false;
				}
				dsOrder.add(or);
				return true;
			}
			public List<OrderDetail> tim(String maOrder)
			{
				return dsOrder.stream()
						.filter(pr->pr.getOderDetailID().equalsIgnoreCase(maOrder))
						.toList();
			}
			public void xoa(String maOrder)
			{
				dsOrder.removeIf(pr->pr.getOderDetailID().equalsIgnoreCase(maOrder));
			}
			public void sua(OrderDetail or)
			{
				dsOrder.forEach(ormoi->{
					ormoi.setDetail(or.getDetail());
					ormoi.setOderDetailID(or.getOderDetailID());
					ormoi.setOrder(or.getOrder());
					ormoi.setProduct(or.getProduct());
					ormoi.setQuantity(or.getQuantity());
					ormoi.setSchedule(or.getSchedule());
				});
			}

}	
