public abstract class Plan {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weight;
    private int wingspan;

    private int topSpeed;
    private int seats;
    private double cost;


    public Plan(String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        if (year > 1903 && year < 2021) {
            this.year = year;
        }
        if (hours > 0 && hours < 10000) {
            this.hours = hours;
        }
        this.military = military;
        this.weight = weight;
        if (wingspan > 10 && wingspan < 45) {
            this.wingspan = wingspan;
        }
        if (topSpeed > 0) {
            this.topSpeed = topSpeed;
        }
        if (seats > 0) {
            this.seats = seats;
        }
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public Plan() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println("Model is : " + model);
        System.out.println("Country is : " + country);
        System.out.println("Year of publishing is: " + year);
        System.out.println("Hours in air is: " + hours);
        System.out.println("Is it military: " + military);
        System.out.println("Weight of plan is: " + weight);
        System.out.println("Wingspan is: " + wingspan);
        System.out.println("Top speed is: " + topSpeed);
        System.out.println("Seats: " + seats);
        System.out.println("cost is: " + cost);
    }


    public void Task2(Plan a) {
        if (a.isMilitary()) {
            System.out.println(a.getCost());
            System.out.println(a.getTopSpeed());
        } else {
            System.out.println(a.getModel());
            System.out.println(a.getCountry());
        }
    }


    public abstract Plan Task3(Plan a, Plan b);

    public abstract String Task4(Plan a, Plan b);
}
