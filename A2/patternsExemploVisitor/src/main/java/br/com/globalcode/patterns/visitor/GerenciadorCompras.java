/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.patterns.visitor;

import java.util.Collection;

/**
 *
 * @author Kleber
 */
public class GerenciadorCompras {
    public void emitirBilhete(Collection<Pessoa> pessoas) {
        for(Pessoa p: pessoas) {
            double taxa = calcularTaxa(p);
            //restante da logica
        }
    }
    
    private double calcularTaxa(Pessoa p) {
        TaxaVisitor visitor = new TaxaVisitor();
        visitor.visit(p);
        return visitor.getTaxa();
    }
}
