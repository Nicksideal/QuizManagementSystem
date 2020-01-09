package utility;

public class SQLInfo {
	private static String URL = "jdbc:oracle:thin:@oraclebd-1.cxc7vkrsynje.us-east-1.rds.amazonaws.com";
	private static String username ="Quizzer";
	private static String password = "pass";
	public SQLInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String getURL() {
		return URL;
	}
	public static void setURL(String uRL) {
		URL = uRL;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		SQLInfo.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		SQLInfo.password = password;
	}
	@Override
	public String toString() {
		return "SQLInfo []";
	}


}
