package rsvier.workshop2.domain;



public class Address {

	private String streetName;
	private int houseNumber;
	private String postalCode;
	private String city;
	
	
	public Address(String streetName, int houseNumber, String postalCode, String city) {
		
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.postalCode = postalCode;
		this.city = city;
	}
	
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
