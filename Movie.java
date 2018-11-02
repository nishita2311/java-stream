package dayFour.demo;


//notice here Comparable
public class Movie implements Comparable<Movie>{
	
	private String movieName;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	private String movieDesc;
	public Movie(String movieName, String movieDesc) {
		super();
		this.movieName = movieName;
		this.movieDesc = movieDesc;
	}
	@Override
	public int compareTo(Movie m) {
		return movieName.compareTo(m.getMovieName());
	}
	
	/*public int compareTo(Employee emp)
	{

	return (this.id-emp.id);
	}*/
	
	
	
}