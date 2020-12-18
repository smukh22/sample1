package login;

import org.testng.annotations.Test;

public class loginHome {

	
	
	@Test(priority =1)
	public void loginHomePage()
	{
		System.out.println("Hello Login");
	}
	
	@Test(priority =2)
	public void selectItems()
	{
		System.out.println("Select Items");
	}
	
	@Test(priority =3)
	public void checkOut()
	{
		System.out.println("Items Checked");
	}
}
