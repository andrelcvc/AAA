package br.com.globalcode;

import br.com.globalcode.commandfactory.ICommandFactory;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Aplicativo extends JFrame {
    
    private ICommandFactory commandFactory;
    
    JTextArea taMensagens = new JTextArea();
    
    public static void main(String[] args) {
        new Aplicativo();
    }
    
    public Aplicativo() {
        super("Curso de Design Patterns - lab01");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = montaPainelBotoes();
        add(panel,BorderLayout.SOUTH);
        add(taMensagens,BorderLayout.CENTER);
        setSize(600,300);
        setVisible(true);

        System.out.println("Inicia aplicativo");
        
        try{
            initCommandFactory();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void initCommandFactory() throws Exception {
        Properties prop = new Properties();
        InputStream f = getClass().getResourceAsStream("config.properties");
        prop.load(f);
        f.close();
        
        System.out.println("Carrega properties p criar Factory");
        
        String commandFactoryName = prop.getProperty("command.factory.class");
        
        System.out.println("command.factory.class="+commandFactoryName);
        
        Class classe = Class.forName(commandFactoryName);
        Object object = classe.newInstance();
        commandFactory = (ICommandFactory)object;
        
    }
    
    private JPanel montaPainelBotoes() {
        JPanel panel = new JPanel();
        JButton btEnviarPedido = new JButton("Enviar Pedido");
        JButton btGerarPDF = new JButton("Gerar PDF");
        JButton btNovoPedido = new JButton("Novo Pedido");
        JButton btExcluirPedido = new JButton("Excluir Pedido");
        panel.add(btExcluirPedido);
        panel.add(btNovoPedido);
        panel.add(btGerarPDF);
        panel.add(btEnviarPedido);
        btEnviarPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonEnviar_clicked();
            }
        });
        btGerarPDF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonGerarPDF_clicked();
            }
        });
        btNovoPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonNovoPedido_clicked();
            }
        });
        btExcluirPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                buttonExcluirPedido_clicked();
            }
        });
        
        return panel;
    }
    
    private void buttonEnviar_clicked() {
        commandFactory.create("EnviaEmail").executa(taMensagens);
    }
    
    private void buttonGerarPDF_clicked() {
        commandFactory.create("GeraPDF").executa(taMensagens);
    }
    
    private void buttonNovoPedido_clicked() {
        commandFactory.create("NovoPedido").executa(taMensagens);
    }
    
    private void buttonExcluirPedido_clicked() {
        commandFactory.create("ExcluirPedido").executa(taMensagens);
    }
}
