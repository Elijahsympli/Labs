package com.HibernateBMSCrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="BMS")
public class BMS1 {
	@Id

	private  	long acc_no;
	@Column(length = 20 ,nullable =false)
	
	private String acc_holder;
	@Column
private double balance;
	@Column(length =20,nullable=false)
	private String branch;
	@Column(length =20,nullable=false)
	private String acc_type;

	@Column
	int pin;
	@Column
	String  ifsc_code;
	
	
	
	
}
