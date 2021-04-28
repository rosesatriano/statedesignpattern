/**
 * This class represents the main tv screen. This class contains the button
 * methods, where it takes it to that specific app. This class also calls
 * the different states that are the different apps.
 * @author rosesatriano
 */

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    
    public TV(){
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }
    /**
     * This method calls to the state interface to direct to the extended
     * state Home.
     */
    public void pressHomeButton(){
        state.pressHomeButton();
    }

    /**
     * This method calls to the state interface to direct to the extended
     * state Netflix.
     */
    public void pressNetflixButton(){
        state.pressNetflixButton();
    }

    /**
     * This method calls to the state interface to direct to the extended
     * state Hulu.
     */
    public void pressHuluButton(){
        state.pressHuluButton();
    }

    /**
     * This method calls to the state interface to direct to the movies, 
     * which is only used in the Netflix and Hulu states.
     */
    public void pressMovieButton(){
        state.pressMovieButton();
    }

    /**
     * This method calls to the state interface to direct to the tv shows, 
     * which is only used in the Netflix and Hulu states.
     */
    public void pressTVButton(){
        state.pressTVButton();
    }

    /**
     * This method sets the State.
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * This method calls the HomeState class.
     * @return This returns the HomeState class
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * This method calls the NetflixState class.
     * @return This returns the NetflixState class
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * This method calls the HuluState class.
     * @return This returns the HuluState class
     */
    public State getHuluState() {
        return HuluState;
    }

}