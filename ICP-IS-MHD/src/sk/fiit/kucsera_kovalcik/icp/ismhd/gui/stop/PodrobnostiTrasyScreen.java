package sk.fiit.kucsera_kovalcik.icp.ismhd.gui.stop;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.GridLayout;
import javax.swing.border.EtchedBorder;

public class PodrobnostiTrasyScreen extends JFrame {

    private JPanel contentPane;
    private JLabel lbZochova;
    private JLabel label;
    private JLabel lbNewLabel;
    private JButton bSpat;
    private JTable table;
    private JLabel lbZochovast;
    private JPanel panel;
    private JLabel lbDtum;
    private JLabel label_1;
    private JLabel lbas;
    private JLabel label_2;
    private JLabel lbTrvanie;
    private JLabel lbMint;
    private JLabel lbTrasa;
    private JLabel lbPodrobnosti;

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
                    PodrobnostiTrasyScreen frame = new PodrobnostiTrasyScreen();
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
    public PodrobnostiTrasyScreen() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 640, 480);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 235, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        lbZochova = new JLabel("Detaily spojenia");
        lbZochova.setOpaque(true);
        lbZochova.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochova.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochova.setForeground(Color.BLUE);
        lbZochova.setFont(new Font("Arial", Font.PLAIN, 36));
        lbZochova.setBorder(new LineBorder(Color.BLUE, 2));
        lbZochova.setBackground(Color.WHITE);
        lbZochova.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbZochova.setBounds(204, 0, 256, 65);
        contentPane.add(lbZochova);
        
        label = new JLabel("13:42:05");
        label.setOpaque(true);
        label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        label.setFont(new Font("Arial", Font.PLAIN, 46));
        label.setBounds(0, 0, 201, 65);
        label.setBackground(new Color(255, 204, 153));
        contentPane.add(label);
        
        lbNewLabel = new JLabel("<html><center>22. apr\u00EDl 2015<br>\r\nPondelok<br>\r\n22\u00B0C</center></html>");
        lbNewLabel.setOpaque(true);
        lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lbNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        lbNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
        lbNewLabel.setBounds(463, 0, 171, 65);
        lbNewLabel.setBackground(new Color(255, 204, 153));
        contentPane.add(lbNewLabel);
        
        bSpat = new JButton("<html><center>Sp\u00E4\u0165<br></center></html>");
        bSpat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PodrobnostiTrasyScreen.this.dispose();
                PodrobnostiTrasyScreen.this.setVisible(false);
                VyhladanieTrasyScreen scr = new VyhladanieTrasyScreen();
                scr.setVisible(true);
            }
        });
        bSpat.setHorizontalTextPosition(SwingConstants.CENTER);
        bSpat.setFont(new Font("Arial", Font.BOLD, 17));
        bSpat.setAlignmentX(0.5f);
        bSpat.setBounds(9, 399, 114, 49);
        contentPane.add(bSpat);
        
        table = new JTable(){
            private TableCellRenderer renderer = new CenteredTableCellRenderer();
            

           /* @Override
            public TableCellRenderer getCellRenderer(int row, int column) {
                return renderer;
            }
            
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                //paintEmptyRows(g);
            }*/

            /**
             * Paints the backgrounds of the implied empty rows when the
             * table model is insufficient to fill all the visible area
             * available to us. We don't involve cell renderers, because
             * we have no data.
             */
            protected void paintEmptyRows(Graphics g) {
                final int rowCount = getRowCount();
                final Rectangle clip = g.getClipBounds();
                if (rowCount * rowHeight < clip.height) {
                    for (int i = rowCount; i <= clip.height/rowHeight; ++i) {
                        g.setColor(colorForRow(i));
                        g.fillRect(clip.x, i * rowHeight, clip.width, rowHeight);
                    }
                }
            }

            /**
             * Changes the behavior of a table in a JScrollPane to be more like
             * the behavior of JList, which expands to fill the available space.
             * JTable normally restricts its size to just what's needed by its
             * model.
             */
            @Override
            public boolean getScrollableTracksViewportHeight() {
                if (getParent() instanceof JViewport) {
                    JViewport parent = (JViewport) getParent();
                    return (parent.getHeight() > getPreferredSize().height);
                }
                return false;
            }

            /**
             * Returns the appropriate background color for the given row.
             */
            protected Color colorForRow(int row) {
                return (row % 2 == 0) ? Color.WHITE : getBackground();
            }

            /**
             * Shades alternate rows in different colors.
             */
            /*@Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (isCellSelected(row, column) == false) {
                    c.setBackground(colorForRow(row));
                    c.setForeground(UIManager.getColor("Table.foreground"));
                } else {
                    c.setBackground(Color.BLUE);
                    c.setForeground(Color.WHITE);
                    //c.setBackground(UIManager.getColor("Table.selectionBackground"));
                    //c.setForeground(UIManager.getColor("Table.selectionForeground"));
                }
                return c;
            }*/
        };
        table.setRowMargin(2);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setFocusable(false);
        table.setRequestFocusEnabled(false);
        table.setRowHeight(22);
        table.setBackground(new Color(255, 204, 153));
        table.setBorder(new LineBorder(Color.BLUE, 2, true));
        table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {"<html><b>linka 31</b></html>", "smer Ra\u010Dianske m\u00FDto"},
                {null, "<html><b>14:00 - Zochova</b></html>"},
                {null, "   (3 zast\u00E1vky, 13 min)"},
                {null, "<html><b>14:13 - Vazovova</b></html>"},
                {null, null},
                {"<html><b>linka 50</b></html>", "smer Nov\u00E9 Mesto"},
                {null, "<html><b>14:14 - Vazovova</b></html>"},
                {null, "   (6 zast\u00E1vok, 15 min)"},
                {null, "<html><b>14:29 - \u017DST Nov\u00E9 Mesto</b></html>"},
            },
            new String[] {
                "New column", "New column"
            }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(73);
        table.getColumnModel().getColumn(1).setPreferredWidth(166);
        table.setBounds(295, 144, 332, 243);
        contentPane.add(table);
        
        lbZochovast = new JLabel("Zochova \u2192 \u017DST Nov\u00E9 Mesto");
        lbZochovast.setForeground(Color.BLUE);
        lbZochovast.setFont(new Font("Arial", Font.BOLD, 27));
        lbZochovast.setHorizontalTextPosition(SwingConstants.CENTER);
        lbZochovast.setHorizontalAlignment(SwingConstants.CENTER);
        lbZochovast.setBounds(9, 78, 597, 31);
        contentPane.add(lbZochovast);
        
        panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel.setBackground(new Color(255, 204, 153));
        panel.setBounds(9, 142, 285, 116);
        contentPane.add(panel);
        panel.setLayout(new GridLayout(0, 2, 0, 0));
        
        lbDtum = new JLabel("D\u00E1tum:");
        lbDtum.setFont(new Font("SansSerif", Font.PLAIN, 18));
        panel.add(lbDtum);
        
        label_1 = new JLabel("22.4.2015");
        label_1.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel.add(label_1);
        
        lbas = new JLabel("\u010Cas:");
        lbas.setFont(new Font("SansSerif", Font.PLAIN, 18));
        panel.add(lbas);
        
        label_2 = new JLabel("14:00 - 14:29");
        label_2.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel.add(label_2);
        
        lbTrvanie = new JLabel("Trvanie:");
        lbTrvanie.setFont(new Font("SansSerif", Font.PLAIN, 18));
        panel.add(lbTrvanie);
        
        lbMint = new JLabel("29 min\u00FAt");
        lbMint.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel.add(lbMint);
        
        lbTrasa = new JLabel("Trasa:");
        lbTrasa.setFont(new Font("Arial", Font.PLAIN, 22));
        lbTrasa.setBounds(295, 121, 141, 16);
        contentPane.add(lbTrasa);
        
        lbPodrobnosti = new JLabel("Podrobnosti:");
        lbPodrobnosti.setFont(new Font("Arial", Font.PLAIN, 22));
        lbPodrobnosti.setBounds(9, 121, 141, 16);
        contentPane.add(lbPodrobnosti);
    }
    
    private class CenteredTableCellRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel renderedLabel = (JLabel) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);
                renderedLabel.setHorizontalAlignment(SwingConstants.CENTER);
                return renderedLabel;
        }
    }
}
