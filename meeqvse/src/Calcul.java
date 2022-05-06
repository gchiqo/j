public class Calcul {
    double a, b;
    Operatori Oper;

    enum Operatori {
        DAMATEBA('+'), GAMOKLEBA('-'), GAMRAVLEBA('*'), GAYOFA('/');
        private final char o;

        Operatori(char o) {
            this.o = o;
        }

        public char getO() {
            return o;
        }

        static Operatori SetThing(char x) {
            try {
                switch (x) {
                    case '+':
                        return Operatori.DAMATEBA;
                    case '-':
                        return GAMOKLEBA;
                    case '*':
                        return GAMRAVLEBA;
                    case '/':
                        return GAYOFA;
                    default:
                        throw new IllegalArgumentException("ოპერატორები შეიძლება იყოს + - * / ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
            return null;
        }
    }

    public Calcul(double a, char oper, double b) {
        this.a = a;
        this.b = b;
        Oper = Oper.SetThing(oper);
        if (Oper != null)
            System.out.println(calculate());
    }

    public double calculate() {
        try {
            switch (Oper) {
                case DAMATEBA:
                    return a + b;
                case GAMOKLEBA:
                    return a - b;
                case GAMRAVLEBA:
                    return a * b;
                case GAYOFA:
                    if (b == 0) {
                        throw new RuntimeException("ნულზე გაყოფა არ შეიძლება!!");
                    }
                    return a / b;
                default:
                    return 69;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 69;
        }
    }
}
