
public class ExamResult {

	private final int points;

	public ExamResult(int points) {
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public boolean isValid() {
		return points >= 0 && points <= 100;
	}

	public int getGrade() {
		return GradeScale.grade(this);
	}
}
