package lt.codeacademy.mongodb.part4;

import com.mongodb.client.MongoCollection;
import lt.codeacademy.mongodb.MongoDBHelper;
import lt.codeacademy.mongodb.part4.model.User;

public class UsersMainTask {

    public static void main(String[] args) {
        MongoCollection<User> collection = MongoDBHelper.getTypedMongoCollection("Task", "Users", User.class);
        UserDataBaseHelper userDataBaseHelper = new UserDataBaseHelper(collection);

        userDataBaseHelper.createUser("NewUser", "New", "123");
        userDataBaseHelper.changePassword("NewUser", "1234");
        userDataBaseHelper.readAndPrintAllUsers();

        MongoDBHelper.close();
    }

}
