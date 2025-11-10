public class Operadores {
    public float adicao (float v1, float v2){
        return v1+v2;
    }
    public float subtracao (float v1, float v2){
        return v1-v2;
    }
    public float multiplicacao (float v1, float v2){
        return v1*v2;
    }
    public float divisao (float v1, float v2){
        return v1/v2;
    }

    // OPERADORES DE ATRIBUIÇÃO
    public float somaEAtribui(float v1, float v2) {
        v1 += v2;
        return v1;
    }

    public float subtraiEAtribui(float v1, float v2) {
        v1 -= v2;
        return v1;
    }

    public float multiplicaEAtribui(float v1, float v2) {
        v1 *= v2;
        return v1;
    }

    public float divideEAtribui(float v1, float v2) {
        v1 /= v2;
        return v1;
    }

    // OPERADORES LÓGICOS
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a) {
        return !a;
    }

    // OPERADORES DE COMPARAÇÃO
    public boolean eIgualA(float v1, float v2) {
        return v1 == v2;
    }

    public boolean eDiferenteDe(float v1, float v2) {
        return v1 != v2;
    }

    public boolean maiorQue(float v1, float v2) {
        return v1 > v2;
    }

    public boolean menorQue(float v1, float v2) {
        return v1 < v2;
    }

    public boolean maiorOuIgual(float v1, float v2) {
        return v1 >= v2;
    }

    public boolean menorOuIgual(float v1, float v2) {
        return v1 <= v2;
    }
}

