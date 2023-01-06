import java.util.Scanner;

public class Main {
    static double sum(double a, double b){
        double result = a+b;
        System.out.println("toplam ; " + result);
        return result;
    }
    static double minus (double a, double b){
        double result = a-b;
        System.out.println("çıkarma ; "+ result );
        return result;
    }
    static double multiply(double a, double b){
        double result = a*b;
        System.out.println("çarpma ; " + result);
        return result;
    }
    static double divide(double a, double b){
        double result = a/b;
        System.out.println("bölme : "+ result);
        return result;
    }
    static double exponencial(double a, double b){
        double c=1;
        for (int i =1;i<=b;i++){
            c*=a;
        }
        double result=c;
        System.out.println(result);
        return result;
    }
    static double faktori(double a,double b){
        int result =1;
        for (int i =1;i<=a;i++){
            result*=i;
        }
        System.out.println("faktöriyel= "+result);
        return result;
    }
    static double mod(double a, double b){
        int result = (int) (a%b);
        System.out.println("mod = "+ result);
        return  result;
    }
    static void alanCevre(double a, double b){
        double resultAlan =a*b;
        double resultCevre= 2 * a + 2 * b;
        System.out.println("alan = "+resultAlan+"\n çevre = "+resultCevre);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String menu = "yapmak istediğiniz işlemi seçiniz  \n 1.toplama \n 2.Çıkarma \n 3. çarpma" +
                    "\n 4.bölme \n 5. üs alma \n 6. faktöriyel hesaplama \n 7. mod alma\n 8. dikdörtgen alan ve çevre hesabı \n çıkmak için 0 a bas ";
            System.out.println(menu);
            int inputt = scan.nextInt();
            if (inputt == 0)
                break;
            System.out.println("birinci sayıyı gir");
            double a = scan.nextDouble();
            System.out.println("ikinci sayıyı gir");
            double b = scan.nextDouble();

            switch (inputt) {

                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    exponencial(a, b);
                    break;
                case 6:
                    faktori(a, b);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    alanCevre(a, b);
                    break;

            }
        }
    }
}