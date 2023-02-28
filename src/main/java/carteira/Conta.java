package carteira;

import java.math.BigDecimal;

public class Conta {

    private int agencia;
    private int numero;
    private BigDecimal saldo;
    private Titular titular;

    public Conta(int agencia, int numero, BigDecimal saldo, Titular titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Titular getTitular() {
        return titular;
    }
}
