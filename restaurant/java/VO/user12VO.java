package VO;

public class user12VO {
	
	private String id;
	private String name;
	
	private String email;
	private String password;
	private String phone;
	
	
	public user12VO() {
	}


		
	
	public user12VO(String id, String name, String email, String password, String phone) {
		super();
		this.id =id;
		this.name =name;
		
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	public user12VO(String id,String password) {
		super();
		this.id =id;
		this.password = password;
		
	}


	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	@Override
	public String toString() {
		return "user12VO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + "]";
	}

	
	

}
