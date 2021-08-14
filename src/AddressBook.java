public class AddressBook {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long phoneNumber;
    private int zip;


    public AddressBook() {


        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.zip = zip;
    }

    /*Getters and setters to return and set or update the value*/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZip() {
        return String.valueOf(zip);
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
                + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
    }
}




