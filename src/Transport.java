public class Transport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String origin;
    protected String color;
    protected int maxSpeed;

    public Transport(String brand, String model, String color, int productionYear, String origin, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.origin = origin;
        setMaxSpeed(maxSpeed);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank() ) {
            this.color = color;
        } else {
            this.color = "default";
        }
    }

    public String getOrigin() {
        return origin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0)
            this.maxSpeed = maxSpeed;
    }
}
