public class User {

    // TODO: Create Private Attributes of User (Name and Phone Number) then Create Setter method for each attribute
    private String nama;
    private String noHandphone;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHandphone() {
        return noHandphone;
    }

    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void registerUser() {
        if (nama != null && noHandphone != null) {
            System.out.println("Registration Successful!");
            System.out.println("Name: " + nama);
            System.out.println("Phone Number: " + noHandphone);
        }
    }
}