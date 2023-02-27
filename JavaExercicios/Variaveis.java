package JavaExercicios;

public class Variaveis {
    public static void main(String[] args) {
        //Estrutura de uma variavel
        // tipo - nome = atribuiçao";"

        String nome = "Neemias";  //Variavel para armazenar texto
        System.out.println(nome);

        char letraA = '9'; //Variavel pra armazenar uma letra ou uma unidade de valor
        System.out.println(letraA);

        byte idade = 127; //Variavel para armazenar um valor até 1byte
        System.out.println(idade);

        short ano = 32767; //Varivel para armazenar valor até 2byte
        System.out.println(ano);

        int cep = 999999999; //Variavel para armazenar valor até 4byte
        System.out.println(cep);

        long cpf = 999999999999999999L; //variavel para armazenar valor até 8byte
        System.out.println(cpf);

        float pi = 3.14F; //Variavel para armazenar valores fracionados até 4byte
        System.out.println(pi);

        double salario = 22.561; //Variavel para armazenar valores fracionados até 8byte
        System.out.println(salario);
    }
}
