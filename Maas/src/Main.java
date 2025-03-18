public class Main {
    public static void main(String[] args) {
        
        // Test için çalışan 
        Employee calisan1 = new Employee("Ahmet Yılmaz", 2000.0, 45, 2015);
     
        
        System.out.println(calisan1.toString());

    }
}



class Employee {
    private String name; // Çalışanın adı
    private double salary; // Çalışanın maaşı
    private int workHours; // Çalışanın çalışma saati
    private int hireYear; // Çalışanın işe başlama yılı
    
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {   
        int year = 2021 - hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        return "Çalışan Bilgileri\n" +
               "-----------------\n" +
               "Adı: " + name + "\n" +
               "Maaşı: " + salary + " TL\n" +
               "Çalışma Saati: " + workHours + "\n" +
               "Başlangıç Yılı: " + hireYear + "\n" +
               "Vergi: " + tax() + " TL\n" +
               "Bonus: " + bonus() + " TL\n" +
               "Maaş Artışı: " + raiseSalary() + " TL";
    }
}