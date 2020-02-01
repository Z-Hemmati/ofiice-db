package Controller;

import Model.Entity.docEn;
import Model.Service.docServ;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Document extends javax.swing.JFrame {
    private Object rs;

    public Document() throws SQLException {
        initComponents();
        setCal();
        table_update();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchbut = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dstxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totxt = new javax.swing.JTextField();
        dctxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        drdtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fromtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        drttxt = new javax.swing.JTextField();
        dntxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        timelab = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        DeleteBut = new javax.swing.JButton();
        signoutBut = new javax.swing.JButton();
        addBut = new javax.swing.JButton();
        EditBut = new javax.swing.JButton();
        clearbut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText(" Document code");

        searchbut.setIcon(new javax.swing.ImageIcon("image/search.png")); // NOI18N
        searchbut.setText("search");
        searchbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchbut, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbut))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

        jLabel5.setText("Document Subject");

        jLabel6.setText("From the employee");

        jLabel4.setText("Document name");

        jLabel8.setText("Document Receipt Date");

        jLabel3.setText("Document code");

        jLabel7.setText("To the employee");

        jLabel9.setText("Document Receipt Time");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drttxt)
                    .addComponent(drdtxt)
                    .addComponent(totxt)
                    .addComponent(fromtxt)
                    .addComponent(dstxt)
                    .addComponent(dntxt)
                    .addComponent(dctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(drdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(drttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Subject", "From", "Too", "Date", "Time"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        timelab.setForeground(new java.awt.Color(255, 0, 51));
        timelab.setIcon(new javax.swing.ImageIcon("image/time.png")); // NOI18N

        dateLab.setForeground(new java.awt.Color(255, 0, 51));
        dateLab.setIcon(new javax.swing.ImageIcon("image/calendar.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Employee system");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timelab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateLab)
                        .addComponent(timelab))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        DeleteBut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteBut.setIcon(new javax.swing.ImageIcon("image/delete.png")); // NOI18N
        DeleteBut.setText("Delete");
        DeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButActionPerformed(evt);
            }
        });

        signoutBut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signoutBut.setIcon(new javax.swing.ImageIcon("image/exit.png")); // NOI18N
        signoutBut.setText("Signout");
        signoutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButActionPerformed(evt);
            }
        });

        addBut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBut.setIcon(new javax.swing.ImageIcon("image/plus.png")); // NOI18N
        addBut.setText("Add");
        addBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButActionPerformed(evt);
            }
        });

        EditBut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EditBut.setIcon(new javax.swing.ImageIcon("image/edit.png")); // NOI18N
        EditBut.setText("Edit");
        EditBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButActionPerformed(evt);
            }
        });

        clearbut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clearbut.setIcon(new javax.swing.ImageIcon("image/garbage.png")); // NOI18N
        clearbut.setText("Clear");
        clearbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signoutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clearbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBut)
                .addGap(18, 18, 18)
                .addComponent(EditBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteBut)
                .addGap(18, 18, 18)
                .addComponent(clearbut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(signoutBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(160, 160, 160)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    PreparedStatement insert;

      private void table_update(){
          ResultSet rs;

        int c;

        try {
            rs= docServ.getInstance().select();

            ResultSetMetaData Rss=rs.getMetaData();
            c=Rss.getColumnCount();
            DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next()){
                Vector v2=new Vector();
                
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("code"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("subject"));
                    v2.add(rs.getString("dfrom"));
                    v2.add(rs.getString("dto"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("time"));
                }
                
                Df.addRow(v2);   
            }
           
            }catch (SQLException ex) {
            Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }


      }
    private void addButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButActionPerformed
        // TODO add your handling code here:
        
        
        String code=dctxt.getText();
        String name=dntxt.getText();
        String subject=dstxt.getText();
        String from=fromtxt.getText();
        String to=totxt.getText();
        String date=drdtxt.getText();
        String time=drttxt.getText();

        docEn docEn=new docEn();
        docEn.setCode(code);
        docEn.setName(name);
        docEn.setSubject(subject);
        docEn.setDfrom(from);
        docEn.setDto(to);
        docEn.setDate(date);
        docEn.setTime(time);
        try {

            docServ.getInstance().insert(docEn);

            JOptionPane.showMessageDialog(this,"Record Addedd");
            
            table_update();
            
            dctxt.setText("");
            dntxt.setText("");
            dstxt.setText("");
            fromtxt.setText("");
            totxt.setText("");
            drdtxt.setText("");
            drttxt.setText("");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_addButActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel Df= (DefaultTableModel) jTable1.getModel();
        int selectedIndex=jTable1.getSelectedRow();
        
        dctxt.setText(Df.getValueAt(selectedIndex, 0).toString());
        dntxt.setText(Df.getValueAt(selectedIndex, 1).toString());
        dstxt.setText(Df.getValueAt(selectedIndex, 2).toString());
        fromtxt.setText(Df.getValueAt(selectedIndex, 3).toString());
        totxt.setText(Df.getValueAt(selectedIndex, 4).toString());
        drdtxt.setText(Df.getValueAt(selectedIndex, 5).toString());
        drttxt.setText(Df.getValueAt(selectedIndex, 6).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void EditButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButActionPerformed
        // TODO add your handling code here:
         DefaultTableModel Df= (DefaultTableModel) jTable1.getModel();
        int selectedIndex=jTable1.getSelectedRow();
        
        String code=dctxt.getText();
        String name=dntxt.getText();
        String subject=dstxt.getText();
        String from=fromtxt.getText();
        String to=totxt.getText();
        String date=drdtxt.getText();
        String time=drttxt.getText();

        code=Df.getValueAt(selectedIndex, 0).toString();
        docEn docEn=new docEn();
        docEn.setCode(code);
        docEn.setName(name);
        docEn.setSubject(subject);
        docEn.setDfrom(from);
        docEn.setDto(to);
        docEn.setDate(date);
        docEn.setTime(time);


        try {
            code=Df.getValueAt(selectedIndex, 0).toString();

            docServ.getInstance().update(docEn);
            
            JOptionPane.showMessageDialog(this,"Record Updated");
            
            table_update();
            
            dctxt.setText("");
            dntxt.setText("");
            dstxt.setText("");
            fromtxt.setText("");
            totxt.setText("");
            drdtxt.setText("");
            drttxt.setText("");
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_EditButActionPerformed

    private void DeleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel Df= (DefaultTableModel) jTable1.getModel();
        int selectedIndex=jTable1.getSelectedRow();
        
        String code=dctxt.getText();
       
        
        code=Df.getValueAt(selectedIndex, 0).toString();
        docEn docEn=new docEn();
        docEn.setCode(code);
        int dialogResult=JOptionPane.showConfirmDialog(null,"Do you want to delete the record?","Warning",JOptionPane.YES_NO_OPTION);
         if(dialogResult == JOptionPane.YES_OPTION){
                
               
            try {

                docServ.getInstance().delete(docEn);
                JOptionPane.showMessageDialog(this,"Record deleted");
            
                table_update();

                dctxt.setText("");
                dntxt.setText("");
                dstxt.setText("");
                fromtxt.setText("");
                totxt.setText("");
                drdtxt.setText("");
                drttxt.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
        
        
        
    }//GEN-LAST:event_DeleteButActionPerformed

    private void searchbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbutActionPerformed
        ResultSet rs;
        try {
            docEn docEn=new docEn();
            String code=searchField.getText();
            docEn.setCode(code);

            rs = docServ.getInstance().findByCode(docEn);
            if(rs.next()){
                String add1=rs.getString("code");
                dctxt.setText(add1);
                String add2=rs.getString("name");
                dntxt.setText(add2);
                String add3=rs.getString("subject");
                dstxt.setText(add3);
                String add4=rs.getString("dfrom");
                fromtxt.setText(add4);
                String add5=rs.getString("dto");
                totxt.setText(add5);
                String add6=rs.getString("date");
                drdtxt.setText(add6);
                String add7=rs.getString("time");
                 drttxt.setText(add7);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_searchbutActionPerformed

    private void signoutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButActionPerformed
      setVisible(false);
            LoginFrame s= new LoginFrame();
            s.setVisible(true);
       
    }//GEN-LAST:event_signoutButActionPerformed

    private void clearbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbutActionPerformed
        // TODO add your handling code here:
        String code=dctxt.getText();
        String name=dntxt.getText();
        String subject=dstxt.getText();
        String from=fromtxt.getText();
        String to=totxt.getText();
        String date=drdtxt.getText();
        String time=drttxt.getText();
        
            dctxt.setText("");
            dntxt.setText("");
            dstxt.setText("");
            fromtxt.setText("");
            totxt.setText("");
            drdtxt.setText("");
            drttxt.setText("");
        

    }//GEN-LAST:event_clearbutActionPerformed
    
    
    public void setCal(){
        Calendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        dateLab.setText("Today's date : "+  day + " / " + (month + 1)+ " / "  + year);
        timelab.setText("Time : "+hour+" : "+minute+" : "+second);
       
    }
    
  
       
        
        
        
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Document().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBut;
    private javax.swing.JButton EditBut;
    private javax.swing.JButton addBut;
    private javax.swing.JButton clearbut;
    private javax.swing.JLabel dateLab;
    private javax.swing.JTextField dctxt;
    private javax.swing.JTextField dntxt;
    private javax.swing.JTextField drdtxt;
    private javax.swing.JTextField drttxt;
    private javax.swing.JTextField dstxt;
    private javax.swing.JTextField fromtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchbut;
    private javax.swing.JButton signoutBut;
    private javax.swing.JLabel timelab;
    private javax.swing.JTextField totxt;
    // End of variables declaration//GEN-END:variables
}
