package sk.fiit.kucsera_kovalcik.icp.ismhd.gui.exterior;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BusExteriorDisplay extends JFrame {

    private JPanel contentPane;

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
            public void run() {
                try {
                    BusExteriorDisplay frame = new BusExteriorDisplay();
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
    public BusExteriorDisplay() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 643, 123);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel label = new JLabel("31");
        label.setForeground(new Color(255, 0, 0));
        label.setFont(new Font("Dialog", Font.BOLD, 99));
        label.setBounds(0, 0, 123, 98);
        contentPane.add(label);
        
        JLabel lblSmer = new JLabel("cez");
        lblSmer.setFont(new Font("Dialog", Font.PLAIN, 30));
        lblSmer.setForeground(new Color(255, 0, 0));
        lblSmer.setBounds(166, 30, 71, 68);
        contentPane.add(lblSmer);
        
        JLabel lblCintornSlviiedolie = new JLabel("Cintor\u00EDn Sl\u00E1vi\u010Die \u00FAdolie");
        lblCintornSlviiedolie.setHorizontalAlignment(SwingConstants.CENTER);
        lblCintornSlviiedolie.setFont(new Font("Dialog", Font.BOLD, 40));
        lblCintornSlviiedolie.setForeground(new Color(255, 0, 0));
        lblCintornSlviiedolie.setBounds(116, 0, 515, 49);
        contentPane.add(lblCintornSlviiedolie);
        
        JLabel lblParkKultry = new JLabel("Park kult\u00FAry");
        lblParkKultry.setHorizontalAlignment(SwingConstants.CENTER);
        lblParkKultry.setForeground(Color.RED);
        lblParkKultry.setFont(new Font("Dialog", Font.PLAIN, 30));
        lblParkKultry.setBounds(151, 30, 465, 71);
        contentPane.add(lblParkKultry);
    }
}
