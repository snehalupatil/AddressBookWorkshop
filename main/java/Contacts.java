
public class Contacts{
    String firstName, lastName,address, city, state,zip,String phoneNumber,String email;

    /**
     * This is a parameterized constructor having the given parameters.
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phonenumber
     * @param email
     */
    public Contacts(String firstName, String lastName, String address, String city, String state, String zip, String phonenumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phonenumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts{
                "First Name=" + firstName+"\nLast Name=" +lastName + "\nAddress='" + address + "\ncity='" + city + '\'' +
                "\nstate=" + state + "\neMail='" + eMail + "\nphoneNumber=" + phoneNumber +"\nzipCode=" + zipCode +
                '}';
    }

