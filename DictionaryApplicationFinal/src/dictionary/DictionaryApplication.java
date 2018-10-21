/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import com.darkprograms.speech.synthesiser.Synthesiser;
import com.darkprograms.speech.translator.GoogleTranslate;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class DictionaryApplication extends javax.swing.JFrame {

    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    DefaultListModel model = new DefaultListModel();
    DefaultListModel tempModel = new DefaultListModel();
    Voice voice;
    VoiceManager voiceManager;

    public DictionaryApplication() throws FileNotFoundException {
        initComponents();
        explainWordTextArea.setEditable(false);
        repairTargetOldTextField.setEditable(false);
        dictionaryManagement.insertFromFile();
        setData();
        listWordTargetLabel.setForeground(Color.decode("#00CED1"));
        translateDocumentLabel.setForeground(Color.decode("#00CED1"));
        informationLabel.setForeground(Color.decode("#00CED1"));
        searchWordLabel.setForeground(Color.decode("#00CED1"));
    }

    private void setData() {

        for (int i = 0; i < dictionaryManagement.getDictionary().getSizeWords(); i++) {
            model.addElement(dictionaryManagement.getDictionary().getWords().get(i).getWord_target().trim());
        }
        listWordTarget.setModel(model);  
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFrame = new javax.swing.JFrame();
        targetAddLabel = new javax.swing.JLabel();
        targetAddTextField = new javax.swing.JTextField();
        explainAddLabel = new javax.swing.JLabel();
        addWordButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        explainTextArea = new javax.swing.JTextArea();
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
        repairTargetNewLabel = new javax.swing.JLabel();
        repairExplainNewLabel = new javax.swing.JLabel();
        repairTargetOldTextField = new javax.swing.JTextField();
        repairTargetNewTextField = new javax.swing.JTextField();
        repairButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        newExplain = new javax.swing.JTextArea();
        searchTextField = new javax.swing.JTextField();
        pronounceButton = new javax.swing.JButton();
        informationLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        repairButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        explainWordTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        listWordTarget = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        targetDocumentTextArea = new javax.swing.JTextArea();
        translateDocumentLabel = new javax.swing.JLabel();
        searchWordLabel = new javax.swing.JLabel();
        listWordTargetLabel = new javax.swing.JLabel();

        addFrame.setTitle("Thêm từ");
        addFrame.setLocation(new java.awt.Point(650, 300));
        addFrame.setName("Thêm từ"); // NOI18N
        addFrame.setSize(new java.awt.Dimension(420, 280));

        targetAddLabel.setText("Từ cần thêm");

        explainAddLabel.setText("Nghĩa");

        addWordButton.setText("Thêm");
        addWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordButtonActionPerformed(evt);
            }
        });

        explainTextArea.setColumns(20);
        explainTextArea.setLineWrap(true);
        explainTextArea.setRows(5);
        explainTextArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(explainTextArea);

        javax.swing.GroupLayout addFrameLayout = new javax.swing.GroupLayout(addFrame.getContentPane());
        addFrame.getContentPane().setLayout(addFrameLayout);
        addFrameLayout.setHorizontalGroup(
            addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrameLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addWordButton)
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(targetAddLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(explainAddLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(targetAddTextField))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        addFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {explainAddLabel, targetAddLabel});

        addFrameLayout.setVerticalGroup(
            addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrameLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addComponent(targetAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFrameLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(explainAddLabel))
                            .addGroup(addFrameLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(targetAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(addWordButton)
                .addContainerGap())
        );

        addFrameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {explainAddLabel, targetAddLabel});

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
        repairFrame1.setResizable(false);
        repairFrame1.setSize(new java.awt.Dimension(443, 310));

        repairTargetOldLabel.setText("Từ ");

        repairTargetNewLabel.setText("Từ mới");

        repairExplainNewLabel.setText("Nghĩa mới");

        repairButton1.setText("Sửa");
        repairButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairButton1ActionPerformed(evt);
            }
        });

        newExplain.setColumns(20);
        newExplain.setRows(5);
        jScrollPane5.setViewportView(newExplain);

        javax.swing.GroupLayout repairFrame1Layout = new javax.swing.GroupLayout(repairFrame1.getContentPane());
        repairFrame1.getContentPane().setLayout(repairFrame1Layout);
        repairFrame1Layout.setHorizontalGroup(
            repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairFrame1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(repairExplainNewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repairTargetNewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repairTargetOldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(repairTargetOldTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repairButton1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repairTargetNewTextField))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        repairFrame1Layout.setVerticalGroup(
            repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairFrame1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairTargetOldLabel)
                    .addComponent(repairTargetOldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repairTargetNewLabel)
                    .addComponent(repairTargetNewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(repairFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(repairFrame1Layout.createSequentialGroup()
                        .addComponent(repairExplainNewLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(repairButton1)
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setLocation(new java.awt.Point(420, 100));
        setResizable(false);

        searchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextFieldMouseClicked(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        pronounceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/speech_icon.png"))); // NOI18N
        pronounceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pronounceButtonActionPerformed(evt);
            }
        });

        informationLabel.setBackground(new java.awt.Color(255, 255, 255));
        informationLabel.setForeground(new java.awt.Color(255, 255, 255));
        informationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/infor.png"))); // NOI18N
        informationLabel.setText("Thông tin");

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/add.jpg"))); // NOI18N
        addButton.setText("Thêm từ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        repairButton.setBackground(new java.awt.Color(255, 255, 255));
        repairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/Repair-icon.png"))); // NOI18N
        repairButton.setText("Sửa từ");
        repairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/Delete_Icon.png"))); // NOI18N
        deleteButton.setText("Xóa từ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/exit_icon.png"))); // NOI18N
        exitButton.setText("Thoát");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        explainWordTextArea.setColumns(20);
        explainWordTextArea.setLineWrap(true);
        explainWordTextArea.setRows(5);
        explainWordTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(explainWordTextArea);

        listWordTarget.setName(""); // NOI18N
        listWordTarget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listWordTargetMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listWordTarget);

        targetDocumentTextArea.setColumns(20);
        targetDocumentTextArea.setLineWrap(true);
        targetDocumentTextArea.setRows(5);
        targetDocumentTextArea.setWrapStyleWord(true);
        targetDocumentTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                targetDocumentTextAreaMouseClicked(evt);
            }
        });
        targetDocumentTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                targetDocumentTextAreaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(targetDocumentTextArea);

        translateDocumentLabel.setText("Dịch văn bản");

        searchWordLabel.setForeground(new java.awt.Color(0, 187, 187));
        searchWordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/search.png"))); // NOI18N
        searchWordLabel.setText("Tìm kiếm từ ");

        listWordTargetLabel.setForeground(java.awt.Color.cyan);
        listWordTargetLabel.setText("Danh sách từ vựng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(translateDocumentLabel)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchWordLabel)
                    .addComponent(listWordTargetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pronounceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(repairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, repairButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(translateDocumentLabel)
                    .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pronounceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(listWordTargetLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addComponent(searchWordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton)
                    .addComponent(repairButton)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton))
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, deleteButton, exitButton, repairButton, searchTextField});

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
        int check = dictionaryManagement.binarySearch(targetAddTextField.getText());

        if (targetAddTextField.getText().trim().equals("") || explainTextArea.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Từ hoặc nghĩa bị bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (check >= 0) {
            JOptionPane.showMessageDialog(null, "Từ đã có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            Word newWord = new Word();
            newWord.setWord_target(targetAddTextField.getText().trim());
            newWord.setWord_explain(explainTextArea.getText().trim());
            dictionaryManagement.getDictionary().getWords().add(newWord);
            dictionaryManagement.sortWords();
            dictionaryManagement.dictionaryExportToFile();
            model.clear();
            setData();
            targetAddTextField.setText("");
            explainTextArea.setText("");
            JOptionPane.showMessageDialog(null, "Thêm từ thành công", "Thành công", JOptionPane.CLOSED_OPTION);
        }

    }//GEN-LAST:event_addWordButtonActionPerformed

    private void deleteWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWordButtonActionPerformed
        int check = dictionaryManagement.binarySearch(deleteWordTextField.getText().trim());

        if (deleteWordTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Từ bị bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (check == -1) {
            JOptionPane.showMessageDialog(null, "Từ không có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            dictionaryManagement.getDictionary().getWords().remove(check);
            model.remove(check);
            dictionaryManagement.dictionaryExportToFile();
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Thành công", JOptionPane.CLOSED_OPTION);
            deleteWordTextField.setText("");
        }
    }//GEN-LAST:event_deleteWordButtonActionPerformed

    private void repairSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairSearchButtonActionPerformed
        int check = dictionaryManagement.binarySearch(repairSearchTextField.getText().trim());

        if (repairSearchTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Từ bị bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else if (check == -1) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy từ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            repairFrame1.setVisible(true);
            repairTargetOldTextField.setText(dictionaryManagement.getDictionary().
                    getWords().get(check).getWord_target());
        }
    }//GEN-LAST:event_repairSearchButtonActionPerformed

    private void repairButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairButton1ActionPerformed
        int check = dictionaryManagement.binarySearch(repairSearchTextField.getText().trim());
        int checkTarget = dictionaryManagement.binarySearch(repairTargetNewTextField.getText());
        int checkExplain = dictionaryManagement.binarySearch(newExplain.getText());
        if (checkTarget != -1 && checkExplain != -1) {
            JOptionPane.showMessageDialog(null, "Từ đã có trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            dictionaryManagement.
                    getDictionary().getWords().get(check).setWord_target(repairTargetNewTextField.getText());
            dictionaryManagement.
                    getDictionary().getWords().get(check).setWord_explain(newExplain.getText());
            dictionaryManagement.sortWords();
            model.clear();
            setData();
            dictionaryManagement.dictionaryExportToFile();
            JOptionPane.showMessageDialog(null, "Sủa thành công", "Thành công", JOptionPane.CLOSED_OPTION);
            repairSearchTextField.setText("");
            newExplain.setText("");
            repairTargetNewTextField.setText("");
            repairFrame1.setVisible(false);
        }
    }//GEN-LAST:event_repairButton1ActionPerformed

    private void pronounceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pronounceButtonActionPerformed
        String text;
        if (targetDocumentTextArea.getText().compareTo("") != 0) {
            text = targetDocumentTextArea.getText();
        } else {
            text = listWordTarget.getSelectedValue();
        }
        Synthesiser synthesiser = new Synthesiser();
        Thread thread = new Thread(() -> {
            try {
                AdvancedPlayer player = new AdvancedPlayer(synthesiser.getMP3Data(text));
                player.play();
            } catch (IOException | JavaLayerException e) {
                JOptionPane.showMessageDialog(rootPane, "Kiểm tra lại kết nối mạng");
            }
        });
        thread.setDaemon(false);
        thread.start();
    }//GEN-LAST:event_pronounceButtonActionPerformed

    private void listWordTargetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listWordTargetMouseClicked
        targetDocumentTextArea.setText("");
        String target = listWordTarget.getSelectedValue();
        int index = dictionaryManagement.binarySearch(target);
        explainWordTextArea.setText(dictionaryManagement.getDictionary().getWords().get(index).getWord_explain());
    }//GEN-LAST:event_listWordTargetMouseClicked

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased

        String target = searchTextField.getText();
        model.clear();
        tempModel.clear();
        int first = dictionaryManagement.binarySearchFirstStartWith(target);
        int end = dictionaryManagement.binarySearchEndStartWith(target);
        if (first != -1) {
            for (int i = first; i <= end; i++) {
                if (dictionaryManagement.getDictionary().getWords().get(i)
                        .getWord_target().startsWith(target)) {
                    tempModel.addElement(dictionaryManagement.getDictionary().getWords().get(i).getWord_target());
                }
            }
        }
        model.clear();
        listWordTarget.setModel(tempModel);
        explainWordTextArea.setText("");
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void targetDocumentTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_targetDocumentTextAreaKeyReleased
        try {
            String target = targetDocumentTextArea.getText();
            String[] arrTarget = target.split("\n");
            String explain = "";
            for (String temp : arrTarget) {
                explain = explain.concat(GoogleTranslate.translate("vi", temp) + "\n");
            }
            explainWordTextArea.setText(explain);
        } catch (IOException ex) {
            Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_targetDocumentTextAreaKeyReleased

    private void searchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextFieldMouseClicked
        targetDocumentTextArea.setText("");
    }//GEN-LAST:event_searchTextFieldMouseClicked

    private void targetDocumentTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetDocumentTextAreaMouseClicked
        searchTextField.setText("");
        setData();
    }//GEN-LAST:event_targetDocumentTextAreaMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new DictionaryApplication().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DictionaryApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel explainAddLabel;
    private javax.swing.JTextArea explainTextArea;
    private javax.swing.JTextArea explainWordTextArea;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listWordTarget;
    private javax.swing.JLabel listWordTargetLabel;
    private javax.swing.JTextArea newExplain;
    private javax.swing.JButton pronounceButton;
    private javax.swing.JButton repairButton;
    private javax.swing.JButton repairButton1;
    private javax.swing.JLabel repairExplainNewLabel;
    private javax.swing.JFrame repairFrame;
    private javax.swing.JFrame repairFrame1;
    private javax.swing.JButton repairSearchButton;
    private javax.swing.JTextField repairSearchTextField;
    private javax.swing.JLabel repairTargetLabel;
    private javax.swing.JLabel repairTargetNewLabel;
    private javax.swing.JTextField repairTargetNewTextField;
    private javax.swing.JLabel repairTargetOldLabel;
    private javax.swing.JTextField repairTargetOldTextField;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel searchWordLabel;
    private javax.swing.JLabel targetAddLabel;
    private javax.swing.JTextField targetAddTextField;
    private javax.swing.JTextArea targetDocumentTextArea;
    private javax.swing.JLabel translateDocumentLabel;
    // End of variables declaration//GEN-END:variables
}
