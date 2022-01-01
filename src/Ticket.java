public class Ticket {
    int ticketId = 0;
    String ticketPersonData;
    String ticketMovieTitle;

    public void GetTicket(Client client, Movie movie) {
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        } else if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
        } else {
            ticketId = ticketId + 1;
            movie.setFreeSeats(movie.getFreeSeats() - 1);
            ticketPersonData = client.getFirstName() + " " + client.getLastName();
            ticketMovieTitle = movie.getMovieTitle();
            System.out.println("Sprzedano następujący bilet: ");
            System.out.println("Imię i Nazwisko: " + client.getFirstName() + " " + client.getLastName());
            System.out.println("Numer biletu: " + ticketId);
            System.out.println("liczba wolnych miejsc: " + movie.getFreeSeats());
            System.out.println("Liczba sprzedanych biletów: " + (movie.getMaxSeats() -
                    movie.getFreeSeats()));

        }
    }
}
