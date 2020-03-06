package hibernateWhatever;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Creting annotations
@Entity
@Table(name="SickDays")

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
		private String address;
		
		@Column(name="phone")
		private int phone; 
		
		// creating constructor
		public void sickDays() {
			
		}

		// creating other constructors
					public void sickDays(int id, String name, String address, int phone) {
						this.id = id;
						this.name = name;
						this.address = address;
						this.phone = phone;
					}
					
					public String getName() {
						return name;
					}
					
					public void setName(String name) {
						this.name = name;
					}
					
					public String getAddress() {
						return address;
					}
					
					public void setAddress(String address) {
						this.address = address;
					}
					
					public int getPhone() {
						return phone;
					}
					
					public void setPhone(int phone) {
						this.phone = phone;
					}
					
					public String toString() {
						return "sickDays[id = "+ id + ", name = "+ name +", address = "+ address +", phone = " + phone +"]";
					}
		}
			