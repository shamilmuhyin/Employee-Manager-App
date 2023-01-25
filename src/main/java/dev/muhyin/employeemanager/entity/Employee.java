package dev.muhyin.employeemanager.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long employeeId;
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;
	private String employeeCode;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ","
				+ " name=" + name + ","
				+ " email=" + email + ","
				+ " jobTitle=" + jobTitle + ","
				+ " phone=" + phone + ","
				+ " imageUrl=" + imageUrl + ","
				+ " employeeCode=" + employeeCode + "]";
	}
	
	
}
