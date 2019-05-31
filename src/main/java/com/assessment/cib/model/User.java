package com.assessment.cib.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "user")
public class User{

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String customer;
	private String role;
	private String email;
	private String cellPhone;

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param customer
	 * @param role
	 * @param email
	 * @param cellPhone
	
	 */
	public User(String name, String action, String firstName, String lastName, String userName,
			String password, String customer, String role, String email, String cellPhone) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.customer = customer;
		this.role = role;
		this.email = email;
		this.cellPhone = cellPhone;
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	@XmlElement
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	@XmlElement
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	@XmlElement
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cellPhone
	 */
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * @param cellPhone
	 *            the cellPhone to set
	 */
	@XmlElement
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}


}
