/**
 * 
 */
package integration.engine;

import integration.CountryService;
import integration.DistrictService;

/**
 * @author WE43MM
 *
 */
public class PlaceServiceImpl implements CountryService, DistrictService {
    @Override
    public String getServiceName() {
        return this.getClass().getSimpleName();
    }

}
