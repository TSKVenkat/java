import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class swing {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame Frame = new JFrame("SHEESH");
            Frame.setSize(400,200);
            Frame.setLayout(new BorderLayout(10,10));
            final JLabel TextBox = new JLabel("", SwingConstants.CENTER);
            JButton button = new JButton("Click");

            button.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent e){
                    TextBox.setText("Welcome!");
                }
            });

            Frame.add(TextBox, BorderLayout.NORTH);
            Frame.add(button, BorderLayout.CENTER);
            Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Frame.setLocationRelativeTo(null);
            Frame.setVisible(true);
        });
    }
}