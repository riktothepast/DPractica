package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class consultarSaldo {
	JFrame jf;
	JTextField jtx=new JTextField();
	public consultarSaldo(){
	}	
	
	public void init(){
		jf=new JFrame("Consultar Saldo");
        jf.setLayout(new FlowLayout());
		jf.setSize(400, 300);
		jf.setBounds(200, 200, 400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jl1=new JLabel();
		jl1.setText("ID:");
		jf.add(jl1);
		final JTextField jtx=new JTextField();
		jtx.setText("1");
		jf.add(jtx);

		JButton but1=new JButton();
		but1.setText("Consultar");
		but1.setSize(600, 100);
		but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	System.out.println(cSaldo(jtx.getText()));
            }
        });      
		jf.add(but1);
		
        jf.pack();
		jf.setVisible(true);
	}
	
	public String cSaldo(String ar1){
		ar1=ar1.trim();
		String uri =
			    "http://localhost:3000/amount_saved/?id="+ar1;
			URL url = null;
			try {
				url = new URL(uri);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			HttpURLConnection connection = null;
			try {
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				
				 BufferedReader br = new BufferedReader(new InputStreamReader(connection
				            .getInputStream()));
				        String l = null;
				        String salida="";
				        while ((l=br.readLine())!=null) {
				            salida+=l;
				        }
						 connection.disconnect();

				return salida;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		return null;
	}
	
}
