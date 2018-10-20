/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;



public class DictionaryApplication extends javax.swing.JFrame {

    DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
    DefaultListModel model = new DefaultListModel();
    DefaultListModel listTarget = new DefaultListModel();
    Voice voice;
    VoiceManager voiceManager;
    public DictionaryApplication() {
        initComponents();
        explainWord.setEditable(false);
        repairTargetOldTextField.setEditable(false);
        repairExplainOldTextField.setEditable(false);
        dictionaryCommandline.getDictionaryManagement().insertFromFile();
        setData();
    }
    
    private void setData() {
        
        for (int i = 0; i < dictionaryCommandline.getDictionaryManagement().getDictionary().getSizeWords(); i++) {
            model.addElement(dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().get(i).getWord_target());
        }
        jList1.setModel(model);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFrame = new javax.swing.JFrame();
        targetAddLabel = new javax.swing.JLabel();
        targetAddTextField = new javax.swing.JTextField();
        explainAddLabel = new javax.swing.JLabel();
        explainAddTextField = new javax.swing.JTextField();
        addWordButton = new javax.swing.JButton();
        repairFrame = new javax.swing.JFrame();
        repairTargetLabel = new javax.swing.JLabel();
        repairSearchTextField = new javax.swing.JTextField();
        repairSearchButton = new javax.swing.JButton();
        deleteFrame = new javax.swing.JFrame();
        deleteLabel = new javax.swing.JLabel();
        deleteWordTextField = new javax.swing.JTextField();
        deleteWordButton = new javax.swing.JButton();
        repairFrame1 = new javax.swing.JFrame();
        repairTargetOldLabel = new javax.swing.JLabel();
        repairExplainOldLabel = new javax.swing.JLabel();
        repairTargetNewLabel = new javax.swing.JLabel();
        repairExplainNewLabel = new javax.swing.JLabel();
        repairExplainOldTextField = new javax.swing.JTextField();
        repairTargetOldTextField = new javax.swing.JTextField();
        repairTargetNewTextField = new javax.swing.JTextField();
        repairExplainNewTextField = new javax.swing.JTextField();
        repairButton1 = new javax.swing.JButton();
        enterFrom = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        informationLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        repairButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        explainWord = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        searchWord = new javax.swing.JButton();

        addFrame.setTitle("Thêm từ");
        addFrame.setLocation(new java.awt.Point(650, 300));
        addFrame.setName("Thêm từ"); // NOI18N
        addFrame.setResizable(false);
        addFrame.setSize(new java.awt.Dimension(300, 200));

        targetAddLabel.setText("Từ cần thêm");

        explainAddLabel.setText("Nghĩa");

        addWordButton.setText("Thêm");
        addWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addFrameLayout = new javax.swing.GroupLayout(addFrame.getContentPane());
        addFrame.getContentPane().setLayout(addFrameLayout);
        addFrameLayout.setHorizontalGroup(
            addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrameLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(targetAddLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(explainAddLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(targetAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(explainAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addWordButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        addFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {explainAddTextField, targetAddTextField});

        addFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {explainAddLabel, targetAddLabel});

        addFrameLayout.setVerticalGroup(
            addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrameLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addComponent(targetAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(explainAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(explainAddLabel)))
                    .addComponent(targetAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(addWordButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        addFrameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {explainAddLabel, targetAddLabel});

        addFrameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {explainAddTextField, targetAddTextField});

        repairFrame.setTitle("Sửa từ");
        repairFrame.setLocation(new java.awt.Point(650, 300));
        repairFrame.setName("repairFrame"); // NOI18N
        repairFrame.setSize(new java.awt.Dimension(300, 200));

        repairTargetLabel.setText("Từ cần sửa");

        repairSearchButton.setText("Tìm");
        repairSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout repairFrameLayout = new javax.swing.GroupLayout(repairFrame.getContentPane());
        repairFrame.getContentPane().setLayout(repairFrameLayout);
        repairFrameLayout.setHorizontalGroup(
            repairFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairFrameLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(repairFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(repairSearchButton)
                    .addGroup(repairFrameLayout.createSequentialGroup()
                        .addComponent(repairTargetLabel)
                        .addGap(39, 39, 39)
                        .addComponent(repairSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        repairFrameLayout.setVerticalGroup(
            repairFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairFrameLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(repairFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairTargetLabel)
                    .addComponent(repairSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(repairSearchButton)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        deleteFrame.setTitle("Xóa từ");
        deleteFrame.setLocation(new java.awt.Point(650, 300));
        deleteFrame.setName("deleteFrame"); // NOI18N
        deleteFrame.setSize(new java.awt.Dimension(300, 200));

        deleteLabel.setText("Từ cần xóa");

        deleteWordButton.setText("Xóa");
        deleteWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteFrameLayout = new javax.swing.GroupLayout(deleteFrame.getContentPane());
        deleteFrame.getContentPane().setLayout(deleteFrameLayout);
        deleteFrameLayout.setHorizontalGroup(
            deleteFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteFrameLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(deleteLabel)
                .addGap(18, 18, 18)
                .addGroup(deleteFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteFrameLayout.createSequentialGroup()
                        .addGap(0, 59, Short.MAX_VALUE)
                        .addComponent(deleteWordButton))
                    .addComponent(deleteWordTextField))
                .addGap(66, 66, 66))
        );
        deleteFrameLayout.setVerticalGroup(
            deleteFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteFrameLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(deleteFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteLabel)
                    .addComponent(deleteWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(deleteWordButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        repairFrame1.setTitle("Sửa từ");
        repairFrame1.setLocation(new java.awt.Point(600, 250));
        repairFrame1.setSize(new java.awt.Dimension(400, 300));

        repairTargetOldLabel.setText("Từ ");

        repairExplainOldLabel.setText("Nghĩa");

        repairTargetNewLabel.setText("Từ mới");

        repairExplainNewLabel.setText("Nghĩa mới");

        repairButton1.setText("Sửa");
        repairButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout repairFrame1Layout = new javax.swing.GroupLayout(repairFrame1.getContentPane());
        repairFrame1.getContentPane().setLayout(repairFrame1Layout);
        repairFrame1Layout.setHorizontalGroup(
            repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, repairFrame1Layout.createSequentialGroup()
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, repairFrame1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(repairExplainNewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repairTargetNewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repairExplainOldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repairTargetOldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(repairTargetNewTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(repairExplainOldTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(repairFrame1Layout.createSequentialGroup()
                                .addComponent(repairTargetOldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(repairExplainNewTextField)))
                    .addGroup(repairFrame1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(repairButton1)
                        .addGap(39, 39, 39)))
                .addGap(66, 66, 66))
        );
        repairFrame1Layout.setVerticalGroup(
            repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairFrame1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairTargetOldLabel)
                    .addComponent(repairTargetOldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairExplainOldLabel)
                    .addComponent(repairExplainOldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairTargetNewLabel)
                    .addComponent(repairTargetNewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairExplainNewLabel)
                    .addComponent(repairExplainNewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(repairButton1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setLocation(new java.awt.Point(420, 175));
        setResizable(false);

        enterFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enterFromKeyReleased(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/Audio.png"))); // NOI18N
        searchButton.setText("Phát âm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        informationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/Info.png"))); // NOI18N
        informationLabel.setText("Thông tin");

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/if_Create_131902.png"))); // NOI18N
        addButton.setText(" Thêm từ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        repairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/if_Writing_pencil_131827.png"))); // NOI18N
        repairButton.setText("Sửa từ");
        repairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/if_Erase_131842.png"))); // NOI18N
        deleteButton.setText("Xóa từ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/if_Close_131755.png"))); // NOI18N
        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        explainWord.setColumns(20);
        explainWord.setRows(5);
        jScrollPane2.setViewportView(explainWord);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        searchWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/if_Search_text_131785.png"))); // NOI18N
        searchWord.setText("Tìm kiếm");
        searchWord.setMaximumSize(new java.awt.Dimension(111, 41));
        searchWord.setMinimumSize(new java.awt.Dimension(111, 41));
        searchWord.setPreferredSize(new java.awt.Dimension(111, 41));
        searchWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchWord, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(repairButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)))
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, deleteButton, exitButton, repairButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(repairButton)
                    .addComponent(deleteButton)
                    .addComponent(exitButton)
                    .addComponent(searchWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        repairFrame.setVisible(false);
        deleteFrame.setVisible(false);
        addFrame.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void repairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairButtonActionPerformed
        addFrame.setVisible(false);
        deleteFrame.setVisible(false);
        repairFrame.setVisible(true);
    }//GEN-LAST:event_repairButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        addFrame.setVisible(false);
        repairFrame.setVisible(false);
        deleteFrame.setVisible(true);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordButtonActionPerformed
        int check = dictionaryCommandline.getDictionaryManagement().binarySearch(targetAddTextField.getText());
        
        if (targetAddTextField.getText().trim().equals("") || explainAddTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Từ hoặc nghĩa bị bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else if (check >= 0) {
            JOptionPane.showMessageDialog(null, "Từ đã có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else {
            Word newWord = new Word();
            newWord.setWord_target(targetAddTextField.getText().trim());
            newWord.setWord_explain(explainAddTextField.getText().trim());
            dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().add(newWord);
            dictionaryCommandline.getDictionaryManagement().sortWords();
            dictionaryCommandline.getDictionaryManagement().dictionaryExportToFile();
            int index = dictionaryCommandline.getDictionaryManagement().binarySearch(targetAddTextField.getText().trim());
            model.add(index, newWord.getWord_target());
            targetAddTextField.setText("");
            explainAddTextField.setText("");
            JOptionPane.showMessageDialog(null, "Thêm từ thành công", "Thành công", JOptionPane.CLOSED_OPTION);
        }
        
    }//GEN-LAST:event_addWordButtonActionPerformed

    private void deleteWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWordButtonActionPerformed
        int check = dictionaryCommandline.getDictionaryManagement().binarySearch(deleteWordTextField.getText().trim());

        if (deleteWordTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Từ bị bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else if (check == -1){
            JOptionPane.showMessageDialog(null, "Từ không có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else {
            dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().remove(check);
            model.remove(check);
            dictionaryCommandline.getDictionaryManagement().dictionaryExportToFile();
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Thành công", JOptionPane.CLOSED_OPTION);
            deleteWordTextField.setText("");
        }
    }//GEN-LAST:event_deleteWordButtonActionPerformed

    private void repairSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairSearchButtonActionPerformed
        int check = dictionaryCommandline.getDictionaryManagement().binarySearch(repairSearchTextField.getText().trim());

        if (repairSearchTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Từ bị bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else if (check == -1) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy từ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else {
            repairFrame1.setVisible(true);
            repairTargetOldTextField.setText(dictionaryCommandline.getDictionaryManagement().
                getDictionary().getWords().get(check).getWord_target());
            repairExplainOldTextField.setText(dictionaryCommandline.getDictionaryManagement().
                getDictionary().getWords().get(check).getWord_explain());
        }
    }//GEN-LAST:event_repairSearchButtonActionPerformed

    private void repairButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairButton1ActionPerformed
        int check = dictionaryCommandline.getDictionaryManagement().binarySearch(repairSearchTextField.getText().trim());
        int check1 = dictionaryCommandline.getDictionaryManagement().binarySearch(repairTargetNewTextField.getText());
        if (check1 >= 0) {
            JOptionPane.showMessageDialog(null, "Từ đã có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else {
            dictionaryCommandline.getDictionaryManagement().
            getDictionary().getWords().get(check).setWord_target(repairTargetNewTextField.getText());
            dictionaryCommandline.getDictionaryManagement().
            getDictionary().getWords().get(check).setWord_explain(repairExplainNewTextField.getText());
            dictionaryCommandline.getDictionaryManagement().sortWords();
            model.clear();
            setData();
            dictionaryCommandline.getDictionaryManagement().dictionaryExportToFile();
            JOptionPane.showMessageDialog(null, "Sửa thành công", "Thành công", JOptionPane.CLOSED_OPTION);
            repairSearchTextField.setText("");
            repairExplainNewTextField.setText("");
            repairTargetNewTextField.setText("");
            repairFrame1.setVisible(false);
        }
    }//GEN-LAST:event_repairButton1ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String text = enterFrom.getText();
        System.setProperty("mbrola.base", "mbrola");
        voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("mbrola_us1");
        voice.allocate();
        voice.speak(text);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String target = jList1.getSelectedValue();
        int index = dictionaryCommandline.getDictionaryManagement().binarySearch(target);
        explainWord.setText(dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().get(index)
        .getWord_explain());
        enterFrom.setText(target);
    }//GEN-LAST:event_jList1MouseClicked

    private void enterFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterFromKeyReleased
        String target = enterFrom.getText();
        listTarget.clear();
        for (int i = 0; i < dictionaryCommandline.getDictionaryManagement().getDictionary().getSizeWords(); i++) {
            if (dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().get(i)
            .getWord_target().startsWith(target))
                listTarget.addElement(dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().get(i).getWord_target());
        }
        model.clear();
        jList1.setModel(listTarget);
        explainWord.setText("");
    }//GEN-LAST:event_enterFromKeyReleased

    private void searchWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchWordActionPerformed
        String text = enterFrom.getText();
        int check = dictionaryCommandline.getDictionaryManagement().binarySearch(text);
        if (check < 0) {
            JOptionPane.showMessageDialog(null, "Từ không có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            explainWord.setText(dictionaryCommandline.getDictionaryManagement().getDictionary().getWords().get(check)
            .getWord_explain());
            enterFrom.setText(text);
        }
    }//GEN-LAST:event_searchWordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new DictionaryApplication().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JFrame addFrame;
    private javax.swing.JButton addWordButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JFrame deleteFrame;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JButton deleteWordButton;
    private javax.swing.JTextField deleteWordTextField;
    private javax.swing.JTextField enterFrom;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel explainAddLabel;
    private javax.swing.JTextField explainAddTextField;
    private javax.swing.JTextArea explainWord;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton repairButton;
    private javax.swing.JButton repairButton1;
    private javax.swing.JLabel repairExplainNewLabel;
    private javax.swing.JTextField repairExplainNewTextField;
    private javax.swing.JLabel repairExplainOldLabel;
    private javax.swing.JTextField repairExplainOldTextField;
    private javax.swing.JFrame repairFrame;
    private javax.swing.JFrame repairFrame1;
    private javax.swing.JButton repairSearchButton;
    private javax.swing.JTextField repairSearchTextField;
    private javax.swing.JLabel repairTargetLabel;
    private javax.swing.JLabel repairTargetNewLabel;
    private javax.swing.JTextField repairTargetNewTextField;
    private javax.swing.JLabel repairTargetOldLabel;
    private javax.swing.JTextField repairTargetOldTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchWord;
    private javax.swing.JLabel targetAddLabel;
    private javax.swing.JTextField targetAddTextField;
    // End of variables declaration//GEN-END:variables
}
