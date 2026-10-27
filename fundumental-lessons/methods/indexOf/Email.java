public class Email {

    // add one attribue for the address

    private String address;

    // create a constructor that assigns an address to this address

    public Email(String address) {
        this.address = address;
    }

    // create the following empty methods with the correct return type (hint: none of them are void)
    // toString

    public String toString() {
        return address;
    }

    // getAtIndex
    //  Where is the @ ?    mharrell@hcvsd.org
    public int getAtIndex() {
        return address.indexOf("@");
    }



    // getUser will return everything to the LEFT of the @

    // method: substring -- cuts out part of a String.
     // String substring(int from, int to)   from index "from" up to, NOT including, "to"
     //guevara20288762@gmail.com
    public String getUser() {
        return address.substring(0,address.indexOf("@"));
    }

    // getDomain

    public String getDomain() {
        //write code here

        return address.substring( address.indexOf("@") + 1);
    }

    // isSchool
    public boolean isSchool() {
        return false;
    }
    
}
