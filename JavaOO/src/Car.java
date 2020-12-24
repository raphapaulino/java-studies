public class Car extends Vehicle {

    Integer shifts;

    public Car () {
        super(); // add father class constructor into Car class
    }

    public Car (String color, Double topSpeed) {
        super(color, topSpeed);
    }

    public Integer getShifts() {
        return this.shifts;
    }

    public void setShifts(Integer shifts) {
        this.shifts = shifts;
    }

    public void methodOverriding() {
        System.out.println("This is a method from Child class overriding");
    }
}
