package utility;

public class SQLInfo {
	
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
