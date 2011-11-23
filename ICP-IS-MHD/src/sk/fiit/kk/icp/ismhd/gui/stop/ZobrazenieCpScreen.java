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
import java.util.ResourceBundle;

public class ZobrazenieCpScreen extends JFrame {
    private static ResourceBundle BUNDLE = ResourceBundle.getBundle("sk.fiit.kk.icp.ismhd.gui.stop.messages_SK"); //$NON-NLS-1$

    private JPanel contentPane;
    private JLabel lbTitleLinkaCislo;
    private JLabel lbAktualnyCas;
    private JLabel lbDatumDenTeplota;
    private JButton bSpat;

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
        
        lbTitleLinkaCislo = new JLabel(BUNDLE.getString("ZobrazenieCpScreen.lbTitleLinkaCislo.text") + 31); //$NON-NLS-1$
        lbTitleLinkaCislo.setOpaque(true);
        lbTitleLinkaCislo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitleLinkaCislo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitleLinkaCislo.setForeground(Color.BLUE);
        lbTitleLinkaCislo.setFont(new Font("Arial", Font.PLAIN, 44));
        lbTitleLinkaCislo.setBorder(new LineBorder(Color.BLUE, 2));
        lbTitleLinkaCislo.setBackground(Color.WHITE);
        lbTitleLinkaCislo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbTitleLinkaCislo.setBounds(204, 0, 256, 65);
        contentPane.add(lbTitleLinkaCislo);
        
        lbAktualnyCas = new JLabel("13:42:05");
        lbAktualnyCas.setOpaque(true);
        lbAktualnyCas.setBackground(new Color(255, 204, 153));
        lbAktualnyCas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbAktualnyCas.setFont(new Font("Arial", Font.PLAIN, 46));
        lbAktualnyCas.setBounds(0, 0, 201, 65);
        contentPane.add(lbAktualnyCas);
        
        lbDatumDenTeplota = new JLabel(BUNDLE.getString("ZobrazenieCpScreen.lbDatumDenTeplota.text")); //$NON-NLS-1$
        lbDatumDenTeplota.setBackground(new Color(255, 204, 153));
        lbDatumDenTeplota.setOpaque(true);
        lbDatumDenTeplota.setHorizontalAlignment(SwingConstants.CENTER);
        lbDatumDenTeplota.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbDatumDenTeplota.setFont(new Font("Arial", Font.PLAIN, 17));
        lbDatumDenTeplota.setBounds(463, 0, 171, 65);
        contentPane.add(lbDatumDenTeplota);
        
        bSpat = new JButton(BUNDLE.getString("ZobrazenieCpScreen.bSpat.text")); //$NON-NLS-1$
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ZobrazenieCpScreen.this.dispose();
                ZobrazenieCpScreen.this.setVisible(false);
                VyhladanieCpScreen scr = new VyhladanieCpScreen();
                scr.setVisible(true);
            }
        });
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setBounds(9, 423, 114, 30);
        contentPane.add(bSpat);
        
        JLabel lbCestovnyPoriadokPicture = new JLabel("");
        lbCestovnyPoriadokPicture.setIcon(new ImageIcon(ZobrazenieCpScreen.class.getResource("/sk/fiit/kk/icp/ismhd/cp.jpg")));
        lbCestovnyPoriadokPicture.setBounds(50, 67, 545, 355);
        contentPane.add(lbCestovnyPoriadokPicture);
    }
}
