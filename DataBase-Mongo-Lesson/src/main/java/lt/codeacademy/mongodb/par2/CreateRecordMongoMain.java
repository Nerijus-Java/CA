package lt.codeacademy.mongodb.par2;

import com.mongodb.client.MongoCollection;
import lt.codeacademy.mongodb.MongoDBHelper;
import org.bson.Document;

import java.util.Iterator;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;


public class CreateRecordMongoMain {
    public static void main(String[] args) {

        MongoCollection<Document> collection = MongoDBHelper.getDocumentMongoCollection("CodeAcademy", "Person");

        insertSomeData(collection);

        printData(collection);

        MongoDBHelper.close();
    }

    private static void printData(MongoCollection<Document> collection) {

        Iterator<Document> it = collection.find().iterator();
        while (it.hasNext()) {
            Document d = it.next();

            System.out.println(d.getString("name"));
            System.out.println(d.getString("lastname"));
            Document address = (Document) d.get("address");
            System.out.println(address.getString("street"));
        }

    }

    private static void insertSomeData(MongoCollection<Document> collection) {

        if (collection.countDocuments(
                and(eq("name", "Tomas"), eq("lastname", "Tom"))) == 0) {

            collection.insertOne(new Document()
                    .append("name", "Tomas")
                    .append("lastname", "tom")
                    .append("address", new Document()
                            .append("city", "Vilnius")
                            .append("street", "Žalgirio g.")
                            .append("nr", 10)));
        } else {
            System.out.println("Record not created...");
        }
    }

}
