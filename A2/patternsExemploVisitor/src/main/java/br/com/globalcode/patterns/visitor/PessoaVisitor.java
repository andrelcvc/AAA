/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.patterns.visitor;

import java.lang.reflect.Method;

/**
 *
 * @author Kleber
 */
public abstract class PessoaVisitor {
    public void visit(Object obj) throws Exception {
        Method m = this.getClass().getMethod("visit",new Class[]{obj.getClass()});
        m.invoke(this, new Object[]{obj});
    }
    
    public abstract void visit(Pessoa p);
    public abstract void visit(Funcionario f);
    public abstract void visit(Gerente g);
    public abstract void visit(Cliente c);
    public abstract void visit(ClienteGold cg);
}
