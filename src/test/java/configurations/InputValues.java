package configurations;

public class InputValues {
	
	private static  String URL="http://www.phptravels.net/";
	private static  String pathChromeDriver="D:\\GitNew\\MavenPageObjectModelWithPageFactory\\MvnPageObjectModelUsingPageFactory\\drivers\\chromedriver_win32\\chromedriver.exe";
	private static String xmlPath="D:\\GitNew\\MavenPageObjectModelWithPageFactory\\MvnPageObjectModelUsingPageFactory\\src\\test\\java\\testData\\testdata.xml";
	public static String extentReportPath="D:\\GitNew\\MavenPageObjectModelWithPageFactory\\MvnPageObjectModelUsingPageFactory\\src\\Reports\\reports.html";
	public static String extentConfig="D:\\GitNew\\MavenPageObjectModelWithPageFactory\\MvnPageObjectModelUsingPageFactory\\src\\configurations\\extent-config.xml";
	
	public static String getURL(){
		return URL;
	}
	public static String getChromeDriverPath(){
		return pathChromeDriver;
	}
	public static String getxmlPath(){
		return xmlPath;
	}

}
