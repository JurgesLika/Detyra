public class Movie {
    private String title;
    private String director;
    private int yeraOfRelease;
    private String gender;
    private String distributor;


    public Movie(){
        this.title=title;
        this.director=director;
        this.gender=gender;
        this.yeraOfRelease=yeraOfRelease;
        this.distributor=distributor;
    }
    //Getter
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getYeraOfRelease(){
        return yeraOfRelease;
    }

    public String getGender() {
        return gender;
    }

    public String getDistributor() {
        return distributor;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYeraOfRelease(int yeraOfRelease) {
        this.yeraOfRelease = yeraOfRelease;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yeraOfRelease=" + yeraOfRelease +
                ", gender='" + gender + '\'' +
                ", distributor='" + distributor + '\'' +
                '}';
    }
    public static class MovieCreator{
        String title;
        String director;
        int yearOfRelease;
        String gender;
        String distributor;
        public MovieCreator setTitle(String title){
            this.title=title;
            return this;
        }
        public MovieCreator setDirector(String director){
            this.distributor=director;
            return this;
        }
        public MovieCreator setYearOfRelease(int year){
            this.yearOfRelease=yearOfRelease;
            return this;
        }
        public MovieCreator setGenre(String gendre) {
            this.gender = gendre;
            return this;
        }

        public MovieCreator setDistributor(String distributor) {
            this.distributor = distributor;
            return this;
        }
        public Movie createMovie(){
            return new Movie();
        }

    }
}
