
package JavaProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.Timer;

public class KTTriNho extends javax.swing.JFrame {
    public Timer timer;
    public int a,timeEasy,diem=0,trueNum=0;
    public KTTriNho() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        start = new javax.swing.JButton();
        numran = new javax.swing.JLabel();
        timeTop = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BRAIN TRANNING");

        input.setBorder(new javax.swing.border.MatteBorder(null));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        ok.setText("OK");
        ok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        start.setText("START");
        start.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        numran.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        numran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numran.setText("LOOK IN HERE");

        timeTop.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        timeTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeTop.setText("TIME");

        score.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        score.setText("0");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input)
                            .addComponent(numran, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeTop, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeTop, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(numran, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        //start
        timeEasy=20;
        diem=0;
        load();
        score.setText("0");
        timer = new Timer(1000, new loadTime());
        timer.start();
       
    }//GEN-LAST:event_startActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        if(Integer.parseInt(input.getText())==a){ // kiem tra xem == random?
            diem++;
            timeEasy=20;
            timer.start();
            score.setText("True"); // ghi trang thai true
            load(); // random lai so moi
            input.setText(""); // xoa so da nhap game truoc
        }
        else{
       
           numran.setText("Your Score: "+diem); //hien diem
           input.setText(""); // xoa ki tu game truoc
           score.setText(""+a); // hien dap an dung
           timer.stop(); 
        }
    }//GEN-LAST:event_okActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    }//GEN-LAST:event_inputActionPerformed
    //RANDOM 
    public void load(){ 
        Random rd= new Random();  
        if(diem>=0&&diem<=1){   
           a= rd.nextInt(99)+1;
           numran.setText(String.valueOf(a));
        }
        else if(diem>1&&diem<=3){
           a= rd.nextInt(99+99999)+1;
           numran.setText(String.valueOf(a));
        }   
        else if(diem>3&&diem<=7){
         a= rd.nextInt(99999+9999999)+1;
         numran.setText(String.valueOf(a));
        }
        else{
         a= rd.nextInt(1000000000)+1;
         numran.setText(String.valueOf(a));
        }
           
    }                           
     
     public class loadTime implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
                if(timeEasy>0){
                    timeEasy--;
                    timeTop.setText(String.valueOf(timeEasy));
                    //timeLine.setValue();
                    if(timeEasy>=10){ // tránh người dùng nhập trước đáp án
                    input.setText("");}
                    if(timeEasy<=10){ // nhỏ hơn 10s mới được nhập
                     numran.setText("Write Your Aswer");
                    }
                }
                
                else {
                    //autocheck
                    if(Integer.parseInt(input.getText())==a){
                    diem++;
                    timeEasy=20;
                    timer.start();
                    score.setText("True");
                    load();
                    input.setText("");
                    }
                       else {load(); // Ngoai le
                            numran.setText("Your Score: "+diem);
                            timer.stop();
                            score.setText(""+a);
                    }
                    
                }
        }
     
     }
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KTTriNho().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel numran;
    private javax.swing.JButton ok;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel score;
    private javax.swing.JButton start;
    private javax.swing.JLabel timeTop;
    // End of variables declaration//GEN-END:variables
}
