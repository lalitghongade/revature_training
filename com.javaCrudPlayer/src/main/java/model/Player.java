package model;

public class Player { private int id;
		private String name;
		private int age;
		private String gender;
		private String sportsName;
		private String city;
		private long contact;
		private Team team;
		
		
		public Player(int id, String name, int age, String gender, String sportsName, String city, long contact) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.sportsName = sportsName;
			this.city = city;
			this.contact = contact;
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


		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", sportsName="
					+ sportsName + ", city=" + city + ", contact=" + contact + "]";
		}

		
		
}
