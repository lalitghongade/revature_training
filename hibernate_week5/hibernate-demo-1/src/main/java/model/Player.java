package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Player {
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", sportsName="
				+ sportsName + ", city=" + city + ", contact=" + contact + "]";
	}
	@Id //used for making a column as Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)  //auto generate
	private int id;
	private String name;
	private int age;
	private String gender;
	private String sportsName;
	private String city;
	private long contact;
	
	

	public Player( String name, int age, String gender, String sportsName, String city, long contact) {
		super();
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sportsName = sportsName;
		this.city = city;
		this.contact = contact;
	}
	public Player() {
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
	

}
