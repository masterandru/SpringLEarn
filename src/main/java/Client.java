/**
 * user
 * 13.12.2016
 */
public class Client {
    String id;
    String fullName;

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
}
