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

public class crearTarjeta {
	JFrame jf;
	public crearTarjeta(){
		
	}	
	
	public void init(){jf=new JFrame("Crear tarjeta");
    jf.setLayout(new FlowLayout());
	jf.setSize(400, 300);
	jf.setBounds(200, 200, 400, 300);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel jl1=new JLabel();
	jl1.setText("ID:");
	jf.add(jl1);
	final JTextField jtx=new JTextField();
	jtx.setText("          ");
	jf.add(jtx);

	JLabel jl2=new JLabel();
	jl2.setText("saldo:");
	jf.add(jl2);
	final JTextField jtx2=new JTextField();
	jtx2.setText("         ");
	jf.add(jtx2);
	
	JButton but1=new JButton();
	but1.setText("Crear tarjeta");
	but1.setSize(600, 100);
	but1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        	cSaldo(jtx.getText(),jtx2.getText());
        }
    });      
	jf.add(but1);
	
    jf.pack();
	jf.setVisible(true);	}
	
	public String cSaldo(String ar1,String ar2){
		ar1=ar1.trim();
		ar2=ar2.trim();
		String uri =
			    "http://localhost:3000/create_card/?id="+ar1+"&amount="+ar2;
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
				return salida;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		return null;
	}
}
