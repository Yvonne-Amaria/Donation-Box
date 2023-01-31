import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HomepageST extends JFrame implements ActionListener {
    JTextField firstTextST;
    JButton firstButtonST, secondButtonST, registrationButtonST;

    HomepageST(){
        setBounds(500, 500, 1200, 800);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel secondLabelST = new JLabel("SOURCE TREE");
        secondLabelST.setFont(new Font("Serif", Font.BOLD, 80));
        secondLabelST.setForeground(new Color(20, 180, 90));
        secondLabelST.setBounds(300, 150, 1000, 70);
        add(secondLabelST);

        JLabel imageHere = new JLabel(new ImageIcon("C:\\Users\\yoobukehwo\\Downloads\\helpingST.jpg"));
        imageHere.setBounds(480, 250, 200, 150);
        add(imageHere);

        JLabel thirdLabelST = new JLabel("Together We Can Make A Difference!");
        thirdLabelST.setFont(new Font("Serif", Font.BOLD, 40));
        thirdLabelST.setForeground(new Color(25,185,95));
        thirdLabelST.setBounds(250, 450, 1000, 45);
        add(thirdLabelST);


//        JFrame snakeFrame = new JFrame();
//        snakeFrame.setBounds(100, 200, 800, 800);
//        snakeFrame.setVisible(true);
//        snakeFrame.add(new JLabel(new ImageIcon("C:\\Users\\yoobukehwo\\Downloads\\helpinghand.jpg")));
//        snakeFrame.pack();


        int setColumnsST = 4;
        int setRowsST = 4;

        String[][] Users = new String[setColumnsST][setRowsST];
        Users[0][0] = "John Doe";
        Users[0][1] = "passwordDoe";
        Users[0][2] = "10000";

        Users[1][0] = "Jane Doe";
        Users[1][1] = "passwordJane";
        Users[1][2] = "500";

        Users[2][0] = "Sarah Conner";
        Users[2][1] = "helloword2000";
        Users[2][2] = "600";

        Users[3][0] = "New Subscriber";
        Users[3][1] = "New Subscriber";
        Users[3][2] = "828282";


        secondButtonST = new JButton("EXIT");
        secondButtonST.setBounds(600, 600, 150, 60);
        secondButtonST.setBackground(new Color(220, 10, 0));
        secondButtonST.setForeground(Color.BLACK);
        secondButtonST.addActionListener(new ActionListener(){
                                             @Override
                                             public void actionPerformed (ActionEvent e){
                                                 new ExitST().setVisible(true);
                                                 dispose();
                                             }
                                         }
        );

        add(secondButtonST);

        setVisible(true);

        registrationButtonST = new JButton("SIGN UP");
        registrationButtonST.setBounds(450, 600, 150, 60);
        registrationButtonST.setBackground(new Color(250, 80, 10));
        registrationButtonST.setForeground(Color.BLACK);
        registrationButtonST.addActionListener(new ActionListener(){
                                                   @Override
                                                   public void actionPerformed (ActionEvent e){
                                                       new RegistrationST().setVisible(true);
                                                       dispose();
                                                   }
                                               }
        );

        add(registrationButtonST);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == firstButtonST){
            String name = firstTextST.getText();
            this.setVisible(false);
            new Guides(name);
        }
        else{
            System.exit(0);
        }
    }

    private static class Guides {
        public Guides(String name) {
        }
    }
}
