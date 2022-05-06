///----------------------------------------------------------
public class Employee {
    private String name;
    private int salary;
    public enum Profesia {
        PROGRAMISTI(1000), LEQTORI(2000), MSHEEBELI(3000);
        private int avarageSalary;
        Profesia(int avarageSalary) {
            this.avarageSalary = avarageSalary;
        }
        public int getAvarageSalary() {
            return avarageSalary;
        }
    }
    enum Gender {Fimale, Male;}
    Gender gen;
    Profesia prof;

    public Employee(String name, int salary,Profesia prof, Gender gen) {
        this.name = name;
        this.salary = salary;
        this.gen = gen;
        this.prof =prof;
    }
    public class Statistic {
        public boolean hasBiggerSalary() {
            if(prof.ordinal() > salary)return true;
            return false;
        }
        public int yearSalary() {
            return salary * 12;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gen=" + gen +
                ", prof=" + prof +
                '}';
    }
}
