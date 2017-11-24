/**
 * 
 */
package configuration;

import java.net.UnknownHostException;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import presentation.DetailsController;

/**
 * @author WE43MM
 *
 */
@Configuration
public class ApplicationConfig {

    @Autowired
    DetailsController detailsController;
    
    @Autowired
    DB db;
    
    @Autowired
    MongoClient mongoClient;
      
    @Bean
    public DetailsController configureDetailsController(){
        return detailsController;
    }
    
    @Bean
    public MongoClient mongoClient() throws UnknownHostException{
        return new MongoClient( "localhost" , 27017 );
    }
    
    @Bean
    public DB mongoDb() throws UnknownHostException{
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        return mongoClient.getDB("admin");
    }
    
    @PreDestroy
    public void cleanUp(){
        System.out.println("Running the Configuration class clean up method..");
        mongoClient.close();
    }
}
