package sk.fiit.kucsera_kovalcik.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VyhladanieTrasyScreen extends JFrame {

    private JPanel contentPane;
    private JLabel lbTitle;
    private JLabel lbCas;
    private JLabel lbDatum;
    private JLabel lbVchodiskovZastvka;
    private JButton bNewButton;
    private JPanel pVychodiskova;
    private JPanel pCielova;
    private JLabel lbCieovZastvka;
    private JButton button;
    private JPanel pCas;
    private JLabel lbasOdchodu;
    private JLabel lbHodina;
    private JLabel lbMinta;
    private JLabel label;
    private JPanel panel;
    private JLabel lbDtumOdchodu;
    private JLabel lbDe;
    private JLabel lbMesiac;
    private JButton bVyhada;
    private JButton bSp;

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
                    VyhladanieTrasyScreen frame = new VyhladanieTrasyScreen();
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
    public VyhladanieTrasyScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbTitle = new JLabel("Vyh\u013Eadanie trasy");
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
        
        lbCas = new JLabel("13:42:05");
        lbCas.setOpaque(true);
        lbCas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbCas.setFont(new Font("Arial", Font.PLAIN, 46));
        lbCas.setBounds(0, 0, 201, 65);
        lbCas.setBackground(new Color(255, 204, 153));
        contentPane.add(lbCas);
        
        lbDatum = new JLabel("<html><center>22. apr\u00EDl 2015<br>\r\nPondelok<br>\r\n22\u00B0C</center></html>");
        lbDatum.setOpaque(true);
        lbDatum.setHorizontalAlignment(SwingConstants.CENTER);
        lbDatum.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbDatum.setFont(new Font("Arial", Font.PLAIN, 17));
        lbDatum.setBounds(463, 0, 171, 65);
        lbDatum.setBackground(new Color(255, 204, 153));
        contentPane.add(lbDatum);
        
        pVychodiskova = new JPanel();
        pVychodiskova.setBackground(new Color(255, 235, 205));
        pVychodiskova.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pVychodiskova.setBounds(6, 77, 308, 109);
        contentPane.add(pVychodiskova);
        pVychodiskova.setLayout(null);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(0, 43, 237, 47);
        pVychodiskova.add(comboBox);
        comboBox.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ag\u00E1tov\u00E1", "Alexyho", "Astronomick\u00E1", "Aupark", "Autobusov\u00E1 stanica", "Avion", "Bajkalsk\u00E1", "Botanick\u00E1 z\u00E1hrada", "Chatam S\u00F3fer", "Cintor\u00EDn Sl\u00E1v. \u00FAdolie", "\u010Cunovo", "Gagarinova", "Kop\u010Dany", "Lafranconi", "Ra\u010Dianske m\u00FDto", "SAV", "S\u00FAhvezdn\u00E1", "\u0160pit\u00E1lska", "Telev\u00EDzia", "Trnavsk\u00E9 m\u00FDto", "Vazovova", "Zochova", "\u017DST Nov\u00E9 Mesto"}));
        comboBox.setSelectedIndex(21);
        
        lbVchodiskovZastvka = new JLabel("V\u00FDchodiskov\u00E1 zast\u00E1vka:");
        lbVchodiskovZastvka.setBounds(6, 6, 232, 26);
        pVychodiskova.add(lbVchodiskovZastvka);
        lbVchodiskovZastvka.setFont(new Font("Arial", Font.PLAIN, 22));
        
        bNewButton = new JButton("");
        bNewButton.setBounds(237, 42, 65, 48);
        pVychodiskova.add(bNewButton);
        bNewButton.setIcon(new ImageIcon(VyhladanieTrasyScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/icon_map.gif")));
        
        pCielova = new JPanel();
        pCielova.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pCielova.setLayout(null);
        pCielova.setBackground(new Color(255, 235, 205));
        pCielova.setBounds(318, 77, 310, 109);
        contentPane.add(pCielova);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ag\u00E1tov\u00E1", "Alexyho", "Astronomick\u00E1", "Aupark", "Autobusov\u00E1 stanica", "Avion", "Bajkalsk\u00E1", "Botanick\u00E1 z\u00E1hrada", "Chatam S\u00F3fer", "Cintor\u00EDn Sl\u00E1v. \u00FAdolie", "\u010Cunovo", "Gagarinova", "Kop\u010Dany", "Lafranconi", "Ra\u010Dianske m\u00FDto", "SAV", "S\u00FAhvezdn\u00E1", "\u0160pit\u00E1lska", "Telev\u00EDzia", "Trnavsk\u00E9 m\u00FDto", "Vazovova", "Zochova", "\u017DST Nov\u00E9 Mesto"}));
        comboBox_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBox_1.setBounds(0, 43, 237, 47);
        pCielova.add(comboBox_1);
        
        lbCieovZastvka = new JLabel("Cie\u013Eov\u00E1 zast\u00E1vka:");
        lbCieovZastvka.setFont(new Font("Arial", Font.PLAIN, 22));
        lbCieovZastvka.setBounds(6, 6, 232, 26);
        pCielova.add(lbCieovZastvka);
        
        button = new JButton("");
        button.setIcon(new ImageIcon(VyhladanieTrasyScreen.class.getResource("/sk/fiit/kucsera_kovalcik/icp/ismhd/icon_map.gif")));
        button.setBounds(239, 42, 65, 48);
        pCielova.add(button);
        
        pCas = new JPanel();
        pCas.setBackground(new Color(255, 235, 205));
        pCas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        pCas.setBounds(6, 189, 308, 132);
        contentPane.add(pCas);
        pCas.setLayout(null);
        
        JSpinner spinner = new JSpinner();
        spinner.setModel(new SpinnerNumberModel(13, 0, 23, 1));
        spinner.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinner.setBounds(70, 52, 75, 72);
        pCas.add(spinner);
        
        lbasOdchodu = new JLabel("\u010Cas odchodu:");
        lbasOdchodu.setFont(new Font("Arial", Font.PLAIN, 22));
        lbasOdchodu.setBounds(6, 6, 232, 26);
        pCas.add(lbasOdchodu);
        
        lbHodina = new JLabel("hodina");
        lbHodina.setHorizontalAlignment(SwingConstants.CENTER);
        lbHodina.setBounds(70, 39, 55, 16);
        pCas.add(lbHodina);
        
        lbMinta = new JLabel("min\u00FAta");
        lbMinta.setHorizontalAlignment(SwingConstants.CENTER);
        lbMinta.setBounds(152, 39, 55, 16);
        pCas.add(lbMinta);
        
        JSpinner spinner_1 = new JSpinner();
        spinner_1.setModel(new SpinnerNumberModel(43, 0, 59, 1));
        spinner_1.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinner_1.setBounds(152, 52, 75, 72);
        pCas.add(spinner_1);
        
        label = new JLabel(":");
        label.setFont(new Font("SansSerif", Font.PLAIN, 31));
        label.setBounds(143, 73, 9, 27);
        pCas.add(label);
        
        panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        panel.setLayout(null);
        panel.setBackground(new Color(255, 235, 205));
        panel.setBounds(318, 189, 308, 132);
        contentPane.add(panel);
        
        JSpinner spinner_2 = new JSpinner();
        spinner_2.setModel(new SpinnerNumberModel(22, 1, 31, 1));
        spinner_2.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinner_2.setBounds(20, 52, 75, 72);
        panel.add(spinner_2);
        
        lbDtumOdchodu = new JLabel("D\u00E1tum odchodu:");
        lbDtumOdchodu.setFont(new Font("Arial", Font.PLAIN, 22));
        lbDtumOdchodu.setBounds(6, 6, 232, 26);
        panel.add(lbDtumOdchodu);
        
        lbDe = new JLabel("de\u0148");
        lbDe.setHorizontalAlignment(SwingConstants.CENTER);
        lbDe.setBounds(23, 39, 55, 16);
        panel.add(lbDe);
        
        lbMesiac = new JLabel("mesiac");
        lbMesiac.setHorizontalAlignment(SwingConstants.CENTER);
        lbMesiac.setBounds(158, 39, 55, 16);
        panel.add(lbMesiac);
        
        JSpinner spinner_3 = new JSpinner();
        spinner_3.setModel(new SpinnerListModel(new String[] {"Janu\u00E1r", "Febru\u00E1r", "Marec", "Apr\u00EDl", "M\u00E1j", "J\u00FAn", "J\u00FAl", "August", "September", "Okt\u00F3ber", "November", "December"}));
        spinner_3.setFont(new Font("SansSerif", Font.PLAIN, 31));
        spinner_3.setBounds(101, 52, 184, 72);
        panel.add(spinner_3);
        
        bVyhada = new JButton("Vyh\u013Eada\u0165");
        bVyhada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieTrasyScreen.this.dispose();
                VyhladanieTrasyScreen.this.setVisible(false);
                NajdeneTrasyScreen scr = new NajdeneTrasyScreen();
                scr.setVisible(true);
            }
        });
        bVyhada.setFont(new Font("Arial", Font.BOLD, 17));
        bVyhada.setBounds(510, 399, 114, 49);
        contentPane.add(bVyhada);
        
        bSp = new JButton("Sp\u00E4\u0165");
        bSp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieTrasyScreen.this.dispose();
                VyhladanieTrasyScreen.this.setVisible(false);
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
            }
        });
        bSp.setFont(new Font("Arial", Font.BOLD, 17));
        bSp.setBounds(9, 399, 114, 49);
        contentPane.add(bSp);
    }
}
