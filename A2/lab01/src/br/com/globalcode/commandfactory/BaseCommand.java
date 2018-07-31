/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.globalcode.commandfactory;

import br.com.globalcode.visitor.Visitor;
import javax.swing.JTextArea;

/**
 *
 * @author turma2
 */
public abstract class BaseCommand {
    
    public abstract void executa(JTextArea taMensagens);
    
    
    public abstract void accept(Visitor visitor);
    
}
