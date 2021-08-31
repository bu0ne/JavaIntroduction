package pl.wojtczak.lesson4.example.hospital;

public class Main {
  public static void main(String[] args) {
    Doctor doctor = new Doctor();
    doctor.setName("Artur");
    doctor.setSurname("Wojtczak");
    doctor.specialization = "cardiopedriat";
    doctor.license = "1341";

    Nurse nurse = new Nurse();
    nurse.name = "helena";
    nurse.surname = "gomez";
    nurse.level = "salowa";

    Employee employee = new Employee();
    employee.name = "Jan";
    employee.surname = "Nowak";

    System.out.println(doctor.name);
    System.out.println(doctor.name);
  }

}
