/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author haiclover
 */
public class LearnComputerNetwork extends javax.swing.JFrame {
    
//    private static ArrayList question;
//    private static ArrayList answerA;
//    private static ArrayList answerB;
//    private static ArrayList answerC;
//    private static ArrayList answerD;
//    private static ArrayList result;
    private static int qcount;
    private static int totalQuestion;
    private static int correct;
    private static int wrong;
    private static int checkCorrect = 0;
    
    private static ArrayList<Exercise>allQuestion; 
    
    
    
    /**
     * Creates new form LearnComputerNetwork
     */
    public LearnComputerNetwork(){
        initComponents();
        qcount = 0;
//        question = new ArrayList();
//        answerA = new ArrayList();
//        answerB = new ArrayList();
//        answerC = new ArrayList();
//        answerD = new ArrayList();
//        result = new ArrayList();
        
        allQuestion = new ArrayList<>();
        getDataFromXml();
        
        Collections.shuffle(allQuestion);
        
        totalQuestion = allQuestion.size();
        questionLabel.setText("Câu 1" + "/" + totalQuestion + ": " + allQuestion.get(qcount).getQuestion());
        aLabel.setText("A, " + allQuestion.get(qcount).getAnswerA());
        bLabel.setText("B, " + allQuestion.get(qcount).getAnswerB());
        cLabel.setText("C, " + allQuestion.get(qcount).getAnswerC());
        dLabel.setText("D, " + allQuestion.get(qcount).getAnswerD());
        scoreLabel.setText("Correct: " + correct + " - Wrong: " + wrong);
        scoreLabel.setForeground(Color.red);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        aLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionLabel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1600, 768));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ôn tập mạng máy tính");

        aBtn.setText("A");
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });

        bBtn.setText("B");
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });

        dBtn.setText("D");
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });

        cBtn.setText("C");
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });

        aLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        scoreLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        questionLabel.setEditable(false);
        questionLabel.setColumns(20);
        questionLabel.setLineWrap(true);
        questionLabel.setRows(5);
        jScrollPane2.setViewportView(questionLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(cBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(744, 744, 744)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(dBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(bBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(cBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(172, 172, 172))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getNewQuestion(){
        ++qcount;
        if(qcount < totalQuestion){
            int num = qcount+1;
            questionLabel.setText("Câu " + num + "/" + totalQuestion +": " + allQuestion.get(qcount).getQuestion());
            aLabel.setText("A, " + allQuestion.get(qcount).getAnswerA());
            bLabel.setText("B, " + allQuestion.get(qcount).getAnswerB());
            cLabel.setText("C, " + allQuestion.get(qcount).getAnswerC());
            dLabel.setText("D, " + allQuestion.get(qcount).getAnswerD());
            checkCorrect = 0;
        }
    }
    
    public void resetBtn(){
        aBtn.setBackground(null);
        bBtn.setBackground(null);
        cBtn.setBackground(null);
        dBtn.setBackground(null);
        aBtn.setEnabled(true);
        bBtn.setEnabled(true);
        cBtn.setEnabled(true);
        dBtn.setEnabled(true);
    }
    
    public void process(JButton jb,String ans){
        if(allQuestion.get(qcount).getResult().equals(ans)){
            jb.setBackground(Color.green);
            if(checkCorrect != 2){
                ++correct;
            }
            ActionListener listener = new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    getNewQuestion();
                    resetBtn();
                }
            };
            Timer timer = new Timer(1000, listener);
            timer.setRepeats(false);
            timer.start();

        }
        else{
            jb.setEnabled(false);
            if(checkCorrect == 0){
                ++wrong;
                checkCorrect = 2;
            }
        }
        scoreLabel.setText("Correct: " + correct + " - Wrong: " + wrong);
    }
    
    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        if(evt.getSource() == aBtn){
            process(aBtn,"A");
        }
    }//GEN-LAST:event_aBtnActionPerformed

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        if(evt.getSource() == bBtn){
            process(bBtn,"B");
        }
    }//GEN-LAST:event_bBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        if(evt.getSource() == cBtn){
            process(cBtn,"C");
            
        }
    }//GEN-LAST:event_cBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        if(evt.getSource() == dBtn){
            process(dBtn,"D");
        }
    }//GEN-LAST:event_dBtnActionPerformed

    public static void getDataFromXml(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("mmt.xml"));
            document.getDocumentElement().normalize();
            Element root = document.getDocumentElement();
            //System.out.println(root.getNodeName());
            NodeList nList = document.getElementsByTagName("entry");

            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node node = nList.item(temp);
                System.out.println("");    //Just a separator
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    Exercise e = new Exercise();
                    e.setQuestion(eElement.getElementsByTagName("noidung").item(0).getTextContent());
                    e.setAnswerA(eElement.getElementsByTagName("A").item(0).getTextContent());
                    e.setAnswerB(eElement.getElementsByTagName("B").item(0).getTextContent());
                    e.setAnswerC(eElement.getElementsByTagName("C").item(0).getTextContent());
                    e.setAnswerD(eElement.getElementsByTagName("D").item(0).getTextContent());
                    e.setResult(eElement.getElementsByTagName("Ans").item(0).getTextContent());
                    
                    allQuestion.add(e);
//                    question.add(eElement.getElementsByTagName("noidung").item(0).getTextContent());
//                    answerA.add(eElement.getElementsByTagName("A").item(0).getTextContent());
//                    answerB.add(eElement.getElementsByTagName("B").item(0).getTextContent());
//                    answerC.add(eElement.getElementsByTagName("C").item(0).getTextContent());
//                    answerD.add(eElement.getElementsByTagName("D").item(0).getTextContent());
//                    result.add(eElement.getElementsByTagName("Ans").item(0).getTextContent());
                    //System.out.println("Cau hoi : "  + eElement.getElementsByTagName("noidung").item(0).getTextContent());
                }
            }
        } catch (SAXException ex) {
            Logger.getLogger(LearnComputerNetwork.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LearnComputerNetwork.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LearnComputerNetwork.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            
        }
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
            java.util.logging.Logger.getLogger(LearnComputerNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LearnComputerNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LearnComputerNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LearnComputerNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LearnComputerNetwork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JLabel aLabel;
    private javax.swing.JButton bBtn;
    private javax.swing.JLabel bLabel;
    private javax.swing.JButton cBtn;
    private javax.swing.JLabel cLabel;
    private javax.swing.JButton dBtn;
    private javax.swing.JLabel dLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea questionLabel;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
