package learning.DesignPatern.Builder;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder(){
        reset();
    }

    @Override
    public void reset() {
        this.car=new Car();

    }

    @Override
    public Builder setSeats(int seats) {
        car.seats=seats;
        return this;

    }

    @Override
    public Builder setEngins(Engin engins) {
car.engins=engins;
return this;
    }

    @Override
    public Builder setTripComputer(boolean tripComputer) {
     car.TripComputer=tripComputer;
    return this;
    }

    @Override
    public Builder setGps(boolean gps) {
        car.gps=gps;
        return this;
    }

    @Override
    public Car build() {
        Car product=this.car;

        return product;
    }
}
