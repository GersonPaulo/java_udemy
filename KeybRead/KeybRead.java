import java.util.Scanner;

class KeybRead {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b,c;
        String nome, n_completo;

        /*System.out.println("1 Digite um numero inteiro:>");
        a = s.nextInt();
        System.out.println("2 Digite um numero inteiro:>");
        b = s.nextInt();
        c = a+b;
        System.out.println("resultado " + c + 20*10);*/

        System.out.print("escreva o seu nome:");
        nome = s.next();
        n_completo =  s.nextLine();
        System.out.println("o seu primeiro nome é: " + nome);
        System.out.println("o seu nome completo é:" + n_completo);



    }
}