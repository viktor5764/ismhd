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

public class VyhladanieCpScreen extends JFrame {

    private JPanel contentPane;
    private JLabel lbTitle;
    private JLabel lbCas;
    private JLabel lbDatum;
    private JLabel lbVchodiskovZastvka;
    private JButton bVyhada;
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
                    VyhladanieCpScreen frame = new VyhladanieCpScreen();
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
    public VyhladanieCpScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbTitle = new JLabel("Cestovn\u00E9 poriadky");
        lbTitle.setOpaque(true);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitle.setForeground(Color.BLUE);
        lbTitle.setFont(new Font("Arial", Font.PLAIN, 28));
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
        
        bVyhada = new JButton("Vyh\u013Eada\u0165");
        bVyhada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieCpScreen.this.dispose();
                VyhladanieCpScreen.this.setVisible(false);
                ZobrazenieCpScreen scr = new ZobrazenieCpScreen();
                scr.setVisible(true);
            }
        });
        bVyhada.setFont(new Font("Arial", Font.BOLD, 17));
        bVyhada.setBounds(514, 399, 114, 49);
        contentPane.add(bVyhada);
        
        bSp = new JButton("Sp\u00E4\u0165");
        bSp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VyhladanieCpScreen.this.dispose();
                VyhladanieCpScreen.this.setVisible(false);
                HlavnaPonukaScreen scr = new HlavnaPonukaScreen();
                scr.setVisible(true);
            }
        });
        bSp.setFont(new Font("Arial", Font.BOLD, 17));
        bSp.setBounds(9, 399, 114, 49);
        contentPane.add(bSp);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(223, 115, 237, 47);
        contentPane.add(comboBox_1);
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "9", "10", "39", "119", "N31", "N34"}));
        comboBox_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(223, 328, 237, 47);
        contentPane.add(comboBox);
        comboBox.setFont(new Font("SansSerif", Font.PLAIN, 18));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ag\u00E1tov\u00E1", "Alexyho", "Astronomick\u00E1", "Aupark", "Autobusov\u00E1 stanica", "Avion", "Bajkalsk\u00E1", "Botanick\u00E1 z\u00E1hrada", "Chatam S\u00F3fer", "Cintor\u00EDn Sl\u00E1v. \u00FAdolie", "\u010Cunovo", "Gagarinova", "Kop\u010Dany", "Lafranconi", "Ra\u010Dianske m\u00FDto", "SAV", "S\u00FAhvezdn\u00E1", "\u0160pit\u00E1lska", "Telev\u00EDzia", "Trnavsk\u00E9 m\u00FDto", "Vazovova", "Zochova", "\u017DST Nov\u00E9 Mesto"}));
        comboBox.setSelectedIndex(21);
        
        lbVchodiskovZastvka = new JLabel("Linka:");
        lbVchodiskovZastvka.setHorizontalAlignment(SwingConstants.LEFT);
        lbVchodiskovZastvka.setBounds(223, 78, 237, 26);
        contentPane.add(lbVchodiskovZastvka);
        lbVchodiskovZastvka.setFont(new Font("Arial", Font.PLAIN, 22));
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 235, 205));
        panel.setBorder(new TitledBorder(null, "Smer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(223, 186, 237, 96);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JRadioButton rdbtnTrnavskMto = new JRadioButton("Trnavsk\u00E9 m\u00FDto");
        rdbtnTrnavskMto.setSelected(true);
        rdbtnTrnavskMto.setBounds(16, 27, 112, 18);
        panel.add(rdbtnTrnavskMto);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Cintor\u00EDn Sl\u00E1v. \u00FAdolie");
        rdbtnNewRadioButton.setBounds(16, 57, 145, 18);
        panel.add(rdbtnNewRadioButton);
        
        JLabel lblZoZastvky = new JLabel("Zo zast\u00E1vky:");
        lblZoZastvky.setHorizontalAlignment(SwingConstants.LEFT);
        lblZoZastvky.setFont(new Font("Arial", Font.PLAIN, 22));
        lblZoZastvky.setBounds(222, 295, 208, 26);
        contentPane.add(lblZoZastvky);
    }
}
