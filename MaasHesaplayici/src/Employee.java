class Employee {
    String name, surName;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int plusHour;
    int plusMoney;
    int currentYear = 2021;
    int exp;
    int raise;
    int vergiBonus;
    int total;

    Employee(String name, String surName, int salary, int workHours, int hireYear) {
        //Burada bi çalışan oluşturduk ve parametrelerini tanımladık.
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     void tax() {
        //Maaş rakamına göre vergi oranı hesaplanıyor.
        if (this.salary < 1000) {
            this.tax = this.salary / 100 * 3;
        }
    }

    void bonus() {
        //Ek çalışma saati var ise saat başı alacağı ücret hesaplanıyor.
        if (this.workHours > 40) {
            this.plusHour = this.workHours - 40;
            this.plusMoney = this.plusHour * 30;
        }
    }

    void raiseSalary() {
        //Şirkette çalıştığı yıl sayısına göre nekadar zam alacağı hesaplanıyor.
        this.exp = this.currentYear - this.hireYear;
        if (this.exp < 10) {
            this.raise = this.salary / 100 * 5;
        } else if (this.exp >= 10 && this.exp < 20) {
            this.raise = this.salary / 10;
        } else if (this.exp >= 20) {
            this.raise = this.salary / 100 * 15;
        }
    }

    void printInfoEmp() {
        //Tüm bilgileri ekrana yazdırmak için kullandığımız metot.
        System.out.println("Adı : " + this.name);
        System.out.println("Soyadı : " + this.surName);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.plusMoney);
        System.out.println("Maaş Artışı : " + this.raise);
        this.vergiBonus = this.salary - this.tax + this.plusMoney;
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : " + this.vergiBonus);
        this.total = this.vergiBonus + this.raise;
        System.out.println("Toplam Maaş : " + this.total);
    }
}
