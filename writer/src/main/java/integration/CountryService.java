/**
 * 
 */
package integration;

/**
 * @author WE43MM
 *
 */
public interface CountryService {
    
    default String getServiceName(){
        return CountryService.class.getSimpleName();
    }

}
