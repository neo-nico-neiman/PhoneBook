package ContactCreator;

public class PersonalInfo {
    private String fName;
    private String lName;
    private String bloodType;
    private String emergencyContactName;
    private int emergencyPhoneNumber;
    public PersonalInfo(){};

    public PersonalInfo(String fName,String lName, String bloodType, String emergencyContactName, int emergencyPhoneNumber){
        this.fName=fName;
        this.lName=lName;
        this.bloodType=bloodType;
        this.emergencyContactName=emergencyContactName;
        this.emergencyPhoneNumber=emergencyPhoneNumber;
    }

    public PersonalInfo createPersonalInfo(){
        Application app= new Application();
        String fName= app.requestRetrieveString("enter first name");
        String lName= app.requestRetrieveString("enter last name");
        String bloodType= app.requestRetrieveString("enter blood type");
        String emergencyContactName= app.requestRetrieveString("enter emergency contact name");
        int emergencyPhoneNumber= app.requestRetrieveInt("enter emergency phone number");

        PersonalInfo personalInfo= new PersonalInfo(fName,lName,bloodType,emergencyContactName,emergencyPhoneNumber);
        return personalInfo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public int getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(int emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String toString(){
        return "name "+fName+" "+lName+"\nBlood type "+bloodType+"\nEmergency contact "+emergencyContactName+" "+emergencyPhoneNumber;
    }
}
