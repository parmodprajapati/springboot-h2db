package com.example.h2database.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contact_dtls")
@Data
@NoArgsConstructor
public class Contact {
	@Id
	@GeneratedValue
 	private int cid;
	private String name;
	private String email;
	private long phno;
	private String activeSw;
}
