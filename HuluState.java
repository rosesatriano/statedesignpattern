public class HuluState implements State{
    private TV tv;

    private static final String[] MOVIES = {"Inside Out", "The Campaign", "High School Musical", "Camp Rock", "The Little Mermaid"};
    private static final String[] TV_SHOWS = {"Schitt's Creek", "Gossip Girl", "Good Girls", "Outer Banks", "Black Mirror"};

    public HuluState(TV tv){
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies: \n");
        for (String movie: MOVIES){
            System.out.println("- " +movie);
        }
        System.out.println("\n");
    }

    public void pressTVButton() {
        System.out.println("Hulu TV Shows: \n");
        for (String show: TV_SHOWS){
            System.out.println("- " +show);
        }
        System.out.println("\n");
    }




}
