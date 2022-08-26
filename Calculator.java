import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener, WindowListener {
    Label lb1;
    TextField  txtnum1;
    float a,b,c;
    char op;
    boolean flag = false;
    Panel mp,  p1,  p2 , p3,  p4,  p5 , p6,  p7,  p8,  p9;
    Button b1,  b2,  b3,  b4,  b5,  b6,  b7,  b8,  b9,  b10,  b11 , b12, b13,  b14, b15, b16,  b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;

    Calculator() {
        lb1 = new Label("Calculator");
        txtnum1 = new TextField(50);

        b1 = new Button("MC");
        b2 = new Button("MR");
        b3 = new Button("M+");
        b4 = new Button("M-");
        b5 = new Button("MS");
        b6 = new Button("M^");
        b7 = new Button("%");
        b8 = new Button("CE");
        b9 = new Button("C");
        b10 = new Button("<x|");
        b11 = new Button("1/x");
        b12 = new Button("x^2");
        b13 = new Button("sqrt");
        b14 = new Button("/");
        b15 = new Button("7");
        b16 = new Button("8");
        b17 = new Button("9");
        b18 = new Button("*");
        b19 = new Button("4");
        b20 = new Button("5");
        b21 = new Button("6");
        b22 = new Button("-");
        b23 = new Button("1");
        b24 = new Button("2");
        b25 = new Button("3");
        b26 = new Button("+");
        b27 = new Button("+/-");
        b28 = new Button("0");
        b29 = new Button(".");
        b30 = new Button("=");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel(new GridLayout(1,  6 , 10, 10));
        p4 = new Panel(new GridLayout(1,  4 , 10, 10));
        p5 = new Panel(new GridLayout(1,  4 , 10, 10));
        p6 = new Panel(new GridLayout(1,  4 , 10, 10));
        p7 = new Panel(new GridLayout(1,  4 , 10, 10));
        p8 = new Panel(new GridLayout(1,  4 , 10, 10));
		p9 = new Panel(new GridLayout(1,  4 , 10, 10));

        mp = new Panel(new GridLayout(9, 1, 10, 10));

        setLayout(new FlowLayout());
        p1.add(lb1);
        p2.add(txtnum1);

        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);
        p3.add(b6);

        p4.add(b7);
        p4.add(b8);
        p4.add(b9);

        p4.add(b10);

        p5.add(b11);
        p5.add(b12);
        p5.add(b13);
        p5.add(b14);

        p6.add(b15);
        p6.add(b16);
        p6.add(b17);
        p6.add(b18);

        p7.add(b19);
        p7.add(b20);
		p7.add(b21);
        p7.add(b22);

        p8.add(b23);
        p8.add(b24);
        p8.add(b25);
        p8.add(b26);

        p9.add(b27);
        p9.add(b28);
        p9.add(b29);
        p9.add(b30);

        mp.add(p1);
        mp.add(p2);
        mp.add(p3);
        mp.add(p4);
        mp.add(p5);
        mp.add(p6);
        mp.add(p7);
        mp.add(p8);
        mp.add(p9);

        add(mp);
        setTitle("Calculator");
		setBounds(300, 300, 500, 500);
		setVisible(true);

    b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);

        addWindowListener(this);

    }

    void showNum(int n) {
        txtnum1.setText(txtnum1.getText() + n);
    }

    public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == b1) {  //mc
				a = 0;
        }
         if (e.getSource() == b2) {  //mr
		        txtnum1.setText("" + a);
        }
         if (e.getSource() == b3) {  //m+
				a+= Float.parseFloat(txtnum1.getText());
        }
         if (e.getSource() == b4) {  //m-
				a-= Float.parseFloat(txtnum1.getText());
        }
         if (e.getSource() == b5) {  //ms
				a = Float.parseFloat(txtnum1.getText());
        }
        if (e.getSource() == b23) {  //1
            showNum(1);
        }
        if (e.getSource() == b24) {
		    showNum(2);
        }
        if (e.getSource() == b25) {
		    showNum(3);
        }
        if (e.getSource() == b28) {
		     showNum(0);
        }
        if (e.getSource() == b19) {
		     showNum(4);
        }
        if (e.getSource() == b20) {
		            showNum(5);
        }
        if (e.getSource() == b21) {
		            showNum(6);
        }
        if (e.getSource() == b15) {
		            showNum(7);
        }
        if (e.getSource() == b16) {
		            showNum(8);
        }
        if (e.getSource() == b17) {
				    showNum(9);
        }
        if (e.getSource() == b29) {
				if(flag == false){
					txtnum1.setText(txtnum1.getText() + ".");
					flag = true;
				}
        }
        if (e.getSource()== b26){
				a = Float.parseFloat(txtnum1.getText());
				op = '+';
				txtnum1.setText("");
				flag = false;
		}
		if (e.getSource()== b22){
						a = Float.parseFloat(txtnum1.getText());
						op = '-';
						txtnum1.setText("");
						flag = false;
		}
		if (e.getSource()== b18){
						a = Float.parseFloat(txtnum1.getText());
						op = '*';
						txtnum1.setText("");
						flag = false;
		}
		if (e.getSource()== b14){
						a = Float.parseFloat(txtnum1.getText());
						op = '/';
						txtnum1.setText("");
						flag = false;
		}
		if (e.getSource()== b8){
						txtnum1.setText("");
		}
		if (e.getSource()== b9){

						txtnum1.setText("");

		}
		if (e.getSource()== b10){
						String str = txtnum1.getText();
						if(str.length() > 0){
						String res = str.substring(0,str.length()-1);
						txtnum1.setText("" + res);
						}
		}
		if (e.getSource()== b11){
						a = Float.parseFloat(txtnum1.getText());
						b = 1/a;
						txtnum1.setText("" + b);
		}
		if (e.getSource()== b12){
						a = Float.parseFloat(txtnum1.getText());
						b = a*a;
						txtnum1.setText("" + b);
		}
		if (e.getSource()== b13){
						a = Float.parseFloat(txtnum1.getText());
						txtnum1.setText("" + Math.sqrt(a));
		}
		if (e.getSource()== b7){
						a = Float.parseFloat(txtnum1.getText());
						c = (a*b)/100;
						txtnum1.setText(""+ c);
		}
		if (e.getSource()== b27){
						a = Float.parseFloat(txtnum1.getText());
						b = a*(-1);
						txtnum1.setText("" + b);
		}
		if (e.getSource()== b30){
						b = Float.parseFloat(txtnum1.getText());
						txtnum1.setText("");
						switch(op){
						case '+' : c = a + b;
							txtnum1.setText("" + c);
							break;

						case '-' : c = a - b;
							txtnum1.setText("" + c);
							break;

						case '*' : c = a * b;
							txtnum1.setText("" + c);
							break;

						case '/' : c = a / b;
							txtnum1.setText("" + c);
							break;

						}
		}

    }

    public void windowActivated(WindowEvent we) {
    }

    public void windowClosed(WindowEvent we) {
    }

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    public void windowDeactivated(WindowEvent we) {
    }

    public void windowDeiconified(WindowEvent we) {
    }

    public void windowIconified(WindowEvent we) {
    }

    public void windowOpened(WindowEvent we) {
    }

    public static void main(String[] args) {
        new Calculator();
    }
}