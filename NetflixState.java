/**
 * This class extends from the interface State. In this class, we introduce two arrays that contain
 * the tv shows and the movies. We also call the button methods here, where they indicate the proper
 * action.
 * @author rosesatriano
 */


public class NetflixState implements State{
    private TV tv;

    private static final String[] MOVIES = {"Bench Warmers", "Step Brothers", "War Dogs", "The Wolf of Wall Street", "Up"};
    private static final String[] TV_SHOWS = {"The Office", "Pretty Little Liars", "Greys Anatomy", "Shameless", "You"};

    public NetflixState(TV tv){
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
     * This method displays that we are already in this state.
     */
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    /**
     * This method changes to the hulu state and displays that it is doing so.
     */
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * This method calls the movies array to display.
     */
    public void pressMovieButton() {
        System.out.println("Netflix Movies: \n");
        for (String movie: MOVIES){
            System.out.println("- " +movie);
        }
        System.out.println("\n");
    }

    /**
     * This method calls the tv shows array to display.
     */
    public void pressTVButton() {
        System.out.println("Netflix TV Shows: \n");
        for (String show: TV_SHOWS){
            System.out.println("- " +show);
        }
        System.out.println("\n");
    }




}
