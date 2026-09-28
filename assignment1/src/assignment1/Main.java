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
		
		TicketBook ticketBook = new TicketBook();
		
		// assuming constructor TicketManager(TicketBook ticketBook);
		// or TicketBook creates its own TicketManager object?
		TicketManager ticketManager = new TicketManager(ticketBook); 					
		
		// Ticket creation
		//            			  (Event event, TicketType type, String studentName)
		ticketManager.createTicket(pizzaParty, studentTicket, "Jerry");
		ticketManager.createTicket(bandConcert, adultTicket, "Tom");
		ticketManager.createTicket(homecoming, studentTicket, "Mario");
		ticketManager.createTicket(footballGame, studentTicket, "Luigi");
		ticketManager.createTicket(homecoming, studentTicket, "Peach");

		ticketManager.cancelTicket(ticketManager.getID());
		ticketManager.admitTicket(ticketManager.getID());
		
		//ticketManager.admitTicket(cancelled ticket)
		
		// prints all stored tickets (one per line)
		TicketManager.printAll();
		// prints tickets for that event
		TicketManager.printForEvent();
		
		
		
		
		
		

	}

}
