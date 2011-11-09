package sk.fiit.kk.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class PomocScreen extends JFrame {

    private JPanel contentPane;
    private JLabel lbZochova;
    private JLabel label;
    private JLabel lbNewLabel;
    private JButton bSk;
    private JButton bEn;
    private JButton bDe;
    private JButton bEs;
    private JButton bFr;
    private JLabel lblCestovnPoriadky;
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
                    PomocScreen frame = new PomocScreen();
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
    public PomocScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbZochova = new JLabel("Pomoc");
        lbZochova.setOpaque(true);
        lbZochova.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochova.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochova.setForeground(Color.BLUE);
        lbZochova.setFont(new Font("Arial", Font.PLAIN, 46));
        lbZochova.setBorder(new LineBorder(Color.BLUE, 2));
        lbZochova.setBackground(Color.WHITE);
        lbZochova.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbZochova.setBounds(204, 0, 256, 65);
        contentPane.add(lbZochova);
        
        label = new JLabel("13:42:05");
        label.setBackground(new Color(255, 204, 153));
        label.setOpaque(true);
        label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        label.setFont(new Font("Arial", Font.PLAIN, 46));
        label.setBounds(0, 0, 201, 65);
        contentPane.add(label);
        
        lbNewLabel = new JLabel("<html><center>22. apr\u00EDl 2015<br>\r\nPondelok<br>\r\n22\u00B0C</center></html>");
        lbNewLabel.setBackground(new Color(255, 204, 153));
        lbNewLabel.setOpaque(true);
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
        lbNewLabel.setBounds(463, 0, 171, 65);
        contentPane.add(lbNewLabel);
        
        bSk = new JButton("");
        bSk.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_sk.GIF")));
        bSk.setBounds(135, 399, 97, 42);
        contentPane.add(bSk);
        
        bEn = new JButton("");
        bEn.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_en.GIF")));
        bEn.setBounds(231, 399, 97, 42);
        contentPane.add(bEn);
        
        bDe = new JButton("");
        bDe.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_de.GIF")));
        bDe.setBounds(328, 399, 97, 42);
        contentPane.add(bDe);
        
        bEs = new JButton("");
        bEs.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_es.GIF")));
        bEs.setBounds(425, 399, 97, 42);
        contentPane.add(bEs);
        
        bFr = new JButton("");
        bFr.setIcon(new ImageIcon(HlavnaPonukaScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/flag_fr.GIF")));
        bFr.setBounds(522, 399, 97, 42);
        contentPane.add(bFr);
        
        lblCestovnPoriadky = new JLabel("<html>\r\n<H2>Cestovn\u00E9 poriadky</H2>\r\nVyh\u013Eadanie cestovn\u00E9ho poriadku danej linky zo zvolenej zast\u00E1vky.<p>\r\nZvo\u013Ete linku, smer a zast\u00E1vku. Tla\u010Didlom <b>Vyh\u013Eada\u0165</b> zobraz\u00EDte cestovn\u00FD poriadok.\r\n<H2>Vyh\u013Eada\u0165 spojenie</H2>\r\nVyh\u013Eadanie spojenia medzi dvomi ur\u010Den\u00FDmi zast\u00E1vkami.<p>\r\nZadajte v\u00FDchodiskov\u00FA a cie\u013Eov\u00FA zast\u00E1vku bu\u010F v\u00FDberom zo zoznamu alebo v\u00FDberom z mapy. \u010Ealej nastavte \u010Das, pr\u00EDpadne i d\u00E1tum, a stla\u010Dte tla\u010Didlo <b>Vyh\u013Eada\u0165</b> pre zobrazenie vyhovuj\u00FAcich spojen\u00ED. Vyberte jedno z nich a tla\u010Didlom <b>Podrobnosti</b> zobraz\u00EDte detaily tohto spojenia.\r\n<H2>Mapa</H2>\r\nZistenie aktu\u00E1lnej polohy, zistenie odchodov vybran\u00EDm zast\u00E1vky z mapy.<p>\r\nStla\u010Den\u00EDm n\u00E1zvu zast\u00E1vky sa zobrazia vo\u013Eby s mo\u017Enos\u0165ami zobrazenia odchodov alebo vyh\u013Eadania spojenia do alebo zo zvolenej zast\u00E1vky.\r\n</html>");
        lblCestovnPoriadky.setFont(new Font("SansSerif", Font.PLAIN, 12));
        lblCestovnPoriadky.setBounds(24, 77, 595, 283);
        contentPane.add(lblCestovnPoriadky);
        
        bSp = new JButton("Sp\u00E4\u0165");
        bSp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PomocScreen.this.dispose();
                PomocScreen.this.setVisible(false);
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
            }
        });
        bSp.setFont(new Font("Arial", Font.BOLD, 17));
        bSp.setBounds(9, 399, 114, 42);
        contentPane.add(bSp);
    }
}
