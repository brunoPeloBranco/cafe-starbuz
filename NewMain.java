
public class NewMain {

    //ATRIBUTOS
    private double saldo;

    // METODO : SAQUE
    //PARAMETRO/ARGUMENTO : VALOR (informacao de entrada para o metodo)
    // RETORNO (tipo) : boolean (informacao de saida do metodo)
    public boolean saque(double valor) {
        boolean resultado = (valor > 0) && (valor <= saldo);
        if (resultado) {

            saldo = saldo - valor;

        }
        return resultado;

    }

    public boolean deposito(double valor) {
        boolean resultado = (valor > 0);
        if (resultado) {

            saldo = saldo + valor;

        }
        return resultado;
    }

}
