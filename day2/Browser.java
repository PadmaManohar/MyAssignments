package week1.day2;

public class Browser {
	
	public String launchbrowser(String g) 
	{
		return g;
	
	}
	
public void loadurl()
{
	System.out.println("Application url loaded successfully");
}


	public static void main(String[] args) {
		Browser ob = new Browser();
		System.out.println(ob.launchbrowser("The Browser Launched successfully"));
		ob.loadurl();
		


	}

}
