package assignment1;

public class Ticket {
	private int ID; // must be positive
	private Event event;
	private TicketType ticketType;
	private String studentName; // not null or blank
	private boolean cancelled;
	private boolean admitted;
	
	public Ticket(int ID, String studentName, Event event, TicketType ticketType) {
		if (ID <= 0) {
			throw new IllegalArgumentException("ID must be greater than 0");
		}
		if (studentName == "" || studentName == null) {
			throw new IllegalArgumentException("Name must not be empty");
		}
		if (event == null) {
			throw new IllegalArgumentException("Event must not be empty");
		}
		if (ticketType == null) {
			throw new IllegalArgumentException("Ticket type must not be empty");
		}
		this.ID = ID;
		this.studentName = studentName;
		this.event = event;
		this.ticketType = ticketType; 
		cancelled = false;
		admitted = false;
	}
	
	
	public boolean cancel() {
		if (cancelled == true) {
			System.out.println("Unable to Cancel ticket twice!");
			return false; // failure
		} 
		cancelled = true;
		System.out.println("Ticket has been Cancelled");
		return true; // success
	}
	
	public boolean admit() {
		if (admitted == true) {
			System.out.println("Unable to Admit ticket twice!");
			return false; // failure
		} 
		admitted = true;
		System.out.println("Ticket has been Admitted");
		return true; // success
	}
	
	public boolean isCancelled() {
		return cancelled;
	}
	
	public boolean isAdmitted() { 
		return admitted;
	}
	
	public boolean isActive() {
		if (cancelled == true || admitted == false) {
			return false;
		}
		return true;
		
	}
	
	public String toString() {
		return "Ticket ID: " + ID +	"\nStudent: " + studentName + "\nEvent: " + event + "\nTicket Type: " + ticketType + "\nActive: " + isActive();
	}
	
}
