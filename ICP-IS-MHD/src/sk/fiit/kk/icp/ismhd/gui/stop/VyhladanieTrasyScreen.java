
package sk.fiit.kk.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeListener;

public class VyhladanieTrasyScreen extends JFrame {

    private static ResourceBundle BUNDLE = ResourceBundle
            .getBundle("sk.fiit.kk.icp.ismhd.gui.stop.messages_SK"); //$NON-NLS-1$

    private JPanel contentPane;

    private JLabel lbTitle;

    private JLabel lbAktualnyCas;

    private JLabel lbDatumDenTeplota;

    private JLabel lbVychodiskovaZastavka;

    private JButton bVychodiskovaMap;

    private JPanel pVychodiskova;

    private JPanel pCielova;

    private JLabel lbCielovaZastavka;

    private JButton bCielovaMap;

    private JPanel pCas;

    private JLabel lbCas;

    private JLabel lbHodina;

    private JLabel lbMinuta;

    private JLabel lbDvojbodka;

    private JPanel panel;

    private JLabel lbDatum;

    private JLabel lbDen;

    private JLabel lbMesiac;

    private JButton bVyhladat;

    private JButton bSpat;

    private JPanel pOdchodPrichod;

    private String[] mesiace;

    private JRadioButton rdbtnOdchod;

    private JRadioButton rdbtnPrichod;

    private JComboBox comboBoxCielova;

    private JComboBox comboBoxVychodiskova;

    private JSpinner spinnerMesiac;

    private JSpinner spinnerDen;

    private JSpinner spinnerHodina;

    private JSpinner spinnerMinuta;

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
                    VyhladanieTrasyScreen frame = new VyhladanieTrasyScreen(BUNDLE);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * 
     * @param rb
     * @wbp.parser.constructor
     */
    public VyhladanieTrasyScreen(ResourceBundle rb) {
        this.BUNDLE = rb;
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lbTitle = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbTitle.text")); //$NON-NLS-1$
        lbTitle.setOpaque(true);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitle.setForeground(Color.BLUE);
        lbTitle.setFont(new Font("Arial", Font.PLAIN, 32));
        lbTitle.setBorder(new LineBorder(Color.BLUE, 2));
        lbTitle.setBackground(Color.WHITE);
        lbTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbTitle.setBounds(204, 0, 256, 65);
        contentPane.add(lbTitle);

        lbAktualnyCas = new JLabel("13:42:05");
        lbAktualnyCas.setOpaque(true);
        lbAktualnyCas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbAktualnyCas.setFont(new Font("Arial", Font.PLAIN, 46));
        lbAktualnyCas.setBounds(0, 0, 201, 65);
        lbAktualnyCas.setBackground(new Color(255, 204, 153));
        contentPane.add(lbAktualnyCas);

        lbDatumDenTeplota = new JLabel(
                BUNDLE.getString("VyhladanieTrasyScreen.lbDatumDenTeplota.text")); //$NON-NLS-1$
        lbDatumDenTeplota.setOpaque(true);
        lbDatumDenTeplota.setHorizontalAlignment(SwingConstants.CENTER);
        lbDatumDenTeplota.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbDatumDenTeplota.setFont(new Font("Arial", Font.PLAIN, 17));
        lbDatumDenTeplota.setBounds(463, 0, 171, 65);
        lbDatumDenTeplota.setBackground(new Color(255, 204, 153));
        contentPane.add(lbDatumDenTeplota);

        pVychodiskova = new JPanel();
        pVychodiskova.setBackground(new Color(255, 235, 205));
        pVychodiskova.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pVychodiskova.setBounds(6, 77, 308, 109);
        contentPane.add(pVychodiskova);
        pVychodiskova.setLayout(null);

        comboBoxVychodiskova = new JComboBox();
        comboBoxVychodiskova.setBounds(0, 43, 237, 47);
        pVychodiskova.add(comboBoxVychodiskova);
        comboBoxVychodiskova.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBoxVychodiskova.setModel(new DefaultComboBoxModel(HlavnaPonukaScreen.ZOZNAM_ZASTAVOK));// new
                                                                                                    // String[]
                                                                                                    // {"Ag\u00E1tov\u00E1",
                                                                                                    // "Alexyho",
                                                                                                    // "Astronomick\u00E1",
                                                                                                    // "Aupark",
                                                                                                    // "Autobusov\u00E1 stanica",
                                                                                                    // "Avion",
                                                                                                    // "Bajkalsk\u00E1",
                                                                                                    // "Botanick\u00E1 z\u00E1hrada",
                                                                                                    // "Chatam S\u00F3fer",
                                                                                                    // "Cintor\u00EDn Sl\u00E1v. \u00FAdolie",
                                                                                                    // "\u010Cunovo",
                                                                                                    // "Gagarinova",
                                                                                                    // "Kop\u010Dany",
                                                                                                    // "Lafranconi",
                                                                                                    // "Ra\u010Dianske m\u00FDto",
                                                                                                    // "SAV",
                                                                                                    // "S\u00FAhvezdn\u00E1",
                                                                                                    // "\u0160pit\u00E1lska",
                                                                                                    // "Telev\u00EDzia",
                                                                                                    // "Trnavsk\u00E9 m\u00FDto",
                                                                                                    // "Vazovova",
                                                                                                    // "Zochova",
                                                                                                    // "\u017DST Nov\u00E9 Mesto"}));
        comboBoxVychodiskova.setSelectedIndex(21);

        lbVychodiskovaZastavka = new JLabel(
                BUNDLE.getString("VyhladanieTrasyScreen.lbVychodiskovaZastavka.text")); //$NON-NLS-1$
        lbVychodiskovaZastavka.setBounds(6, 6, 232, 26);
        pVychodiskova.add(lbVychodiskovaZastavka);
        lbVychodiskovaZastavka.setFont(new Font("Arial", Font.PLAIN, 22));

        bVychodiskovaMap = new JButton("");
        bVychodiskovaMap.setBounds(237, 42, 65, 48);
        pVychodiskova.add(bVychodiskovaMap);
        bVychodiskovaMap.setIcon(new ImageIcon(VyhladanieTrasyScreen.class
                .getResource("/sk/fiit/kk/icp/ismhd/icon_map.gif")));
        bVychodiskovaMap.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MapaScreen scr = new MapaScreen(BUNDLE);
                scr.setVisible(true);
                VyhladanieTrasyScreen.this.dispose();
                VyhladanieTrasyScreen.this.setVisible(false);
            }
        });

        pCielova = new JPanel();
        pCielova.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pCielova.setLayout(null);
        pCielova.setBackground(new Color(255, 235, 205));
        pCielova.setBounds(318, 77, 310, 109);
        contentPane.add(pCielova);

        comboBoxCielova = new JComboBox();
        comboBoxCielova.setModel(new DefaultComboBoxModel(HlavnaPonukaScreen.ZOZNAM_ZASTAVOK));// new
                                                                                               // String[]
                                                                                               // {"Ag\u00E1tov\u00E1",
                                                                                               // "Alexyho",
                                                                                               // "Astronomick\u00E1",
                                                                                               // "Aupark",
                                                                                               // "Autobusov\u00E1 stanica",
                                                                                               // "Avion",
                                                                                               // "Bajkalsk\u00E1",
                                                                                               // "Botanick\u00E1 z\u00E1hrada",
                                                                                               // "Chatam S\u00F3fer",
                                                                                               // "Cintor\u00EDn Sl\u00E1v. \u00FAdolie",
                                                                                               // "\u010Cunovo",
                                                                                               // "Gagarinova",
                                                                                               // "Kop\u010Dany",
                                                                                               // "Lafranconi",
                                                                                               // "Ra\u010Dianske m\u00FDto",
                                                                                               // "SAV",
                                                                                               // "S\u00FAhvezdn\u00E1",
                                                                                               // "\u0160pit\u00E1lska",
                                                                                               // "Telev\u00EDzia",
                                                                                               // "Trnavsk\u00E9 m\u00FDto",
                                                                                               // "Vazovova",
                                                                                               // "Zochova",
                                                                                               // "\u017DST Nov\u00E9 Mesto"}));
        comboBoxCielova.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBoxCielova.setBounds(0, 43, 237, 47);
        pCielova.add(comboBoxCielova);

        lbCielovaZastavka = new JLabel(
                BUNDLE.getString("VyhladanieTrasyScreen.lbCielovaZastavka.text")); //$NON-NLS-1$
        lbCielovaZastavka.setFont(new Font("Arial", Font.PLAIN, 22));
        lbCielovaZastavka.setBounds(6, 6, 232, 26);
        pCielova.add(lbCielovaZastavka);

        bCielovaMap = new JButton("");
        bCielovaMap.setIcon(new ImageIcon(VyhladanieTrasyScreen.class
                .getResource("/sk/fiit/kk/icp/ismhd/icon_map.gif")));
        bCielovaMap.setBounds(239, 42, 65, 48);
        pCielova.add(bCielovaMap);
        bCielovaMap.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MapaScreen scr = new MapaScreen(BUNDLE);
                scr.setVisible(true);
                VyhladanieTrasyScreen.this.dispose();
                VyhladanieTrasyScreen.this.setVisible(false);

            }
        });

        pCas = new JPanel();
        pCas.setBackground(new Color(255, 235, 205));
        pCas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pCas.setBounds(6, 255, 308, 132);
        contentPane.add(pCas);
        pCas.setLayout(null);

        spinnerHodina = new JSpinner();
        spinnerHodina.setModel(new SpinnerNumberModel(13, 0, 23, 1));
        spinnerHodina.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinnerHodina.setBounds(70, 52, 75, 72);
        pCas.add(spinnerHodina);

        lbCas = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbCas.text")); //$NON-NLS-1$
        lbCas.setFont(new Font("Arial", Font.PLAIN, 22));
        lbCas.setBounds(6, 6, 232, 26);
        pCas.add(lbCas);

        lbHodina = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbHodina.text")); //$NON-NLS-1$
        lbHodina.setHorizontalAlignment(SwingConstants.CENTER);
        lbHodina.setBounds(70, 36, 55, 16);
        pCas.add(lbHodina);

        lbMinuta = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbMinuta.text")); //$NON-NLS-1$
        lbMinuta.setHorizontalAlignment(SwingConstants.CENTER);
        lbMinuta.setBounds(152, 36, 55, 16);
        pCas.add(lbMinuta);

        spinnerMinuta = new JSpinner();
        spinnerMinuta.setModel(new SpinnerNumberModel(43, 0, 59, 1));
        spinnerMinuta.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinnerMinuta.setBounds(152, 52, 75, 72);
        pCas.add(spinnerMinuta);

        lbDvojbodka = new JLabel(":");
        lbDvojbodka.setFont(new Font("SansSerif", Font.PLAIN, 31));
        lbDvojbodka.setBounds(143, 73, 9, 27);
        pCas.add(lbDvojbodka);

        panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel.setLayout(null);
        panel.setBackground(new Color(255, 235, 205));
        panel.setBounds(318, 255, 308, 132);
        contentPane.add(panel);

        spinnerDen = new JSpinner();
        spinnerDen.setModel(new SpinnerNumberModel(22, 1, 31, 1));
        spinnerDen.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinnerDen.setBounds(20, 52, 75, 72);
        panel.add(spinnerDen);

        lbDatum = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbDatum.text")); //$NON-NLS-1$
        lbDatum.setFont(new Font("Arial", Font.PLAIN, 22));
        lbDatum.setBounds(6, 6, 232, 26);
        panel.add(lbDatum);

        lbDen = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbDen.text")); //$NON-NLS-1$
        lbDen.setHorizontalAlignment(SwingConstants.CENTER);
        lbDen.setBounds(23, 36, 55, 16);
        panel.add(lbDen);

        lbMesiac = new JLabel(BUNDLE.getString("VyhladanieTrasyScreen.lbMesiac.text")); //$NON-NLS-1$
        lbMesiac.setHorizontalAlignment(SwingConstants.CENTER);
        lbMesiac.setBounds(158, 36, 55, 16);
        panel.add(lbMesiac);

        spinnerMesiac = new JSpinner();
        spinnerMesiac.setModel(new SpinnerListModel(new String[] {
                "Janu\u00E1r", "Febru\u00E1r", "Marec", "Apr\u00EDl", "M\u00E1j", "J\u00FAn",
                "J\u00FAl", "August", "September", "Okt\u00F3ber", "November", "December"
        }));
        spinnerMesiac.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinnerMesiac.setBounds(101, 52, 184, 72);
        panel.add(spinnerMesiac);

        bVyhladat = new JButton(BUNDLE.getString("VyhladanieTrasyScreen.bVyhladat.text")); //$NON-NLS-1$
        bVyhladat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String odkial = (String)comboBoxVychodiskova.getSelectedItem();
                String kam = (String)comboBoxCielova.getSelectedItem();
                int hash = odkial.hashCode() + kam.hashCode()
                        + new Boolean(rdbtnOdchod.isSelected()).hashCode()
                        + spinnerDen.getValue().hashCode() + spinnerHodina.getValue().hashCode()
                        + spinnerMinuta.getValue().hashCode() + spinnerMesiac.getValue().hashCode();
                NajdeneTrasyScreen scr = new NajdeneTrasyScreen(BUNDLE, odkial, kam, hash);
                scr.setVisible(true);
                VyhladanieTrasyScreen.this.dispose();
                VyhladanieTrasyScreen.this.setVisible(false);
            }
        });// aegf
        bVyhladat.setFont(new Font("Arial", Font.BOLD, 17));
        bVyhladat.setBounds(510, 399, 114, 49);
        contentPane.add(bVyhladat);

        bSpat = new JButton(BUNDLE.getString("VyhladanieTrasyScreen.bSpat.text")); //$NON-NLS-1$
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
                VyhladanieTrasyScreen.this.dispose();
                VyhladanieTrasyScreen.this.setVisible(false);
            }
        });
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setBounds(9, 399, 114, 49);
        contentPane.add(bSpat);

        pOdchodPrichod = new JPanel();
        pOdchodPrichod.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pOdchodPrichod.setBounds(6, 200, 621, 42);
        contentPane.add(pOdchodPrichod);
        pOdchodPrichod.setLayout(null);
        pOdchodPrichod.setBackground(new Color(255, 235, 205));

        rdbtnOdchod = new JRadioButton(BUNDLE.getString("VyhladanieTrasyScreen.rdbtnOdchod.text"));
        rdbtnOdchod.setSelected(true);
        rdbtnOdchod.setBounds(157, 9, 147, 18);
        pOdchodPrichod.add(rdbtnOdchod);
        rdbtnOdchod.setFont(new Font("Arial", Font.PLAIN, 22));

        rdbtnPrichod = new JRadioButton(BUNDLE.getString("VyhladanieTrasyScreen.rdbtnPrichod.text"));
        rdbtnPrichod.setBounds(349, 9, 147, 18);
        pOdchodPrichod.add(rdbtnPrichod);
        rdbtnPrichod.setFont(new Font("Arial", Font.PLAIN, 22));

        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnOdchod);
        group.add(rdbtnPrichod);

        // vycentrovanie okna na stred obrazovky
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension window = this.getSize();
        int x = (screen.width - window.width) / 2;
        int y = (screen.height - window.height) / 2;
        this.setLocation(x, y);

        initMesiace();
        spinnerMesiac.setModel(new SpinnerListModel(mesiace));
    }

    private void initMesiace() {
        mesiace = new String[] {

                BUNDLE.getString("HlavnaPonukaScreen.januar"),
                BUNDLE.getString("HlavnaPonukaScreen.februar"),
                BUNDLE.getString("HlavnaPonukaScreen.marec"),
                BUNDLE.getString("HlavnaPonukaScreen.april"),
                BUNDLE.getString("HlavnaPonukaScreen.maj"),
                BUNDLE.getString("HlavnaPonukaScreen.jun"),
                BUNDLE.getString("HlavnaPonukaScreen.jul"),
                BUNDLE.getString("HlavnaPonukaScreen.august"),
                BUNDLE.getString("HlavnaPonukaScreen.oktober"),
                BUNDLE.getString("HlavnaPonukaScreen.november"),
                BUNDLE.getString("HlavnaPonukaScreen.december"),
        };
    }

    public VyhladanieTrasyScreen(ResourceBundle rb, String zastavkaOdkial, String zastavkaKam) {
        this(rb);
        if (zastavkaOdkial != null) {
            // if
            // (Arrays.asList(HlavnaPonukaScreen.ZOZNAM_ZASTAVOK).contains(zastavkaOdkial)
            comboBoxCielova.setEditable(true);
            comboBoxVychodiskova.setEditable(true);
            comboBoxVychodiskova.setSelectedItem(zastavkaOdkial);
        }
        if (zastavkaKam != null) {
            comboBoxCielova.setEditable(true);
            comboBoxVychodiskova.setEditable(true);
            comboBoxCielova.setSelectedItem(zastavkaKam);
        }
    }
}
