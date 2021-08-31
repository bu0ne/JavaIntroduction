package pl.wojtczak.lesson4.example.hospital;

public class Main {
  public static void main(String[] args) {
    Doctor dorothy = new Doctor();
    dorothy.setName("Artur");
    dorothy.setSurname("Wojtczak");
    dorothy.specialization = "cardiopedriat";
    dorothy.license = "1341";

    Nurse nurse = new Nurse();
    nurse.name = "helena";
    nurse.surname = "gomez";
    nurse.level = "salowa";

    Employee employee = new Employee();
    employee.name = "Jan";
    employee.surname = "Nowak";

    System.out.println(dorothy.name);
    System.out.println(dorothy.name);
  }

}
