public class Main {
    public static void main(String[] args) {
        Employee kursad = new Employee("Kürşad", "Yaprak", 900, 45, 1985);
        kursad.tax();            //vergi metodunu çağırıyoruz
        kursad.bonus();          //ek mesai metodunu çağırıyoruz
        kursad.raiseSalary();    //zam metodunu çağırıyoruz
        kursad.printInfoEmp();   //herşeyi ekrana bastıran metodu çağırıyoruz
    }
}