public class OperacaoBasicaTeste {
    public static boolean testar_soma() {
        double soma = OperacaoBasica.somar(5,3);
        if(soma == 5+3) return true;
        return false;
    }


    public static boolean testar_subtracao() {
        double subtracao = OperacaoBasica.subtrair(5,3);
        if(subtracao == 5-3) return true;
        return false;
    }


    public static boolean testar_multiplicacao() {
        double multiplica = OperacaoBasica.multiplicar(5,3);
        if(multiplica == 5*3) return true;
        return false;
    }


    public static boolean testar_divisao() {
        double divide = OperacaoBasica.dividir(9,3);
        if(divide == 9/3) return true;
        return false;
    }
}
