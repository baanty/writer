/**
 * 
 */
package integration.engine;

import java.io.File;
import java.util.concurrent.BlockingQueue;

import integration.CountryService;
import integration.DistrictService;

/**
 * @author WE43MM
 *
 */
public class PlaceServiceImpl implements CountryService, DistrictService {
    @Override
    public String getServiceName() {
        BlockingQueue<File> x = null;
        return this.getClass().getSimpleName();
    }

}
