package Business;

public class Country {
	private String country;

	public Country() {
		super();
	}

	public Country(String country) {
		super();
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Country [country=" + country + "]";
	}
	
	

	

	

}
