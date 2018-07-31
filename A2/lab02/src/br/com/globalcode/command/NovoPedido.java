/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.globalcode.command;

import br.com.globalcode.singleton.ConfigManager;
import br.com.globalcode.commandfactory.BaseCommand;
import br.com.globalcode.visitor.Visitor;
import javax.swing.JTextArea;

/**
 *
 * @author turma2
 */
public class NovoPedido extends BaseCommand{

    @Override
    public void executa(JTextArea taMensagens) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        taMensagens.setText("Conex�o com servidor " + server+"\n");
        taMensagens.append("Novo Pedido...");
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }   
}
