package ContactCreator;
/*
Created by Nico Neiman October 2019
 */

public class Main {

    public static void main (String[]args){
        Application app=new Application();
        int arraySize=app.requestRetrieveInt("Enter size of contact array");
        ContactInfo[] newArray =new ContactInfo[arraySize];
        ContactInfo emptyContact= new ContactInfo();
        for (int i = 0; i <newArray.length ; i++) {
            newArray[i]=emptyContact;
        }
        int selection;
        do {
            selection=app.requestRetrieveInt("Select: 1. to add 3 contact|| 2. for one contact  || 0. exit");
            switch (selection) {
                case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("Enter contact " + (i + 1) + "\n");
                    PersonalInfo pI = new PersonalInfo();
                    PersonalInfo newPersonalInfo = pI.createPersonalInfo();
                    Address nA = new Address();
                    Address newAddress = nA.createAddress();
                    ContactInfo cI = new ContactInfo();
                    ContactInfo newContactInfo = cI.createContactInfo(newPersonalInfo, newAddress);
                    newArray[i] = newContactInfo;
                    break;
                }
                case 2:
                    int contactPosition=app.requestRetrieveInt("Which contact you want to edit? (select value smaller than array length");
                    System.out.println("Enter info for contact " + contactPosition + "\n");
                    PersonalInfo pI = new PersonalInfo();
                    PersonalInfo newPersonalInfo = pI.createPersonalInfo();
                    Address nA = new Address();
                    Address newAddress = nA.createAddress();
                    ContactInfo cI = new ContactInfo();
                    ContactInfo newContactInfo = cI.createContactInfo(newPersonalInfo, newAddress);
                    newArray[ contactPosition] = newContactInfo;
                    break;
            }
        }while (selection!=0);
        Contact newContact= new Contact(newArray);
        System.out.println(newContact.getTotalContacts());
        for (int i = 0; i <newArray.length ; i++) {
            System.out.println(newArray[i]);

        }

    }
}
