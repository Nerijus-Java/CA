package lt.codeacademy.mongodb.par1;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.function.Consumer;


public class ConnectToMongoMain {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false"));

        MongoDatabase db = mongoClient.getDatabase("CodeAcademy");

        MongoCollection<Document> collection = db.getCollection("Second");

        collection.find().forEach((Consumer<Document>) document -> {

            System.out.println(document.getString("name") + " " +document.getString("surname"));

        });

        mongoClient.close();
    }
}
