public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie.MovieCreator()
                .setTitle("Interstellar")
                .setDirector("Christopher Nolan")
                .setYearOfRelease(2010)
                .setGenre("Science Fiction")
                .setDistributor("Warner Bros.")
                .createMovie();
        System.out.println(movie1.toString());
    }
}