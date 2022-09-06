import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sales {
  public static JTextField t1,t2,t3,t6;
  public static JLabel heading, l1,t4,t5,t7,l2,l3,l4,l5,l6,l7;
  public static JButton b1,b2, b3;
  public static JPanel panel;
  public static JFrame frame;
  public static String name;
  public static float quantity, price, subtotal, total, cash, balance;
    sales(){
        name="";
        quantity=price=subtotal=total=cash=balance= 0.0F;
    }
    public static void frontend(){
        frame = new JFrame("Sales Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,500);
        heading = new JLabel("Azam And Co");
        l1 = new JLabel("Item Name");
        t1=new JTextField();
        l2 = new JLabel("Quantity");
        t2 = new JTextField();
        l3 = new JLabel("Item Price");
        t3 = new JTextField();
        l4 = new JLabel("Sub Total");
        t4 = new JLabel("       ");
//        t4.setEnabled(false);
        l5 = new JLabel("Total Price");
        t5 = new JLabel();
        l6 = new JLabel("Cash");
        t6 = new JTextField();
        l7 = new JLabel("Balance");
        t7 = new JLabel();
        b1= new JButton("Add");
        b2 = new JButton("Print");
        b3= new JButton("Clear");

        panel = new JPanel();
        panel.setLayout(null);
        heading.setBounds(120,15, 100, 40);
        panel.add(heading);
        l1.setBounds(10, 70, 100, 40);
        panel.add(l1);
        t1.setBounds(120, 80, 100, 20);
        panel.add(t1);
        l2.setBounds(10,110, 100, 40);  //+0+40+0+0
        panel.add(l2);
        t2.setBounds(120, 120, 100, 20);
        panel.add(t2);
        l3.setBounds(10, 150, 100, 40);
        panel.add(l3);
        t3.setBounds(120, 160, 100, 20);
        panel.add(t3);
        l4.setBounds(10, 190, 100, 40);
        panel.add(l4);
        t4.setBounds(120, 200, 100, 20);
        panel.add(t4);
        b1.setBounds(80, 240, 80, 20);
        panel.add(b1);
        b3.setBounds(170, 240, 70, 20);
        panel.add(b3);
        l5.setBounds(10, 270, 100, 40);
        panel.add(l5);
        t5.setBounds(120, 280, 100, 20);
        panel.add(t5);
        l6.setBounds(10, 310, 100, 40);
        panel.add(l6);
        t6.setBounds(120, 320, 100, 20);
        panel.add(t6);
        l7.setBounds(10, 350, 100, 40);
        panel.add(l7);
        t7.setBounds(120, 360, 100, 20);
        panel.add(t7);
        b2.setBounds(120, 390, 100, 20);
        panel.add(b2);
        frame.add(panel);
//        frame.pack();
        frame.setVisible(true);
        panel.setVisible(true);
    }
    public static void taking_values(){

    }
    public static void button_actions(){
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = t1.getText();
                quantity = Float.parseFloat(t2.getText());
                price = Float.parseFloat(t3.getText());
                subtotal = quantity*price;
                t4.setText(String.valueOf(subtotal));
                total = total+ subtotal;
                t5.setText(String.valueOf(total));

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cash = Float.parseFloat(t6.getText());
                balance = cash-total;
                t7.setText(String.valueOf(balance));
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            }
        });
    }
    public static void main(String[] args){
        frontend();
        taking_values();
        button_actions();
    }


}
