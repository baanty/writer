/**
 * 
 */
package integration;

/**
 * @author we43mm
 *
 */
public interface AuthenticationService {
    
    public default Boolean authenticateUser(String userId, String password){
        return (userId.equalsIgnoreCase(password));
    }

    public default Boolean authenticateUsers(String userId, String password){
        return (userId.equalsIgnoreCase(password));
    }
}
