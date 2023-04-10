package emailapp;

public class EmailApp
{

	public static void main(String[] args) 
	{
		System.out.println("Email Administration Application:"+"\n");
		
		Email em1=new Email("Harry","Potter");
		
		System.out.println(" ");
		System.out.println("New Employee Details: \n\n"+em1.showInfo());
	}
}
