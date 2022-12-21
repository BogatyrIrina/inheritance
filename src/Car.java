public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;


    public double getEngineVolume() {
        return engineVolume;
    }

    public String getOrigin() {
        return origin;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }


    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String origin, String bodyType, int numberOfSeats, String transmission,
               String registrationNumber, boolean summerTyres, int maxSpeed) {
        super(brand, model, color, productionYear, origin, maxSpeed);

        if (brand != null && !brand.isEmpty() && !brand.isBlank() ) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (origin == null) {
            this.origin = "default";
        } else {
            this.origin = origin;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats == 0) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }

        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        this.summerTyres = !this.summerTyres;
    }
}
