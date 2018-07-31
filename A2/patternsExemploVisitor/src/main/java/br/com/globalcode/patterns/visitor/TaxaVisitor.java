/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.patterns.visitor;

/**
 *
 * @author Kleber
 */
public class TaxaVisitor extends PessoaVisitor {

    private double taxa;

    @Override
    public void visit(Pessoa p) {
        //regra para Pessoa
    }

    @Override
    public void visit(Funcionario f) {
        //regra para Funcionario
    }

    @Override
    public void visit(Gerente g) {
        //regra para Gerente
    }

    @Override
    public void visit(Cliente c) {
        //regra para Cliente
    }

    @Override
    public void visit(ClienteGold cg) {
        //regra para ClienteGold
    }

    public double getTaxa() {
        return taxa;
    }

}
