package com.JavaCode.project.user;

public class UserCollection {

    private User[] users;
    private final UserWriter writer = new UserWriter();

    public UserCollection() {
        this.users = new User[0];
    }

    public void addNewUser(String name,String password){
        User newUser = new User(name,password);
        writer.writeOneUserToFile(newUser);
        addMoreRoom();
        users[users.length - 1] = newUser;
    }

    public void addOldUser(String name,String password){
        User newUser = new User(name,password);
        addMoreRoom();
        users[users.length - 1] = newUser;
    }

    public User getUserByNameAndPassword(String name,String password){
        for(User u : users){
            if (u.getName().equals(name) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    private void addMoreRoom() {
        User[] newUsers = new User[users.length + 1];

        int count = 0;
        for (User u : users) {
            newUsers[count] = u;
            count++;
        }

        this.users = newUsers;
    }

    public User[] getUsers() {
        return users;
    }
}
