package com.codinghub;

public class Student {

		 int roll;
		 String name,email,section;
		 Double percentage;
		public Student(int roll, String name, String email, String section, Double percentage) {
			super();
			this.roll = roll;
			this.name = name;
			this.email = email;
			this.section = section;
			this.percentage = percentage;
		}
		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", section=" + section
					+ ", percentage=" + percentage + "]";
		}
		 
		
}

