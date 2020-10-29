package org.hcl.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class PetDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	@Length(min=1,max=2,message="please enter the petAge")
	private int petAge;
	private  String petType;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public PetDetails(int pid, @Length(min = 1, max = 2, message = "please enter the petAge") int petAge,
			String petType) {
		super();
		this.pid = pid;
		this.petAge = petAge;
		this.petType = petType;
	}
	public PetDetails() {
		super();
	}
	
	
	

}
