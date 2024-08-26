package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class SignUp3 extends JFrame implements ActionListener {
    JRadioButton r1 , r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno;
    Button submit , cancel;

    SignUp3(String formno){
    this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150 , 5 , 100,100);
        add(image);

        JLabel l1=new JLabel(": Page 3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("ACCOUNT DETAILS");
        l2.setFont(new Font("Raleway" , Font.BOLD,22));
        l2.setBounds(280,80,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Raleway" , Font.BOLD,18));
        l3.setBounds(150,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Arial" , Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(150,180,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Arial" , Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(400,180,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Arial" , Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(150,220,150,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Arial" , Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(400,220,300,30);
        add(r4);


        ButtonGroup bg1 =  new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);
        bg1.add(r3);
        bg1.add(r4);


        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway" , Font.BOLD,18));
        l4.setBounds(150,270,200,20);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway" , Font.BOLD,12));
        l5.setBounds(150,300,400,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-5494");
        l6.setFont(new Font("Raleway" , Font.BOLD,18));
        l6.setBounds(400,270,400,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway" , Font.BOLD,12));
        l7.setBounds(400,300,400,20);
        add(l7);


        JLabel l8 = new JLabel("Pin Number :");
        l8.setFont(new Font("Raleway" , Font.BOLD,18));
        l8.setBounds(150,340,200,20);
        add(l8);



        JLabel l9 = new JLabel("(Your 4-digit Pin Number)");
        l9.setFont(new Font("Raleway" , Font.BOLD,12));
        l9.setBounds(150,360,300,20);
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("Raleway" , Font.BOLD,18));
        l10.setBounds(450,340,100,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required");
        l11.setFont(new Font("Raleway" , Font.BOLD,18));
        l11.setBounds(150,400,400,20);
        add(l11);


        //Check Boxes for Services

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215 , 252, 252));
        c1.setFont(new Font("Arial" , Font.BOLD,14));
        c1.setBounds(150,435,200,20);
        add(c1);


        c2 = new JCheckBox("Net Banking");
        c2.setBackground(new Color(215 , 252, 252));
        c2.setFont(new Font("Arial" , Font.BOLD,14));
        c2.setBounds(450,435,200,20);
        add(c2);


        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215 , 252, 252));
        c3.setFont(new Font("Arial" , Font.BOLD,14));
        c3.setBounds(150,485,200,20);
        add(c3);


        c4 = new JCheckBox("Email Alert");
        c4.setBackground(new Color(215 , 252, 252));
        c4.setFont(new Font("Arial" , Font.BOLD,14));
        c4.setBounds(450,485,200,20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215 , 252, 252));
        c5.setFont(new Font("Arial" , Font.BOLD,14));
        c5.setBounds(150,535,200,20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215 , 252, 252));
        c6.setFont(new Font("Arial" , Font.BOLD,14));
        c6.setBounds(450,535,200,20);
        add(c6);


        JCheckBox c7 = new JCheckBox("I here by declares that the above declared details correct to the best of my knowledge." , true);
        c7.setBackground(new Color(215 , 252, 252));
        c7.setFont(new Font("Arial" , Font.BOLD,14));
        c7.setBounds(150,600,800,20);
        add(c7);



        JLabel l12 = new JLabel("Form no. :");
        l12.setFont(new Font("Raleway" , Font.BOLD,18));
        l12.setBounds(670,10,100,30);
        add(l12);

        JLabel l13 = new JLabel();
        l13.setFont(new Font("Raleway" , Font.BOLD,18));
        l13.setBounds(765,10,100,30);
        add(l13);


        submit = new Button("Submit");
        submit.setFont(new Font("Arial",Font.BOLD ,14));
        submit.setBounds(450,690,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

         cancel = new Button("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setFont(new Font("Arial" , Font.BOLD,14));
        cancel.setBounds(300 , 690,100,30);
        cancel.addActionListener(this);
        add(cancel);


        setLayout(null);
        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String accType = "";
            if(r1.isSelected()){
                accType = "Saving Account";
            }else if(r2.isSelected()){
                accType="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accType ="Current Account" ;
            }else if(r4.isSelected()){
                accType = "Recurring Deposit Account" ;
            }

            Random ran = new Random();
            long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
            String card_num = "" + Math.abs(first7);


            long first3 = (ran.nextLong() % 9000L) + 1000l;
            String pin_num = "" + Math.abs(first3);


            String service ="";
            if(c1.isSelected()){
                service +="ATM Card";
            }if(c2.isSelected()){
                service +="Net Banking";
            } if(c3.isSelected()){
                service+="Mobile Banking";
            } if(c4.isSelected()){
                service +="Email Alert";
            } if(c5.isSelected()){
                service +="Cheque Book";
            } if(c6.isSelected()){
                service +="E-Statement";
            }

            try {
                if(e.getSource() == submit){
                    if(accType.equals("")){
                        JOptionPane.showMessageDialog(null , "Fill al the fields");
                    }else {
                        DatabaseConnection conn2 = new DatabaseConnection();
                        String q1 = "insert into signup3 values ('"+formno+"' , '"+accType+"' , '"+card_num+"' , '"+pin_num+"' , '"+service +"')" ;
                        String q2 = "insert into login values ('"+formno+"' ,'"+card_num+"' , '"+pin_num+"')" ;
                        conn2.st.executeUpdate(q1);
                        conn2.st.executeUpdate(q2);

                        JOptionPane.showMessageDialog(null , "Card Number : " + card_num  +"\n" + "Pin Number : " + pin_num + "\n");
                        setVisible(false);
                        new Deposit(pin_num);
                    }
                }

                else if(e.getSource() == cancel){
                    System.exit(0);
                }
            }catch(Exception E)
            {
                E.printStackTrace();
            }

    }

    public static void main(String[] args) {
        new SignUp3("");
    }
}
