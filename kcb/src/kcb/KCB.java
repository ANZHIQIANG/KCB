package kcb;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class KCB {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new KCBData());
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
		 
		cr.setHorizontalAlignment(JLabel.CENTER);
		 
		//hr.setHorizontalAlignment(SwingConstants.CENTER);
		 
		table.setDefaultRenderer(Object.class, cr);
		frame.pack();
		frame.setVisible(true);

	}

}
