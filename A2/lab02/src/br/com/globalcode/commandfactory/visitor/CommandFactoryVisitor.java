package br.com.globalcode.commandfactory.visitor;

import br.com.globalcode.commandfactory.BaseCommand;
import br.com.globalcode.commandfactory.CommandFactory1;
import br.com.globalcode.commandfactory.CommandFactory2;
import br.com.globalcode.visitor.LogVisitor;


public class CommandFactoryVisitor extends CommandFactory2 {
 
    @Override
    public BaseCommand create(String name){
        
        System.out.println("Factory Visitor");
        
        System.out.println("cria BaseCommand");
        // para facilitar foi herdado o commandFactory1 para o metodo create
        BaseCommand command = super.create(name); 
        
        System.out.println("inicia Visitor e adiciona no BaseCommand");
        
        addVisitor(command);

        return command;
    }

    public void addVisitor(BaseCommand command) {
        command.accept(new LogVisitor());
    }
}
