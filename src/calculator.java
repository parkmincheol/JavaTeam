	import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calc extends JFrame{
	private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, equal, dot,
		plus, minus, multi, divis, root, mc, mr, mplus, square, mminus, delete, percent, divis2;
	private String operator = "=";
	private boolean start = true;
	JTextField f;
	double result;

	
	public calc(){
		setSize(900,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		equal = new JButton("=");
		dot = new JButton(".");
		plus = new JButton("+");
		minus = new JButton("-");
		multi = new JButton("��");
		divis = new JButton("��");
		root = new JButton("��");
		mc = new JButton("MC");
		mr = new JButton("MR");
		mplus = new JButton("M+");
		square = new JButton("����");
		mminus = new JButton("M-");
		delete = new JButton("C");
		percent = new JButton("%");
		divis2 = new JButton("1/x");
		
		
		num1.addActionListener(new MyListener());
		num2.addActionListener(new MyListener());
		num3.addActionListener(new MyListener());
		num4.addActionListener(new MyListener());
		num5.addActionListener(new MyListener());
		num6.addActionListener(new MyListener());
		num7.addActionListener(new MyListener());
		num8.addActionListener(new MyListener());
		num9.addActionListener(new MyListener());
		num0.addActionListener(new MyListener());
		equal.addActionListener(new MyListener());
		dot.addActionListener(new MyListener());
		plus.addActionListener(new MyListener());
		minus.addActionListener(new MyListener());
		multi.addActionListener(new MyListener());
		divis.addActionListener(new MyListener());
		root.addActionListener(new MyListener());
		mc.addActionListener(new MyListener());
		mr.addActionListener(new MyListener());
		mplus.addActionListener(new MyListener());
		square.addActionListener(new MyListener());
		mminus.addActionListener(new MyListener());
		delete.addActionListener(new MyListener());
		percent.addActionListener(new MyListener());
		divis2.addActionListener(new MyListener());
		
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		f = new JTextField(40);
		f.setText("0.0");
		p1.add(f);

		f.setFont(new Font("Serif", Font.ITALIC,30));
		num1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num5.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num7.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num8.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num9.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		num0.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		equal.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		dot.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		plus.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		minus.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		multi.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		divis.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		root.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		mc.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		mr.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		mplus.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		square.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		mminus.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		delete.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		percent.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		divis2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		
		p.setBackground(Color.cyan);
		p.setLayout(new GridLayout(6,4));
		p.add(mplus);
		p.add(mminus);
		p.add(mr);
		p.add(mc);
		p.add(delete);
		p.add(root);
		p.add(percent);
		p.add(divis2);
		p.add(num1);
		p.add(num2);
		p.add(num3);
		p.add(plus);
		p.add(num4);
		p.add(num5);
		p.add(num6);
		p.add(minus);
		p.add(num7);
		p.add(num8);
		p.add(num9);
		p.add(multi);
		p.add(dot);
		p.add(num0);
		p.add(equal);
		p.add(divis);
		this.add(p1,BorderLayout.NORTH);
		this.add(p,BorderLayout.CENTER);
		setVisible(true);
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		}
	}
}
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc cal = new calc();
	}

}
