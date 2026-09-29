package assignment1;

public class TicketManager {
    private TicketBook book;
    private int nextId = 1;

    public TicketManager(TicketBook book) {
        this.book = book;
    }

    public int createTicket(Event event, TicketType type, String name) {
        Ticket ticket = new Ticket(nextId, name, event, type);
        book.addTicket(ticket);
        nextId++;
        return nextId - 1;
    }

    public boolean cancelTicket(int id) {
        Ticket ticket = book.findById(id);

        if (ticket == null) {
            return false;
        }

        return ticket.cancel();
    }

    public boolean admitTicket(int id) {
        Ticket ticket = book.findById(id);

        if (ticket == null) {
            return false;
        }

        return ticket.admit();
    }

    public void printAll() {
        book.printAll();
    }

    public void printForEvent(Event event) {
        book.printForEvent(event);
    }
}