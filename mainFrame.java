
package contacts;
  import java.awt.*;
  import java.awt.event.*;
  import java.io.*;
  import java.util.*;
  import java.util.logging.Level;
  import java.util.logging.Logger;
  import javax.swing.table.DefaultTableModel;
  import javax.swing.*;
import java.util.Vector;
          
public class mainFrame extends javax.swing.JFrame {
      DefaultTableModel model;
      File f;
    public mainFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\Dell\\Downloads\\unknown.png");
        setIconImage(img.getImage());
          model = (DefaultTableModel)contactsTable.getModel();
          contactsTable.setAutoCreateRowSorter(true);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        newClientPanel = new javax.swing.JPanel();
        nameL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        phoneNumberL = new javax.swing.JLabel();
        phoneNumberTF = new javax.swing.JTextField();
        addressL = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearNameButton = new javax.swing.JButton();
        clearEmailButton = new javax.swing.JButton();
        clearPhoneButton = new javax.swing.JButton();
        clearAddressButton = new javax.swing.JButton();
        listOfContactsL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsTable = new javax.swing.JTable();
        numOfClientsL = new javax.swing.JLabel();
        counterL = new javax.swing.JLabel();
        anonymousLabel = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        itemBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        clearSearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contacts");
        setForeground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(940, 690));
        setPreferredSize(new java.awt.Dimension(940, 690));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(0, 153, 153));
        mainPanel.setPreferredSize(new java.awt.Dimension(940, 690));

        newClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "new clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N
        newClientPanel.setOpaque(false);

        nameL.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        nameL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/signature.png"))); // NOI18N
        nameL.setText("*Name");

        emailL.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        emailL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/mail-inbox-app.png"))); // NOI18N
        emailL.setText("*Email");

        nameTF.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        emailTF.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        phoneNumberL.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        phoneNumberL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/phone-call.png"))); // NOI18N
        phoneNumberL.setText("*Phone Number");

        phoneNumberTF.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        addressL.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        addressL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/location.png"))); // NOI18N
        addressL.setText("Address");

        addressTF.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        addButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/broom.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.setPreferredSize(new java.awt.Dimension(80, 33));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/system-update.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearNameButton.setBackground(new java.awt.Color(0, 153, 153));
        clearNameButton.setText("Clear Name");
        clearNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearNameButtonActionPerformed(evt);
            }
        });

        clearEmailButton.setBackground(new java.awt.Color(0, 153, 153));
        clearEmailButton.setText("Clear Email");
        clearEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEmailButtonActionPerformed(evt);
            }
        });

        clearPhoneButton.setBackground(new java.awt.Color(0, 153, 153));
        clearPhoneButton.setText(" Clear Phone");
        clearPhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPhoneButtonActionPerformed(evt);
            }
        });

        clearAddressButton.setBackground(new java.awt.Color(0, 153, 153));
        clearAddressButton.setText("Clear Address");
        clearAddressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAddressButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newClientPanelLayout = new javax.swing.GroupLayout(newClientPanel);
        newClientPanel.setLayout(newClientPanelLayout);
        newClientPanelLayout.setHorizontalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newClientPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTF)
                    .addComponent(emailTF)
                    .addComponent(phoneNumberTF)
                    .addComponent(addressTF)
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addComponent(emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearEmailButton))
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addComponent(addressL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearAddressButton))
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addComponent(nameL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearNameButton))
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addComponent(phoneNumberL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(clearPhoneButton)))
                .addContainerGap())
        );
        newClientPanelLayout.setVerticalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(clearNameButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailL)
                    .addComponent(clearEmailButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberL)
                    .addComponent(clearPhoneButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressL)
                    .addComponent(clearAddressButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        listOfContactsL.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        listOfContactsL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listOfContactsL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/group.png"))); // NOI18N
        listOfContactsL.setText("List Of Contacts");

        contactsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num.", "Name", "Email", "Phone Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        contactsTable.setOpaque(false);
        jScrollPane1.setViewportView(contactsTable);
        if (contactsTable.getColumnModel().getColumnCount() > 0) {
            contactsTable.getColumnModel().getColumn(0).setResizable(false);
            contactsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            contactsTable.getColumnModel().getColumn(1).setResizable(false);
            contactsTable.getColumnModel().getColumn(2).setResizable(false);
            contactsTable.getColumnModel().getColumn(3).setResizable(false);
            contactsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        numOfClientsL.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        numOfClientsL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/number-blocks (1).png"))); // NOI18N
        numOfClientsL.setText("Number Of Clients Is :");

        counterL.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        counterL.setText("0");

        anonymousLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        anonymousLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anonymousLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/hacker.png"))); // NOI18N
        anonymousLabel.setText("Designed by Anonymous Team");

        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });

        itemBox.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        itemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Name ", "Email", "Phone", "Address" }));
        itemBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBoxActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacts/loupe.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearSearchButton.setBackground(new java.awt.Color(0, 153, 153));
        clearSearchButton.setText("Cear Search Text");
        clearSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(numOfClientsL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(counterL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(clearSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listOfContactsL, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(itemBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(anonymousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numOfClientsL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(counterL)
                            .addComponent(listOfContactsL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(anonymousLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 948, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
         clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
         if(checkClientInfo()){
           validation_Clients_Info newClient;
         if(addressTF.getText().trim().isEmpty()){
             newClient = new validation_Clients_Info(nameTF.getText().trim(),
                    phoneNumberTF.getText().trim(), emailTF.getText().trim());
           }else{ 
             newClient = new validation_Clients_Info(nameTF.getText().trim(),
                     phoneNumberTF.getText().trim(), emailTF.getText().trim(),addressTF.getText().trim());
           }  
          if(!newClient.vlag()){
              JOptionPane.showMessageDialog(this,
                     newClient.getMessage(),"Verify Your Data",JOptionPane.INFORMATION_MESSAGE);
          }else{
              model.addRow(new Object[]{contactsTable.getRowCount()+1,newClient.getNameL(),
                  newClient.getEmailL(),newClient.getPhoneNumberL()
                      ,newClient.getAddressL().isEmpty()?"client hasn‘t address":newClient.getAddressL()});
              numberOfClients++;
              counterUpdate(numberOfClients);
               clear();
          }
         }
        else{
             
             JOptionPane.showMessageDialog(this,
                     "please enter all Main fields","try again",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         int row = contactsTable.getSelectedRow();
       if(row<0){
        JOptionPane.showMessageDialog(this,
                "please select at least 1 row"," no rows selected",JOptionPane.ERROR_MESSAGE);
       }else{ 
           model.removeRow(row);
           numberOfClients--;
           counterUpdate(numberOfClients);
             } 
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if(searchTF.getText().isBlank()){
        JOptionPane.showMessageDialog(this,
                " Please Enter Data To Search About It "," try again ",JOptionPane.ERROR_MESSAGE);
        }else{
           
          if(itemBox.getSelectedItem().equals("All")){
             for (int i = 0; i < numberOfClients ; i++) {
                  for (int j = 1; j < 5; j++) {
                      if(model.getValueAt(i, j).equals(searchTF.getText().trim())){
                        searchValid(i);
                          return;
                      }
                  }
              }
          }else if(itemBox.getSelectedItem().equals("Name")){
               for (int i = 0; i < numberOfClients; i++) {
                    if(model.getValueAt(i, 1).equals(searchTF.getText().trim())){
                       searchValid(i);
                       return;
                }
             }
          }else if(itemBox.getSelectedItem().equals("Emial")){  
              for (int i = 0; i < numberOfClients; i++) {
                    if(model.getValueAt(i,2).equals(searchTF.getText().trim())){
                       searchValid(i);
                       return;
                }
             }
          }else if(itemBox.getSelectedItem().equals("Phone")){
                for (int i = 0; i < numberOfClients; i++) {
                    if(model.getValueAt(i, 3).equals(searchTF.getText().trim())){
                       searchValid(i);
                       return;
                }
             }
          }else {
               for (int i = 0; i < numberOfClients; i++) {
                    if(model.getValueAt(i, 4).equals(searchTF.getText().trim())){
                       searchValid(i);
                       return;
                }
             }
          }
           JOptionPane.showMessageDialog(this,
           "Not founded Data in the Option :"+itemBox.getSelectedItem(),
           " Not Founded !!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    public void searchValid(int row){
           contactsTable.setRowSelectionInterval(row, row);
           nameTF.setText(model.getValueAt(row, 1)+"");
           emailTF.setText(model.getValueAt(row, 2)+"");
           phoneNumberTF.setText(model.getValueAt(row, 3)+"");
           addressTF.setText(model.getValueAt(row, 4)+"");
           JOptionPane.showMessageDialog(this,
                 " founded in the "+itemBox.getSelectedItem()+" column",
                " result of your search",JOptionPane.INFORMATION_MESSAGE);
     }
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
             if(checkClientInfo()){
           validation_Clients_Info newClient;
         if(addressTF.getText().trim().isEmpty()){
             newClient = new validation_Clients_Info(nameTF.getText().trim(),
                     phoneNumberTF.getText().trim(), emailTF.getText().trim());
           }else{
             newClient = new validation_Clients_Info(nameTF.getText().trim(),
                     phoneNumberTF.getText().trim(), emailTF.getText().trim(),addressTF.getText().trim());
           }  
          if(!newClient.vlag()){
              JOptionPane.showMessageDialog(this,
                     newClient.getMessage(),"try again",JOptionPane.INFORMATION_MESSAGE);
          }else{
              model.setValueAt(newClient.getNameL(), contactsTable.getSelectedRow(), 1);
              model.setValueAt(newClient.getEmailL(), contactsTable.getSelectedRow(),2);
              model.setValueAt(newClient.getPhoneNumberL(), contactsTable.getSelectedRow(), 3);
              model.setValueAt(newClient.getAddressL(), contactsTable.getSelectedRow(), 4);
              clear();
          }
         }
        else{
             
             JOptionPane.showMessageDialog(this,
                     "please enter all Main fields","try again",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        //model = (DefaultTableModel) contactsTable.getModel(); //allraedy declear in mainFrame constractor
//          Vector<Vector> tableData = model.getDataVector();
//             //saving object in the file
//             try{
//                 FileOutputStream file = new FileOutputStream("file.bin");
//                 ObjectOutputStream output = new ObjectOutputStream(file);
//                  //method to serialization of object
//                  output.writeObject(tableData);
//                   
//                  output.close();
//                    file.close();
//                    
//             }catch(Exception ex){
//                   ex.printStackTrace();
//             }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        try{
//                 FileInputStream file = new FileInputStream("file.bin");
//                 ObjectInputStream input = new ObjectInputStream(file);
//                  //method to deserialization of object
//                    Vector<Vector> tableData = (Vector<Vector>)input.readObject();
//                     input.close();
//                     file.close();
//                    for (int i = 0; i < tableData.size(); i++) {
//                     Vector row = tableData.get(i);
//                     model.addRow(new Object[]{row.get(0),row.get(1)
//                             ,row.get(2),row.get(3),row.get(4)});
//                 }
//         }catch(Exception ex){
//                   ex.printStackTrace();
//             }
    }//GEN-LAST:event_formWindowOpened

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed

    private void clearNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearNameButtonActionPerformed
        clearName();
    }//GEN-LAST:event_clearNameButtonActionPerformed

    private void clearEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEmailButtonActionPerformed
        clearEmail();
    }//GEN-LAST:event_clearEmailButtonActionPerformed

    private void clearPhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPhoneButtonActionPerformed
       clearphoneNumber();
    }//GEN-LAST:event_clearPhoneButtonActionPerformed

    private void clearAddressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAddressButtonActionPerformed
       clearAddress();
    }//GEN-LAST:event_clearAddressButtonActionPerformed

    private void clearSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSearchButtonActionPerformed
        clearSearchTF();
    }//GEN-LAST:event_clearSearchButtonActionPerformed

    
    public static int numberOfClients;
    
    public boolean checkClientInfo(){
           return !nameTF.getText().trim().isBlank()&&
                  !emailTF.getText().trim().isBlank()&& 
                   !phoneNumberTF.getText().trim().isBlank();
           }
      public void counterUpdate(int numberOfClients){
          counterL.setText(String.valueOf(numberOfClients));
   
      }
       
        public void clear(){
              nameTF.setText("");
              emailTF.setText("");
              phoneNumberTF.setText("");
              addressTF.setText("");
          }
         public void clearName(){ nameTF.setText(""); }
         public void clearEmail(){ emailTF.setText(""); }
         public void clearphoneNumber(){ phoneNumberTF.setText(""); }
         public void clearAddress(){ addressTF.setText(""); }
         public void clearSearchTF(){ searchTF.setText(""); }
         public void fileUpdate() throws Exception{
              Vector<Vector> tableData = model.getDataVector();
               FileOutputStream file = new FileOutputStream("file.bin");
                 ObjectOutputStream output = new ObjectOutputStream(file);
                  //method to serialization of object
                  output.writeObject(tableData);
                   
                  output.close();
                    file.close();
         }
         
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addressL;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel anonymousLabel;
    private javax.swing.JButton clearAddressButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearEmailButton;
    private javax.swing.JButton clearNameButton;
    private javax.swing.JButton clearPhoneButton;
    private javax.swing.JButton clearSearchButton;
    private javax.swing.JTable contactsTable;
    private javax.swing.JLabel counterL;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JComboBox<String> itemBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listOfContactsL;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel newClientPanel;
    private javax.swing.JLabel numOfClientsL;
    private javax.swing.JLabel phoneNumberL;
    private javax.swing.JTextField phoneNumberTF;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
