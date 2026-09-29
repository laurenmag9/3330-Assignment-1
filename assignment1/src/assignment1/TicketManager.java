package assignment1;

public class TicketManager {
    private TicketBook book;
    private int nextId = 1;

    public TicketManager(TicketBook book) {
        if (book == null) {
            throw new IllegalArgumentException("Ticket book is required");
        }

        this.book = book;
    }

    public int createTicket(Event event, TicketType type, String name) {
        book.createTicket(nextId, name, event, type);
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