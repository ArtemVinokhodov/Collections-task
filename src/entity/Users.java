package entity;

public class Users {
    private final String name;
    private final String eMail;


    public Users(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String getEMaile() {
        return eMail;
    }

    @Override
    public String toString() {
        return "User{" +
                " name='" + name + '\'' +
                ", has e-mail='" + eMail + '\'' +
                '}';
    }
}


