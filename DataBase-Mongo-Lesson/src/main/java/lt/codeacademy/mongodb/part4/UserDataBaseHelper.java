package lt.codeacademy.mongodb.part4;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import lt.codeacademy.mongodb.part4.model.User;

public class UserDataBaseHelper {

    private final MongoCollection<User> collection;

    public UserDataBaseHelper(MongoCollection<User> collection) {
        this.collection = collection;
    }

    public void changePassword(String username, String newPassword) {
        collection.updateOne(Filters.eq("username", username), Updates.set("password", newPassword));
    }

    public void readAndPrintAllUsers() {
        int count = 0 ;
        for (User user : collection.find()) {
            System.out.println(count + " " + user.getName() + " " + user.getUsername() + " " + user.getPassword());
            count++;
        }
    }

    public void createUser(String name, String username, String password) {
        if (!isDuplicateNameInUse(username)) {
            User newUser = new User();
            newUser.setName(name);
            newUser.setUsername(username);
            newUser.setPassword(password);
            collection.insertOne(newUser);

            System.out.println("--User created--");
        } else {
            System.out.println("--Username is in use--");
        }
    }

    private boolean isDuplicateNameInUse(String username) {
        return collection.countDocuments(Filters.eq("username", username)) > 0;
    }
}
