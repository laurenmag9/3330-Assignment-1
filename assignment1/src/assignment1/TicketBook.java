package assignment1;

public class TicketBook {
    private Ticket[] tickets;
    private int count;

    public TicketBook(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }

        tickets = new Ticket[capacity];
        count = 0;
    }

    public Ticket createTicket(int ID, String studentName,
            Event event, TicketType ticketType) {

        if (count >= tickets.length) {
            throw new IllegalStateException("Ticket book is full");
        }

        Ticket ticket = new Ticket(ID, studentName, event, ticketType);
        tickets[count] = ticket;
        count++;

        return ticket;
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