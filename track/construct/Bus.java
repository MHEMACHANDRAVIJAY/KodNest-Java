
public class Bus {
    private String name; 
    private int seats;
    private String route;
    
    public Bus(String name, int seats, String route) {
        this.name = name;
        this.seats = seats;
        this.route = route;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public String getRoute() {
        return route;
    }
}

public class Conductor {
    private String name;
    
    public Conductor(String name) {
        this.name = name;
    }
    
    public void collectCash(double amount) {
        System.out.println("Conductor " + name + " collected cash: $" + amount);
    }
    
    public void giveTicket(String passengerName) {
        System.out.println("Conductor " + name + " gave ticket to: " + passengerName);
    }
    
    public void collectCashAndGiveTicket(double amount, String passengerName) {
        collectCash(amount);
        giveTicket(passengerName);
    }
}   


     
