package assignment1;

public class Main {

	public static void main(String[] args) {
		
		// Event creation
		Event homecoming = new Event("Homecoming", "Gym");
		Event bandConcert = new Event("Band Concert", "Auditorium");
		Event footballGame = new Event("Football Game", "Field");
		Event pizzaParty = new Event("Pizza Party", "Gym");
		
		// Ticket type creation
		TicketType studentTicket = new TicketType("Student", 5);
		TicketType adultTicket = new TicketType("Adult", 10);
		
		TicketBook ticketBook = new TicketBook(10);
		
		// assuming constructor TicketManager(TicketBook ticketBook);
		// or TicketBook creates its own TicketManager object?
		TicketManager ticketManager = new TicketManager(ticketBook); 					
		
		// Ticket creation
		//            			  (Event event, TicketType type, String studentName)
		// assuming createTicket returns int ID
		int ticket1 = ticketManager.createTicket(pizzaParty, studentTicket, "Jerry");
		int ticket2 = ticketManager.createTicket(bandConcert, adultTicket, "Tom");
		int ticket3 = ticketManager.createTicket(homecoming, studentTicket, "Mario");
		int ticket4 = ticketManager.createTicket(footballGame, studentTicket, "Luigi");
		int ticket5 = ticketManager.createTicket(homecoming, studentTicket, "Peach");

		ticketManager.cancelTicket(ticket1); 
		ticketManager.admitTicket(ticket3); 
		
		ticketManager.admitTicket(ticket1); // should fail since ticket1 is has been cancelled
		
		// prints all stored tickets (one per line)
		ticketManager.printAll();
		// prints tickets for that event
		ticketManager.printForEvent(homecoming);
		
		
		
		
	}

}
