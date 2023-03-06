import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketReservation {

    public static void main(String[] args) {
        List<Integer> seatNo = new ArrayList<>();
        for (int i=1; i<33; i++){
            seatNo.add(i);
        }
        Bus bus = new Bus("34 IST 78", seatNo);
        Ticket ticket = new Ticket();
        start(bus, ticket);

    }

    public static void start(Bus bus, Ticket ticket){
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Reservation System!");
        System.out.println("Enter the distance to be traveled in KM:");
        ticket.setDistance(inp.nextInt());
        int tripNo;
        boolean tripNoExists;
        do {
            System.out.println("Choose the type of trip:");
            System.out.println("1) One-way\n2) Round-Round");
            tripNo = inp.nextInt();
            tripNoExists = tripNo==1 || tripNo==2;
            if (!tripNoExists) {
                System.out.println("You have entered incorrectly");
            }
        }while (!tripNoExists);

        ticket.setTypeNo(tripNo);
        System.out.println("Please enter your age:");
        int age = inp.nextInt();
        System.out.println("Please choose seat number:");
        System.out.println("(Single seat fee is 20% more.)");
        System.out.println(bus.getSeats());
        int seatNo;
        boolean seatNoExists;
        do {
            seatNo = inp.nextInt();
            seatNoExists = bus.getSeats().contains(seatNo);
            if (!seatNoExists) {
                System.out.println("You have chosen wrong seatNo!!!\nPlease select correct seatNo:");
            }
        }while(!seatNoExists);
        ticket.setSeatNo(seatNo);
        bus.getSeats().remove(ticket.getSeatNo() - 1);
        boolean check = ticket.getTypeNo()==1 || ticket.getTypeNo()==2;

    }
}