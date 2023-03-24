

import javax.swing.*;

public class Chegada {
    Verificacao verificacao = new Verificacao();
    Paciente paciente = new Paciente();
    Fila fila = new Fila();
    public Chegada() {

        int continuacao;
        do {

            int preferencial = JOptionPane.showConfirmDialog(null, "Você se encaixa no atendimento preferencial?");
            verificacao.verificaPrefencial(preferencial);
            JOptionPane.showMessageDialog(null, "Retirando uma senha para encaixa-lo na fila");

            if (verificacao.verificaPrefencial(preferencial)) { // Verificando se o paciente é prefencial
                paciente.setIndentificacao("Preferencial");
            } else {
                paciente.setIndentificacao("Normal");
            }

            if (fila.estaVazia()) {
               fila.adiciona(paciente.setSenha("1"));

            }else{

            }
            System.out.println(fila.espiar());

            continuacao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro paciente? ");

        } while (continuacao == 0);
    }
}