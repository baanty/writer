/**
 * 
 */
package integration.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import integration.StateService;

/**
 * @author WE43MM
 *
 */
public class StateServiceImpl extends MarkingMe implements StateService {

    private static Map<String,List<String>> COUNTRY_STATE_MAPPING;
    
    static {
        COUNTRY_STATE_MAPPING = new HashMap<String, List<String>>();
        List<String> US_STATES = new ArrayList<String>();
        US_STATES.add("Nevada");
        US_STATES.add("California");
        COUNTRY_STATE_MAPPING.put("usa", US_STATES);
    }
    
    /* (non-Javadoc)
     * @see integration.StateService#statesOfCountry(java.lang.String)
     */
    @Override
    public List<String> statesOfCountry(String country) {
        return COUNTRY_STATE_MAPPING.get(country);
    }

    @Override
    public String stating(String input, Integer inputNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void getName(String name, Integer id) {
        // TODO Auto-generated method stub
        
    }

   

    
}
