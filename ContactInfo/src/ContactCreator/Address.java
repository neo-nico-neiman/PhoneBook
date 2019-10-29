package ContactCreator;

public class Address {
    private String streetName;
    private int streetNumber;
    private String city;
    private String province;
    private String postalCode;
    private String country;
    public Address(){};

    public Address(String streetName, int streetNumber, String city, String province, String postalCode, String country){
        this.streetName=streetName;
        this.streetNumber=streetNumber;
        this.city=city;
        this.province=province;
        this.postalCode=postalCode;
        this.country=country;
    }

    public  Address createAddress(){
        Application app= new Application();
        String streetName= app.requestRetrieveString("enter streetName");
        int streetNumber= app.requestRetrieveInt("enter street number");
        String city= app.requestRetrieveString("enter city");
        String province= app.requestRetrieveString("enter province");
        String postalCode= app.requestRetrieveString("enter postal code");
        String country= app.requestRetrieveString("enter country");
        Address newAddress= new Address(streetName,streetNumber,city,province,postalCode,country);
        return newAddress;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

public String toString(){
        return "address "+streetNumber+" "+streetName+"\nCity "+ city;
}
}
