package Entity;

import java.time.LocalDate;
import java.util.Objects;

public class Movies {
	private String movieID;
	private String movieName;
	private String genre;
	private String diretor;
	private int duration;
	private LocalDate releaseDate;
	private String language;
	private String country;
	private String movieDescription;
	public Movies(String movieID, String movieName, String genre, String diretor, int duration, LocalDate releaseDate,
			String language, String country, String movieDescription) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.genre = genre;
		this.diretor = diretor;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.language = language;
		this.country = country;
		this.movieDescription = movieDescription;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	@Override
	public String toString() {
		return "Movies [movieID=" + movieID + ", movieName=" + movieName + ", genre=" + genre + ", diretor=" + diretor
				+ ", duration=" + duration + ", releaseDate=" + releaseDate + ", language=" + language + ", country="
				+ country + ", movieDescription=" + movieDescription + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(movieID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		return Objects.equals(movieID, other.movieID);
	}
	
	
}
