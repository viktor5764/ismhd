
package sk.fiit.kucsera_kovalcik.icp.ismhd;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.UIManager;

public class HelloScreen extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = -5810891128224610736L;
    private JPanel contentPane;
    private JLabel lbBlablaBla;
    private JTextField txfEnterTextHere;
    private JButton bSubmit;
    private JLabel lbIsPreHromadn;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    HelloScreen frame = new HelloScreen();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public HelloScreen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 631, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 204));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbBlablaBla = new JLabel("Blabla bla:");
        lbBlablaBla.setBounds(10, 12, 60, 14);
        contentPane.add(lbBlablaBla);
        
        txfEnterTextHere = new JTextField();
        txfEnterTextHere.setText("Enter text here...");
        txfEnterTextHere.setBounds(80, 8, 290, 22);
        contentPane.add(txfEnterTextHere);
        txfEnterTextHere.setColumns(10);
        
        bSubmit = new JButton("Submit");
        bSubmit.setFont(new Font("SansSerif", Font.BOLD, 12));
        bSubmit.setForeground(new Color(255, 255, 255));
        bSubmit.setBackground(Color.BLUE);
        bSubmit.setBounds(380, 7, 89, 25);
        contentPane.add(bSubmit);
        
        lbIsPreHromadn = new JLabel("IS pre hromadn\u00FA dopravu");
        lbIsPreHromadn.setHorizontalAlignment(SwingConstants.CENTER);
        lbIsPreHromadn.setForeground(Color.BLUE);
        lbIsPreHromadn.setFont(new Font("Arial", Font.BOLD, 34));
        lbIsPreHromadn.setBounds(10, 255, 595, 98);
        contentPane.add(lbIsPreHromadn);
        
        JCheckBox chckbxBla = new JCheckBox("Bla?");
        chckbxBla.setBounds(240, 142, 97, 23);
        contentPane.add(chckbxBla);
    }
}
