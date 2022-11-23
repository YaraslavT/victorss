public class Main {
    public static void main(String[] args) {
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);

        var mashaYearMoney = (mashaNewSalary -mashaSalary) * 12;
        var denisYearMoney = (denisNewSalary -denisNewSalary) * 12;
        var kristinaYearMoney = (kristinaNewSalary -kristinaNewSalary) * 12;

        System.out.println("ЗП Маши = " + mashaNewSalary + " Годовая зп = " + mashaYearMoney);


    }
}