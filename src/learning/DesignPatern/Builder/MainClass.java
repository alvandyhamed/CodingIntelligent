package learning.DesignPatern.Builder;

public class MainClass {
    public static void main(String[] args) {

        //// Without Director
        Car car = (new CarBuilder())
                .setEngins(new SportEngin())
                .setTripComputer(true)
                .setSeats(5)
                .setGps(false)
                .build();

        //// With Director

        CarBuilder carbuilder=new CarBuilder();
        Director director=new Director();
        director.constractorSportCar(carbuilder);
        Car car1=carbuilder.build();




        System.out.println("MyCar    "+car.seats+"\n"+car.engins+"\n"+car.gps+"\n"
        +car.TripComputer
        );

        System.out.println("MyCar2"+car1.seats+"\n"+car1.engins+"\n"+car1.gps+"\n"
                +car1.TripComputer
        );
    }
}
