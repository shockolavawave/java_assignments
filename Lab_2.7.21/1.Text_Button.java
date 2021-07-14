import java.awt.*;
import java.awt.event.*;
class frameClass extends Frame implements ActionListener{

	TextField txf = new TextField();
	Frame fr = new Frame("Text field to label");
	Label la = new Label("*here*");
	Button bu1 = new Button("Print");
	Button bu2 = new Button("clear");
	Button bu3 = new Button("close");

	frameClass(){

		fr.setSize(600, 500);
		fr.setLayout(null);
		fr.setVisible(true);

		la.setBounds(50, 250, 500, 50);

		txf.setBounds(50, 50, 500, 50);

		bu1.setBounds(50, 150, 100, 50);
		bu2.setBounds(200, 400, 100, 50);
		bu3.setBounds(400, 400, 100, 50);
		

		bu1.addActionListener(this);
		bu2.addActionListener(this);
		bu3.addActionListener(this);

		fr.add(bu1);fr.add(bu2);fr.add(bu3);
		fr.add(txf);fr.add(la);
	}

	public void actionPerformed(ActionEvent eve) {
		String act = eve.getActionCommand();
		switch (act) {
			case "Print" -> la.setText(txf.getText());
			case "clear" -> {
				txf.setText("");
				la.setText("*here*");
			}
			case "close" -> fr.dispose();
		}
	}
}

class Text_Button{
	public static void main(String[] args) {new frameClass();}
}
