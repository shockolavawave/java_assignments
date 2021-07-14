import java.awt.*;
import java.awt.event.*;
class awtDrop extends Frame implements ActionListener{
	Frame fr = new Frame("Organism");
	Choice ch = new Choice();
	Button bu1 = new Button("show");
	Button bu2 = new Button("clear");
	Button bu3 = new Button("close");
	Label la = new Label("*here*");

	awtDrop(){
		fr.setSize(300, 300);
		fr.setLayout(null);
		fr.setVisible(true);

		ch.setBounds(70, 50, 100, 25);
		ch.add("Select one");
		ch.add("Porifera");
		ch.add("Coelenterata");
		ch.add("Echinodermata");
		ch.add("Reptile");
		ch.add("Mamalia");

		la.setBounds(20, 100, 100, 10);

		bu1.setBounds(200, 50, 70, 25);			//show
		bu2.setBounds(50, 200, 70, 25);          //clear
		bu3.setBounds(200, 200, 70, 25);         //close

		bu1.addActionListener(eve -> {
			String actCh = ch.getItem(ch.getSelectedIndex());

			switch (actCh){
				case "Select one" -> la.setText("*here*");
				case "Porifera" -> la.setText("Sponges");
				case "Coelenterata" -> la.setText("Jelly fish");
				case "Echinodermata" -> la.setText("Brittle star");
				case "Reptile" -> la.setText("Snakes and lizards");
				case "Mamalia" -> la.setText("Elephant");
			}
		});

		bu2.addActionListener(this);
		bu3.addActionListener(this);

		fr.add(ch); fr.add(la);
		fr.add(bu1);fr.add(bu2);fr.add(bu3);
	}

	public void actionPerformed(ActionEvent eve) {
		String act = eve.getActionCommand();

		switch (act){
			case "clear" -> {
				ch.setName("Select one");
				la.setText("*here*");
			}
			case "close" -> fr.dispose();
		}
	}
}
class Organism{
     public static void main(String[] args) { new awtDrop(); }
}
