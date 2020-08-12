package hib3;

public class Address {
	int block_no;
	String street;
	String city;
	public int getBlock_no() {
		return block_no;
	}
	public void setBlock_no(int block_no) {
		this.block_no = block_no;
	}
	public String getStreet() {
		System.out.println("Street");
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		System.out.println("City");
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
