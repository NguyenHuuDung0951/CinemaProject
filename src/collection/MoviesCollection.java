package collection;

import java.util.ArrayList;
import java.util.List;
import entity.Movies;



public class MoviesCollection {
private ArrayList<Movies> movies;
	
	public MoviesCollection() {
		movies = new ArrayList<Movies>();
}
public ArrayList<Movies> getdanhsachnhanvien(){
return movies;
}
public boolean them(Movies mo) {
if( mo == null) {
	return false;
}
if(movies.contains(mo)) {
	return false;
}
movies.add(mo);
return true;
}
public boolean xoa(String maMoive)
{
return movies.removeIf(tv->tv.getMovieID().equals(maMoive));
}

public List<Movies> tim(String maMoviee)
{
return movies.stream()
		.filter(tv->tv.getMovieID().equalsIgnoreCase(maMoviee))
		.toList();
}
public void sua(Movies mo)
{
	movies.forEach(accmoi->
			{
				accmoi.setCountry(mo.getCountry());
				accmoi.setDiretor(mo.getDiretor());
				accmoi.setDuration(mo.getDuration());
				accmoi.setGenre(mo.getGenre());
				accmoi.setLanguage(mo.getLanguage());
				accmoi.setMovieDescription(mo.getMovieDescription());
				accmoi.setMovieID(mo.getMovieID());
				accmoi.setMovieName(mo.getMovieName());
				accmoi.setReleaseDate(mo.getReleaseDate());
			}
			);
}

}
