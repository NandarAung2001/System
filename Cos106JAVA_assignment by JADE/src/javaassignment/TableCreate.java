/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class TableCreate extends javax.swing.JFrame {

    /**
     * Creates new form DataDef
     */
    public TableCreate() {
        initComponents();
        
        fullpanel.setVisible(true);
        titlePanel.setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        panel7.setVisible(false);
        
    }
    
    private String[] OneData()
    {
        String cName = txtCol1.getText();
        String type = cboColumn1.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull1.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk1.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        String[] Data = {cName,type,aNull,pKey};
        return Data;
    }
    
    private String[] TwoData()
    {
        String cName = txtCol2.getText();
        String type = cboCol2.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull2.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk2.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        int local = 4;
        String[] previous = OneData();
        String[] current = {cName,type,aNull,pKey};
        String[] result = new String[previous.length+current.length];
        System.arraycopy(previous,0,result,0,previous.length);
        System.arraycopy(current,0,result,local,current.length);
        return result;
    }
    
    private String[] ThreeData()
    {
        String cName = txtCol3.getText();
        String type = cboCol3.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull3.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk3.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        int local = 8;
        String[] previous = TwoData();
        String[] current = {cName,type,aNull,pKey};
        String[] result = new String[previous.length+current.length];
        System.arraycopy(previous,0,result,0,previous.length);
        System.arraycopy(current,0,result,local,current.length);
        return result;
    }
    
    private String[] FourData()
    {
        String cName = txtCol4.getText();
        String type = cboCol4.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull4.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk4.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        int local = 12;
        String[] previous = ThreeData();
        String[] current = {cName,type,aNull,pKey};
        String[] result = new String[previous.length+current.length];
        System.arraycopy(previous,0,result,0,previous.length);
        System.arraycopy(current,0,result,local,current.length);
        return result;
    }
    
    private String[] FiveData()
    {
        String cName = txtCol5.getText();
        String type = cboCol5.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull5.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk5.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        int local = 16;
        String[] previous = FourData();
        String[] current = {cName,type,aNull,pKey};
        String[] result = new String[previous.length+current.length];
        System.arraycopy(previous,0,result,0,previous.length);
        System.arraycopy(current,0,result,local,current.length);
        return result;
    }
    
    private String[] SixData()
    {
        String cName = txtCol6.getText();
        String type = cboCol6.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull6.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk6.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        int local = 20;
        String[] previous = FiveData();
        String[] current = {cName,type,aNull,pKey};
        String[] result = new String[previous.length+current.length];
        System.arraycopy(previous,0,result,0,previous.length);
        System.arraycopy(current,0,result,local,current.length);
        return result;
    }
    
    private String[] SevenData()
    {
        String cName = txtCol7.getText();
        String type = cboCol7.getSelectedItem().toString();
        String aNull;
        String pKey;
        if(chkNull7.isSelected())
        {
            aNull = "NULL";
        }
        else 
        {
            aNull = "NOT NULL";
        }
        if(chkPk7.isSelected())
        {
            pKey = "Primary Key";
        }
        else
        {
            pKey = "";
        }
        int local = 24;
        String[] previous = SixData();
        String[] current = {cName,type,aNull,pKey};
        String[] result = new String[previous.length+current.length];
        System.arraycopy(previous,0,result,0,previous.length);
        System.arraycopy(current,0,result,local,current.length);
        return result;
    }
    
    private void oneRow()
    {
        txtCol1.setText("");
        cboColumn1.setSelectedIndex(0);
        chkNull1.setSelected(false);
        chkPk1.setSelected(false);
    }
    private void twoRow()
    {
        txtCol2.setText("");
        cboCol2.setSelectedIndex(0);
        chkNull2.setSelected(false);
        chkPk2.setSelected(false);
    }
    private void threeRow()
    {
        txtCol3.setText("");
        cboCol3.setSelectedIndex(0);
        chkNull3.setSelected(false);
        chkPk3.setSelected(false);
    }
    private void fourRow()
    {
        txtCol4.setText("");
        cboCol4.setSelectedIndex(0);
        chkNull4.setSelected(false);
        chkPk4.setSelected(false);
    }
    private void fiveRow()
    {
        txtCol5.setText("");
        cboCol5.setSelectedIndex(0);
        chkNull5.setSelected(false);
        chkPk5.setSelected(false);
    }
    private void sixRow()
    {
        txtCol6.setText("");
        cboCol6.setSelectedIndex(0);
        chkNull6.setSelected(false);
        chkPk6.setSelected(false);
    }
    private void sevenRow()
    {
        txtCol7.setText("");
        cboCol7.setSelectedIndex(0);
        chkNull7.setSelected(false);
        chkPk7.setSelected(false);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fullpanel = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboColumn1 = new javax.swing.JComboBox();
        txtCol1 = new javax.swing.JTextField();
        chkNull1 = new javax.swing.JCheckBox();
        chkPk1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtTable = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboCol = new javax.swing.JComboBox();
        panel2 = new javax.swing.JPanel();
        cboCol2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtCol2 = new javax.swing.JTextField();
        chkNull2 = new javax.swing.JCheckBox();
        chkPk2 = new javax.swing.JCheckBox();
        panel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCol3 = new javax.swing.JTextField();
        cboCol3 = new javax.swing.JComboBox();
        chkNull3 = new javax.swing.JCheckBox();
        chkPk3 = new javax.swing.JCheckBox();
        panel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCol4 = new javax.swing.JTextField();
        cboCol4 = new javax.swing.JComboBox();
        chkNull4 = new javax.swing.JCheckBox();
        chkPk4 = new javax.swing.JCheckBox();
        panel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCol5 = new javax.swing.JTextField();
        cboCol5 = new javax.swing.JComboBox();
        chkNull5 = new javax.swing.JCheckBox();
        chkPk5 = new javax.swing.JCheckBox();
        panel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCol6 = new javax.swing.JTextField();
        cboCol6 = new javax.swing.JComboBox();
        chkNull6 = new javax.swing.JCheckBox();
        chkPk6 = new javax.swing.JCheckBox();
        panel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCol7 = new javax.swing.JTextField();
        cboCol7 = new javax.swing.JComboBox();
        chkNull7 = new javax.swing.JCheckBox();
        chkPk7 = new javax.swing.JCheckBox();
        btnCreate = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDD1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREATE TABLES");

        fullpanel.setBackground(new java.awt.Color(0, 102, 102));
        fullpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Column 1:");

        cboColumn1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboColumn1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char" }));

        txtCol1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        chkNull1.setBackground(new java.awt.Color(142, 136, 123));
        chkNull1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull1.setForeground(new java.awt.Color(255, 255, 255));
        chkNull1.setText("NULL");

        chkPk1.setBackground(new java.awt.Color(142, 136, 123));
        chkPk1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk1.setForeground(new java.awt.Color(240, 240, 240));
        chkPk1.setText("Primary Key");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(txtCol1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cboColumn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(chkNull1)
                .addGap(59, 59, 59)
                .addComponent(chkPk1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboColumn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull1)
                    .addComponent(chkPk1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 920, 50));

        jLabel5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel5.setText("Table Name:");
        fullpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txtTable.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        fullpanel.add(txtTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 82, 160, 30));

        jLabel6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel6.setText("No. of Columns:(max count 7)");
        fullpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        cboCol.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        cboCol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboColItemStateChanged(evt);
            }
        });
        cboCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboColActionPerformed(evt);
            }
        });
        fullpanel.add(cboCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 70, 30));

        panel2.setBackground(new java.awt.Color(255, 204, 255));
        panel2.setForeground(new java.awt.Color(255, 255, 255));

        cboCol2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char" }));

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Column 2:");

        txtCol2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        chkNull2.setBackground(new java.awt.Color(142, 136, 123));
        chkNull2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull2.setForeground(new java.awt.Color(255, 255, 255));
        chkNull2.setText("NULL");

        chkPk2.setBackground(new java.awt.Color(142, 136, 123));
        chkPk2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk2.setForeground(new java.awt.Color(255, 255, 255));
        chkPk2.setText("Primary Key");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txtCol2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cboCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(chkNull2)
                .addGap(59, 59, 59)
                .addComponent(chkPk2)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull2)
                    .addComponent(chkPk2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 920, 50));

        panel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Column 3:");

        txtCol3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        cboCol3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char" }));

        chkNull3.setBackground(new java.awt.Color(142, 136, 123));
        chkNull3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull3.setForeground(new java.awt.Color(255, 255, 255));
        chkNull3.setText("NULL");

        chkPk3.setBackground(new java.awt.Color(142, 136, 123));
        chkPk3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk3.setForeground(new java.awt.Color(255, 255, 255));
        chkPk3.setText("Primary Key");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(txtCol3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cboCol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(chkNull3)
                .addGap(59, 59, 59)
                .addComponent(chkPk3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull3)
                    .addComponent(chkPk3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 920, 50));

        panel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Column 4:");

        txtCol4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        cboCol4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char", " " }));

        chkNull4.setBackground(new java.awt.Color(142, 136, 123));
        chkNull4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull4.setForeground(new java.awt.Color(255, 255, 255));
        chkNull4.setText("NULL");

        chkPk4.setBackground(new java.awt.Color(142, 136, 123));
        chkPk4.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk4.setForeground(new java.awt.Color(240, 240, 240));
        chkPk4.setText("Primary Key");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addComponent(txtCol4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(cboCol4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(chkNull4)
                .addGap(61, 61, 61)
                .addComponent(chkPk4)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCol4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCol4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull4)
                    .addComponent(chkPk4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 920, 50));

        panel5.setBackground(new java.awt.Color(102, 102, 102));
        panel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Column 5:");

        txtCol5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        cboCol5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char" }));

        chkNull5.setBackground(new java.awt.Color(142, 136, 123));
        chkNull5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull5.setForeground(new java.awt.Color(255, 255, 255));
        chkNull5.setText("NULL");

        chkPk5.setBackground(new java.awt.Color(142, 136, 123));
        chkPk5.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk5.setForeground(new java.awt.Color(255, 255, 255));
        chkPk5.setText("Primary Key");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(txtCol5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(cboCol5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(chkNull5)
                .addGap(60, 60, 60)
                .addComponent(chkPk5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCol5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCol5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull5)
                    .addComponent(chkPk5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 920, 50));

        panel6.setBackground(new java.awt.Color(102, 204, 255));

        jLabel9.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Column 6:");

        txtCol6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        cboCol6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char", " " }));

        chkNull6.setBackground(new java.awt.Color(142, 136, 123));
        chkNull6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull6.setForeground(new java.awt.Color(255, 255, 255));
        chkNull6.setText("NULL");

        chkPk6.setBackground(new java.awt.Color(142, 136, 123));
        chkPk6.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk6.setForeground(new java.awt.Color(255, 255, 255));
        chkPk6.setText("Primary Key");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addComponent(txtCol6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(cboCol6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(chkNull6)
                .addGap(62, 62, 62)
                .addComponent(chkPk6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCol6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull6)
                    .addComponent(chkPk6)
                    .addComponent(cboCol6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 920, 50));

        panel7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Column 7:");

        txtCol7.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N

        cboCol7.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        cboCol7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "float", "double", "varchar(10)", "varchar(20)", "date", "char", " " }));

        chkNull7.setBackground(new java.awt.Color(142, 136, 123));
        chkNull7.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkNull7.setForeground(new java.awt.Color(255, 255, 255));
        chkNull7.setText("NULL");

        chkPk7.setBackground(new java.awt.Color(142, 136, 123));
        chkPk7.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 13)); // NOI18N
        chkPk7.setForeground(new java.awt.Color(255, 255, 255));
        chkPk7.setText("Primary Key");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(txtCol7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(cboCol7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(chkNull7)
                .addGap(62, 62, 62)
                .addComponent(chkPk7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCol7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCol7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNull7)
                    .addComponent(chkPk7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fullpanel.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 920, 50));

        btnCreate.setBackground(new java.awt.Color(204, 204, 255));
        btnCreate.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 14)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        fullpanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 110, 50));

        titlePanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(102, 204, 255));
        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Table Creation");

        btnDD1.setBackground(new java.awt.Color(153, 204, 255));
        btnDD1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 18)); // NOI18N
        btnDD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment/icons8-create-100.png"))); // NOI18N
        btnDD1.setText("CREATE TABLES");
        btnDD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(btnDD1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fullpanel.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        btnBack.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 14)); // NOI18N
        btnBack.setText(">>>>");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        fullpanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (cboCol.getSelectedItem().equals("1"))
        {
        String [] allData = OneData();
        String tName = txtTable.getText();
        oneRow(); 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        if (cboCol.getSelectedItem().equals("2"))
        {
        String [] allData = TwoData();
        String tName = txtTable.getText();
        oneRow(); 
        twoRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+","
                    + " "+" "+allData[4]+" "+allData[5]+" "+allData[6]+" "+allData[7]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        if (cboCol.getSelectedItem().equals("3"))
        {
        String [] allData = ThreeData();
        String tName = txtTable.getText();
        oneRow(); 
        twoRow();
        threeRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+","
                    + " "+" "+allData[4]+" "+allData[5]+" "+allData[6]+" "+allData[7]+","
                    + " "+" "+allData[8]+" "+allData[9]+" "+allData[10]+" "+allData[11]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        if (cboCol.getSelectedItem().equals("4"))
        {
        String [] allData = FourData();
        String tName = txtTable.getText();
        oneRow(); 
        twoRow();
        threeRow();
        fourRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+","
                    + " "+" "+allData[4]+" "+allData[5]+" "+allData[6]+" "+allData[7]+","
                    + " "+" "+allData[8]+" "+allData[9]+" "+allData[10]+" "+allData[11]+","
                    + " "+" "+allData[12]+" "+allData[13]+" "+allData[14]+" "+allData[15]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        if (cboCol.getSelectedItem().equals("5"))
        {
        String [] allData = FiveData();
        String tName = txtTable.getText();
        oneRow(); 
        twoRow();
        threeRow();
        fourRow();
        fiveRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+","
                    + " "+" "+allData[4]+" "+allData[5]+" "+allData[6]+" "+allData[7]+","
                    + " "+" "+allData[8]+" "+allData[9]+" "+allData[10]+" "+allData[11]+","
                    + " "+" "+allData[12]+" "+allData[13]+" "+allData[14]+" "+allData[15]+","
                    + " "+" "+allData[16]+" "+allData[17]+" "+allData[18]+" "+allData[19]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        if (cboCol.getSelectedItem().equals("6"))
        {
        String [] allData = SixData();
        String tName = txtTable.getText();
        oneRow(); 
        twoRow();
        threeRow();
        fourRow();
        fiveRow();
        sixRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+","
                    + " "+" "+allData[4]+" "+allData[5]+" "+allData[6]+" "+allData[7]+","
                    + " "+" "+allData[8]+" "+allData[9]+" "+allData[10]+" "+allData[11]+","
                    + " "+" "+allData[12]+" "+allData[13]+" "+allData[14]+" "+allData[15]+","
                    + " "+" "+allData[16]+" "+allData[17]+" "+allData[18]+" "+allData[19]+","
                    + " "+" "+allData[20]+" "+allData[21]+" "+allData[22]+" "+allData[23]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        
        if (cboCol.getSelectedItem().equals("7"))
        {
        String [] allData = SevenData();
        String tName = txtTable.getText();
        oneRow(); 
        twoRow();
        threeRow();
        fourRow();
        fiveRow();
        sixRow();
        sevenRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RepairDB", "root","root");
            String sql = "create table RepairDB."+tName+"("+" "+allData[0]+" "+allData[1]+" "+allData[3]+","
                    + " "+" "+allData[4]+" "+allData[5]+" "+allData[6]+" "+allData[7]+","
                    + " "+" "+allData[8]+" "+allData[9]+" "+allData[10]+" "+allData[11]+","
                    + " "+" "+allData[12]+" "+allData[13]+" "+allData[14]+" "+allData[15]+","
                    + " "+" "+allData[16]+" "+allData[17]+" "+allData[18]+" "+allData[19]+","
                    + " "+" "+allData[20]+" "+allData[21]+" "+allData[22]+" "+allData[23]+","
                    + " "+" "+allData[24]+" "+allData[25]+" "+allData[26]+" "+allData[27]+""
                    +")";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this,"Good!Success table Created");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cboColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboColActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainMenu MM = new MainMenu();
        MM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cboColItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboColItemStateChanged
        // TODO add your handling code here:
        if (cboCol.getSelectedItem().equals("1"))
        {
            
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
        }
        else if (cboCol.getSelectedItem().equals("2"))
        {
            
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
        }
        else if (cboCol.getSelectedItem().equals("3"))
        {
            
            panel2.setVisible(true);
            panel3.setVisible(true);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
        }
        else if (cboCol.getSelectedItem().equals("4"))
        {
            
            panel2.setVisible(true);
            panel3.setVisible(true);
            panel4.setVisible(true);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
        }
        else if (cboCol.getSelectedItem().equals("5"))
        {
            
            panel2.setVisible(true);
            panel3.setVisible(true);
            panel4.setVisible(true);
            panel5.setVisible(true);
            panel6.setVisible(false);
            panel7.setVisible(false);
        }
        else if (cboCol.getSelectedItem().equals("6"))
        {
            
            panel2.setVisible(true);
            panel3.setVisible(true);
            panel4.setVisible(true);
            panel5.setVisible(true);
            panel6.setVisible(true);
            panel7.setVisible(false);
        }
        else 
        {
           
            panel2.setVisible(true);
            panel3.setVisible(true);
            panel4.setVisible(true);
            panel5.setVisible(true);
            panel6.setVisible(true);
            panel7.setVisible(true);
        }
    }//GEN-LAST:event_cboColItemStateChanged

    private void btnDD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDD1ActionPerformed
        // TODO add your handling code here:
        TableCreate DF = new TableCreate();
        DF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDD1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDD1;
    private javax.swing.JComboBox cboCol;
    private javax.swing.JComboBox cboCol2;
    private javax.swing.JComboBox cboCol3;
    private javax.swing.JComboBox cboCol4;
    private javax.swing.JComboBox cboCol5;
    private javax.swing.JComboBox cboCol6;
    private javax.swing.JComboBox cboCol7;
    private javax.swing.JComboBox cboColumn1;
    private javax.swing.JCheckBox chkNull1;
    private javax.swing.JCheckBox chkNull2;
    private javax.swing.JCheckBox chkNull3;
    private javax.swing.JCheckBox chkNull4;
    private javax.swing.JCheckBox chkNull5;
    private javax.swing.JCheckBox chkNull6;
    private javax.swing.JCheckBox chkNull7;
    private javax.swing.JCheckBox chkPk1;
    private javax.swing.JCheckBox chkPk2;
    private javax.swing.JCheckBox chkPk3;
    private javax.swing.JCheckBox chkPk4;
    private javax.swing.JCheckBox chkPk5;
    private javax.swing.JCheckBox chkPk6;
    private javax.swing.JCheckBox chkPk7;
    private javax.swing.JPanel fullpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField txtCol1;
    private javax.swing.JTextField txtCol2;
    private javax.swing.JTextField txtCol3;
    private javax.swing.JTextField txtCol4;
    private javax.swing.JTextField txtCol5;
    private javax.swing.JTextField txtCol6;
    private javax.swing.JTextField txtCol7;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables
}
