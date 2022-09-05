public class CarBuilder {
    private String car_brand;
    private String model;
    private int volume;
    private Color color;
    private int year;

    public CarBuilder setCar_brand(String car_brand) {
        this.car_brand = car_brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public Car createCar() {
        return new Car(car_brand, model, volume, color, year);
    }
}