package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Quiz;
import utility.ConnectionsUtil;
import utility.MagicWords;

public class QuizDaoImpl implements QuizDao{

	@Override
	public void CreateQuiz(int quiz_id, String name, int created_by) {
		try (Connection c = ConnectionsUtil.getConnection()){
			PreparedStatement stmt = c.prepareCall(MagicWords.LOGIN_QUERY);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return extractUser(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
