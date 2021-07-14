import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
class awtPerc extends Frame implements ActionListener{
	//creating frame
	Frame fr = new Frame("Nucleotide Percent");

	//creating labels
	Label la1 = new Label("Enter Sequence");
	Label la2 = new Label();      //used to display error

	//creating textarea
	TextArea txtIn = new TextArea();
	TextArea txtOu = new TextArea("*results*");

	//creating buttons
	Button bu1 = new Button("Submit");
	Button bu2 = new Button("Clear all");
	Button bu3 = new Button("close");

	Font fon = new Font("Monospaced", Font.PLAIN, 17);

	awtPerc(){
		//setting frame
		fr.setSize(700, 700);
		fr.setLayout(null);
		fr.setVisible(true);

		//setting label
		la1.setBounds(50, 100, 100, 50);
		la2.setBounds(300, 600, 100, 50);

		//setting textarea
		txtIn.setBounds(200, 100, 450, 100);         txtIn.setFont(fon);
		txtOu.setBounds(50, 300, 600, 200);          txtOu.setFont(fon);      txtOu.setEditable(false);

		//setting buttons
		bu1.setBounds(600, 260, 50, 30);
		bu2.setBounds(100, 550, 70, 30);
		bu3.setBounds(600, 550, 50, 30);

		bu1.addActionListener(this);
		bu2.addActionListener(this);
		bu3.addActionListener(this);

		//adding everything
		fr.add(txtIn); fr.add(txtOu);      //textarea
		fr.add(la1); fr.add(la2);          //labels
		fr.add(bu1); fr.add(bu2); fr.add(bu3);       //buttons

	}

	//creating method to rectify the input sequence
	public boolean seqCheck(String seq) {
		boolean boo = false;
		for (int i = 0; i < seq.length(); i++)
			if (seq.charAt(i) == 'A' || seq.charAt(i) == 'G' || seq.charAt(i) == 'T' || seq.charAt(i) == 'C')
				boo = true;
			else{
				boo = false;
				break;
			}

		return boo;
	}

	public String seqDisplay(String seq){
		StringBuilder fin = new StringBuilder();
		for (int i = 0; i < seq.length(); i++){
			if(i%10 == 0 && i != 0)
				fin.append('|');

			if(i%30 == 0 && i != 0)
				fin.append('\n');

			fin.append(seq.charAt(i));
		}
		return fin.toString();
	}

	public void actionPerformed(ActionEvent eve) {
		switch (eve.getActionCommand()){
			case "Submit" -> {
				String seq = txtIn.getText().toUpperCase();
				boolean boo;

				if (seq.length() < 2)
					boo = false;
				else
					boo = seqCheck(seq);

				if(boo){
					la2.setText("");
					int a_count = 0, g_count = 0, t_count = 0, c_count = 0;

					for(int i = 0; i < seq.length(); i++){
						switch (seq.charAt(i)){
							case 'A' -> a_count++;
							case 'G' -> g_count++;
							case 'T' -> t_count++;
							case 'C' -> c_count++;
						}
					}

					double a_perc = (a_count / (float)seq.length()) * 100;
					double g_perc = (g_count / (float)seq.length()) * 100;
					double t_perc = (t_count / (float)seq.length()) * 100;
					double c_perc = (c_count / (float)seq.length()) * 100;

					DecimalFormat dF1 = new DecimalFormat("0000");
					DecimalFormat dF2 = new DecimalFormat("000.####");

					String result =
							"Adenine  (A) : " + dF1.format(a_count) + " residues         " + dF2.format(a_perc) + " %" + '\n' +
							"Guanine  (G) : " + dF1.format(g_count) + " residues         " + dF2.format(g_perc) + " %" + '\n' +
							"Thymine  (T) : " + dF1.format(t_count) + " residues         " + dF2.format(t_perc) + " %" + '\n' +
							"Cytosine (C) : " + dF1.format(c_count) + " residues         " + dF2.format(c_perc) + " %" + "\n\n" +
							"Sequence length: " + seq.length() + "\n\n" +
							"Your sequence is:\n\n";

					String disSeq = seqDisplay(seq);
					txtOu.setText(result + disSeq);

				}else{
					la2.setText("");
					txtOu.setText("""
						Undesired characters in the input.
						Only A/G/T/C are allowed.

						OR, very short input. At least 2 residues expected.

						ALSO, no whitespaces allowed.""");
				}
			}
			case "Clear all" -> {
				txtIn.setText("");
				txtOu.setText("*results*");
			}
			case "close" -> fr.dispose();
		}
	}
}
class nuclePerc{
	public static void main(String[] args) { new awtPerc(); }
}
