public class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String course) {
        System.out.println(name + " is managing the system for " + course);
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + " (Admin)";
    }
}
