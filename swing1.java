import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing1{
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("sheeshhshs");
            frame.setSize(100,200);
            frame.setLayout(new BorderLayout(10,10));
            JLabel TextBox = new JLabel("",SwingConstants.CENTER);
            JButton btn = new JButton("Click");

            btn.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent e){
                    TextBox.setText("hello hello");
                }
            });

            frame.add(btn,BorderLayout.NORTH);
            frame.add(TextBox,BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}