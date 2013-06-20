package uonlineeditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultSingleSelectionModel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author m1kc, houjing
 */
public class MainFrame extends javax.swing.JFrame {

	private boolean aFileOpened = false;
	private boolean lFileOpened = false;
	private boolean areasChanged = false;
	private boolean locationsChanged = false;

	Areas areas = new Areas();
	AreasFile areasFile;
	LocationsFile locationsFile;

	String defaultTitle;

    /**
     * Creates new form MainFrame
     */
	public MainFrame() {
		initComponents();
		setLocation(400, 100);

		defaultTitle = getTitle();
		setUIModels();
		update();
	}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      MainTabbedPane = new javax.swing.JTabbedPane();
      AreasPanel = new javax.swing.JPanel();
      AddAreaButton = new javax.swing.JButton();
      RemoveAreaButton = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      AreasScrollPane = new javax.swing.JScrollPane();
      AreasTable = new javax.swing.JTable();
      LocationsPanel = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      AreasComboBox = new javax.swing.JComboBox();
      jLabel2 = new javax.swing.JLabel();
      LocationsComboBox = new javax.swing.JComboBox();
      AddLocationButton = new javax.swing.JButton();
      RemoveLocationButton = new javax.swing.JButton();
      RenameLocationButton = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      LocationDescriptionTextArea = new javax.swing.JTextArea();
      jLabel4 = new javax.swing.JLabel();
      LocationImageURLTextField = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      jScrollPane3 = new javax.swing.JScrollPane();
      WaysTable = new javax.swing.JTable();
      AddWayButton = new javax.swing.JButton();
      RemoveWayButton = new javax.swing.JButton();
      LoadAreasButton = new javax.swing.JButton();
      LoadLocationsButton = new javax.swing.JButton();
      SaveAreasButton = new javax.swing.JButton();
      SaveLocationsButton = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("uonline Editor");

      AddAreaButton.setText("Add");
      AddAreaButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            AddArea(evt);
         }
      });

      RemoveAreaButton.setText("Remove");
      RemoveAreaButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            RemoveArea(evt);
         }
      });

      jButton3.setText("Rename");

      AreasTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Зона", "id"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.Integer.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      AreasScrollPane.setViewportView(AreasTable);

      javax.swing.GroupLayout AreasPanelLayout = new javax.swing.GroupLayout(AreasPanel);
      AreasPanel.setLayout(AreasPanelLayout);
      AreasPanelLayout.setHorizontalGroup(
         AreasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(AreasPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(AreasScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(AreasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(RemoveAreaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(AddAreaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      AreasPanelLayout.setVerticalGroup(
         AreasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(AreasPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(AreasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(AreasPanelLayout.createSequentialGroup()
                  .addComponent(AreasScrollPane)
                  .addContainerGap())
               .addGroup(AreasPanelLayout.createSequentialGroup()
                  .addComponent(AddAreaButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(RemoveAreaButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton3)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
      );

      MainTabbedPane.addTab("Areas", AreasPanel);

      jLabel1.setText("Area:");

      jLabel2.setText("Location:");

      AddLocationButton.setText("Add");
      AddLocationButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            AddLocation(evt);
         }
      });

      RemoveLocationButton.setText("Remove");
      RemoveLocationButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            RemoveLocation(evt);
         }
      });

      RenameLocationButton.setText("Rename");
      RenameLocationButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            RenameLocation(evt);
         }
      });

      jLabel3.setText("Description:");

      LocationDescriptionTextArea.setColumns(20);
      LocationDescriptionTextArea.setLineWrap(true);
      LocationDescriptionTextArea.setRows(5);
      LocationDescriptionTextArea.setWrapStyleWord(true);
      jScrollPane2.setViewportView(LocationDescriptionTextArea);

      jLabel4.setText("Picture URL:");

      jLabel5.setText("Ways:");

      WaysTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Text", "Location"
         }
      ));
      jScrollPane3.setViewportView(WaysTable);

      AddWayButton.setText("Add");
      AddWayButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            AddWay(evt);
         }
      });

      RemoveWayButton.setText("Remove");
      RemoveWayButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            RemoveWay(evt);
         }
      });

      javax.swing.GroupLayout LocationsPanelLayout = new javax.swing.GroupLayout(LocationsPanel);
      LocationsPanel.setLayout(LocationsPanelLayout);
      LocationsPanelLayout.setHorizontalGroup(
         LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(LocationsPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(LocationsPanelLayout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(LocationImageURLTextField))
               .addComponent(jScrollPane2)
               .addGroup(LocationsPanelLayout.createSequentialGroup()
                  .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(RemoveWayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(AddWayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(LocationsPanelLayout.createSequentialGroup()
                  .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(AreasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(LocationsPanelLayout.createSequentialGroup()
                        .addComponent(LocationsComboBox, 0, 242, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddLocationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveLocationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RenameLocationButton))))
               .addGroup(LocationsPanelLayout.createSequentialGroup()
                  .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel5)
                     .addComponent(jLabel3))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      LocationsPanelLayout.setVerticalGroup(
         LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(LocationsPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(AreasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LocationsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2)
               .addComponent(RemoveLocationButton)
               .addComponent(AddLocationButton)
               .addComponent(RenameLocationButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(LocationImageURLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(LocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(LocationsPanelLayout.createSequentialGroup()
                  .addComponent(AddWayButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(RemoveWayButton))
               .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
            .addContainerGap())
      );

      MainTabbedPane.addTab("Locations", LocationsPanel);

      LoadAreasButton.setText("Load areas");
      LoadAreasButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LoadAreas(evt);
         }
      });

      LoadLocationsButton.setText("Load locations");
      LoadLocationsButton.setEnabled(false);
      LoadLocationsButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LoadLocations(evt);
         }
      });

      SaveAreasButton.setText("Save areas");
      SaveAreasButton.setEnabled(false);
      SaveAreasButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SaveAreas(evt);
         }
      });

      SaveLocationsButton.setText("Save locations");
      SaveLocationsButton.setEnabled(false);
      SaveLocationsButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SaveLocations(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(MainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(LoadAreasButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(LoadLocationsButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(SaveAreasButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(SaveLocationsButton)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(LoadAreasButton)
               .addComponent(LoadLocationsButton)
               .addComponent(SaveAreasButton)
               .addComponent(SaveLocationsButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(MainTabbedPane)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

	private void updateTitle() {
		switch(MainTabbedPane.getSelectedIndex()) {
			case 0:
				setTitle(defaultTitle + " - " + (areasFile!=null?areasFile.file.getAbsolutePath():"Unsaved") );
				break;
			case 1:
				setTitle(defaultTitle);
				break;
		}
	}

	private void updateButtons() {
		if (areas.areas.isEmpty()) {
			SaveAreasButton.setEnabled(false);
			SaveLocationsButton.setEnabled(false);
			LoadLocationsButton.setEnabled(false);
		}
		else {
			LoadLocationsButton.setEnabled(true);
			if (!areas.getLocations().isEmpty()) {
				SaveAreasButton.setEnabled(true);
				SaveLocationsButton.setEnabled(true);
			}
			else {
				SaveAreasButton.setEnabled(false);
				SaveLocationsButton.setEnabled(false);
			}
		}
	}

	private void update() {
		updateButtons();
		updateTitle();
	}

   private void LoadAreas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadAreas
		AreasFile af = new AreasFile(CommFile.OPEN);
		if (!af.approved) return;
		areasFile = af;
		areas = areasFile.getAreas();
		LoadLocationsButton.setEnabled(true);
		AreasTable.updateUI();
		AreasComboBox.updateUI();
		updateTitle();
   }//GEN-LAST:event_LoadAreas

	public Area getSelectedArea() {
		int row = AreasTable.getSelectedRow();
		if (row == -1 || row > areas.areas.size() - 1) return null;
		else return areas.areas.get(row);
	}

   private void LoadLocations(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLocations
		if ( !((javax.swing.JButton) evt.getSource()).isEnabled() ) return;

		LocationsFile lf = new LocationsFile(CommFile.OPEN);
		if (!lf.approved) return;
		locationsFile = lf;
		areas.attachLocations(locationsFile.getLocations());
		LocationsComboBox.updateUI();
		WaysTable.updateUI();
		update();
   }//GEN-LAST:event_LoadLocations

   private void AddArea(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddArea
		int sel = areas.addArea(AreasTable.getSelectedRow());
		AreasTable.setRowSelectionInterval(sel, sel);
		AreasTable.updateUI();
		AreasComboBox.updateUI();
		update();
   }//GEN-LAST:event_AddArea

   private void RemoveArea(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveArea
		int sel = areas.removeAreas(AreasTable.getSelectedRows());
		if (sel > -1) AreasTable.setRowSelectionInterval(sel, sel);
		AreasTable.updateUI();
		AreasComboBox.updateUI();
		update();
   }//GEN-LAST:event_RemoveArea

   private void SaveAreas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveAreas
		if ( !((javax.swing.JButton) evt.getSource()).isEnabled() ) return;

		AreasFile af;
		if (areasFile == null) {
			af = new AreasFile(CommFile.SAVE);
			if (!af.approved) return;
			areasFile = af;
		}
		areasFile.writeAreas(areas);
   }//GEN-LAST:event_SaveAreas

   private void SaveLocations(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveLocations
		if ( !((javax.swing.JButton) evt.getSource()).isEnabled() ) return;

		LocationsFile lf;
		if (locationsFile == null) {
			lf = new LocationsFile(CommFile.SAVE);
			if (!lf.approved) return;
			locationsFile = lf;
		}
		locationsFile.writeLocations(areas.getLocations());
   }//GEN-LAST:event_SaveLocations

   private void AddLocation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLocation
		if (getSelectedArea() == null) return;
		getSelectedArea().locs.addLocation();
		LocationsComboBox.updateUI();
		update();
   }//GEN-LAST:event_AddLocation

   private void RemoveLocation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveLocation
		if (getSelectedArea() == null) return;
		getSelectedArea().locs.removeLocation();
		LocationsComboBox.updateUI();
		update();
   }//GEN-LAST:event_RemoveLocation

   private void AddWay(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddWay
      if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
		int sel = getSelectedArea().locs.getSelected().ways.addWay(WaysTable.getSelectedRow());
		WaysTable.setRowSelectionInterval(sel, sel);
		WaysTable.updateUI();
   }//GEN-LAST:event_AddWay

   private void RemoveWay(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveWay
      if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
      int sel = getSelectedArea().locs.getSelected().ways.removeWays(WaysTable.getSelectedRows());
		if (sel > -1) WaysTable.setRowSelectionInterval(sel, sel);
		WaysTable.updateUI();
   }//GEN-LAST:event_RemoveWay

   private void RenameLocation(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RenameLocation
      if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
		LocationsComboBox.setEditable(true);
		LocationsComboBox.requestFocus(true);
   }//GEN-LAST:event_RenameLocation

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		*/
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				(new MainFrame()).setVisible(true);
			}
		});
	}

	final void setUIModels() {
		MainTabbedPane.setModel(new DefaultSingleSelectionModel() {
			@Override
			public void setSelectedIndex(int index) {
				super.setSelectedIndex(index);
				updateTitle();
			}
			@Override
			public int getSelectedIndex() {
				if (super.getSelectedIndex() == -1) super.setSelectedIndex(0);
				return super.getSelectedIndex();
			}

		});
		AreasTable.setModel(new DefaultTableModel() {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				switch(columnIndex){
					case 0:
						return String.class;
					case 1:
						return Integer.class;
					default:
						return null;
				}
			}

			@Override
			public int getColumnCount() {
				return 2;
			}

			@Override
			public String getColumnName(int columnIndex) {
				switch (columnIndex) {
					case Area.TITLE:
						return "Area";
					case Area.ID:
						return "id";
					default:
						return "";
				}
			}

			@Override
			public int getRowCount() {
				return areas.areas == null ? 0 : areas.areas.size();
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				return areas.areas.get(rowIndex).getParameter(columnIndex);
			}

			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return true;
			}

			@Override
			public void setValueAt(Object value, int rowIndex, int columnIndex) {
				areas.areas.get(rowIndex).setParameter(value, columnIndex);
			}
		});
		AreasTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				WaysTable.updateUI();
			}
		});
		WaysTable.setModel(new DefaultTableModel() {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				switch(columnIndex){
					case 0:
						return String.class;
					case 1:
						return Integer.class;
					default:
						return null;
				}
			}

			@Override
			public int getColumnCount() {
				return 2;
			}

			@Override
			public String getColumnName(int columnIndex) {
				switch (columnIndex) {
					case Way.TEXT:
						return "Text";
					case Way.LOCATION_ID:
						return "Location";
					default:
						return "";
				}
			}

			@Override
			public int getRowCount() {
				if(getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return 0;
				Ways ways = getSelectedArea().locs.getSelected().ways;
				return ways.wlist.size();
			}

			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				return getSelectedArea().locs.getSelected().ways.wlist.get(rowIndex).getParameter(columnIndex);
			}

			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return true;
			}

			@Override
			public void setValueAt(Object value, int rowIndex, int columnIndex) {
				getSelectedArea().locs.getSelected().ways.wlist.get(rowIndex).setParameter(value, columnIndex);
			}
		});
		AreasComboBox.setModel(new DefaultComboBoxModel() {

			@Override
			public Object getElementAt(int index) {
				return AreasTable.getValueAt(index, Area.TITLE);
			}

			@Override
			public int getSize() {
				return AreasTable.getRowCount();
			}

			@Override
			public Object getSelectedItem() {
				if (areas.areas.isEmpty()) return "<Empty>";
				int row = AreasTable.getSelectedRow();
				if (row == -1 || row > areas.areas.size() - 1) return "<Select area>";
				return AreasTable.getValueAt(row, Area.TITLE);
			}

			@Override
			public void setSelectedItem(Object anObject) {
				int ind = areas.getRowNumberOf(anObject, Area.TITLE);
				AreasTable.setRowSelectionInterval(ind, ind);
				LocationsComboBox.updateUI();
				WaysTable.updateUI();
			}
		});
		LocationsComboBox.setModel(new DefaultComboBoxModel() {

			@Override
			public void setSelectedItem(Object anItem) {
				if (getSelectedArea() == null)
					return;
				else {
					int sel = getSelectedArea().locs.getIndexOf(anItem, Location.TITLE);
					if (sel == -1) getSelectedArea().locs.getSelected().setParameter((String) anItem, Location.TITLE);
					else getSelectedArea().locs.selected = sel;
//					LocationTitleTextField.setText((String) anItem);
					LocationDescriptionTextArea.setText(getSelectedArea().locs.getSelected().description);
					LocationImageURLTextField.setText(getSelectedArea().locs.getSelected().imageURL);
				}
				WaysTable.updateUI();
			}

			@Override
			public Object getSelectedItem() {
				if (getSelectedArea() == null || getSelectedArea().locs == null || getSelectedArea().locs.locs.isEmpty()) {
//					LocationTitleTextField.setText("");
					LocationDescriptionTextArea.setText("");
					LocationImageURLTextField.setText("");
					return "<Empty>";
				}
				else {
					int sel = getSelectedArea().locs.selected;
					if (sel == -1) {
//						LocationTitleTextField.setText("");
						LocationDescriptionTextArea.setText("");
						LocationImageURLTextField.setText("");
						return "<Select location>";
					}
					else {
//						LocationTitleTextField.setText((String) getSelectedArea().locs.getSelected().title);
						LocationDescriptionTextArea.setText(getSelectedArea().locs.getSelected().description);
						LocationImageURLTextField.setText(getSelectedArea().locs.getSelected().imageURL);
						return getSelectedArea().locs.locs.get(sel).getParameter(Location.TITLE);
					}
				}
			}

			@Override
			public int getSize() {
				if (getSelectedArea() == null || getSelectedArea().locs == null) return 0;
				else return getSelectedArea().locs.locs.size();
			}

			@Override
			public Object getElementAt(int index) {
				return getSelectedArea().locs.locs.get(index).getParameter(Location.TITLE);
			}
		});
		LocationsComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LocationsComboBox.setEditable(false);
			}
		});
//		LocationTitleTextField.addCaretListener(new CaretListener() {
//			@Override
//			public void caretUpdate(CaretEvent e) {
//				if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
//				getSelectedArea().locs.getSelected().title = LocationTitleTextField.getText();
//			}
//		});
//		LocationTitleTextField.addCaretListener(new CaretListener() {
//			@Override
//			public void caretUpdate(CaretEvent e) {
//				if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
//				getSelectedArea().locs.getSelected().title = LocationTitleTextField.getText();
//			}
//		});
		LocationDescriptionTextArea.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent e) {
				if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
				getSelectedArea().locs.getSelected().description = LocationDescriptionTextArea.getText();
			}
		});
		LocationImageURLTextField.addCaretListener(new CaretListener() {
			@Override
			public void caretUpdate(CaretEvent e) {
				if (getSelectedArea() == null || getSelectedArea().locs.getSelected() == null) return;
				getSelectedArea().locs.getSelected().imageURL = LocationImageURLTextField.getText();
			}
		});
//		MainTabbedPane.setModel(null);
	}
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton AddAreaButton;
   private javax.swing.JButton AddLocationButton;
   private javax.swing.JButton AddWayButton;
   private javax.swing.JComboBox AreasComboBox;
   private javax.swing.JPanel AreasPanel;
   private javax.swing.JScrollPane AreasScrollPane;
   private javax.swing.JTable AreasTable;
   private javax.swing.JButton LoadAreasButton;
   private javax.swing.JButton LoadLocationsButton;
   private javax.swing.JTextArea LocationDescriptionTextArea;
   private javax.swing.JTextField LocationImageURLTextField;
   private javax.swing.JComboBox LocationsComboBox;
   private javax.swing.JPanel LocationsPanel;
   private javax.swing.JTabbedPane MainTabbedPane;
   private javax.swing.JButton RemoveAreaButton;
   private javax.swing.JButton RemoveLocationButton;
   private javax.swing.JButton RemoveWayButton;
   private javax.swing.JButton RenameLocationButton;
   private javax.swing.JButton SaveAreasButton;
   private javax.swing.JButton SaveLocationsButton;
   private javax.swing.JTable WaysTable;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   // End of variables declaration//GEN-END:variables
}
