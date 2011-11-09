package sk.fiit.kk.icp.ismhd.gui.stop;

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

public class ZobrazenieCpScreen extends JFrame {

    private JPanel contentPane;
    private JLabel lbTitle;
    private JLabel lbCas;
    private JLabel lbDatum;
    private JButton bSp;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ZobrazenieCpScreen frame = new ZobrazenieCpScreen();
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
    public ZobrazenieCpScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbTitle = new JLabel("Linka 31");
        lbTitle.setOpaque(true);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitle.setForeground(Color.BLUE);
        lbTitle.setFont(new Font("Arial", Font.PLAIN, 44));
        lbTitle.setBorder(new LineBorder(Color.BLUE, 2));
        lbTitle.setBackground(Color.WHITE);
        lbTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbTitle.setBounds(204, 0, 256, 65);
        contentPane.add(lbTitle);
        
        lbCas = new JLabel("13:42:05");
        lbCas.setOpaque(true);
        lbCas.setBackground(new Color(255, 204, 153));
        lbCas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbCas.setFont(new Font("Arial", Font.PLAIN, 46));
        lbCas.setBounds(0, 0, 201, 65);
        contentPane.add(lbCas);
        
        lbDatum = new JLabel("<html><center>22. apr\u00EDl 2015<br>\r\nPondelok<br>\r\n22\u00B0C</center></html>");
        lbDatum.setBackground(new Color(255, 204, 153));
        lbDatum.setOpaque(true);
        lbDatum.setHorizontalAlignment(SwingConstants.CENTER);
        lbDatum.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbDatum.setFont(new Font("Arial", Font.PLAIN, 17));
        lbDatum.setBounds(463, 0, 171, 65);
        contentPane.add(lbDatum);
        
        bSp = new JButton("Sp\u00E4\u0165");
        bSp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ZobrazenieCpScreen.this.dispose();
                ZobrazenieCpScreen.this.setVisible(false);
                VyhladanieCpScreen scr = new VyhladanieCpScreen();
                scr.setVisible(true);
            }
        });
        bSp.setFont(new Font("Arial", Font.BOLD, 17));
        bSp.setBounds(9, 423, 114, 30);
        contentPane.add(bSp);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(ZobrazenieCpScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/cp.jpg")));
        label.setBounds(50, 67, 545, 355);
        contentPane.add(label);
    }
}
