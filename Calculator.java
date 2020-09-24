import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute; 
public class Calculator extends JFrame implements ActionListener
{ 
	private JButton zero,one,two ,three ,four ,five,six,seven,eight,nine,sum,sub,multiple,div
	,clr,equal,d,on,Ac,plus;
	int n,i;
	double n1,n2,x=0;
	double ans;
	 private JTextField result;
	 private JPanel keys;
	 public Calculator()  { 
		 super( "Calculator" );
		 keys = new JPanel(); 
		 keys.setLayout( new GridLayout(5,4));

		 
		 // On Button
		 on = new JButton("on");
		 on.setBackground(Color.orange);
		 on.addActionListener(this);
		 keys.add(on);

		 // On Button
		 Ac = new JButton("Ac");
		 Ac.setBackground(Color.orange);
		 Ac.addActionListener(this);
		 keys.add(Ac);
	
		// Plus Button
		plus = new JButton("+/-");
		plus.setBackground(Color.ORANGE);
		plus.addActionListener(this);
		keys.add(plus);
		// Div Button
		div = new JButton("/");
		div.addActionListener(this);
		div.setBackground(Color.ORANGE);
		keys.add(div);
		// 7 Button
		seven = new JButton("7");
		seven.setBackground(Color.LIGHT_GRAY);
		seven.addActionListener(this);
		keys.add(seven);
		// 8
		eight = new JButton("8");
		eight.setBackground(Color.LIGHT_GRAY);
		eight.addActionListener(this);
		keys.add(eight);
		// 9
		nine = new JButton("9");
		nine.setBackground(Color.LIGHT_GRAY);
		nine.addActionListener(this);
		keys.add(nine);
		// Multiple Button
		multiple = new JButton("*");
		multiple.setBackground(Color.ORANGE);
		multiple.addActionListener(this);
		keys.add(multiple);
		//4
		four = new JButton("4");
		four.setBackground(Color.LIGHT_GRAY);
		four.addActionListener(this);
		keys.add(four);
		//5
		five = new JButton("5");
		five.setBackground(Color.LIGHT_GRAY);
		five.addActionListener(this);
		keys.add(five);
		//6
		six = new JButton("6");
		six.setBackground(Color.LIGHT_GRAY);
		six.addActionListener(this);
		keys.add(six);
		// Sub Button
		sub = new JButton("-");
		sub.addActionListener(this);
		sub.setBackground(Color.ORANGE);
		keys.add(sub);
		//1
		one = new JButton("1");
		 one.setBackground(Color.LIGHT_GRAY);
		 one.addActionListener(this);
		 keys.add(one);
		//2
		two = new JButton("2");
		two.setBackground(Color.LIGHT_GRAY);
		two.addActionListener(this);
		keys.add(two);
		//3
		three = new JButton("3");
		three.setBackground(Color.LIGHT_GRAY);
		three.addActionListener(this);
		keys.add(three);
		// Sum Button
		sum = new JButton("+");
		sum.setBackground(Color.ORANGE);
		sum.addActionListener(this);
		keys.add(sum);
		// clr Button
		clr = new JButton("clear");
		clr.setBackground(Color.LIGHT_GRAY);
		clr.addActionListener(this);
		keys.add(clr);
		//0 
		zero = new JButton("0");
		zero.setBackground(Color.LIGHT_GRAY);
		zero.addActionListener(this);
		keys.add(zero);
		// dot
		d = new JButton(".");
		d.setBackground(Color.LIGHT_GRAY);
		d.addActionListener(this);
		keys.add(d);
		// equal
		equal = new JButton("=");
		equal.setBackground(Color.ORANGE);
		// equal.setBounds(80,60,80,80);
		equal.addActionListener(this);
		keys.add(equal);  

		
	 result = new JTextField("");
	 result.setHorizontalAlignment(JTextField.RIGHT);
	 Font font1 = new Font("SansSerif", Font.BOLD, 50 );
	 result.setFont(font1);
	 add(result, BorderLayout.NORTH); 
	 add(keys, BorderLayout.CENTER);
	 } 
	 
 public void actionPerformed(ActionEvent ae)
	  {
	 if(ae.getSource()==d)
	 {
	 if(((result.getText()).indexOf("."))==-1)
	 result.setText(result.getText()+".");
	 }
	 if(ae.getSource()==plus)
	 {
	 if(x==0){
		 
	 
	 result.setText("-"+result.getText());
	 x=1;
	 }
	 else
		 result.setText("-"+result.getText());
	 }
	  if(ae.getSource()==on)
	  {                                            		 
		  result.setText("0");
	  }
	  if(ae.getSource()==sum) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=1;
	  result.setText("");
	  }
	  if(ae.getSource()==sub) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=2;
	  result.setText("");
	  }
	  if(ae.getSource()==multiple) {
	  n1=Double.parseDouble(result.getText());
	  i=3;
	  result.setText("");
	  }
	  if(ae.getSource()==div) 
	  {
	  n1=Double.parseDouble(result.getText());
	  i=4;
	  result.setText("");
	  }
	  if(ae.getSource()==clr) 
	  {
	  result.setText("0");
	  }
	  if(ae.getSource()==zero)
	  {
	  if(result.getText().equals("0"))
	  result.setText("0");
	  else
	  result.setText(result.getText() +"0");
	  }
	  if(ae.getSource()==one)
	  {
	  if(result.getText().equals("0"))
	  result.setText("1");
	  else
	  result.setText(result.getText() +"1");
	  }
	  if(ae.getSource()==two)
	  {
	  if(result.getText().equals("0"))
	  result.setText("2");
	  else
	  result.setText(result.getText() +"2");
	  }
	  if(ae.getSource()==three)
	  {
	  if(result.getText().equals("0"))
	  result.setText("3");
	  else
	  result.setText(result.getText() +"3");
	  }
	  if(ae.getSource()==four)
	  {
	  if(result.getText().equals("0"))
	  result.setText("4");
	  else
	  result.setText(result.getText() +"4");
	  }
	  if(ae.getSource()==five)
	  {
	  if(result.getText().equals("0"))
	  result.setText("5");
	  else
	  result.setText(result.getText() +"5");
	  }
	  if(ae.getSource()==six)
	  {
	  if(result.getText().equals("0"))
	  result.setText("6");
	  else
	  result.setText(result.getText() +"6");
	  }
	  if(ae.getSource()==seven)
	  {
	  if(result.getText().equals("0"))
	  result.setText("7");
	  else
	  result.setText(result.getText() +"7");
	  }
	  if(ae.getSource()==eight)
	  {
	  if(result.getText().equals("0"))
	  result.setText("8");
	  else
	  result.setText(result.getText() +"8");
	  }
	  if(ae.getSource()==nine)
	  {
	  if(result.getText().equals("0"))
	  result.setText("9");
	  else
	  result.setText(result.getText() +"9");
	  }
	  if(ae.getSource()==Ac) 
	  {
		  result.setText("");
	  }
	  if(ae.getSource()==equal) 
	  {
	  n2=Double.parseDouble(result.getText());
	  switch(i)
	  {
	  case 1:
	  {
		 
	     ans=n1+n2;
		 result.setText(Double.toString(ans)); 
	     n1=0;
	     n2=0;
	  }
	  break;
	  case 2:
	  {
	  ans=n1-n2;
	  result.setText(Double.toString(ans));
	  n1=0;
	  n2=0;
	  }
	  break;
	  case 3:
	  {
	  ans=n1*n2;
	  result.setText(Double.toString(ans));
	  n1=0;
	  n2=0;
	  }
	  break;
	  case 4:
	  {
	  ans=n1/n2;
	  result.setText(Double.toString(ans));
	  n1=0;
	  n2=0;
	  }
	  break;
	  case 5:
	  {
		  ans=Math.cos(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 6:
	  {
		  ans=Math.sin(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 7:
	  {
		  ans=Math.tan(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 8:
	  {
		  ans=Math.pow(n1,2);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 9:
	  {
		  ans=Math.pow(n1,3);
		  result.setText(Double.toString(ans));
		  n1=0;
	  }
	  break;
	  case 10:
	  {
		  ans=Math.pow(n1,n2);
		  result.setText(Double.toString(ans));
		  n1=0;
		  n2=0;
	  }
	  break;
	  case 11:
	  {
		  ans=Math.log10(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 12:
	  {
		  ans=(1/n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 13:
	  {
		  ans=Math.sqrt(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 14:
	  {
		  ans=Math.atan(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 15:
	  {
		  ans=Math.asin(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 16:
	  {
		  ans=Math.acos(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 17:
	  {
		  ans=Math.log(n1);
		  result.setText(Double.toString(ans));
		  n1=0;
		
	  }
	  break;
	  case 18:
	  {
		  int fac=1;
		  for(int i=1;i<=n1;i++){
		  fac*=i;
		  }
		  result.setText(Double.toString(fac));
		  n1=0;
		
	  }
	  break;
	  }
	}
	   
	  }										
	public static void main( String[] args ) { 
		Calculator test = new Calculator();
		test.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 test.setSize( 300, 400);
		  test.setVisible( true );  
	}
}