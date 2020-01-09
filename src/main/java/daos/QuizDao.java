package daos;

import models.Quiz;

public interface QuizDao {
	
	//quiz creation methods
	void CreateQuiz(int quiz_id, String name, int created_by);
	void AddQuestion(int quiz_question_id, String question, int quiz_id);
	void AddAnswer(int question_answer_id, String answer_a, String answer_b, String answer_c, 
			String answer_d, String answer, int quiz_question_id);
	
	//quiz extraction method
	Quiz SendQuiz(int quiz_id);
	
	//grading the quiz
	

}
