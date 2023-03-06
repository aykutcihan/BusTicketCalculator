import java.util.List;

public class Bus {

    private String numberPlate;
    private List<Integer> seats;

    public Bus(String numberPlate, List<Integer> seats) {
        this.numberPlate = numberPlate;
        this.seats = seats;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public List<Integer> getSeats() {
        return seats;
    }

    public void setSeats(List<Integer> seats) {
        this.seats = seats;
    }

}
