package javaHigh05.example06;

public class Values {
	private String store;
	private Integer sale;
	private String region;

	public Values(String region, String store, Integer sale) {
		super();
		this.store = store;
		this.sale = sale;
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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
