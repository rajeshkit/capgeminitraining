package com.tms.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Trainee implements Serializable {
	@Id
	@GeneratedValue
	private int traineeId;
	private String traineeName;
	private LocalDate dateOfJoining;
	private String email;
	private long phone;
	
	public Trainee() {
		super();
	}
	public Trainee(int traineeId, String traineeName, LocalDate dateOfJoining, String email, long phone) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.dateOfJoining = dateOfJoining;
		this.email = email;
		this.phone = phone;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
