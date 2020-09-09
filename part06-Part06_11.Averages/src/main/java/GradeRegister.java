
import java.util.ArrayList;

public class GradeRegister {

	private final ArrayList<Integer> grades;
	private final ArrayList<Integer> points;

	public GradeRegister() {
		this.grades = new ArrayList<>();
		this.points = new ArrayList<>();
	}

	public void addGradeBasedOnPoints(int points) {
		this.points.add(points);
		this.grades.add(pointsToGrade(points));
	}

	public int numberOfGrades(int grade) {
		int count = 0;
		count = this.grades.stream()
			.filter((received) -> (received == grade))
			.map((_item) -> 1)
			.reduce(count, Integer::sum);

		return count;
	}

	public static int pointsToGrade(int points) {

		int grade;
		if (points < 50) {
			grade = 0;
		} else if (points < 60) {
			grade = 1;
		} else if (points < 70) {
			grade = 2;
		} else if (points < 80) {
			grade = 3;
		} else if (points < 90) {
			grade = 4;
		} else {
			grade = 5;
		}

		return grade;
	}

	public double averageOfGrades() {
		return grades.stream()
			.mapToDouble((i) -> i * 1.0)
			.average()
			.orElse(-1);
	}

	public double averageOfPoints() {
		return points.stream()
			.mapToDouble((i) -> i * 1.0)
			.average()
			.orElse(-1);
	}
}
