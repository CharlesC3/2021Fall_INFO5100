package Question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws ParseException {
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date nineteenHundred = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie a = new Movie("A Star is Born", new GregorianCalendar(2007, Calendar.FEBRUARY, 05).getTime(),
                Arrays.asList("Lady Gaga", "Bradly Cooper"), "peopel1");
        Movie b = new Movie("La La Land", new GregorianCalendar(1992, Calendar.JULY, 27).getTime(),
                Arrays.asList("Amma Stone"), "people2");
        Movie c = new Movie("Whatever", new GregorianCalendar(2020, Calendar.JUNE, 03).getTime(),
                Arrays.asList("William", "Isable"), "peoiple3");
        Movie d = new Movie("Don't know", new GregorianCalendar(1988, Calendar.JUNE, 14).getTime(),
                Arrays.asList("Charles"), "people4");


        List<Movie> comicList = new ArrayList<>();
        comicList.add(a);
        comicList.add(b);

        List<Movie> storyList = new ArrayList<>();
        storyList.add(c);
        storyList.add(d);

        Genre comic = new Genre(comicList);
        Genre story = new Genre(storyList);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(comic);
        genreList.add(story);

        Netflix netflix = new Netflix(genreList);


        netflix.list.stream()
                .flatMap(genre -> genre.list.stream())
                .filter(movie -> movie.ReleaseDate.before(twoThousand))
                .forEach(movie -> movie.Title = movie.Title + "(Classic)");

        List<Movie> ans = netflix.list.stream().flatMap(genre -> genre.list.stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.ReleaseDate.compareTo(o1.ReleaseDate);
            }
        }).limit(3).collect(Collectors.toList());


        List<Movie> listOfAllMovie = netflix.list.stream().flatMap(genre -> genre.list.stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.ReleaseDate.before(twoThousand);
        Predicate<Movie> dateAfter1990 = movie -> movie.ReleaseDate.after(nineteenHundred);
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);


        for(Movie movie : listOfAllMovie) addReleaseYear(movie);


        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.Title.compareTo(o2.Title);
            }
        });
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.Title);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.ReleaseDate);
        movie.Title = movie.Title + year;
    }
}