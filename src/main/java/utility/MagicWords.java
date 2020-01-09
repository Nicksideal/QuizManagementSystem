package utility;

public class MagicWords {
	
	// ObjectMapper Header
		public static final String CONTENT_TYPE = "application/json";
		
	//UserDaoImpl 
		public static final String LOGIN_QUERY = "SELECT user_id, username FROM user_table WHERE username = ? AND password = ?";
		
	//QuizDaoImpl
		public static final String ADD_QUIZ = "INSERT INTO quiz (quiz_id, name, created_by)" + "VALUES (quiz_id_seq.nextval, ?, ?)";
		public static final String ADD_QUESTION = "INSERT INTO quiz_questions (quiz_question_id, question, quiz_id)" + "VALUES (quiz_question_id_seq.nextval, ?, ?)";
		public static final String ADD_ANSWER = "INSERT INTO quiz_answers_multiplechoice (question_answer_id, answer_a, answer_b, answer_c, answer_d, quiz_question_id)" + "VALUES (question_answer_id_seq.nextval, ?, ?, ?, ?, ?)";
		public static final String GET_QUIZZES = "SELECT * FROM quiz";
}
