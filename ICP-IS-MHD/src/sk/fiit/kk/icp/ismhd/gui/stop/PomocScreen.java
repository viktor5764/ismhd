package sk.fiit.kk.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PomocScreen extends JFrame {
    private static ResourceBundle BUNDLE = ResourceBundle.getBundle("sk.fiit.kk.icp.ismhd.gui.stop.messages_SK"); //$NON-NLS-1$

    private JPanel contentPane;
    private JLabel lbTitlePomoc;
    private JLabel lbAktualnyCas;
    private JLabel lbDatumDenTeplota;
    private JButton bSk;
    private JButton bEn;
    private JButton bDe;
    private JButton bEs;
    private JButton bFr;
    private JLabel lblHelpText;
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
                    PomocScreen frame = new PomocScreen(PomocScreen.BUNDLE);
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
    public PomocScreen(ResourceBundle rb) {
        this.BUNDLE = rb;
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbTitlePomoc = new JLabel(BUNDLE.getString("PomocScreen.lbTitlePomoc.text")); //$NON-NLS-1$
        lbTitlePomoc.setOpaque(true);
        lbTitlePomoc.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitlePomoc.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitlePomoc.setForeground(Color.BLUE);
        lbTitlePomoc.setFont(new Font("Arial", Font.PLAIN, 46));
        lbTitlePomoc.setBorder(new LineBorder(Color.BLUE, 2));
        lbTitlePomoc.setBackground(Color.WHITE);
        lbTitlePomoc.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbTitlePomoc.setBounds(204, 0, 256, 65);
        contentPane.add(lbTitlePomoc);
        
        lbAktualnyCas = new JLabel("13:42:05");
        lbAktualnyCas.setBackground(new Color(255, 204, 153));
        lbAktualnyCas.setOpaque(true);
        lbAktualnyCas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbAktualnyCas.setFont(new Font("Arial", Font.PLAIN, 46));
        lbAktualnyCas.setBounds(0, 0, 201, 65);
        contentPane.add(lbAktualnyCas);
        
        lbDatumDenTeplota = new JLabel(BUNDLE.getString("PomocScreen.lbDatumDenTeplota.text")); //$NON-NLS-1$
        lbDatumDenTeplota.setBackground(new Color(255, 204, 153));
        lbDatumDenTeplota.setOpaque(true);
        lbDatumDenTeplota.setHorizontalAlignment(SwingConstants.CENTER);
        lbDatumDenTeplota.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbDatumDenTeplota.setFont(new Font("Arial", Font.PLAIN, 17));
        lbDatumDenTeplota.setBounds(463, 0, 171, 65);
        contentPane.add(lbDatumDenTeplota);
        
        bSk = new JButton("");
        bSk.setIcon(new ImageIcon(PomocScreen.class.getResource("/sk/fiit/kk/icp/ismhd/flag_sk.GIF")));
        bSk.setBounds(135, 399, 97, 42);
        contentPane.add(bSk);
        
        bEn = new JButton("");
        bEn.setIcon(new ImageIcon(PomocScreen.class.getResource("/sk/fiit/kk/icp/ismhd/flag_en.GIF")));
        bEn.setBounds(231, 399, 97, 42);
        contentPane.add(bEn);
        
        bDe = new JButton("");
        bDe.setIcon(new ImageIcon(PomocScreen.class.getResource("/sk/fiit/kk/icp/ismhd/flag_de.GIF")));
        bDe.setBounds(328, 399, 97, 42);
        contentPane.add(bDe);
        
        bEs = new JButton("");
        bEs.setIcon(new ImageIcon(PomocScreen.class.getResource("/sk/fiit/kk/icp/ismhd/flag_es.GIF")));
        bEs.setBounds(425, 399, 97, 42);
        contentPane.add(bEs);
        
        bFr = new JButton("");
        bFr.setIcon(new ImageIcon(PomocScreen.class.getResource("/sk/fiit/kk/icp/ismhd/flag_fr.GIF")));
        bFr.setBounds(522, 399, 97, 42);
        contentPane.add(bFr);
        
        lblHelpText = new JLabel(BUNDLE.getString("PomocScreen.lblHelpText.text")); //$NON-NLS-1$
        lblHelpText.setFont(new Font("SansSerif", Font.PLAIN, 12));
        lblHelpText.setBounds(24, 77, 595, 283);
        contentPane.add(lblHelpText);
        
        bSpat = new JButton(BUNDLE.getString("PomocScreen.bSpat.text")); //$NON-NLS-1$
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PomocScreen.this.dispose();
                PomocScreen.this.setVisible(false);
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
            }
        });
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setBounds(9, 399, 114, 42);
        contentPane.add(bSpat);
        
     // vycentrovanie okna na stred obrazovky
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width) / 2;
        int y = (screen.height - window.height) / 2;
        this.setLocation(x, y);
    }

}
