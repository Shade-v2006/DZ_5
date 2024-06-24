package model;

public abstract class User {
    protected int id;
    protected String name;
    protected String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + ": id = %s, name = %s, lastName = %s", id, name, lastName);
    }

    public int getId(){
        return id;
    }
}
