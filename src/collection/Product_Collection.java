package Collection;

import java.util.ArrayList;
import java.util.List;

import Entity.Product;

public class Product_Collection {
	private ArrayList<Product> dsProduct;
	public Product_Collection() {
		dsProduct=new ArrayList<Product>();
	}
	public boolean themProduct(Product pr)
	{
		if(pr==null)
		{
			return false;
		}
		if(dsProduct.contains(pr))
		{
			return false;
		}
		dsProduct.add(pr);
		return true;
	}
	public List<Product> tim(String maProDuct)
	{
		return dsProduct.stream()
				.filter(pr->pr.getProductID().equalsIgnoreCase(maProDuct))
				.toList();
	}
	public void xoa(String maProduct)
	{
		dsProduct.removeIf(pr->pr.getProductID().equalsIgnoreCase(maProduct));
	}
	public void sua(Product pr)
	{
		dsProduct.forEach(prmoi->{
			prmoi.setProductID(pr.getProductID());
			prmoi.setQuantity(pr.getQuantity());
			prmoi.setProductName(pr.getProductName());
			prmoi.setProductType(pr.getProductType());
			prmoi.setPromotion(pr.isPromotion());
			prmoi.setPrice(pr.getPrice());
		});
	}

}
