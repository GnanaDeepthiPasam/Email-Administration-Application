package emailapp;

import java.util.Scanner;
public class Email 
{
	// Writing the application properties as variables and making them as 'private'
	
		private String firstName;
		private String lastName;
		private String department;
		private String password;
		private int defaultPasswordLength=10;
		private String email;
		private int mailboxCapacity=500; // Default mail capacity
		private String alternateEmail;
		
		
		// Constructor to receive 'firstName' and 'lastName'
		
		public Email(String firstName, String lastName) 
		{
			this.firstName=firstName;
			this.lastName=lastName;
			
			
			// Call a method asking for the department - return the department
			
			this.department=setDepartment();
			// System.out.println("\nDepartment: "+this.department);
			
			
			// Call a method that returns a random password
			
			this.password=randomPassword(defaultPasswordLength);
			// System.out.println("\nPassword: "+this.password);
			
			
			// Combine elements to generate email
			
			email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+".company.com";
			// System.out.println("\nEmail: "+email);
			
		}
		
		
		// Ask for the department
		
		private String setDepartment() 
		{
			System.out.print("New Employee: "+this.firstName+"\n\nDepartment Codes:\n 1. Sales\n 2. Developement\n 3. Accounting\n 4. None\n\nEnter department code: ");
			
			Scanner dep=new Scanner(System.in);
			int choice=dep.nextInt();
			
			if(choice==1) 
			{
				return "Sales";
				
			}
			
			else if(choice==2) 
			{
				return "Developement";
				
			}
			
			else if(choice==3) 
			{
				return "Accounting";
				
			}
			
			else 
			{
				return " "; 
				
			}
			
		}
		
		
		// Generate a random password
		
		private String randomPassword(int length) 
		{
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%";
			
			char password []=new char[length];
			
			for(int i=0;i<length;i++) 
			{
				int rand=(int) (Math.random() *passwordSet.length()); // 'Math.random()' Returns a double value with a positive sign, greater than or equal to 0.0 
				                                                      //  and less than 1.0. Returned values are chosen pseudo randomly with (approximately)uniform 
				                                                      //  distribution from that range
				password[i]=passwordSet.charAt(rand);
				
			}
			
			return new String(password); // Allocates a new String so that it represents the sequence of characters currently contained in the character array argument
		}
		
		
		
		// Set the mailbox capacity
		
		public void setMailBoxCapacity(int capacity) 
		{
			this.mailboxCapacity=capacity;
			
		}
		
		// Get the mailbox capacity
		
		public int getMailBoxCapacity() 
		{
			return this.mailboxCapacity;
			
		}

		
		// Set the alternate email
		
		public void setAlternateEmail(String altEmail) 
		{
			this.alternateEmail=altEmail;
			
		}
		
		// Get the alternate email
		
		public String getalternateEmail() 
		{
			return this.alternateEmail;
			
		}
		
		
		// Change the password
		
		public void changePassword(String password) 
		{
			this.password=password;
			
		}
		
		// Get method for 'Change the password'
		
		public String getPassword() 
		{
			return this.password;
			
		}
		
		
		// Displaying the required info
		
		public String showInfo()
		{
			return "Employee Name: "+this.lastName+", "+this.firstName+"\n"+"Allocated Department: "+this.department+"\n"+"Company Email Address: "+this.email
					+"\n"+"Company Email Password: "+this.password+"\n"+ "Mailbox Capacity: "+this.mailboxCapacity;
			
		} 

}
