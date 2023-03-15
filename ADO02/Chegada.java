package EstruturaDeDados.ADO02;

import javax.swing.*;

public class Chegada {
    Verificacao verificacao = new Verificacao();
    Paciente paciente = new Paciente();
    public Chegada(){
        int preferencial = JOptionPane.showConfirmDialog(null,"Você se encaixa no atendimento preferencial?");
        verificacao.verificaPrefencial(preferencial);
        JOptionPane.showMessageDialog(null,"Retirando uma senha para encaixa-lo na fila");
        if(verificacao.verificaPrefencial(preferencial) && ){



        }

    }
}
