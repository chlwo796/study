package javaHigh03.example04;

public class Shop {
	private String custName;
	private String custPhone;
	private int point;

	public Shop(String custname, String custPhone, int point) {
		super();
		this.custName = custname;
		this.custPhone = custPhone;
		this.point = point;
	}

	public String getCustname() {
		return custName;
	}

	public void setCustname(String custname) {
		this.custName = custname;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public int hashCode() {
		// String custName, String custPhone;
		return custName.hashCode() + custPhone.hashCode();
	}@Override
	public boolean equals(Object obj) {
		// custName, custPhone이 같으면 같은 데이터로 취급
		if(obj instanceof Shop) {
			Shop shop = (Shop) obj;
			return shop.custName.equals(this.custName) && shop.custPhone.equals(this.custPhone);
		}
		return false;
	}
}
