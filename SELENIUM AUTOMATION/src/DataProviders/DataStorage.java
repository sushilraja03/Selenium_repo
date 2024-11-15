package DataProviders;

import org.testng.annotations.DataProvider;

public class DataStorage {
	
	@DataProvider
	public String[][] loginData()
	{
		String data[][]= {
				{"admin","admin"},
				{"ad","admin"},
				{"ad","ad"},
				{"admin","ad"}
				};
		
		return data;
	}
	
	@DataProvider
	public String[][] registerData()
	{
		String data[][]= {{"abhi","s","abhis1234@gmail.co","abhis"},
				{"sushil","raja","sushilraja@1234.com","sushil@1234","sushil@1234"},
				{"messi","leonel","messi123gmail.com","@@","@@"}};
		
		return data;
	}
}
