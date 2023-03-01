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

    public void credito(BigDecimal valor) {
        validar(valor);

        saldo.add(valor);
    }

    public void debito(BigDecimal valor) {
        validar(valor);
        if(valor.compareTo(saldo) > 0) {
            throw new RuntimeException();
        }
        saldo.subtract(valor);
    }

    public void validar(BigDecimal valor) {
        if(valor == null) {
            throw new RuntimeException();
        }
         if(this.valorIncorreto(valor)) {
            throw new RuntimeException();
        }
    }
    private Boolean valorIncorreto(BigDecimal valor) {
        return valor.compareTo(BigDecimal.ZERO) <= 0;
    }
    public BigDecimal getSaldo() {
        return this.saldo;
    }
    public Titular getTitular() {
        return titular;
    }
}
