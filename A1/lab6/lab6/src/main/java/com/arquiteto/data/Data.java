/**
 * 
 */
package com.arquiteto.data;

/**
 * @author turma2
 *
 */
public class Data {
	int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public boolean isAnoBissexto(){
		return (ano%4==0 && ano%100!=0) || (ano%400==0);
	}
}
