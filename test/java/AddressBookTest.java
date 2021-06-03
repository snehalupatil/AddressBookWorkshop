

class AddressBookTest {

    @Test
    public void GivenContact_whenReturn_SholdReturnTest(){
        AddressBook address = new AddressBook();
        Contacts contact = new contacts("Snehal", "Patil", "Gitanagaer", "Sangli", "Maharastra", "444444", "9999999999", "snehal@gmail.com");
        boolean result = address.AddContact(addressbook);
        Assertions.assertTrue(result);
    }
}
