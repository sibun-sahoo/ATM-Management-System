package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JTextField textName , textFname, textEmail ,textAdd , textCity , textPin , textState;
    JDateChooser dateChooser;
    JRadioButton b1,b2,b3 , m1 ,m2;
    JButton next;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);


    SignUp(){
        super("APPLICATION FORM");


        //image section
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25 , 10 , 100,100);
        add(image);


        //Applicatio form label
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway" , Font.BOLD , 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(370, 70,600,30);
        label2.setFont(new Font("Ralway" , Font.BOLD , 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(330,110,600,30);
        label3.setFont(new Font("Ralway" , Font.BOLD, 22));
        add(label3);

        //Your name

        JLabel label4 = new JLabel("Name :");
        label4.setBounds(100,190,100,30);
        label4.setFont(new Font("Ralway",Font.BOLD,20));
        add(label4);

        textName = new JTextField();
        textName.setBounds(300,190 , 300,30);
        textName.setFont(new Font("Arial",Font.BOLD,14));
        add(textName);

        //Fathers name
        JLabel label5 = new JLabel("Father's Name :");
        label5.setBounds(100,240,200,30);
        label5.setFont(new Font("Ralway",Font.BOLD,20));
        add(label5);

        textFname = new JTextField();
        textFname.setBounds(300,240 , 300,30);
        textFname.setFont(new Font("Arial",Font.BOLD,14));
        add(textFname);

        //DOB
        JLabel label6 = new JLabel("Date of Birth :");
        label6.setBounds(100,290,300,30);
        label6.setFont(new Font("Ralway",Font.BOLD,20));
        add(label6);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,300,30);
        add(dateChooser);

        //Gender Check

        JLabel label7 = new JLabel("Gender :");
        label7.setBounds(100,340,200,30);
        label7.setFont(new Font("Ralway",Font.BOLD,20));
        add(label7);

        b1 = new JRadioButton("Male");
        b1.setBackground(new Color(222,255,228));
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBounds(300,340,60,30);
        add(b1);

        b2 = new JRadioButton("Female");
        b2.setBackground(new Color(222,255,228));
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBounds(400,340,90,30);
        add(b2);


        b3 = new JRadioButton("Other");
        b3.setBackground(new Color(222,255,228));
        b3.setFont(new Font("Arial",Font.BOLD,14));
        b3.setBounds(520,340,90,30);
        add(b3);

        //  To select only of the option
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(b1);
        buttonGroup.add(b2);
        buttonGroup.add(b3);


        //Email Address
        JLabel emailAddress = new JLabel("Email :");
        emailAddress.setBounds(100,390,200,30);
        emailAddress.setFont(new Font("Ralway" , Font.BOLD, 20));
        add(emailAddress);

        textEmail = new JTextField();
        textEmail.setBounds(300 , 390 , 300,30);
        textEmail.setFont(new Font("Arial",Font.BOLD,14));
        add(textEmail);

        //Marriage Status
        JLabel marriage = new JLabel("Marital Status :");
        marriage.setBounds(100,440,200,30);
        marriage.setFont(new Font("Raleway" , Font.BOLD,20));
        add(marriage);


        m1 = new JRadioButton("Married");
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Arial",Font.BOLD,14));
        m1.setBounds(300,440,90,30);
        add(m1);


        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Arial",Font.BOLD,14));
        m2.setBounds(400,440,150,30);
        add(m2);

        //  To select only of the option
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);


        //Address
        JLabel jadd = new JLabel("Location :");
        jadd.setBounds(100,490,300,30);
        jadd.setFont(new Font("Raleway" , Font.BOLD,20));
        add(jadd);

        textAdd = new JTextField();
        textAdd.setBounds(300 , 490 , 300,30);
        textAdd.setFont(new Font("Arial",Font.BOLD,14));
        add(textAdd);


        //City
        JLabel jcity = new JLabel("City :");
        jcity.setBounds(100,540,300,30);
        jcity.setFont(new Font("Raleway" , Font.BOLD,20));
        add(jcity);

        textCity = new JTextField();
        textCity.setBounds(300 , 540 , 300,30);
        textCity.setFont(new Font("Arial",Font.BOLD,14));
        add(textCity);


        //PIN CODE

        JLabel jpin = new JLabel("PIN Code :");
        jpin.setBounds(100,590,300,30);
        jpin.setFont(new Font("Raleway" , Font.BOLD,20));
        add(jpin);

        textPin = new JTextField();
        textPin.setBounds(300 , 590 , 300,30);
        textPin.setFont(new Font("Arial",Font.BOLD,14));
        add(textPin);

        //State

        JLabel jstate = new JLabel("State :");
        jstate.setBounds(100,640,300,30);
        jstate.setFont(new Font("Raleway" , Font.BOLD,20));
        add(jstate);

        textState = new JTextField();
        textState.setBounds(300 , 640 , 300,30);
        textState.setFont(new Font("Arial",Font.BOLD,14));
        add(textState);


        //Next Button
        next = new JButton("Next");
        next.setFont(new Font("Raleway" , Font.BOLD,15));
        next.setBounds(620,710,80,30);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);



        //content page
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850 , 800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String father = textFname.getText();
        String  gender = null;
        if(b1.isSelected()){
            gender = "Male";
        }
        else if(b2.isSelected()){
            gender = "Female";
        }
        else if(b3.isSelected()){
            gender = "Other";
        }
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }
        else if(m2.isSelected()){
            marital="Unmarried";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pin = textPin.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all fields");
            }
            else {
                DatabaseConnection connection = new DatabaseConnection();
                String q = "insert into signup values('"+formno+"' , '"+name+"','"+father+"','"+gender+"','"+dob+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                connection.st.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);


            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }


    }

    public static void main (String[] args){
        new SignUp();
    }
}
