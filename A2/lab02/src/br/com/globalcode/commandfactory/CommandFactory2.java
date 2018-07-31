/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.globalcode.commandfactory;

/**
 *
 * @author turma2
 */
public class CommandFactory2 implements ICommandFactory{

    public BaseCommand create(String className) {
        BaseCommand command = null;

        try{
            Class classe = Class.forName("br.com.globalcode.command."+className);
            Object object = classe.newInstance();
            command = (BaseCommand)object;
        } catch(Exception e){
            e.printStackTrace();
        }
        return command;
    }
    
}
