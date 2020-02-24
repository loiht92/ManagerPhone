public class Phone {

    private String name;
    private String phoneNumber;

    public Phone() {
    }

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone: " +
                "name='" + name + "\t" +
                ", phoneNumber='" + phoneNumber + "\t" ;
    }
}
