package ru.mirea.task28;

public class Auto {
    public String brand, model, type;
    private final Wheels wheels=new Wheels("Toyo");

    public Auto() { }

    Auto(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    Auto(String brand, String model, String type){
        this.brand=brand;
        this.model=model;
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineSound(){
        System.out.println("Звук двигателя");
    }

    private class Wheels { //Вложенный внутренний класс
        private String manufacturer;

        private Wheels(String manufacturer){
            this.manufacturer=manufacturer;
        }

        @Override
        public String toString() {
            return "Wheels{" +
                    "manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }

    public static class Sedan extends Auto { //Вложенный статический класс
        Sedan(String brand, String model) {
            super(brand, model);
            setType("Sedan");
        }
    }

    public class SRCar extends Auto { //Вложенный класс

        SRCar(String brand, String model) {
            super(brand, model);
            setType("StreetRace car");
        }

        public void engineSound(){
            System.out.println("Рев двигателя");
        }
    }

    public static void main(String[] args) {

        Auto sedan=new Sedan("Audi", "A4");
        Auto notAnonSRCar=new Auto().new SRCar("Mitsubishi", "Lancer10");
        Auto anonSRCar=new Auto("Honda", "Civic", "SR car") { //Анонимный класс
            @Override
            public void engineSound() {
                System.out.println("Рев двигателя");
            }
        };

        System.out.println(sedan.toString());
        sedan.engineSound();

        System.out.println(anonSRCar.toString());
        anonSRCar.engineSound();

        System.out.println(notAnonSRCar.toString());
        notAnonSRCar.engineSound();

    }


    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", " + wheels.toString() +
                '}';
    }
}