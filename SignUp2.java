package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {
    JComboBox religion , category , income , education , occupation;
    JTextField pannum , adharnum;
    JRadioButton s1,s2 , e1 ,e2;
    ButtonGroup bg1 , bg2;
    JButton next;
    String  formno;


    SignUp2(String first){
        super("APPLICATON FORM ");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150 , 5 , 100,100);
        add(image);


        this.formno = first;

        JLabel l1 = new JLabel(": Page 2 :");
        l1.setFont(new Font("Raleway" , Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);


        JLabel l2 = new JLabel("ADDITIONAL DETAILS");
        l2.setFont(new Font("Raleway" , Font.BOLD,24));
        l2.setBounds(300,60,600,40);
        add(l2);


        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway" , Font.BOLD,18));
        l3.setBounds(150,140,100,30);
        add(l3);

        //COMBO BOX
        String Religion[] = {"Hindu","Muslim","Shikh","Budha","Christian","Other"};
        religion = new JComboBox(Religion);
        religion.setBackground(new Color(252,208,76));
        religion.setFont(new Font("Arial" , Font.BOLD,14));
        religion.setBounds(350,140,320,30);
        add(religion);


        //CATEGORY SECTION

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway" , Font.BOLD,18));
        l4.setBounds(150,190,100,30);
        add(l4);

        String Category[] = {"General" , "OBC" , "SC", "ST", "OTHER"};
        category = new JComboBox(Category);
        category.setBackground(new Color(252,208,76));
        category.setFont(new Font("Arial" , Font.BOLD,14));
        category.setBounds(350,190,320,30);
        add(category);


        //INCOME SECTION

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway" , Font.BOLD,18));
        l5.setBounds(150,240,100,30);
        add(l5);

        String Income[] = {"Null" , "<1,50,000" , "<2.50,000", "5,00,000", "Upto 10,00,000" , "Above 10,00,000"};
        income = new JComboBox(Income);
        income.setBackground(new Color(252,208,76));
        income.setFont(new Font("Arial" , Font.BOLD,14));
        income.setBounds(350,240,320,30);
        add(income);


        //Education Section

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway" , Font.BOLD,18));
        l6.setBounds(150,290,150,30);
        add(l6);

        String Education[] = {"Graduate" , "Post Graduate","Doctrate","Non-Graduate","Other"};
        education = new JComboBox(Education);
        education.setBackground(new Color(252,208,76));
        education.setFont(new Font("Arial" , Font.BOLD,14));
        education.setBounds(350,290,320,30);
        add(education);

        //Ocupation

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway" , Font.BOLD,18));
        l7.setBounds(150,340,150,30);
        add(l7);

        String Occupation[] = {"Salaried" , "Self-Employed" ,"Student","Business" ,"Retired","Other"};
        occupation = new JComboBox(Occupation);
        occupation.setBackground(new Color(252,208,76));
        occupation.setFont(new Font("Arial" , Font.BOLD,14));
        occupation.setBounds(350,340,320,30);
        add(occupation);

        //Pan Number

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway" , Font.BOLD,18));
        l8.setBounds(150,390,150,30);
        add(l8);

        pannum = new JTextField();
//        pannum.setBackground(new Color(252 , 208,76));
        pannum.setFont(new Font("Arial", Font.BOLD, 14));
        pannum.setBounds(350,390,320,30);
        add(pannum);


        //Aadhar NUMBER SECTION

        JLabel l9 = new JLabel("AADHAR Number :");
        l9.setFont(new Font("Raleway" , Font.BOLD,18));
        l9.setBounds(150,440,200,30);
        add(l9);

        adharnum = new JTextField();
        // adharnum.setBackground(new Color(252 , 208,76));
        adharnum.setFont(new Font("Arial", Font.BOLD, 14));
        adharnum.setBounds(350,440,320,30);
        add(adharnum);


        //Senior Citizen

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway" , Font.BOLD,18));
        l10.setBounds(150,490,200,30);
        add(l10);

        s1=new JRadioButton("Yes");
        s1.setBounds(350, 490,90,30);
        s1.setFont(new Font("Arial", Font.BOLD,14));
        s1.setBackground(new Color(252,208,76));
        add(s1);


        s2=new JRadioButton("No");
        s2.setBounds(440, 490,120,30);
        s2.setFont(new Font("Arial", Font.BOLD,14));
        s2.setBackground(new Color(252,208,76));
        add(s2);

        //Adding ButtonGroup
        bg1 = new ButtonGroup();
        bg1.add(s1);
        bg1.add(s2);


        //Existing Account

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway" , Font.BOLD,18));
        l11.setBounds(150,540,200,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setBounds(350, 540,90,30);
        e1.setFont(new Font("Arial", Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        add(e1);


        e2=new JRadioButton("No");
        e2.setBounds(440, 540,120,30);
        e2.setFont(new Font("Arial", Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        add(e2);


        bg2 = new ButtonGroup();
        bg2.add(e1);
        bg2.add(e2);


        //FORM NUMBER

        JLabel l12 = new JLabel("Form No. : ");
        l12.setFont(new Font("Raleway" , Font.BOLD,18));
        l12.setBounds(670,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway" , Font.BOLD,18));
        l13.setBounds(765,10,100,30);
        add(l13);


        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(252 , 208,76));
        setLayout(null);
        setSize(850,790);
        setLocation(450,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) religion.getSelectedItem();
        String cate =(String) category.getSelectedItem();
        String inco =(String) income.getSelectedItem();
        String edu = (String) education.getSelectedItem();
        String occu = (String) occupation.getSelectedItem();

        String pan = pannum.getText();
        String adhar = adharnum.getText();

        String sen_citizen = null;
        if(s1.isSelected())
        {
            sen_citizen = "Yes";
        }
        else if(s2.isSelected())
        {
            sen_citizen = "No";
        }

        String exist_acc = " ";
        if(e1.isSelected())
        {
            exist_acc = "Yes";
        }
        else if (e2.isSelected()){
                exist_acc ="No";
    }
        try{
            if(pannum.getText().equals("") || adharnum.getText().equals("")){
                JOptionPane.showMessageDialog(null , "Fill all the fields");
            }else{
                DatabaseConnection conn = new DatabaseConnection();
                String q = "insert into signup2 values('"+rel+"' , '"+cate+"' , '"+inco+"' ,'"+edu+"' ,'"+occu+"' , '"+pan+"' , '"+adhar+"' , '"+sen_citizen+"' , '"+exist_acc+"' , '"+formno+"')";
                conn.st.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }
        }catch(Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new SignUp2("");
    }
}
