package javaHigh05.example05;

public class BusinessSale{
	private String teamName;
	private String store;
	private Integer sale;
	private BusinessSale businessSale;

	public BusinessSale(String store, BusinessSale businessSale){
		super();
		this.store = store;
		this.businessSale = businessSale;
	}

	public BusinessSale(String store, Integer sale) {
		super();
		this.store = store;
		this.sale = sale;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Integer getSale() {
		return sale;
	}

	public void setSale(Integer sale) {
		this.sale = sale;
	}
}
