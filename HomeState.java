/**
 * This class extends from the interface State. In this class, we call the button methods here, 
 * where they indicate the proper action.
 * @author rosesatriano
 */


public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv){
        this.tv = tv;
    }

    /**
     * This method displays that we are already in this state.
     */
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
    }

    /**
     * This method changes to the netflix state and displays that it is doing so.
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * This method changes to the hulu state and displays that it is doing so.
     */
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * This method indicates that you need to be in a state to call this.
     */
    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.\n");
    }

    /**
     * This method indicates that you need to be in a state to call this.
     */
    public void pressTVButton() {
        System.out.println("Home: You must pick an app to show movies.\n");
    }

}
