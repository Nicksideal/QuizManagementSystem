package models;

public class Quiz {
	private int quiz_id;
	private String name;
	private int created_by;
	private int question_answer_id;
	private String answer_a;
	private String answer_b;
	private String answer_c;
	private String answer_d;
	private String answer;
	private int quiz_question_id;
	private String quiz;
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quiz(int quiz_id, String name, int created_by, int question_answer_id, String answer_a, String answer_b,
			String answer_c, String answer_d, String answer, int quiz_question_id, String quiz) {
		super();
		this.quiz_id = quiz_id;
		this.name = name;
		this.created_by = created_by;
		this.question_answer_id = question_answer_id;
		this.answer_a = answer_a;
		this.answer_b = answer_b;
		this.answer_c = answer_c;
		this.answer_d = answer_d;
		this.answer = answer;
		this.quiz_question_id = quiz_question_id;
		this.quiz = quiz;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((answer_a == null) ? 0 : answer_a.hashCode());
		result = prime * result + ((answer_b == null) ? 0 : answer_b.hashCode());
		result = prime * result + ((answer_c == null) ? 0 : answer_c.hashCode());
		result = prime * result + ((answer_d == null) ? 0 : answer_d.hashCode());
		result = prime * result + created_by;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + question_answer_id;
		result = prime * result + ((quiz == null) ? 0 : quiz.hashCode());
		result = prime * result + quiz_id;
		result = prime * result + quiz_question_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quiz other = (Quiz) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (answer_a == null) {
			if (other.answer_a != null)
				return false;
		} else if (!answer_a.equals(other.answer_a))
			return false;
		if (answer_b == null) {
			if (other.answer_b != null)
				return false;
		} else if (!answer_b.equals(other.answer_b))
			return false;
		if (answer_c == null) {
			if (other.answer_c != null)
				return false;
		} else if (!answer_c.equals(other.answer_c))
			return false;
		if (answer_d == null) {
			if (other.answer_d != null)
				return false;
		} else if (!answer_d.equals(other.answer_d))
			return false;
		if (created_by != other.created_by)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (question_answer_id != other.question_answer_id)
			return false;
		if (quiz == null) {
			if (other.quiz != null)
				return false;
		} else if (!quiz.equals(other.quiz))
			return false;
		if (quiz_id != other.quiz_id)
			return false;
		if (quiz_question_id != other.quiz_question_id)
			return false;
		return true;
	}
	public int getQuiz_id() {
		return quiz_id;
	}
	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public int getQuestion_answer_id() {
		return question_answer_id;
	}
	public void setQuestion_answer_id(int question_answer_id) {
		this.question_answer_id = question_answer_id;
	}
	public String getAnswer_a() {
		return answer_a;
	}
	public void setAnswer_a(String answer_a) {
		this.answer_a = answer_a;
	}
	public String getAnswer_b() {
		return answer_b;
	}
	public void setAnswer_b(String answer_b) {
		this.answer_b = answer_b;
	}
	public String getAnswer_c() {
		return answer_c;
	}
	public void setAnswer_c(String answer_c) {
		this.answer_c = answer_c;
	}
	public String getAnswer_d() {
		return answer_d;
	}
	public void setAnswer_d(String answer_d) {
		this.answer_d = answer_d;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getQuiz_question_id() {
		return quiz_question_id;
	}
	public void setQuiz_question_id(int quiz_question_id) {
		this.quiz_question_id = quiz_question_id;
	}
	public String getQuiz() {
		return quiz;
	}
	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}
	@Override
	public String toString() {
		return "Quiz [quiz_id=" + quiz_id + ", name=" + name + ", created_by=" + created_by + ", question_answer_id="
				+ question_answer_id + ", answer_a=" + answer_a + ", answer_b=" + answer_b + ", answer_c=" + answer_c
				+ ", answer_d=" + answer_d + ", answer=" + answer + ", quiz_question_id=" + quiz_question_id + ", quiz="
				+ quiz + "]";
	}
	
	
}

