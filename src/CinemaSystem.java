public class CinemaSystem {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Omen", "horror", 128,
                16, 3);
        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket1 = new Ticket();
        ticket1.GetTicket(client2,movie1);
        ticket1.GetTicket(client2,movie1);
        ticket1.GetTicket(client2,movie1);
        ticket1.GetTicket(client2,movie1);
    }
}
