package orz.xuchao.test.lesson16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("customerBean16_2")
public class Customer16_2 {
	
	@Value("#{itemBean16_2}")
	private Item16_2 item;

	
//	Spring EL支持大多数标准的数学，逻辑和关系运算符。 例如，
//	关系运算符 – 等于 (==, eq), 不等于 (!=, ne), 小于 (<, lt), 小于或等于 (<= , le), 大于 (>, gt), 和大于或等于 (>=, ge).
//	逻辑运算符 – 且, 或, 非 (!).
//	数学运算符 – 加法(+), 减法 (-), 乘法 (*), 除法(/), 除模(%) 和指数幂 (^).
//	比如
//	@Value("#{1 == 1}") //true
//	@Value("#{1 >= 1}") //true
//	@Value("#{!(numberBean.no == 999)}") //false
	
//	if-else 也行
//	@Value("#{itemBean.qtyOnHand < 100 ? true : false}")
	
//	//get map whete key = 'MapA'
//	@Value("#{testBean.map['MapA']}")
//	//get first value from list, list is 0-based.
//	@Value("#{testBean.list[0]}")
	
//	还有正则表达式
//	@Value("#{'100' matches '\\d+' }")
//	private boolean isDigit;
	
	@Value("#{itemBean16_2.name.toUpperCase()}")
	private String itemName;

	@Value("#{itemBean16_2.getAge(11)}")
	private int age;
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Item16_2 getItem() {
		return item;
	}

	public void setItem(Item16_2 item) {
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
		
		return "item==>"+item.toString()+" itemName==>"+ itemName+" age==>"+age;
	}
	
	
}
