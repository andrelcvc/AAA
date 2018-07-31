package br.com.globalcode.visitor;

import br.com.globalcode.command.EnviaEmail;
import br.com.globalcode.command.ExcluirPedido;
import br.com.globalcode.command.GeraPDF;
import br.com.globalcode.command.NovoPedido;
import br.com.globalcode.commandfactory.BaseCommand;


public class LogVisitor implements Visitor{

    public void visit(BaseCommand command) {
        System.out.println("visit BaseCommand");
    }
    
    public void visit(EnviaEmail command){
        System.out.println("visit EnviaEmail");
    }

    public void visit(ExcluirPedido command){
        System.out.println("visit ExcluirPedido");
    }

    public void visit(GeraPDF command){
        System.out.println("visit GeraPDF");
    }

    public void visit(NovoPedido command){
        System.out.println("visit NovoPedido");
    }
}
