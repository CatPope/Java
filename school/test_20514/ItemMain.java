package test_20514;

import org.graalvm.compiler.nodes.extended.GetClassNode;

public class ItemMain {

	public static void main(String[] args) {
		
		System.out.println(Item.getCompany()+"의 제품은 "+Item.getItemCnt());
		
		Item i1 = new Item();
		i1.setNo(101);
		i1.setName("산업로봇");
		i1.setPrice(1000);
		i1.setCount(15);
		
		Item i2 = new Item(102, "청소로봇");
		i2.setPrice(2000);
		i2.setCount(10);
		
		Item i3 = new Item(103, "탐사로봇", 3000, 5);		
		
		System.out.println("**************************************************");

		i1.printInfo();
		i2.printInfo();
		i3.printInfo();
		
		System.out.println("**************************************************");
		
		i1.outStore(5000);
		i1.inStore(5);
		i1.outStore(10);
		i2.inStore(3);
		i2.outStore(3353153);
		i2.outStore(5);
		i3.outStore(2);
		
		System.out.println("**************************************************");
		
		i1.printInfo();
		i2.printInfo();
		i3.printInfo();
		
	}

}
