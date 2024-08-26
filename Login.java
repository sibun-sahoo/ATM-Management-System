package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1 , label2 , label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2, button3;

    Login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350 , 10 , 100,100);
        add(image);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630 , 350 , 100,100);
        add(iimage);


        //welcome label

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde" , Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);


        //Card label

        label2 = new JLabel("Card No:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway" , Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        // Textfield for card number

        textField2 = new JTextField();
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        add(textField2);





        //pin level
        label3 = new JLabel("PIN No:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway" , Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        //password field
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial" , Font.BOLD , 14));
        add(passwordField3);


        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial" ,Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);


        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial" ,Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(460,300,100,30);
        button2.addActionListener(this);
        add(button2);



        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial" ,Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);



        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0 , 0 , 850,480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450 , 200);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){

                DatabaseConnection conn4 = new DatabaseConnection();
                String card_num = textField2.getText();
                String pin_password = passwordField3.getText();

                String check = "select * from login where card_number ='"+card_num+"' and pin = '"+pin_password+"' ";
//                String check = "SELECT * FROM login WHERE card_number = '"+card_num+"' AND pin = '"+pin_password+"' ";

                //store what we get from above the query

                ResultSet resultSet = conn4.st.executeQuery(check);

                // in if condition we use to see tha if the data is now in resultset or not
                if(resultSet.next()){
                    setVisible(false);
                    new Main_Class(pin_password);

                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect card number and password");
                }


            }
            else if(e.getSource()==button2){
                textField2.setText("");
                passwordField3.setText("");

            }
            else if(e.getSource()==button3){

                new SignUp();
                setVisible(false);

            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
            new Login();
    }
}
