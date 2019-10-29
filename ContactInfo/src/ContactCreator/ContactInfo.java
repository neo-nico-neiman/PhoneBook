package ContactCreator;

public class ContactInfo {
    PersonalInfo personalInfo;
    private int cellNumber;
    private String email;
    Address newAddress;

    public ContactInfo(){}

    public ContactInfo(PersonalInfo personalInfo, int cellNumber, String email, Address newAddress){
        this.personalInfo=personalInfo;
        this.cellNumber=cellNumber;
        this.email=email;
        this.newAddress=newAddress;
    }
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(Address newAddress) {
        this.newAddress = newAddress;
    }
    public static ContactInfo createContactInfo(PersonalInfo personalInfo, Address newAddress){
        Application app= new Application();
        int cellNumber= app.requestRetrieveInt("enter cell number");
        String email= app.requestRetrieveString("enter email");
        ContactInfo newContactInfo= new ContactInfo(personalInfo,cellNumber, email,newAddress);
        return newContactInfo;
    }
    public String toString(){
        return "personal info "+personalInfo+" address "+newAddress;
    }

}
