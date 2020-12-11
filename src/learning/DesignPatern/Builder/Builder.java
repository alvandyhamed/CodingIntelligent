package learning.DesignPatern.Builder;

public interface Builder {

    //this method for make ready next object constractor
    public void reset();
    public Builder setSeats(int seats);

    public Builder setEngins(Engin engins);

    public Builder setTripComputer(boolean tripComputer);

    public Builder setGps(boolean gps);
    public Car build();
}
