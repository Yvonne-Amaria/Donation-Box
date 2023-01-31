import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExitST extends JFrame implements ActionListener {
    JButton backButtonST;
    ExitST(){
        setBounds(300, 200, 1000, 400);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel viewBalanceST = new JLabel("Thank You For Your Act Of Kindness 💓✨");
        viewBalanceST.setFont(new Font("Monospace", Font.BOLD, 30));
        viewBalanceST.setForeground(new Color(223,120,200));
        viewBalanceST.setBounds(100, 100, 1000, 140);
        add(viewBalanceST);

        JLabel moreNoteST = new JLabel("See You Next Time 👋");
        moreNoteST.setFont(new Font("Monospace", Font.BOLD, 30));
        moreNoteST.setForeground(new Color(223,180,100));
        moreNoteST.setBounds(100, 150, 1000, 140);
        add(moreNoteST);

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