package learning.DesignPatern.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void constractorSportCar(Builder builder){
        builder.setEngins(new SportEngin());
        builder.setTripComputer(true);
        builder.setSeats(98);
        builder.setGps(true);

    }
}
