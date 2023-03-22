package TiposConta;

import TiposCliente.Cliente;
import TiposCliente.PessoaFisica;

public class ContaInvestimento extends Cliente{

    PessoaFisica pf = new PessoaFisica();

    public String toString() {
        return "ContaCorrente{" +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta=" + getNumConta() +
                ", saldoConta=" + getSaldoContaInvestimento() +
                '}';
    }

    @Override
    public void exibirSaldo(int tipoConta) {
        System.out.println(super.getSaldoContaInvestimento());
    }
}

