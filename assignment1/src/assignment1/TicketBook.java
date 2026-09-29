package assignment1;

public class TicketBook {
    private Ticket[] tickets = new Ticket[100];
    private int count = 0;

    public void addTicket(Ticket ticket) {
        tickets[count] = ticket;
        count++;
    }

    public Ticket findById(int ID) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getId() == ID) {
                return tickets[i];
            }
        }
        return null;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(tickets[i]);
        }
    }

    public void printForEvent(Event event) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getEvent() == event) {
                System.out.println(tickets[i]);
            }
        }
    }
}