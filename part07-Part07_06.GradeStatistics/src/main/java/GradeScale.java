
public class GradeScale {

	public static int grade(ExamResult examResult) {

		if (!examResult.isValid()) {
			return 0;
		}

		int points = examResult.getPoints();

		if (points >= 90) {
			return 5;
		} else if (points >= 80) {
			return 4;
		} else if (points >= 70) {
			return 3;
		} else if (points >= 60) {
			return 2;
		} else if (points >= 50) {
			return 1;
		} else {
			return 0;
		}
	}
}
