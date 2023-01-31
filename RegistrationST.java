import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationST extends JFrame implements ActionListener {
    JButton firstButtonST, secondButtonST, registrationButtonST;
    JTextField nameST, passwordST; //newMoneyST;

    RegistrationST(){
        setBounds(200, 200, 1000, 600);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel secondLabelST = new JLabel("SOURCE TREE ☘");
        secondLabelST.setFont(new Font("Serif Italic", Font.BOLD, 40));
        secondLabelST.setForeground(new Color(50, 150, 40));
        secondLabelST.setBounds(300, 60, 800, 45);
        add(secondLabelST);

        JLabel thirdLabelST = new JLabel("Enter Username");
        thirdLabelST.setFont(new Font("Serif Italic", Font.BOLD, 28));
        thirdLabelST.setForeground(new Color(25,255,155));
        thirdLabelST.setBounds(300, 150, 500, 30);
        add(thirdLabelST);

        nameST = new JTextField();
        nameST.setBounds(300, 200, 400, 35);
        nameST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        add(nameST);

        JLabel enterFieldST = new JLabel("Enter Password");
        enterFieldST.setFont(new Font("Serif Italic", Font.BOLD, 28));
        enterFieldST.setForeground(new Color(25,255,155));
        enterFieldST.setBounds(300, 250, 500, 30);
        add(enterFieldST);

        passwordST = new JTextField();
        passwordST.setBounds(300, 300, 400, 35);
        passwordST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        add(passwordST);

//        JLabel MoneyST = new JLabel("donateMoney Amount");
//        MoneyST.setFont(new Font("Serif Italic", Font.BOLD, 28));
//        MoneyST.setForeground(new Color(255,255,255));
//        MoneyST.setBounds(300, 350, 500, 30);
//        add(MoneyST);
//
//        newMoneyST = new JTextField();
//        newMoneyST.setBounds(300, 400, 400, 35);
//        newMoneyST.setFont(new Font("Serif Italic", Font.BOLD, 20));
//        add(newMoneyST);

        firstButtonST = new JButton("START");
        firstButtonST.setBounds(300, 450, 100, 40);
        firstButtonST.setBackground(new Color(220, 100, 10));
        firstButtonST.setForeground(Color.BLACK);
        firstButtonST.addActionListener(new ActionListener(){
                                            @Override
                                            public void actionPerformed (ActionEvent e){
                                                String sendName = nameST.getText();
                                                //String senddonateMoney = newMoneyST.getText();

                                                new MenuST(sendName).setVisible(true);
                                                dispose();
                                            }
                                        }
        );

        add(firstButtonST);

        secondButtonST = new JButton("EXIT");
        secondButtonST.setBounds(550, 450, 100, 40);
        secondButtonST.setBackground(new Color(200, 0, 40));
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

        registrationButtonST = new JButton("BACK");
        registrationButtonST.setBounds(425, 450, 100, 40);
        registrationButtonST.setBackground(new Color(130, 15, 120));
        registrationButtonST.setForeground(Color.BLACK);
        registrationButtonST.addActionListener(new ActionListener(){
                                                   @Override
                                                   public void actionPerformed (ActionEvent e){

                                                       new HomepageST().setVisible(true);
                                                       dispose();

                                                   }
                                               }
        );

        add(registrationButtonST);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){


        if(ae.getSource() == firstButtonST){
            String name = nameST.getText();
            this.setVisible(false);
            new Guides(name);
        }else{
            System.exit(0);
        }
    }


    private static class Guides {
        public Guides(String name) {
        }
    }
}
