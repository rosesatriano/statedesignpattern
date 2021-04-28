



public class NetflixState implements State{
    private TV tv;

    private static final String[] MOVIES = {"Bench Warmers", "Step Brothers", "War Dogs", "The Wolf of Wall Street", "Up"};
    private static final String[] TV_SHOWS = {"The Office", "Pretty Little Liars", "Greys Anatomy", "Shameless", "You"};

    public NetflixState(TV tv){
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies: \n");
        for (String movie: MOVIES){
            System.out.println("- " +movie);
        }
        System.out.println("\n");
    }

    public void pressTVButton() {
        System.out.println("Netflix TV Shows: \n");
        for (String show: TV_SHOWS){
            System.out.println("- " +show);
        }
        System.out.println("\n");
    }




}
