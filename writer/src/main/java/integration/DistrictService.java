/**
 * 
 */
package integration;

/**
 * @author WE43MM
 *
 */
public interface DistrictService {
    
    default String getServiceName(){
        return DistrictService.class.getSimpleName();
    }

}
