package testData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFile
{

	//Headings
	
	static LocalDate localDate = LocalDate.now().minusDays(1);
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static String formattedDate = localDate.format(formatter); 

	//Page Heading & Title
	public static String HomePageHeading = "Let's Talk Tea";
	public static String HomePageTitle = "Let's Talk Tea";
	
}

