public class Calculadora {
    public static void main(String[] args) {

        Operadores op = new Operadores();
        
        //EXEMPLO DE ADIÇÃO
        System.out.println("O Resultado da Adição é: "+ op.adicao(10,5));

        //EXEMPLO DE SUBTRAÇÃO
        System.out.println("O Resultado da Subtração é: "+ op.subtracao(10,5));

        //EXEMPLO DE MULTIPLICAÇÃO
        System.out.println("O Resultado da Multiplicação é: "+ op.multiplicacao(10, 5));

        //EXEMPLO DE DIVISÃO
        System.out.println("O Resultado da Divisão é: "+ op.divisao(10, 5));

        System.out.println();

        // OPERAÇÕES DE ATRIBUIÇÃO
        System.out.println("ATRIBUIÇÃO SOMA: " + op.somaEAtribui(10, 5));
        System.out.println("ATRIBUIÇÃO SUBTRAÇÃO: " + op.subtraiEAtribui(10, 5));
        System.out.println("ATRIBUIÇÃO MULTIPLICAÇÃO: " + op.multiplicaEAtribui(10, 5));
        System.out.println("ATRIBUIÇÃO DIVISÃO: " + op.divideEAtribui(10, 5));

                System.out.println();

        // OPERAÇÕES LÓGICAS
        System.out.println("LÓGICO E (true && false): " + op.eLogico(true, false));
        System.out.println("LÓGICO OU (true || false): " + op.ouLogico(true, false));
        System.out.println("LÓGICO NÃO (!true): " + op.naoLogico(true));

        System.out.println();

        // OPERAÇÕES DE COMPARAÇÃO
        System.out.println("\nMAIOR QUE (10 > 5): " + op.maiorQue(10, 5));
        System.out.println("MENOR QUE (10 < 5): " + op.menorQue(10, 5));
        System.out.println("IGUAL A (10 == 5): " + op.eIgualA(10, 5));
        System.out.println("DIFERENTE DE (10 != 5): " + op.eDiferenteDe(10, 5));
        System.out.println("MENOR OU IGUAL (10 <= 5): " + op.menorOuIgual(10, 5));
        System.out.println("MAIOR OU IGUAL (10 >= 10): " + op.maiorOuIgual(10, 10));
    }
}
