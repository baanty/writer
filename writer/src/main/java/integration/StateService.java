/**
 * 
 */
package integration;

import java.util.List;

/**
 * @author WE43MM
 *
 */
public interface StateService {

    public List<String> statesOfCountry(String country);
    
    public String stating(String input , Integer inputNumber);
}
