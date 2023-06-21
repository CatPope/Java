package test_20514;

public class Item {

	private int no;
	private int price;
	private int count;
	private String name;
	private static final String COMPANY = "로봇 주식회사";
	private static int itemCnt;
	
	
	public Item() {
		itemCnt++;
	}


	public Item(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}


	public Item(int no, String name, int price, int count) {
		this(no, name);
		this.price = price;
		this.count = count;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static int getItemCnt() {
		return itemCnt;
	}


	public static void setItemCnt(int itemCnt) {
		Item.itemCnt = itemCnt;
	}


	public static String getCompany() {
		return COMPANY;
	}
	
	
	public void printInfo() {
		System.out.println("물품코드:"+no+"  물품명:"+name+"  물품가격:"+price+"  물품개수:"+count);
	}
	
	public void inStore(int cnt){
		System.out.println("입고:"+name+", "+cnt+"개 입고 완료");
		count += cnt;
	}
	
	public void outStore(int cnt) {
		if(cnt <= count) {
			System.out.println("출고:"+name+", "+cnt+"개 출고 완료");
			count -= cnt;
		}
		else
			System.out.println("출고실패:"+name+", 현재 물품개수 "+count);
	}
	
}
