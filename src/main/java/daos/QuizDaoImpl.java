package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Quiz;
import utility.ConnectionsUtil;
import utility.MagicWords;

public class QuizDaoImpl implements QuizDao{
	
	private static QuizDao instance = new QuizDaoImpl();
	
	private Quiz extractQuiz(ResultSet rs) {
		return new Quiz(rs.getInt("quiz_id"), rs.getString("name"), 0, 0, null, null, null, null, null, 0, null);
	}

	@Override
	public void CreateQuiz(int quiz_id, String name, int created_by) {
		try (Connection c = ConnectionsUtil.getConnection()){
			PreparedStatement stmt = c.prepareCall(MagicWords.ADD_QUIZ);
			stmt.setString(1, name);
			stmt.setInt(2, created_by);
			stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void AddQuestion(int quiz_question_id, String question, int quiz_id) {
		try (Connection c = ConnectionsUtil.getConnection()){
			PreparedStatement stmt = c.prepareCall(MagicWords.ADD_QUESTION);
			stmt.setString(1, question);
			stmt.setInt(2, quiz_id);
			stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void AddAnswer(int question_answer_id, String answer_a, String answer_b, String answer_c, String answer_d,
			String answer, int quiz_question_id) {
		try (Connection c = ConnectionsUtil.getConnection()){
			PreparedStatement stmt = c.prepareCall(MagicWords.ADD_ANSWER);
			stmt.setString(1, answer_a);
			stmt.setString(2, answer_b);
			stmt.setString(3, answer_c);
			stmt.setString(4, answer_d);
			stmt.setInt(5, quiz_question_id);
			stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
		
	}

	@Override
	public Quiz SendQuiz(int quiz_id) {
		try (Connection c = ConnectionsUtil.getConnection()){
			PreparedStatement stmt = c.prepareCall(MagicWords.GET_QUIZZES);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return extractQuiz(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
}
