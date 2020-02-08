package javaHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Creting annotations
@Entity
@Table(name="sick days")

// main class
public class SickDays {

	// Modify everything. creating fields and mapping them to the database table
		@Id
		// This GeneratedValue tells you how you are going to get the primary key or id
		// in this case IDENTITY assign primary key using database identity column
		// this is important to retrieve objects from the database
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="address")
		private int address;
		
		@Column(name="phone")
		private int phone; 
		
		// creating constructor
		public void getId() {
			
		}

		// creating other constructors
					public void setId(int id) {
						this.id = id;
					}
					
					public String getName() {
						return name;
					}
					
					public void setName(String name) {
						this.name = name;
					}
					
					public int getAddress() {
						return address;
					}
					
					public void setAddress(int address) {
						this.address = address;
					}
					
					public int getPhone() {
						return phone;
					}
					
					public void setPhone(int phone) {
						this.phone = phone;
					}
					
					public String toString() {
						return Integer.toString(id) + " " + name + " " + address + " " + phone;
					}
		}
					
						
					