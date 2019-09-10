package oracle.ocp.clazz;

public class AnonymousClazzDemo {

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    private int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        int value = new AnonymousClazzDemo().admission(100);
        System.out.println(value);
    }

}

