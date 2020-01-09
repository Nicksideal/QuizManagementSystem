package utility;

public class MagicWords {
	
	// ObjectMapper Header
		public static final String CONTENT_TYPE = "application/json";
		
	//UserDaoImpl 
		public static final String LOGIN_QUERY = "SELECT user_id, username FROM user_table WHERE username = ? AND password = ?";

}
