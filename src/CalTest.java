public class CalTest{
    public static void main(String[] args) {
        Cal cal = new Cal();

        int sum1 = cal.plus(1,2);
        int sum2 = cal.plus(1,2,3);
        double sum3 = cal.plus(1.3,2.2);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
