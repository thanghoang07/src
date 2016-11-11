package model;

public class Account {
	private String mail, pass, name, phone, mobile, country_name, city, address, district;
	private String date;

	public Account(String mail, String pass, String name, String phone, String mobile, String country_name, String city,
			String address, String district, String date) {
		super();
		this.mail = mail;
		this.pass = pass;
		this.name = name;
		this.phone = phone;
		this.mobile = mobile;
		this.country_name = country_name;
		this.city = city;
		this.address = address;
		this.district = district;
		this.date = date;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	@Override
	public String toString() {
		return "mail=" + mail + "%npass=" + pass + "%nname=" + name + "%nphone=" + /*System.out.format("%,8d%n", phone)*/ phone + "%nmobile=" + mobile
				+ "%ncountry_name=" + country_name + "%ncity=" + city + "%naddress=" + address + "%ndistrict="
				+ district + "%ndate=" + date;
	}

}
