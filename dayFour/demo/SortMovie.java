package dayFour.demo;
import java.util.*;


public class SortMovie {
	
		
		public static void main(String args[]){

			Movie[] movies = new Movie[4];
			
			Movie movie1 = new Movie("Bhaijan", "good movie"); 
			Movie Movie2 = new Movie("Queen", "Kangana"); 
			Movie Movie3 = new Movie("Dil", "Aamir"); 
			Movie Movie4 = new Movie("Transformer", "Excellent");  
			
			movies[0]=movie1;
			movies[1]=Movie2;
			movies[2]=Movie3;
			movies[3]=Movie4;
			
			Arrays.sort(movies);

			int i=0;
			for(Movie temp: movies){
			   System.out.println("Movies " + ++i + " : " + temp.getMovieName() + 
				", Description : " + temp.getMovieDesc());
			}
			
		}	
	}

