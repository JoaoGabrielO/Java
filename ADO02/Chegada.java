package EstruturaDeDados.ADO02;


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

            if (fila.espiar() == null) {
                System.out.println("Sua senha é " + fila.espiar());
            }
            if (verificacao.verificaPrefencial(preferencial)) {
                paciente.setIndentificacao("Preferencial");
            } else {
                paciente.setIndentificacao("Normal");
            }
            continuacao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro paciente? ");

        } while (continuacao == 0);
    }
}
