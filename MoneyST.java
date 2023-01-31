import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoneyST extends JFrame implements ActionListener {
    JTextField amountST;
    String testBalanceST;
    JButton backButtonST, enterFieldST;

    MoneyST(String currUserST){
        setBounds(200, 100, 1000, 500);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        amountST = new JTextField();
        amountST.setBounds(100, 100, 200, 35);
        amountST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        add(amountST);
        setVisible(true);

        JLabel acctBalanceST = new JLabel("Please Enter Amount to Donate");

        int check = 0;

        //testBalanceST = userBalanceST;
        JLabel viewAcctBalanceST = new JLabel("Hello " + currUserST + "!");
        viewAcctBalanceST.setFont(new Font("Serif Italic", Font.BOLD, 25));
        viewAcctBalanceST.setForeground(new Color(10, 180, 180));
        viewAcctBalanceST.setBounds(75, 0, 400, 100);
        add(viewAcctBalanceST);

        acctBalanceST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        acctBalanceST.setForeground(new Color(10, 180, 180));
        acctBalanceST.setBounds(75, 25, 2880, 100);
        add(acctBalanceST);

        backButtonST = new JButton("BACK");
        backButtonST.setBounds(100, 200, 100, 40);
        backButtonST.setBackground(new Color(130, 0, 120));
        backButtonST.setForeground(Color.BLACK);
        backButtonST.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                new MenuST(currUserST).setVisible(true);
                dispose();
            }
        });

        add(backButtonST);

        enterFieldST = new JButton("ENTER");
        enterFieldST.setBounds(100, 150, 100, 40);
        enterFieldST.setBackground(new Color(190, 190, 0));
        enterFieldST.setForeground(Color.BLACK);
        enterFieldST.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){
                                               String thisUserDonationST = amountST.getText();
                                               acctBalanceST.setText("You Have Generously Donated $" + thisUserDonationST);
                                           }
                                       }
        );

        add(enterFieldST);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == backButtonST){
            this.setVisible(false);
        }
        else{
            System.exit(0);
        }
    }
    public int viewMoneyST(String x ){
        String text = amountST.getText();
        System.out.println(text);
        int withdrawCashST = Integer.parseInt(text);

        int thisUserBalanceST = Integer.parseInt(x);

        thisUserBalanceST = thisUserBalanceST + withdrawCashST;
        testBalanceST = String.valueOf(thisUserBalanceST) ;

        amountST.setText("");

        return thisUserBalanceST;
    }
}