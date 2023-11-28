import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database {
    private List<Konser> concertDatabase;
    private List<User> userDatabase;

    public Database() {
        concertDatabase = new ArrayList<>();
        userDatabase = new ArrayList<>();
    }

    public void addConcert(Konser konser) {
        concertDatabase.add(konser);
    }

    public List<Konser> getAllConcerts() {
        return concertDatabase;
    }

    public void addUser(User user) {
        userDatabase.add(user);
    }

    public List<User> getAllUsers() {
        return userDatabase;
    }


    public static void main(String[] args) {
        
        Database database = new Database();

       
        Konser concert = new Konser();
        concert.setBandname("Example Band");
        concert.setDate(new Date()); 
        concert.setLocation("Example Location");
        concert.setTicketprice(50.0);
        database.addConcert(concert);

        
        User user = new User();
        user.setNama("John Doe");
        user.setNoHandphone("123-456-7890");
        database.addUser(user);

       
        List<Konser> concerts = database.getAllConcerts();
        for (Konser c : concerts) {
            System.out.println("Band: " + c.getBandname());
            System.out.println("Date: " + c.getDate());
            System.out.println("Location: " + c.getLocation());
            System.out.println("Ticket Price: " + c.getTicketprice());
        }

        List<User> users = database.getAllUsers();
        for (User u : users) {
            System.out.println("User Name: " + u.getNama());
            System.out.println("Phone Number: " + u.getNoHandphone());
        }
    }
}
