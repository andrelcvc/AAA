package br.com.globalcode.visitor;

import br.com.globalcode.command.EnviaEmail;
import br.com.globalcode.command.ExcluirPedido;
import br.com.globalcode.command.GeraPDF;
import br.com.globalcode.command.NovoPedido;
import br.com.globalcode.commandfactory.BaseCommand;


public interface Visitor {

    public void visit(BaseCommand command);
    public void visit(EnviaEmail command);
    public void visit(ExcluirPedido command);
    public void visit(GeraPDF command);
    public void visit(NovoPedido command);
}
