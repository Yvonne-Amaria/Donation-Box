import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TotalDonationsST extends JFrame implements ActionListener {
    JButton backButtonST, moneyFieldST, clothesFieldST, foodFieldST;;

    TotalDonationsST(String thisUserST){
        setBounds(200, 100, 1000, 500);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel moneyBalanceST = new JLabel();
        moneyBalanceST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        moneyBalanceST.setForeground(new Color(150, 80, 180));
        moneyBalanceST.setBounds(75, 25, 2880, 100);
        add(moneyBalanceST);

        moneyFieldST = new JButton("MONEY 💸");
        moneyFieldST.setBounds(100, 50, 300, 40);
        moneyFieldST.setBackground(new Color(190, 190, 0));
        moneyFieldST.setForeground(Color.BLACK);
//        moneyFieldST.addActionListener(new ActionListener(){
//                                           @Override
//                                           public void actionPerformed (ActionEvent e){
//                                               String totalUserDonationST = MoneyST(thisUserDonationST);
//                                               moneyBalanceST.setText("You have donated $" + totalUserDonationST);
//                                           }
//                                       }
//        );
        add(moneyFieldST);

        JLabel clothesBalanceST = new JLabel();
        clothesBalanceST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        clothesBalanceST.setForeground(new Color(150, 80, 180));
        clothesBalanceST.setBounds(75, 25, 2880, 100);
        add(clothesBalanceST);

        clothesFieldST = new JButton("CLOTHES 👚");
        clothesFieldST.setBounds(100, 120, 300, 40);
        clothesFieldST.setBackground(new Color(190, 190, 0));
        clothesFieldST.setForeground(Color.BLACK);
//        clothesFieldST.addActionListener(new ActionListener(){
//                                           @Override
//                                           public void actionPerformed (ActionEvent e){
//                                               new viewClothesST(String x ).setVisible(true);
//                                               dispose();
////                                               String totalUserDonationST = ClothesST(thisUserST).ViewClothesST;
////                                               clothesBalanceST.setText("You have donated " + totalUserDonationST + " clothing packages.");
//                                           }
//                                       }
//        );
        add(clothesFieldST);

        JLabel foodBalanceST = new JLabel();
        foodBalanceST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        foodBalanceST.setForeground(new Color(150, 80, 180));
        foodBalanceST.setBounds(75, 25, 2880, 100);
        add(foodBalanceST);

        foodFieldST = new JButton("FOOD 🍱");
        foodFieldST.setBounds(100, 180, 300, 40);
        foodFieldST.setBackground(new Color(190, 190, 0));
        foodFieldST.setForeground(Color.BLACK);
//        foodFieldST.addActionListener(new ActionListener(){
//                                           @Override
//                                           public void actionPerformed (ActionEvent e){
//                                               String totalUserDonationST = FoodST(thisUserDonationST);
//                                               foodBalanceST.setText("You have donated " + totalUserDonationST + " food boxes.");
//                                           }
//                                       }
//        );
        add(foodFieldST);


        backButtonST = new JButton("BACK");
        backButtonST.setBounds(100, 240, 100, 40);
        backButtonST.setBackground(new Color(130, 0, 120));
        backButtonST.setForeground(Color.BLACK);
        backButtonST.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){

                                               new MenuST(thisUserST).setVisible(true);
                                               dispose();

                                           }
                                       }
        );

        add(backButtonST);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == backButtonST){
            this.setVisible(false);
        }
        else{
            System.exit(0);
        }
    }
}