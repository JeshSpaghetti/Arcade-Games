import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clare
 */
public class menuFrame extends javax.swing.JFrame {

    /**
     * Creates new form menuFrame
     */
    public menuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ;
            }
        });
    }
    private static JFrame menu;
    
    public static void menuFrame() {   //This is the main menu frame
        menu = new JFrame("Menu"); //Creates frame
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        man.getTimer().stop();
        
        //Creates Background
        MyPanel p = new MyPanel();
        
        //Creates buttons
        JButton play = new JButton("Play");
        JButton high_score = new JButton("High Scores");
        JButton credits = new JButton("Credits"); 
        JButton exit = new JButton("Exit");
        
        //Action Listeners for buttons
        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(false);
                gameFrame.gameFrame();
            }
        });
        high_score.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(false);
                highScoreFrame.highScoreFrame();
            }
        });
        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(false);
                creditsFrame.creditsFrame();
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                System.exit(0);
            }
        });
        
        //Creates logo
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("src\\SCP_logo.png"));
        logo.setBounds(100, 100, 200, 200);
        
        //Adds buttons to frame
        menu.add(play);
        menu.add(high_score);
        menu.add(credits);
        menu.add(exit);
        menu.add(logo);
        
        //These are the default dimensions for buttons
        int Dhori = 110;
        int Dvert = 30;
        
        //Determinse the size and position of the buttons
        play.setBounds(450, 250, Dhori, Dvert);
        high_score.setBounds(450, 300, Dhori, Dvert);
        credits.setBounds(450, 350, Dhori, Dvert);
        exit.setBounds(30, 350, Dhori, Dvert);
        
        //Draws background on frame and makes it visible
        menu.add(p);
        menu.pack();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
    
    public static JFrame getMenu() {
        return menu;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
