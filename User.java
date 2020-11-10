package marina1109w6d1assignment;

import java.util.Random;

public class User implements Comparable <User> {
	

	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public User(String firstName, String lastName, String phoneNumber, String email) {
		setId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		 Random rnd = new Random();
			this.id = rnd.nextInt(99001)+1000;
		}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "unknown";
		}
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "unknown";
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "unknown";
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "unknown";
		}
	}





	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "Id : " + id + "\nName : " + firstName + " " + lastName + "\nPhoneNumber : " 
				+ phoneNumber + "\nemail : " + email;
		}



	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
//		return this.getFirstName().compareTo(o.getFirstName());
//		return this.getLastName().compareTo(o.getLastName());
//		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
//		return this.getEmail().compareTo(o.getEmail());
		
		
	}
	
	
	

}
