package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	JFrame jf;
	public Main(){
		jf=new JFrame("Buses Guatemala");
        jf.setLayout(new FlowLayout());
		jf.setSize(400, 300);
		jf.setBounds(200, 200, 400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton but1=new JButton();
		but1.setText("Crear tarjeta");
		but1.setSize(600, 100);
		but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	new crearTarjeta().init();
            }
        });      
		jf.add(but1);
		
		JButton but2=new JButton();
		but2.setText("Cargar Saldo");
		but2.setSize(600, 100);
		jf.add(but2);
		but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	new cargarSaldo().init();
            }
        });    
		
		
		JButton but3=new JButton();
		but3.setText("Debitar de tarjeta");
		but3.setSize(600, 100);
		jf.add(but3);
		but3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	new debitarTarjeta().init();
            }
        });    
		
		JButton but4=new JButton();
		but4.setText("Consultar saldo");
		but4.setSize(600, 100);
		jf.add(but4);
		but4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	new consultarSaldo().init();
            }
        });   

        jf.pack();

		jf.setVisible(true);		
	}
	
	public static void main(String args[]){
		new Main();
	}
	
}
