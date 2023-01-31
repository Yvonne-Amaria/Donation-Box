import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuST extends JFrame implements ActionListener {
    JButton donateMoneyButtonST, exitButtonST, donateClothesButtonST, totalDonationsButtonST, donateFoodButtonST;
    MenuST(String currUserST){
        setBounds(300, 400, 1000, 500);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel secondLabelST = new JLabel("Welcome " + currUserST + "✨");
        secondLabelST.setFont(new Font("Serif Italic", Font.BOLD, 35));
        secondLabelST.setForeground(new Color(250, 100, 150));
        secondLabelST.setBounds(100, 150, 600, 45);
        add(secondLabelST);

        JLabel noteST = new JLabel("We appreciate your will to give back 💓");
        noteST.setFont(new Font("Serif Italic", Font.BOLD, 20));
        noteST.setForeground(new Color(250, 100, 0));
        noteST.setBounds(100, 250, 600, 45);
        add(noteST);

        int check = 0;

        donateMoneyButtonST = new JButton("DONATE MONEY 💸");
        donateMoneyButtonST.setBounds(750, 50, 180, 40);
        donateMoneyButtonST.setBackground(new Color(190, 80, 200));
        donateMoneyButtonST.setForeground(Color.BLACK);
        donateMoneyButtonST.addActionListener(new ActionListener(){
                                              @Override
                                              public void actionPerformed (ActionEvent e){
                                                  new MoneyST(currUserST).setVisible(true);
                                                  dispose();
                                              }
                                          }
        );

        add(donateMoneyButtonST);

        donateClothesButtonST = new JButton("DONATE CLOTHES 👚");
        donateClothesButtonST.setBounds(750, 120, 180, 40);
        donateClothesButtonST.setBackground(new Color(190, 80, 200));
        donateClothesButtonST.setForeground(Color.BLACK);
        donateClothesButtonST.addActionListener(new ActionListener(){
                                                 @Override
                                                 public void actionPerformed (ActionEvent e){
                                                     new ClothesST(currUserST).setVisible(true);
                                                     dispose();
                                                 }
                                             }
        );

        add(donateClothesButtonST);

        donateFoodButtonST = new JButton("DONATE FOOD 🍱🍗");
        donateFoodButtonST.setBounds(750, 180, 180, 40);
        donateFoodButtonST.setBackground(new Color(190, 80, 200));
        donateFoodButtonST.setForeground(Color.BLACK);
        donateFoodButtonST.addActionListener(new ActionListener(){
                                                  @Override
                                                  public void actionPerformed (ActionEvent e){
                                                      new FoodST(currUserST).setVisible(true);
                                                      dispose();
                                                  }
                                              }
        );
        add(donateFoodButtonST);

        totalDonationsButtonST = new JButton("TOTAL DONATIONS 🎁");
        totalDonationsButtonST.setBounds(750, 240, 180, 40);
        totalDonationsButtonST.setBackground(new Color(190, 80, 200));
        totalDonationsButtonST.setForeground(Color.BLACK);
        totalDonationsButtonST.addActionListener(new ActionListener(){
                                              @Override
                                              public void actionPerformed (ActionEvent e){
                                                  new TotalDonationsST(currUserST).setVisible(true);
                                                  dispose();
                                              }
                                          }
        );

        add(totalDonationsButtonST);

        exitButtonST = new JButton("EXIT 👋");
        exitButtonST.setBounds(750, 300, 180, 40);
        exitButtonST.setBackground(new Color(195, 220, 0));
        exitButtonST.setForeground(Color.BLACK);
        exitButtonST.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){

                                               new ExitST().setVisible(true);
                                               dispose();

                                           }
                                       }
        );
        add(exitButtonST);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == donateMoneyButtonST){
            this.setVisible(false);
        }
        else{
            System.exit(0);
        }
    }
}

