package sk.fiit.kk.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;
import java.util.ResourceBundle;

public class VyhladanieCpScreen extends JFrame {
    private static ResourceBundle BUNDLE = ResourceBundle.getBundle("sk.fiit.kk.icp.ismhd.gui.stop.messages_SK"); //$NON-NLS-1$

    private JPanel contentPane;
    private JLabel lbTitleCestovnePoriadky;
    private JLabel lbCas;
    private JLabel lbDatumDenTeplota;
    private JLabel lbLinka;
    private JButton bVyhladat;
    private JButton bSpat;
    private TitledBorder tbDestBorder;

    private JComboBox comboBoxLinka;

    private JComboBox comboBoxZoZastavky;

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
                    VyhladanieCpScreen frame = new VyhladanieCpScreen(BUNDLE);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * @param rb 
     */
    public VyhladanieCpScreen(ResourceBundle rb) {
        this.BUNDLE = rb;
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbTitleCestovnePoriadky = new JLabel(BUNDLE.getString("VyhladanieCpScreen.lbTitleCestovnePoriadky.text")); //$NON-NLS-1$
        lbTitleCestovnePoriadky.setOpaque(true);
        lbTitleCestovnePoriadky.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitleCestovnePoriadky.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitleCestovnePoriadky.setForeground(Color.BLUE);
        lbTitleCestovnePoriadky.setFont(new Font("Arial", Font.PLAIN, 28));
        lbTitleCestovnePoriadky.setBorder(new LineBorder(Color.BLUE, 2));
        lbTitleCestovnePoriadky.setBackground(Color.WHITE);
        lbTitleCestovnePoriadky.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbTitleCestovnePoriadky.setBounds(204, 0, 256, 65);
        contentPane.add(lbTitleCestovnePoriadky);
        
        lbCas = new JLabel("13:42:05");
        lbCas.setOpaque(true);
        lbCas.setBackground(new Color(255, 204, 153));
        lbCas.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbCas.setFont(new Font("Arial", Font.PLAIN, 46));
        lbCas.setBounds(0, 0, 201, 65);
        contentPane.add(lbCas);
        
        lbDatumDenTeplota = new JLabel(BUNDLE.getString("VyhladanieCpScreen.lbDatumDenTeplota.text")); //$NON-NLS-1$
        lbDatumDenTeplota.setBackground(new Color(255, 204, 153));
        lbDatumDenTeplota.setOpaque(true);
        lbDatumDenTeplota.setHorizontalAlignment(SwingConstants.CENTER);
        lbDatumDenTeplota.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbDatumDenTeplota.setFont(new Font("Arial", Font.PLAIN, 17));
        lbDatumDenTeplota.setBounds(463, 0, 171, 65);
        contentPane.add(lbDatumDenTeplota);
        
        bVyhladat = new JButton(BUNDLE.getString("VyhladanieCpScreen.bVyhladat.text")); //$NON-NLS-1$
        bVyhladat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieCpScreen.this.dispose();
                VyhladanieCpScreen.this.setVisible(false);
                ZobrazenieCpScreen scr = new ZobrazenieCpScreen(BUNDLE);
                scr.setVisible(true);
            }
        });
        bVyhladat.setFont(new Font("Arial", Font.BOLD, 17));
        bVyhladat.setBounds(514, 399, 114, 49);
        contentPane.add(bVyhladat);
        
        bSpat = new JButton(BUNDLE.getString("VyhladanieCpScreen.bSpat.text")); //$NON-NLS-1$
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieCpScreen.this.dispose();
                VyhladanieCpScreen.this.setVisible(false);
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
            }
        });
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setBounds(9, 399, 114, 49);
        contentPane.add(bSpat);
        
        comboBoxLinka = new JComboBox();
        comboBoxLinka.setBounds(223, 115, 237, 47);
        contentPane.add(comboBoxLinka);
        comboBoxLinka.setModel(new DefaultComboBoxModel(HlavnaPonukaScreen.ZOZNAM_LINIEK));//new String[] {"1", "2", "3", "4", "5", "11", "12", "13", "14", "15", "19", "30", "31", "32", "37", "38", "39", "46", "48", "51", "60", "80", "83", "84", "93", "131", "139", "202", "206", "208", "210", "N31", "N93", "N208"}));
        comboBoxLinka.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBoxLinka.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED)
                    return;
                VyhladanieCpScreen.this.fillZastavkyComboBox((String)comboBoxLinka.getSelectedItem());
                
            }
        });
        
        comboBoxZoZastavky = new JComboBox();
        comboBoxZoZastavky.setBounds(223, 328, 237, 47);
        contentPane.add(comboBoxZoZastavky);
        comboBoxZoZastavky.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBoxZoZastavky.setModel(new DefaultComboBoxModel(HlavnaPonukaScreen.ZOZNAM_ZASTAVOK));//new String[] {"Ag\u00E1tov\u00E1", "Alexyho", "Astronomick\u00E1", "Aupark", "Autobusov\u00E1 stanica", "Avion", "Bajkalsk\u00E1", "Botanick\u00E1 z\u00E1hrada", "Chatam S\u00F3fer", "Cintor\u00EDn Sl\u00E1v. \u00FAdolie", "\u010Cunovo", "Gagarinova", "Kop\u010Dany", "Lafranconi", "Ra\u010Dianske m\u00FDto", "SAV", "S\u00FAhvezdn\u00E1", "\u0160pit\u00E1lska", "Telev\u00EDzia", "Trnavsk\u00E9 m\u00FDto", "Vazovova", "Zochova", "\u017DST Nov\u00E9 Mesto"}));
        comboBoxZoZastavky.setSelectedIndex(0);
        
        lbLinka = new JLabel(BUNDLE.getString("VyhladanieCpScreen.lbLinka.text")); //$NON-NLS-1$
        lbLinka.setHorizontalAlignment(SwingConstants.LEFT);
        lbLinka.setBounds(223, 78, 237, 26);
        contentPane.add(lbLinka);
        lbLinka.setFont(new Font("Arial", Font.PLAIN, 22));
        
        tbDestBorder = new TitledBorder(null, BUNDLE.getString("VyhladanieCpScreen.tbDestBorder.text"), TitledBorder.LEADING, TitledBorder.TOP, null, null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 235, 205));
        panel.setBorder(tbDestBorder);
        panel.setBounds(223, 186, 237, 96);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JRadioButton rdbtnSmer1 = new JRadioButton("Trnavsk\u00E9 m\u00FDto");
        rdbtnSmer1.setSelected(true);
        rdbtnSmer1.setBounds(16, 27, 112, 18);
        panel.add(rdbtnSmer1);
        
        JRadioButton rdbtnSmer2 = new JRadioButton("Cintor\u00EDn Sl\u00E1v. \u00FAdolie");
        rdbtnSmer2.setBounds(16, 57, 145, 18);
        panel.add(rdbtnSmer2);
        
        JLabel lbZoZastavky = new JLabel(BUNDLE.getString("VyhladanieCpScreen.lbZoZastavky.text")); //$NON-NLS-1$
        lbZoZastavky.setHorizontalAlignment(SwingConstants.LEFT);
        lbZoZastavky.setFont(new Font("Arial", Font.PLAIN, 22));
        lbZoZastavky.setBounds(222, 295, 208, 26);
        contentPane.add(lbZoZastavky);
    }

    private void fillZastavkyComboBox(String linkaName) {
            int hash = linkaName.hashCode();
            Random rand = new Random(hash);
            int pocetZastavok = rand.nextInt(HlavnaPonukaScreen.ZOZNAM_ZASTAVOK.length);
            
    };
}
