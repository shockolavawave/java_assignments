import java.awt.*;
import java.awt.event.*;
class cal extends Frame implements ActionListener{
	Frame fr = new Frame("Calculator");

	//creating labels
	Label num1 = new Label("First number: ");
	Label num2 = new Label("Second number:");
	Label rslt = new Label("Result:       ");

	//creating textfields
	TextField txf1 = new TextField();
	TextField txf2 = new TextField();
	TextField txf3 = new TextField();

	//creating buttons
	Button buAdd = new Button("+");
	Button buSub = new Button("-");
	Button buMul = new Button("*");
	Button buDiv = new Button("/");
	Button buMod = new Button("%");
	Button buclr = new Button("clear all");
	Button buclo = new Button("close");

	cal(){
		//setting frame
		fr.setLayout(null);
		fr.setSize(600, 600);
		fr.setVisible(true);

		//aligning labels
		num1.setBounds(50, 100, 100, 50);
		num2.setBounds(50, 200, 100, 50);
		rslt.setBounds(50, 300, 100, 50);

		//aligning textfields
		txf3.setEditable(false);
		txf1.setBounds(200, 100, 270, 50);
		txf2.setBounds(200, 200, 270, 50);
		txf3.setBounds(200, 300, 270, 70);

		//aligning buttons
		buAdd.setBounds(175, 400, 25, 25);
		buSub.setBounds(250, 400, 25, 25);
		buMul.setBounds(325, 400, 25, 25);
		buDiv.setBounds(400, 400, 25, 25);
		buMod.setBounds(475, 400, 25, 25);
		buclr.setBounds(400, 500, 60, 30);
		buclo.setBounds(500, 500, 50, 30);

		//adding action listener to buttons
		buAdd.addActionListener(this);
		buSub.addActionListener(this);
		buMul.addActionListener(this);
		buDiv.addActionListener(this);
		buMod.addActionListener(this);
		buclo.addActionListener(this);
		buclr.addActionListener(this);

		//adding everything
		fr.add(num1); fr.add(num2); fr.add(rslt);   //labels
		fr.add(txf1); fr.add(txf2); fr.add(txf3);    //textfields
		fr.add(buAdd); fr.add(buSub); fr.add(buMul); fr.add(buDiv); fr.add(buMod); fr.add(buclo); fr.add(buclr);     //buttons
}

	public void actionPerformed(ActionEvent eve) {
		String act = eve.getActionCommand();
		switch(act){
			case "+" -> {
				try{
					boolean bool = (txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d+"));

					if(bool)
						txf3.setText(Double.toString(Double.parseDouble(txf1.getText()) + Double.parseDouble(txf2.getText())));
					else
						throw new Exception("Error");

				}catch(Exception e){
					txf3.setText("The input should be a number.");
				}
			}
			case "-" -> {
				try{
					boolean bool = (txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d+"));

					if(bool)
						txf3.setText(Double.toString(Double.parseDouble(txf1.getText()) - Double.parseDouble(txf2.getText())));
					else
						throw new Exception("Error");

				}catch(Exception e){
					txf3.setText("The input should be a number.");
				}
			}
			case "*" -> {
				try{
					boolean bool = (txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d+"));

					if(bool)
						txf3.setText(Double.toString(Double.parseDouble(txf1.getText()) * Double.parseDouble(txf2.getText())));
					else
						throw new Exception("Error");

				}catch(Exception e){
					txf3.setText("The input should be a number.");
				}
			}
			case "/" -> {
				try{
					boolean bool = (txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d*[.]+\\d+") && txf2.getText().matches("\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d*[.]+\\d+")) ||
								(txf1.getText().matches("\\d+") && txf2.getText().matches("\\d+"));

					if(bool)
						txf3.setText(Double.toString(Double.parseDouble(txf1.getText()) / Double.parseDouble(txf2.getText())));
					else
						throw new Exception("Input should be a number.");

				}catch(Exception e){
					txf3.setText("Error: " + e.getMessage());
				}
			}
			case "%" -> {
				try{
					boolean bool = (txf1.getText().matches("\\d+") && txf2.getText().matches("\\d+"));

					if(bool){
						bool = (Integer.parseInt(txf1.getText()) > 0) && (Integer.parseInt(txf2.getText()) > 0);

						if(bool)
							txf3.setText(Integer.toString(Integer.parseInt(txf1.getText()) % Integer.parseInt(txf2.getText())));
						else
							throw new Exception("Error");

					}else
						throw new Exception("Error");

				}catch(Exception e){
					txf3.setText("The input should be a positive integer");
				}
			}
			case "clear all" -> {
				txf1.setText("");
				txf2.setText("");
				txf3.setText("");
			}
			case "close" -> fr.dispose();
		}
	}
}

class Calculator{
     public static void main(String[] args) { new cal(); }
}
