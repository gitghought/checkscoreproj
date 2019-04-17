package myproj;

public enum QuestionType {

	
	SINGLE(3),
	MULTI(2),
	CHOOSE(2);
	
	
	
	private int score;
	

	private QuestionType(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
}
