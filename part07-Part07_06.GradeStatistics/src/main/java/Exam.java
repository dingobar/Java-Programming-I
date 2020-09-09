
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Exam {
	
	private final ArrayList<ExamResult> examResults;
	private final int passingPoints;
	
	public Exam() {
		this.examResults = new ArrayList();
		this.passingPoints = 50;
	}
	
	public void add(ExamResult examResult) {
		examResults.add(examResult);
	}
	
	public double getPointAverage() {
		return examResults.stream()
			.filter((i) -> i.isValid())
			.mapToDouble((i) -> (double) i.getPoints())
			.average()
			.orElse(-1);
	}
	
	public double getPassingPointAverage() {
		return examResults.stream()
			.filter((i) -> i.isValid())
			.mapToDouble((i) -> (double) i.getPoints())
			.filter((i) -> i >= passingPoints)
			.average()
			.orElse(-1);
	}
	
	public double getPassPercentage() {
		double numberOfPassingGrades = examResults.stream()
			.filter(ExamResult::isValid)
			.filter((i) -> i.getPoints() >= passingPoints)
			.count();
		double numberOfValidGrades = examResults.stream()
			.filter(ExamResult::isValid)
			.count();
		return 100 * numberOfPassingGrades / numberOfValidGrades;
	}
	
	public void printGradeDistribution() {
		IntStream.range(-5, 1)
			.map(Math::abs)
			.forEach(this::printGradeCount);
	}
	
	private void printGradeCount(int i) {
		String toPrint = i + ": ";
		
		for (int j = 0; j < gradeCount(i); j++) {
			toPrint += "*";
		}
		
		System.out.println(toPrint);
	}
	
	private long gradeCount(int grade) {
		return examResults.stream()
			.filter(ExamResult::isValid)
			.mapToInt(ExamResult::getGrade)
			.filter((i) -> (int) i == grade)
			.count();
	}
	
	public void printGradeStatistics() {
		System.out.println(
			"Point average (all): " + getPointAverage()
		);
		
		double passingAverage = getPassingPointAverage();
		if (passingAverage != -1) {
			System.out.println(
				"Point average (passing): " + passingAverage);
		} else {
			System.out.println(
				"Point average (passing): -"
			);
		}
		
		System.out.println(
			"Pass percentage: " + getPassPercentage()
		);
		
		printGradeDistribution();
		
	}
	
}
