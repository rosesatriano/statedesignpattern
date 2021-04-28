/**
 * This class extends from the interface State. In this class, we introduce two arrays that contain
 * the tv shows and the movies. We also call the button methods here, where they indicate the proper
 * action.
 * @author rosesatriano
 */

public class HuluState implements State{
    private TV tv;

    private static final String[] MOVIES = {"Inside Out", "The Campaign", "High School Musical", "Camp Rock", "The Little Mermaid"};
    private static final String[] TV_SHOWS = {"Schitt's Creek", "Gossip Girl", "Good Girls", "Outer Banks", "Black Mirror"};

    public HuluState(TV tv){
        this.tv = tv;
    }

     /**
     * This method changes to the home state and displays that it is doing so.
     */
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * This method changes to the netflix state and displays that it is doing so.
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * This method displays that we are already in this state.
     */
    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    /**
     * This method calls the movies array to display.
     */
    public void pressMovieButton() {
        System.out.println("Hulu Movies: \n");
        for (String movie: MOVIES){
            System.out.println("- " +movie);
        }
        System.out.println("\n");
    }

    /**
     * This method calls the tv shows array to display.
     */
    public void pressTVButton() {
        System.out.println("Hulu TV Shows: \n");
        for (String show: TV_SHOWS){
            System.out.println("- " +show);
        }
        System.out.println("\n");
    }




}
