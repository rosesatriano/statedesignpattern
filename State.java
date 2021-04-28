/**
 * This interface allows netflix, hulu, and home to extend from it. 
 * This includes the button methods all those classes have.
 * @author rosesatriano
 */

public interface State {
    public void pressHomeButton();
    public void pressNetflixButton();
    public void pressHuluButton();
    public void pressMovieButton();
    public void pressTVButton();
}
