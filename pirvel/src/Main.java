//class Person {
//    public static String name;
//    int age;
//    Person(String _name, int _age) {
//        name = _name;
//        age = _age;
//    }
//
//    @Override
//    public String toString() {
//        return "age=" + age + "     name" + name;
//    }
//
//    public boolean metia21ze(){
//        if (age>=21)
//            return true;
//        return false;
//    }
//
//    public void setAgeFromString(String ageString){
//        int ric=0;
//        int l = ageString.length();
//        for (int i=0; i< l;i++)
//        {
//            ric += (ageString.charAt(i)-48)*Math.pow(10,(l-i-1));
//        }
//        System.out.println(ric);
//    }
//
//    // გამოიყენეთ StringBuilder კლასი
//    public String sayMyName(int nTimes){
//        StringBuilder names = new StringBuilder();
//        for (int i = 0; i < nTimes; i++) {
//            names.append(name);
//        }
//        System.out.println("Haizenberg");
//        return names.toString();
//    }
//
//
//}

public class Main {

    static int[] sort1(int[] nums){
        for (int i=0;i<nums.length; i++){
            for (int j=1;j<nums.length; j++){
                if(nums[j]<nums[j-1]){
                    int min =nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=min;
                }
            }
        }
        return nums;
    }

    static int ramdrnj(String s, char c){
        int ramden=0;
        for (char ch: s.toCharArray()) {
            if (ch ==  c)
                ramden++;
        }
        return ramden;
    }

    static void piramida(int h, char c){
        StringBuilder p = new StringBuilder();
        for (int j = 1; j<=h; j++) {

            for (int i = 0; i < (h - j); i++) {
                p.append(' ');
            }
            for (int i = 0; i < j*2-1; i++) {
                p.append(c);
            }
            p.append('\n');
        }
        System.out.println(p);
    }

    public static class Outer {
        public enum Profesia{PROGRAMISTI,MASWAVLEBELI,MXATVARI};

        Profesia prof;
        private int salary = 12;
        public Outer(int salary,Profesia prof) {
            this.salary = salary;
            this.prof = prof;
        }
        public class Inner {
            int yearly() {
                return salary*12;
            }
        }

        @Override
        public String toString() {
            return "Outer{" +
                    "prof=" + prof +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static  void main(String[] args)
    {
//        int[] nums= {16, 15, 4, 42, 8, 23};
//        nums = sort1(nums);
//        for(int i=0;i<nums.length; i++){
//            System.out.println(nums[i]);
//        }


//        Person gio = new Person("gio",20);
//        System.out.println(gio);
//        System.out.println(gio.metia21ze());
//        System.out.println(gio.sayMyName(5));
//        gio.setAgeFromString("234");

       // System.out.println(ramdrnj("giorgi", 'i'));

       // piramida(8,'X');

//        Outer outer = new Outer(9, Outer.Profesia.PROGRAMISTI);
//        Outer.Inner inner = outer.new Inner();
//        System.out.println(outer);

//        Employee emp = new Employee("giorga",300, Employee.Profesia.LEQTORI, Employee.Gender.Male);
//        Employee.Statistic empstat = emp.new Statistic();
//        System.out.println(empstat.hasBiggerSalary());
//        System.out.println(empstat.yearSalary());

        Person per = new Person("giorga", 20);
        Person per1 = new Person("ana", 22);
        System.out.println(per.sayHelloTo(per1));
        per.eatFood("xinkali");

        Human humans[]={new Person("avto",15),new Person("mari",21),per,per1};

        System.out.println(humans[1].sayHelloTo(humans[0]));
    }
}


