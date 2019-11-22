package com.hospital.appointment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@Column(name="confirmationNum")
	private String confirmationNum;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	@Column(name="dob")
	private String dob;
	@Column(name="apptDate")
	private String apptDate;
	@Column(name="apptTime")
	private String apptTime;
	
	public String getConfirmationNum() {
		return confirmationNum;
	}
	public void setConfirmationNum(String confirmationNum) {
		this.confirmationNum = confirmationNum;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getApptDate() {
		return apptDate;
	}
	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}
	public String getApptTime() {
		return apptTime;
	}
	public void setApptTime(String apptTime) {
		this.apptTime = apptTime;
	}
	@Override
	public String toString() {
		return "User [confirmationNum=" + confirmationNum + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", apptDate=" + apptDate + ", apptTime=" + apptTime + "]";
	}
	
	
	
}
