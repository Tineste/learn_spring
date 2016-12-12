package orz.xuchao.test.lesson16;

public class Customer16 {
	private Item16 item;

	private String itemName;

	public Item16 getItem() {
		return item;
	}

	public void setItem(Item16 item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		
		return "item==>"+item.toString()+" itemName==>"+ itemName;
	}
	
	
}
