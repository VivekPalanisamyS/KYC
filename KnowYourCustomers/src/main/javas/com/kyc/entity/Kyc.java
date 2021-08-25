package com.kyc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name ="Kyc")
public class Kyc {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="custId")
	private int custId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="mName")
	private String mName;
	@Column(name="gender")
	private String gender;
	@Column(name="dob")
	private String dob;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="postalCode")
	private String postalCode;
	@Column(name="kycCountry")
	private String kycCountry;
	@Column(name="occupationType")
	private String occupationType;
	@Column(name="designation")
	private String designation;
	@Column(name="salary")
	private int salary;
	@Column(name="identificationType")
	private String identificationType;
	@Column(name="identificationNumber")
	private int identificationNumber;
	
	@Override
	public String toString() {
		return "Kyc [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", mName=" + mName
				+ ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", postalCode=" + postalCode + ", kycCountry=" + kycCountry
				+ ", occupationType=" + occupationType + ", designation=" + designation + ", salary=" + salary
				+ ", identificationType=" + identificationType + ", identificationNumber=" + identificationNumber + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getKycCountry() {
		return kycCountry;
	}
	public void setKycCountry(String kycCountry) {
		this.kycCountry = kycCountry;
	}
	public String getOccupationType() {
		return occupationType;
	}
	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getIdentificationType() {
		return identificationType;
	}
	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
}
