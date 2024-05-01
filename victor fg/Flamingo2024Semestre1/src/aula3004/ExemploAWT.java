package aula3004;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class ExemploAWT extends Frame {

	ExemploAWT(){
		Frame quadro = new Frame();
		Label etiqueta = new Label("bababooe");
		Button botao = new Button("Vudu é pra jacu");
		TextField campoDeTexto = new TextField();
		
		etiqueta.setBounds(20,80,80,30);
		botao.setBounds(40,200,80,30);
		campoDeTexto.setBounds(100,100,80,30);
		
		quadro.add(etiqueta);
		quadro.add(botao);
		quadro.add(campoDeTexto);
		quadro.setSize(400,400);
		quadro.setTitle("TOMETOMETOME");
		quadro.setLayout(null);
		quadro.setVisible(true);
		
		}
	public static void main (String[] args) {
		ExemploAWT awt = new ExemploAWT();		
	}

}
