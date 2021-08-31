package pl.wojtczak.lesson4.example.cars;

public class Car implements Drive{

    double mileage;
    int doors;
    Brand brand;
    String model;
    Engine engine;

public Car(){
    this.mileage = 25;

}



   public Car (int doors, Brand brand, String model){
       this.brand = brand;
       this.doors = doors;
       this.model = model;
       this.mileage = -1000;
   }

    @Override
    public void forward() {
        mileage += 5;
    }

    @Override
    public void back() {
    mileage -= 5;
    }

    public void horn(){
        System.out.println("Biiiip");
    }

     public double drive (double mileage){
        this.mileage += mileage;
        return this.mileage;

         //return this.mileage += mileage; jedna linija zamiast dwóch

    }
}
