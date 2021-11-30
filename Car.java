
public class Car
{
    private String model;
    private String colour;
    private int year;
    
    public Car(String model, String colour, int year){
        this.model = model;
        this.colour = colour;
        this.year = year;
    }
    public String drive(){
        return "Driving...";
    }
    public void setModel(String model){
        this.model = model;
    }
    public void info(){
        System.out.println("model: " + model + "\nColour: " + colour + "\nYear: " + year);
    }
    public static void main(String[] args){
        Car c1 = new Car("Ford Focus", "Red", 2010);
        c1.drive();
        c1.info();
        c1.setModel("VW Golf");
        c1.info();
    }
}
