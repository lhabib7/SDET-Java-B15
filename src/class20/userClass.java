package class20;

public class userClass {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor
    // call. Print users name, mobile number and address in userDetails method. Test your code.
    String name;
    String mobileNumber;
    userClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class userInfo extends userClass {
    String address;
    userInfo(String name, String mobileNumber,String address) {
        super(name, mobileNumber);
       this.address=address;
    }
    void userDetails(){
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
}
    public static void main(String[] args) {
        userInfo user = new userInfo("Amber", "9143285465", "2365 Main St");
        user.userDetails();
    }
}

