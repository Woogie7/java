import java.util.Scanner;
public class Programm {
    public static void main(String[] args){
        String a;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите число: ");
        if(scn.hasNextInt()){
            a=scn.nextLine();
            int c=0;
            for(int i=0;i<a.length();i++){
                char m=a.charAt(i);

                c=(a.charAt(i)-48)+c;
            }
            System.out.println("Сумма всех чисел введенного числа равна "+c);
        }
        else System.out.println("Ошибка. Вы ввели не число!");
    }
}
