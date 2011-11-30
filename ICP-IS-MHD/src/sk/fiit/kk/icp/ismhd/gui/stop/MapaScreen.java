package sk.fiit.kk.icp.ismhd.gui.stop;

import java.awt.Color;
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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class MapaScreen extends JFrame {
    private static ResourceBundle BUNDLE = ResourceBundle.getBundle("sk.fiit.kk.icp.ismhd.gui.stop.messages_SK"); //$NON-NLS-1$
    private JPanel contentPane;
    private JButton bSpat;
    private JButton bTelevzia;
    private JButton bGrunty;
    private JButton bBotanickZhrada;
    private JButton bMolecova;
    private JButton bPanorma;
    private JButton bNadInterntmi;
    private JButton bHorskPark;
    private JButton bBdkov;
    private JButton bPrvosienkov;
    private JButton btnL;
    private JButton btnUp;
    private JButton btnx;
    private JButton btnx_1;

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
                    MapaScreen frame = new MapaScreen(BUNDLE);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * @param bUNDLE2 
     */
    public MapaScreen(ResourceBundle rb) {
        this.BUNDLE = rb;
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        bSpat = new JButton(BUNDLE.getString("MapaScreen.bSpat.text")); //$NON-NLS-1$
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MapaScreen.this.dispose();
                MapaScreen.this.setVisible(false);
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
            }
        });
        bSpat.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setBounds(9, 399, 114, 49);
        contentPane.add(bSpat);
        
        JButton btnZoo = new JButton("ZOO");
        btnZoo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnZoo.setBackground(Color.ORANGE);
        btnZoo.setBounds(277, 179, 62, 25);
        contentPane.add(btnZoo);
        
        JButton btnLafranconi = new JButton("Lafranconi");
        btnLafranconi.setBackground(Color.ORANGE);
        btnLafranconi.setBounds(392, 409, 105, 25);
        contentPane.add(btnLafranconi);
        
        JButton bervenKr = new JButton("\u010Cerven\u00FD kr\u00ED\u017E");
        bervenKr.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        bervenKr.setBackground(Color.ORANGE);
        bervenKr.setBounds(471, 288, 122, 25);
        contentPane.add(bervenKr);
        
        JButton btnCintornSlviiedolie = new JButton("<html>\r\n<center>    \r\nCintor\u00EDn<br>\r\nSl\u00E1vi\u010Die \u00FAdolie\r\n</center>\r\n</html>");
        btnCintornSlviiedolie.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnCintornSlviiedolie.setBackground(Color.ORANGE);
        btnCintornSlviiedolie.setBounds(199, 33, 122, 42);
        contentPane.add(btnCintornSlviiedolie);
        
        bTelevzia = new JButton("Telev\u00EDzia");
        bTelevzia.setBackground(Color.ORANGE);
        bTelevzia.setBounds(183, 131, 84, 25);
        contentPane.add(bTelevzia);
        
        bGrunty = new JButton("Grunty");
        bGrunty.setBackground(Color.ORANGE);
        bGrunty.setBounds(175, 179, 68, 25);
        contentPane.add(bGrunty);
        
        bBotanickZhrada = new JButton("Botanick\u00E1 z\u00E1hrada");
        bBotanickZhrada.setBackground(Color.ORANGE);
        bBotanickZhrada.setBounds(186, 318, 135, 27);
        contentPane.add(bBotanickZhrada);
        
        bMolecova = new JButton("Molecova");
        bMolecova.setBackground(Color.ORANGE);
        bMolecova.setBounds(37, 310, 81, 36);
        contentPane.add(bMolecova);
        
        bPanorma = new JButton("Panor\u00E1ma");
        bPanorma.setBackground(Color.ORANGE);
        bPanorma.setBounds(183, 249, 90, 25);
        contentPane.add(bPanorma);
        
        bNadInterntmi = new JButton("Nad intern\u00E1tmi");
        bNadInterntmi.setBackground(Color.ORANGE);
        bNadInterntmi.setBounds(30, 72, 114, 27);
        contentPane.add(bNadInterntmi);
        
        bHorskPark = new JButton("<html>\r\n<center>    \r\nHorsk\u00FD<br>\r\npark\r\n</center>\r\n</html>");
        bHorskPark.setBackground(Color.ORANGE);
        bHorskPark.setBounds(498, 126, 69, 42);
        contentPane.add(bHorskPark);
        
        bBdkov = new JButton("B\u00FAdkov\u00E1");
        bBdkov.setBackground(Color.ORANGE);
        bBdkov.setBounds(540, 223, 81, 36);
        contentPane.add(bBdkov);
        
        bPrvosienkov = new JButton("Prvosienkov\u00E1");
        bPrvosienkov.setBackground(Color.ORANGE);
        bPrvosienkov.setBounds(354, 125, 101, 25);
        contentPane.add(bPrvosienkov);
        
        btnL = new JButton("<html>&#x2190</html>");
        btnL.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        btnL.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        btnL.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnL.setBounds(534, 376, 30, 30);
        contentPane.add(btnL);
        
        btnUp = new JButton("<html>&#x2191</html>");
        btnUp.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        btnUp.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        btnUp.setBounds(563, 347, 30, 30);
        contentPane.add(btnUp);
        
        btnx = new JButton("<html>&#x2193</html>");
        btnx.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        btnx.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        btnx.setBounds(563, 404, 30, 30);
        contentPane.add(btnx);
        
        btnx_1 = new JButton("<html>&#x2192</html>");
        btnx_1.setBorder(new LineBorder(new Color(0, 0, 0), 0));
        btnx_1.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        btnx_1.setBounds(591, 376, 30, 30);
        contentPane.add(btnx_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setIcon(new ImageIcon(MapaScreen.class.getResource("/sk/fiit/kk/icp/ismhd/map.GIF")));
        lblNewLabel.setBounds(6, 6, 628, 441);
        contentPane.add(lblNewLabel);
        
     // vycentrovanie okna na stred obrazovky
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width) / 2;
        int y = (screen.height - window.height) / 2;
        this.setLocation(x, y);
    }
}
