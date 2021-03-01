import p2utils.Queue;
import p2utils.HashTable;

public class SupermarketOrdering {
	
	private Queue<Order> orders;
	private HashTable<Integer> prodencom;
	
	public SupermarketOrdering(){
		this.orders = new Queue<>();
		this.prodencom = new HashTable<>(10);
	}
	
	public void enterOrder(Order o) {
		orders.in(o);
		prodencom.set(o.prodName, o.quantity);
	}
	
	public Order serveOrder(){
		Order o = orders.peek();
		orders.out();
		prodencom.set(o.prodName, prodencom.get(o.prodName) - o.quantity);
		return o;
	}
	
	public void displayOrders(){
		orders.toString();
	}
	
	public int query(String product){
		return prodencom.get(product);
	}
	
	public int numOrders(){
		return orders.size();
	}
}

