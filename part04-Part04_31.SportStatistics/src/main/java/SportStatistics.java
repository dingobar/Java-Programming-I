
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("File:");
		ArrayList<Match> matches = readRecordsFromFile(scan.nextLine());

		System.out.println("Team:");
		String team = scan.nextLine();

		ArrayList<Match> teamMatches = (ArrayList<Match>) matches.stream()
			.filter(x -> x.getHomeTeam().equals(team) || x.getAwayTeam().equals(team))
			.collect(Collectors.toCollection(ArrayList::new));

		int games = teamMatches.size();

		int wins = (int) teamMatches.stream()
			.filter((m) -> m.getWinner().equals(team))
			.count();

		System.out.println("Games: " + games);
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + (games - wins));

	}

	public static ArrayList<Match> readRecordsFromFile(String file) {
		ArrayList<Match> content = new ArrayList();
		try ( Scanner scanner = new Scanner(Paths.get(file))) {

			while (scanner.hasNextLine()) {
				String input = scanner.nextLine();
				if (input.isEmpty()) {
					continue;
				}
				String[] temp = input.split(",");
				Team homeTeam = new Team(temp[0]);
				Team awayTeam = new Team(temp[1]);
				try {
					Match match = new Match(homeTeam, awayTeam, Integer.valueOf(temp[2]), Integer.valueOf(temp[3]));
					content.add(match);
				} catch (InvalidScoreException e) {
					System.out.println(e.toString());
				}
			}

		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return content;

	}

}
