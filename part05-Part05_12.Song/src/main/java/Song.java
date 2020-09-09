
import java.util.Objects;


public class Song {

	private String artist;
	private String name;
	private int durationInSeconds;

	public Song(String artist, String name, int durationInSeconds) {
		this.artist = artist;
		this.name = name;
		this.durationInSeconds = durationInSeconds;
	}

	public String getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}

	@Override
	public boolean equals(Object compared) {
		// if the variables are located in the same position, they are equal
		if (this == compared) {
			return true;
		}

		// convert the object into a Person object
		Song comparedPerson = (Song) compared;

		return compared instanceof Song
			&& this.name.equals(comparedPerson.name)
			&& this.artist.equals(comparedPerson.artist)
			&& this.name.equals(comparedPerson.name)
			&& this.durationInSeconds == comparedPerson.durationInSeconds;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 67 * hash + Objects.hashCode(this.artist);
		hash = 67 * hash + Objects.hashCode(this.name);
		hash = 67 * hash + this.durationInSeconds;
		return hash;
	}

	@Override
	public String toString() {
		return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
	}

}
