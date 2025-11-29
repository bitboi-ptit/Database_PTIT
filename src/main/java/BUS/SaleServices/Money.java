package BUS.SaleServices;

public class Money {
    public static String format(Long yourMoney){
        String str = String.format("%,d", yourMoney);
        return str;
    }
    public static void main(String[] args){
        System.out.println(Money.format(39238119932L));
    }
}
