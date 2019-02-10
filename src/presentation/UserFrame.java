/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.Book;
import business.Manager;
import business.User;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author perei
 */
public class UserFrame extends javax.swing.JFrame {
    private User user;
    private Manager mng;
    private List<Book> searchedBooks;

    /**
     * Creates new form UserFrame
     * @param u
     */
    public UserFrame(Manager mng, User u) {
        this.mng = mng;
        this.user = u;
        this.searchedBooks = u.getShelf();
        initComponents();
        bookTable.setAutoCreateRowSorter(true);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(bookTable.getModel());
        sorter.setComparator(0, new Comparator<Object>() {
            public int compare(Object arg0, Object arg1) {
                return arg0.toString().compareTo(arg1.toString());
        }
        });

        bookTable.setRowSorter(sorter);
        bookTable.getRowSorter().toggleSortOrder(0);
        
        updateTable(u.getShelf());      
    }
    
    private void saveData(){
        try {
            FileOutputStream fos = new FileOutputStream(".vshelf.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            
            oos.writeObject(this.mng);
            
            oos.close();
            fos.close();
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        signoutButton = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VShelf");
        setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        label1.setText("vSHELF");

        label2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        label2.setText("My books");

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Genre", "Read", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
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
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        signoutButton.setText("Sign out");
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        addBookButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jLabel1.setText("Search");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\perei\\OneDrive\\Ambiente de Trabalho\\MiEI\\Projetos\\VShelf\\VShelf\\img\\book.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBookButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(signoutButton)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signoutButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addBookButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        saveData();
        JOptionPane.showMessageDialog(new JFrame(), "Your data has been successfully saved.", "DATA SAVED", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        LoginFrame f = new LoginFrame();
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
    }//GEN-LAST:event_signoutButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        AddBookFrame f = new AddBookFrame(this.user,this);
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveData();        
        JOptionPane.showMessageDialog(new JFrame(), "Your data has been successfully saved.", "DATA SAVED", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_saveButtonActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        if (evt.getClickCount() == 2) {
        int selRow = bookTable.getSelectedRow();
        if (selRow > -1) {
            Book selectedBook = searchedBooks.get(bookTable.convertRowIndexToModel(selRow));
            EditBookFrame f = new EditBookFrame(user,this,selectedBook);
            f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
            f.setVisible(true);
            f.setLocationRelativeTo(null);
            f.setResizable(false);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Please select a row.", "NO ITEM SELECTED", JOptionPane.WARNING_MESSAGE);
        }
    }
    }//GEN-LAST:event_bookTableMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String to_search = searchField.getText();

        List<Book> books = this.user.getShelf().stream()
                .filter(c -> c.getName().contains(to_search) || c.getAuthor().contains(to_search) || c.getPublisher().contains(to_search)
                    || c.getObs().contains(to_search) || c.getType().contains(to_search))
                .collect(Collectors.toList());
        
        searchedBooks = new ArrayList<>(books);

        updateTable(books);
    }//GEN-LAST:event_searchFieldKeyReleased

    void updateTable(List<Book> books){
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        Object row_data[] = new Object[5];

        // Remove todos
        model.setRowCount(0);

        // Adiciona novos
        
        int cont=0;
        for(Book b : books){
            cont++;
            row_data[0] = b.getName();
            row_data[1] = b.getAuthor();
            row_data[2] = b.getType();
            row_data[3] = b.getRead();
            if (b.getRead()){
                row_data[4] = String.valueOf(b.getRating());
            }
            else row_data[4] = "-";
            model.addRow(row_data);
        }
        this.searchedBooks = books;
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton signoutButton;
    // End of variables declaration//GEN-END:variables
}
