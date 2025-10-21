package sale;

import java.util.ArrayList;
import java.util.List;

import produtos.Product;

public abstract class Sale {
	protected List<SaleItem> items = new ArrayList<>();
	
	public abstract String getType();
	
	public boolean addItem(Product produto, int quantidade) {
		if (produto.removeStock(quantidade)) {
            items.add(new SaleItem(produto, quantidade));
            return true;
        } else {
        	return false;
        }
	}
	
	public double getTotal() {
        return items.stream().mapToDouble(SaleItem::getSubtotal).sum();
    }

    public List<SaleItem> getItems() {
        return items;
    }

}
