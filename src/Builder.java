public class Builder extends Car {
    private car_tip car_tip;
    private int wheel_size;




    public Builder(String car_brand, String model, int volume, Color color, int year, car_tip car_tip, int wheel_size) {
        super(car_brand, model,volume, color,year);

        this.car_tip = car_tip;
        if (wheel_size < 0){
            this.wheel_size = getWheel_size();
            System.out.println("Нормально размер колес пиши");
        } else {
            this.wheel_size = wheel_size;
        }
    }




    public car_tip getCar_tip() {
        return car_tip;
    }
    public int getWheel_size() {
        return wheel_size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\n car tip:" + car_tip +
                "\n wheel size: " + wheel_size;
    }
}


