package lt.codeacademy.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.BsonTypeClassMap;
import org.bson.codecs.DocumentCodec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class MongoDBHelper {

    private static final int PORT = 12345;//27017
    private static MongoClient mongoClient;
    private static CodecRegistry codecRegistry;
    private static DocumentCodec codec;

    public static MongoCollection<Document> getDocumentMongoCollection(String databaseName, String collectionName) {
        createIfNeeded();

        MongoDatabase db = mongoClient.getDatabase(databaseName);

        MongoCollection<Document> collection = db.getCollection(collectionName);
        return collection;
    }

    private static void createIfNeeded() {
        if (mongoClient == null) {
            mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false"));
            CodecProvider pojoCodecProvider = PojoCodecProvider.builder().register("lt.codeacademy.mongodb.part3.model", "lt.codeacademy.mongodb.part4.model").build();
            codecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
            codec = new DocumentCodec(codecRegistry, new BsonTypeClassMap());
        }
    }

    public static void close() {
        mongoClient.close();
    }

    public static <T> MongoCollection<T> getTypedMongoCollection(String dbName, String collectionName, Class<T> klass) {
        createIfNeeded();
        MongoDatabase db = mongoClient.getDatabase(dbName);

        return db.getCollection(collectionName, klass).withCodecRegistry(codecRegistry);

    }
}
