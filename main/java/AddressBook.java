import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList = new ArrayList<>();

    /**
     * adding Contacts in the Address Book
     * @return
     */
    public boolean add(Contacts contact) {
        return this.contactList.AddContact(contact);

    }

    /**
     * Welcome message is added
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");

    }
}



