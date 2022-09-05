public class Car {
    private String car_brand;
    private String model;
    private int year;
    private float volume;
    private Color color;


    public int getYear() {
        return year;
    }

    public Car(String car_brand, String model, int volume, Color color, int year) {
        this.car_brand = car_brand;
        this.model = model;
        this.volume = volume;
        this.color = color;
        this.year = year;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getModel() {
        return model;
    }

    public float getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public String getInfo() {
        return "\n brand: " + car_brand +
                "\n model: " + model +
                "\n volume: " + volume +
                "\n color: " + color +
                "\n year: " + year;
    }
}
