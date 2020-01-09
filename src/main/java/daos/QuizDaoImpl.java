package daos;

import models.Quiz;

public class QuizDaoImpl implements QuizDao{

	@Override
	public void CreateQuiz(int quiz_id, String name, int created_by) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddQuestion(int quiz_question_id, String question, int quiz_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddAnswer(int question_answer_id, String answer_a, String answer_b, String answer_c, String answer_d,
			String answer, int quiz_question_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Quiz SendQuiz(int quiz_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
