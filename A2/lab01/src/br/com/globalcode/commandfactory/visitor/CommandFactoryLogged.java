package br.com.globalcode.commandfactory.visitor;

import br.com.globalcode.commandfactory.BaseCommand;
import br.com.globalcode.visitor.LogVisitor;
import br.com.globalcode.visitor.Visitor;

public class CommandFactoryLogged {

    private Visitor visitor = new LogVisitor(); 
    
    public void addVisitor(BaseCommand command){
        command.accept(visitor);
    }
    
}
