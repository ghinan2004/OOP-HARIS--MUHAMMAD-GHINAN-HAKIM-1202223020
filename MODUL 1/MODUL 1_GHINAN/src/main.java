public class main {
    public static void main(String[] args) {
        Konser concert = new Konser();
        concert.setBandname("Example Band");
        // Set other concert details

        User user = new User();
        user.setNama("John Doe");
        user.setNoHandphone("123-456-7890");

        user.registerUser();

        System.out.println("Concert Details:");
        System.out.println("Band Name: " + concert.getBandname());
        // Display other concert details
    }
}
