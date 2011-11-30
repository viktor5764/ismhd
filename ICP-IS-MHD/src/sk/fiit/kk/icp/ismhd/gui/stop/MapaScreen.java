package sk.fiit.kk.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
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
    private JPanel panel;
    private JPanel panel_1;
    private JPopupMenu popup;
    private MouseListener popupMouseListener;
    private String zastavka;
    private JButton btnCintornSlviiedolie;
    private JButton btnLafranconi;
    private JButton btnZoo;
    private JButton bervenKr;

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
        bSpat.setName(bSpat.getText());
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
                MapaScreen.this.dispose();
                MapaScreen.this.setVisible(false);
            }
        });
        bSpat.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setBounds(9, 399, 114, 49);
        contentPane.add(bSpat);
        
        btnZoo = new JButton("ZOO");
        btnZoo.setName(btnZoo.getText());
        btnZoo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnZoo.setBackground(Color.ORANGE);
        btnZoo.setBounds(277, 179, 62, 25);
        contentPane.add(btnZoo);
        
        btnLafranconi = new JButton("Lafranconi");
        btnLafranconi.setName(btnLafranconi.getText());
        btnLafranconi.setBackground(Color.ORANGE);
        btnLafranconi.setBounds(390, 411, 105, 25);
        contentPane.add(btnLafranconi);
        
        bervenKr = new JButton("\u010Cerven\u00FD kr\u00ED\u017E");
        bervenKr.setName(bervenKr.getText());
        bervenKr.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        bervenKr.setBackground(Color.ORANGE);
        bervenKr.setBounds(471, 288, 122, 25);
        contentPane.add(bervenKr);
        
        btnCintornSlviiedolie = new JButton("<html>\r\n<center>    \r\nCintor\u00EDn<br>\r\nSl\u00E1vi\u010Die \u00FAdolie\r\n</center>\r\n</html>");
        btnCintornSlviiedolie.setName("Cintor\u00EDn Sl\u00E1v. \u00FAdolie");
        btnCintornSlviiedolie.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnCintornSlviiedolie.setBackground(Color.ORANGE);
        btnCintornSlviiedolie.setBounds(192, 34, 122, 42);
        contentPane.add(btnCintornSlviiedolie);
        
        bTelevzia = new JButton("Telev\u00EDzia");
        bTelevzia.setName(bTelevzia.getText());
        bTelevzia.setBackground(Color.ORANGE);
        bTelevzia.setBounds(176, 133, 84, 25);
        contentPane.add(bTelevzia);
        
        bGrunty = new JButton("Grunty");
        bGrunty.setName(bGrunty.getText());
        bGrunty.setBackground(Color.ORANGE);
        bGrunty.setBounds(169, 183, 68, 25);
        contentPane.add(bGrunty);
        
        bBotanickZhrada = new JButton("Botanick\u00E1 z\u00E1hrada");
        bBotanickZhrada.setName(bBotanickZhrada.getText());
        bBotanickZhrada.setBackground(Color.ORANGE);
        bBotanickZhrada.setBounds(172, 319, 135, 27);
        contentPane.add(bBotanickZhrada);
        
        bMolecova = new JButton("Molecova");
        bMolecova.setName(bMolecova.getText());
        bMolecova.setBackground(Color.ORANGE);
        bMolecova.setBounds(33, 311, 81, 36);
        contentPane.add(bMolecova);
        
        bPanorma = new JButton("Panor\u00E1ma");
        bPanorma.setName(bPanorma.getText());
        bPanorma.setBackground(Color.ORANGE);
        bPanorma.setBounds(178, 251, 90, 25);
        contentPane.add(bPanorma);
        
        bNadInterntmi = new JButton("Nad intern\u00E1tmi");
        bNadInterntmi.setName(bNadInterntmi.getText());
        bNadInterntmi.setBackground(Color.ORANGE);
        bNadInterntmi.setBounds(25, 77, 114, 27);
        contentPane.add(bNadInterntmi);
        
        bHorskPark = new JButton("<html>\r\n<center>    \r\nHorsk\u00FD<br>\r\npark\r\n</center>\r\n</html>");
        bHorskPark.setName("Horsk\u00FD park");
        bHorskPark.setBackground(Color.ORANGE);
        bHorskPark.setBounds(492, 121, 69, 42);
        contentPane.add(bHorskPark);
        
        bBdkov = new JButton("B\u00FAdkov\u00E1");
        bBdkov.setName(bBdkov.getText());
        bBdkov.setBackground(Color.ORANGE);
        bBdkov.setBounds(532, 225, 81, 36);
        contentPane.add(bBdkov);
        
        bPrvosienkov = new JButton("Prvosienkov\u00E1");
        bPrvosienkov.setName(bPrvosienkov.getText());
        bPrvosienkov.setBackground(Color.ORANGE);
        bPrvosienkov.setBounds(351, 132, 101, 25);
        contentPane.add(bPrvosienkov);
        
        panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLUE, 2));
        panel.setBounds(542, 362, 90, 90);
        contentPane.add(panel);
        panel.setLayout(null);
        
        btnL = new JButton("<html>&#x2190</html>");
        btnL.setBounds(0, 30, 30, 30);
        panel.add(btnL);
        btnL.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        btnL.setBorder(null);
        
        btnUp = new JButton("<html>&#x2191</html>");
        btnUp.setBounds(30, 0, 30, 30);
        panel.add(btnUp);
        btnUp.setBorder(null);
        btnUp.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        
        btnx = new JButton("<html>&#x2193</html>");
        btnx.setBounds(30, 60, 30, 30);
        panel.add(btnx);
        btnx.setBorder(null);
        btnx.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        
        btnx_1 = new JButton("<html>&#x2192</html>");
        btnx_1.setBounds(60, 30, 30, 30);
        panel.add(btnx_1);
        btnx_1.setBorder(null);
        btnx_1.setFont(new Font("DejaVu Sans", Font.BOLD, 20));
        btnL.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setIcon(new ImageIcon(MapaScreen.class.getResource("/sk/fiit/kk/icp/ismhd/map.GIF")));
        lblNewLabel.setBounds(0, 0, 634, 454);
        contentPane.add(lblNewLabel);
        
        panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 10, 10);
        contentPane.add(panel_1);
        
        popup = new JPopupMenu();
        popup.add(new JMenuItem(new AbstractAction("H\u013Eada\u0165 cestu sem...") {
            public void actionPerformed(ActionEvent e) {
                VyhladanieTrasyScreen frame = new VyhladanieTrasyScreen(BUNDLE, null, zastavka);
                frame.setVisible(true);
                MapaScreen.this.dispose();
                MapaScreen.this.setVisible(false);
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("H\u013Eada\u0165 cestu odtia\u013Eto...") {
            public void actionPerformed(ActionEvent e) {
                VyhladanieTrasyScreen frame = new VyhladanieTrasyScreen(BUNDLE, zastavka, null);
                frame.setVisible(true);
                MapaScreen.this.dispose();
                MapaScreen.this.setVisible(false);
            }
        }));
        
        popupMouseListener = new MouseListener() {
            
            @Override
            public void mouseReleased(MouseEvent e) {}
            
            @Override
            public void mousePressed(MouseEvent e) {}
            
            @Override
            public void mouseExited(MouseEvent e) {}
            
            @Override
            public void mouseEntered(MouseEvent e) {}
            
            @Override
            public void mouseClicked(MouseEvent e) {
                zastavka = ((JButton)e.getComponent()).getName();
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        };
        
        bBdkov.addMouseListener(popupMouseListener);
        bervenKr.addMouseListener(popupMouseListener);
        btnCintornSlviiedolie.addMouseListener(popupMouseListener);
        btnLafranconi.addMouseListener(popupMouseListener);
        btnZoo.addMouseListener(popupMouseListener);
        bBotanickZhrada.addMouseListener(popupMouseListener);
        bGrunty.addMouseListener(popupMouseListener);
        bHorskPark.addMouseListener(popupMouseListener);
        bMolecova.addMouseListener(popupMouseListener);
        bNadInterntmi.addMouseListener(popupMouseListener);
        bPanorma.addMouseListener(popupMouseListener);
        bPrvosienkov.addMouseListener(popupMouseListener);
        bTelevzia.addMouseListener(popupMouseListener);

        
     // vycentrovanie okna na stred obrazovky
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width) / 2;
        int y = (screen.height - window.height) / 2;
        this.setLocation(x, y);
    }
}
