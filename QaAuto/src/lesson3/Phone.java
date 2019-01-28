package lesson3;

public class Phone {
    public String PhoneName;
    public double PhonePrice;

    public Phone(){
    };

    public Phone(String phoneName, double phonePrice) {
        PhoneName = phoneName;
        PhonePrice = phonePrice;
    }

    public String getPhoneName() {
        return PhoneName;
    }

    public void setPhoneName(String phoneName) {
        PhoneName = phoneName;
    }

    public double getPhonePrice() {
        return PhonePrice;
    }

    public void setPhonePrice(double phonePrice) {
        PhonePrice = phonePrice;
    }


}
