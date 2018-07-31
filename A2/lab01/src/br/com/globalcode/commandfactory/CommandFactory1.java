/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.globalcode.commandfactory;

import br.com.globalcode.command.EnviaEmail;
import br.com.globalcode.command.ExcluirPedido;
import br.com.globalcode.command.GeraPDF;
import br.com.globalcode.command.NovoPedido;

/**
 *
 * @author turma2
 */
public class CommandFactory1 implements ICommandFactory{

    public BaseCommand create(String name) {

        BaseCommand command = null;
        
        if("EnviaEmail".equals(name)){
            command = new EnviaEmail();
        } else if("NovoPedido".equals(name)){
            command = new NovoPedido();
        } else if("ExcluirPedido".equals(name)){
            command = new ExcluirPedido();
        } else if("GeraPDF".equals(name)){
            command = new GeraPDF();
        }
    
        return command;
    }
    
    
}
