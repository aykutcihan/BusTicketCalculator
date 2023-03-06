public class Ticket {

    private Integer distance;
    private Integer typeNo;
    private Integer seatNo;
    private Double price;

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void printTicket(Bus bus) {
        System.out.println("-------Ticket Details-------");
        System.out.println("Total amount: " + price);
        System.out.println("Bus plate: " + bus.getNumberPlate());
        System.out.println("Distance: " + distance);
        System.out.println("Trip type: " + (typeNo==1 ? "One direction" : "Round-Trip"));
        System.out.println("Seat no: " + seatNo);
        System.out.println("We wish you a pleasant journey...");
    }
}
