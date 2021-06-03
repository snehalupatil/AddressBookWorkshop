public class AddressBook {

    /**
     * Added variables
     */
    public String firstName,lastName,address,city,state,zip,phoneNumber,email;

    /**
     * Initialize values
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phoneNumber
     * @param email
     */
    public Addressbook(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email){
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public static void main(String[] args) {
        /**
         * Added welcome message
         */
        System.out.println("Welcome to AddressBook System");
    }
}
