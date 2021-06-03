public class AddressBook {

    public void setDetails()
    {
        /**
         *  Initialize variables and Create the contact
         */
        String firstName, lastName, address, city,state,zip,phone,email;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Name: ");
        firstName = sc.nextLine();
        System.out.println("Enter the Last Name: ");
        lastName = sc.nextLine();
        System.out.println("Enter the Address: ");
        address = sc.nextLine();
        System.out.println("Enter the City: ");
        city = sc.nextLine();
        System.out.println("Enter the State:");
        state = sc.nextLine();
        System.out.println("Enter the ZipCode:");
        zip = sc.nextLine();
        System.out.println("Enter the Phone Number: ");
        phone = sc.nextLine();
        System.out.println("Enter the Email address: ");
        email = sc.nextLine();
    }

    /**
     *  Ability to display Contact
     */
    public void showDetails()
    {
        System.out.println();
        System.out.print("First Name: "+firstName+"Last Name:"+lastName + "\nAddress: "+address+ "\nCity: "+city);
        System.out.print("\nstate"+state+"Zip code: "+zip+ "\nPhone no.: "+phone+ "\nEmail: "+email);
    }

    /**
     * Initialise constructor and call the methods
     * @param args
     */
    public static void main(String[] args)
    {
        AddressBook book = new AddressBook();
        book.setDetails();
        book.showDetails();

        /**
         * welcome message is added
         */
        System.out.println("Welcome to AddressBook System");
    }
}
