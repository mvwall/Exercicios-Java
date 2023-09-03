import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //para rodar o exercicio chame o metodo conforme linha abaixo:
        exercicio20();

    }

    /**
     * Faça um programa que imprima na tela a frase "Olá Mundo"
     */
    public static void  exercicio1(){
        System.out.println("Olá mundo!");
    }

    /**
     * Escreva um programa que imprima o seu nome completo na tela.
     */
    public static void  exercicio2(){
        System.out.println("Wallysson Vieira Magalhães");
    }

    /**
     *  Escreva um algoritmo que imprima na tela a seguinte mensagem: A programação é aprendida escrevendo programas
     * (Brian Kernighan)
     */
    public static void  exercicio3(){
        System.out.println("A programação é aprendida escrevendo programas\n" +
                "(Brian Kernighan)");
    }

    /**
     * Crie um programa que imprima o produto entre os números 25 e 27.
     */
    public static void  exercicio4(){
        byte numero_25 = 25;
        byte numero_27 = 27;
        int produto = (numero_25 * numero_27);
        System.out.println("O produto do número " + numero_25 + " e do número" + numero_27 + " é: " + produto);
    }

    /**
     * Crie um algoritmo que imprima a média aritmética entre os números 4, 12, 15
     */
    public static void exercicio5(){

        int n1 = 4;
        int n2 = 12;
        int n3 = 15;
        float media = (n1+n2+n3)/3;
        System.out.println(media);

    }

    /**
     * Faça um programa que leia um número inteiro e mostre-o na tela, por exemplo,
     * da seguinte forma: O número inteiro digitado foi 4
     */
    public static void exercicio6 (){

        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInt = console.nextInt();
        System.out.print("O numero digitado foi " + numeroInt);

    }

    /**
     * Faça um programa que leia e imprima dois números inteiros na tela.
     */
    public static void exercicio7(){

        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = console.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = console.nextInt();
        System.out.print("O numero digitado foi " + numero1 + " e " +
                numero2);

    }

    /**
     * Faça um programa que leia um número inteiro e imprima o seu número
     * sucessor e antecessor
     */
    public static void exercicio8(){

        Scanner console = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        int numInt = console.nextInt();
        System.out.println("Número sucessor " + (numInt+1) + "\n Número antessesor " + (numInt - 1) + "\n Você digitou: " + numInt);

    }

    /**
     * Faça um programa que leia o nome, endereço e telefone de um usuário e imprima na tela.
     */
    public static void exercicio9(){

        Scanner console = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = console.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = console.nextLine();
        System.out.println("Digite seu telefone: ");
        int telefone = console.nextInt();
        System.out.println(nome + " " + endereco +" " + telefone);

    }

    /**
     * Faça um programa que leia e multiplique dois números inteiros.
     */
    public static void exercicio10(){

        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = console.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = console.nextInt();
        float multiplicar = numero1 * numero2;
        System.out.print(multiplicar);
    }


    /**
     * Faça um programa que leia um número real e imprima a terça parte deste número.
     */
    public static void exercicio11(){

        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número real: ");
        float numero1 = console.nextFloat();
        System.out.print((numero1)/3);
    }

    /**
     *  Faça um programa que leia dois números inteiros e imprima o dividendo,divisor, quociente e resto da divisão.
     */
    public static void exercicio12(){

        Scanner console = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        int dividendo = console.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = console.nextInt();
        int quociente = (dividendo / divisor);
        float resto = (dividendo & divisor);
        System.out.println("O dividendo é: "+ dividendo +"\nO divisor é: "+ divisor +"\nO quociente é: " + quociente + "\nO resto é: "+ resto) ;

    }

    /**
     *  Faça um programa que leia quatro números inteiros, calcule e mostre a soma desses números.
     */
    public static void  exercicio13(){

        Scanner console = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("Digite um numero inteiro: ");
        n1 = console.nextInt();
        System.out.println("Digite um numero inteiro: ");
        n2 = console.nextInt();
        System.out.println("Digite um numero inteiro: ");
        n3 = console.nextInt();
        System.out.println("Digite um numero inteiro: ");
        n4 = console.nextInt();
        System.out.println("A soma dos números digitados é: " +(n1 + n2 + n3 + n4));
    }

    /**
     * Faça um programa que leia um número inteiro com três dígitos e imprima
     * somente o algarismo da casa das dezenas. Por exemplo, se o usuário digitar 135,
     * seu programa deverá mostrar na tela somente o número 3
     */
    public static void exercicio14(){

        int NUMERO_INTEIRO_MAX = 999;
        int NUMERO_INTEIRO_MIN = 100;

        Scanner console = new Scanner(System.in);
        int n1 = 0;
        //caso digitar um numero com 2 digitos o sistema pedirá para digitar novamente.
        do {
            System.out.println("Digite um número inteiro com três digitos: ");
                    n1 = console.nextInt();
        } while (n1 < NUMERO_INTEIRO_MIN || n1 > NUMERO_INTEIRO_MAX);

        int unidade = n1 % 10;
        n1 = n1 - unidade;
        int dezena = (n1 / 10)%10;
        int centena = n1/100;
        System.out.println("A centena é " + centena + " A dezena é " + dezena + " A unidade é " + unidade);

    }

    /**
     * Faça um programa que receba três notas, calcule e mostre a média aritmética.
     */

    public static void exercicio15(){
        //regras
        final byte NOTA_MAX_A1_A2 = 30;
        final byte NOTA_MAX_A3 = 40;
        final byte NOTA_MIN = 0;
        final byte TOTAL_AVALIACOES = 3;

        byte a1, a2, a3;
        Scanner console = new Scanner(System.in);
        //tratamento das notas

        do {
            System.out.println("Digite a nota A1: ");
            a1 = console.nextByte();
        }
        while (a1 < NOTA_MIN || a1 > NOTA_MAX_A1_A2);
        do {
            System.out.println("Digite a nota A2: ");
            a2 = console.nextByte();
        }
        while (a2 < NOTA_MIN || a2 > NOTA_MAX_A1_A2);
        do {
            System.out.println("Digite a nota A3: ");
            a3 = console.nextByte();
        }
        while (a3 < NOTA_MIN || a3 > NOTA_MAX_A3);

        System.out.println("a média foi: " + (a1 + a2 +a3)/TOTAL_AVALIACOES);

    }

    /**
     * Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.
     */
    public static void exercicio16() {

        final byte NOTA_MAX = 100;
        final byte NOTA_MIN = 0;
        final byte TOTAL_AVALIACOES = 3;
        final float p1 = 0.3f;
        final float p2 = 0.3f;
        final float p3 = 0.4f;
        final float peso = p1 + p2 + p3;

        float a1, a2, a3;
        Scanner console = new Scanner(System.in);

        do{
            System.out.println("Digite a nota A1 de 0 a 100: ");
            a1 = console.nextByte();
        }
        while (a1 < NOTA_MIN || a1 > NOTA_MAX);
        do{
            System.out.println("Digite a nota A2 de 0 a 100: ");
            a2 = console.nextByte();
        }
        while (a2 < NOTA_MIN || a2 > NOTA_MAX);
        do{
            System.out.println("Digite a nota A3 de 0 a 100: ");
            a3 = console.nextByte();
        }
        while (a3 < NOTA_MIN || a3 > NOTA_MAX);
        float media = (a1*p1) + (a2*p2) +(a3 * p3)/peso ;
        System.out.println("A média ponderada é: " + media);
    }

    /**
     * Faça um programa que leia um número real e imprima o número elevado ao quadrado e sua raiz quadrada.
     */
    public static void exercicio17(){

    }

    /**
     * Faça um programa que receba o salário de um funcionário, calcule e mostre o
     * novo salário, sabendo-se que este sofreu um aumento de 25%.
     */
    public static void exercicio18(){
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o salário de um funcionário: ");
        double salario = console.nextDouble();
        System.out.println("O salário digitado foi " + salario + ". Com o aumento de 25% o salário será: " + (salario + (salario * 0.25)));

    }

    /**
     * Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário
     */
    public static void exercicio19(){
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o salário de um funcionário: ");
        double salario = console.nextDouble();
        System.out.println("Digite o porcentual do aumento do salário: ");
        double porc = console.nextDouble();
        System.out.println("O salário digitado foi " + salario + ". Com o aumento de "+ porc +"%. O salário será: " + (salario + ((salario * porc)/100 )));

    }

    /**
     * Faça um programa que receba o salário base de um funcionário, calcule e
     * mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5%
     * sobre o salário base e paga imposto de 7% também sobre o salário base.
     */
    public static void exercicio20(){
        final double GRATIFICACAO = 0.05;
        final double IMPOSTO = 0.93;

        Scanner console = new Scanner(System.in);
        System.out.println("Digite o salário de um funcionário: ");
        double salario = console.nextDouble();
        double salarioLiquido = salario - (salario * IMPOSTO);
        System.out.println(salario + (salario * GRATIFICACAO) - salarioLiquido);

    }


}




