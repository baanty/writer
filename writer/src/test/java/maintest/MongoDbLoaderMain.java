package maintest;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import configuration.ApplicationConfig;
import vo.Worker;

public class MongoDbLoaderMain {
    private static final String WORKER_COLLECTION_TABLE_NAME = "worker_collection";
    /**
     * 
     */
    AnnotationConfigApplicationContext context;
    DB db;
    Worker worker;
    
    public void setUp(){
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        db = context.getBean(DB.class);
        worker = new Worker("David", 254584, new Date());
    }
    
    public void cleanUp(){
        context.close();
    }
    
    public static void main(String[] args) {
        MongoDbLoaderMain loader = new MongoDbLoaderMain();
        loader.setUp();
        loader.saveWorker();
        loader.showWorker();
        loader.cleanUp();
    }

    public void saveWorker(){
        DBCollection workerCollection = db.getCollection(WORKER_COLLECTION_TABLE_NAME);
        BasicDBObject workerObject = new BasicDBObject();
        workerObject.put("employeeId", worker.getEmployeeId());
        workerObject.put("name", worker.getEmployeeName());
        workerObject.put("lastUpdateTimestamp", worker.getLastUpdateTimestamp());
        workerCollection.insert(workerObject);
    }
    
    public void showWorker(){
        DBCollection workerCollection = db.getCollection(WORKER_COLLECTION_TABLE_NAME);
        BasicDBObject workerFinderObject = new BasicDBObject();
        workerFinderObject.put("employeeId", worker.getEmployeeId());
        DBCursor cursor = workerCollection.find(workerFinderObject);
        cursor.forEachRemaining(dbObject -> {
            dbObject.keySet().stream()
                             .forEach(key -> {
                                 System.out.println("The key is - "+key+". The value of the entry is - "+dbObject.get(key));
                             });
        });
    }
}
