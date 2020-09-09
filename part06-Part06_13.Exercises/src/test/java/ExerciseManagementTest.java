
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

	private ExerciseManagement management;

	@Before
	public void initialize() {
		management = new ExerciseManagement();
	}

	@Test
	public void exerciseListEmptyAtBeginning() {
		assertEquals(0, management.exerciseList().size());
	}

	@Test
	public void addingExerciseGrowsListByOne() {
		management.add("Write a test");
		assertEquals(1, management.exerciseList().size());
	}

	@Test
	public void addedExerciseIsInList() {
		management.add("LOL");
		assertTrue(management.exerciseList().contains("LOL"));
	}

	@Test
	public void exerciseCanBeMarkedAsCompleted() {
		management.add("LOL");
		management.markAsCompleted("LOL");
		assertTrue(management.isCompleted("LOL"));
	}

	@Test
	public void ifNotMarkedCompletedIsNotCompleted() {
		management.add("LOL");
		assertFalse(management.isCompleted("LOL"));
	}

}
