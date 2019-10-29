package ContactCreator;

public class Contact {
    ContactInfo[] contactInfoArray;
    private int totalContacts;

    public Contact(){};
    public Contact(ContactInfo[] contactInfoArray){
        this.contactInfoArray=contactInfoArray;
        this.totalContacts=contactInfoArray.length;
    }

    public int getTotalContacts() {
        return totalContacts;
    }

    public void setTotalContacts(int totalContacts) {
        this.totalContacts = contactInfoArray.length;
    }
}
