/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcal;

import java.awt.Dimension;

/**
 *
 * @author DjShujja
 */
public class CalculatorGUI extends javax.swing.JFrame {

    int total_subjects;
    int rollNo = 123;

    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI(int rollNo, int total_subjects) {
        initComponents();
        
        txt_sub2.setPreferredSize(new Dimension(100,25));
        
        lbl_grade1.setVisible(false);
        lbl_grade2.setVisible(false);
        lbl_grade3.setVisible(false);
        lbl_grade4.setVisible(false);
        lbl_grade5.setVisible(false);
        lbl_grade6.setVisible(false);
        lbl_grade7.setVisible(false);
        lbl_grade8.setVisible(false);
        subject2.setVisible(false);
        cmb_ch2.setVisible(false);
        txt_marks2.setVisible(false);
        txt_sub2.setVisible(false);
       

        subject3.setVisible(false);
        cmb_ch3.setVisible(false);
        txt_marks3.setVisible(false);
        txt_sub3.setVisible(false);
        

        subject4.setVisible(false);
        cmb_ch4.setVisible(false);
        txt_marks4.setVisible(false);
        txt_sub4.setVisible(false);
       

        subject5.setVisible(false);
        cmb_ch5.setVisible(false);
        txt_marks5.setVisible(false);
        txt_sub5.setVisible(false);
        

        subject6.setVisible(false);
        cmb_ch6.setVisible(false);
        txt_marks6.setVisible(false);
        txt_sub6.setVisible(false);
      

        subject7.setVisible(false);
        cmb_ch7.setVisible(false);
        txt_marks7.setVisible(false);
        txt_sub7.setVisible(false);
       

        subject8.setVisible(false);
        cmb_ch8.setVisible(false);
        txt_marks8.setVisible(false);
        txt_sub8.setVisible(false);
     

        switch(total_subjects){
            case 1:{
            break;
            }
            case 2:{
                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
               
break;
            }
            case 3: {
                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
               

                this.subject3.setVisible(true);
                cmb_ch3.setVisible(true);
                txt_marks3.setVisible(true);
                txt_sub3.setVisible(true);
                
break;
            }
            case 4: {
                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
            

                this.subject3.setVisible(true);
                cmb_ch3.setVisible(true);
                txt_marks3.setVisible(true);
                txt_sub3.setVisible(true);
         

                this.subject4.setVisible(true);
                cmb_ch4.setVisible(true);
                txt_marks4.setVisible(true);
                txt_sub4.setVisible(true);
             
                break;
            }
            case 5:{
                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
            

                this.subject3.setVisible(true);
                cmb_ch3.setVisible(true);
                txt_marks3.setVisible(true);
                txt_sub3.setVisible(true);
     

                this.subject4.setVisible(true);
                cmb_ch4.setVisible(true);
                txt_marks4.setVisible(true);
                txt_sub4.setVisible(true);
         

                this.subject5.setVisible(true);
                cmb_ch5.setVisible(true);
                txt_marks5.setVisible(true);
                txt_sub5.setVisible(true);
        
                break;
            }
            case 6:{
                                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
           

                this.subject3.setVisible(true);
                cmb_ch3.setVisible(true);
                txt_marks3.setVisible(true);
                txt_sub3.setVisible(true);
           

                this.subject4.setVisible(true);
                cmb_ch4.setVisible(true);
                txt_marks4.setVisible(true);
                txt_sub4.setVisible(true);
              

                this.subject5.setVisible(true);
                cmb_ch5.setVisible(true);
                txt_marks5.setVisible(true);
                txt_sub5.setVisible(true);
         
                
                                this.subject6.setVisible(true);
                cmb_ch6.setVisible(true);
                txt_marks6.setVisible(true);
                txt_sub6.setVisible(true);
         
                
                      
                break;
            }
            case 7:{
                                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
           

                this.subject3.setVisible(true);
                cmb_ch3.setVisible(true);
                txt_marks3.setVisible(true);
                txt_sub3.setVisible(true);
         

                this.subject4.setVisible(true);
                cmb_ch4.setVisible(true);
                txt_marks4.setVisible(true);
                txt_sub4.setVisible(true);
              

                this.subject5.setVisible(true);
                cmb_ch5.setVisible(true);
                txt_marks5.setVisible(true);
                txt_sub5.setVisible(true);
             
                
                                this.subject6.setVisible(true);
                cmb_ch6.setVisible(true);
                txt_marks6.setVisible(true);
                txt_sub6.setVisible(true);
          
                
                                this.subject7.setVisible(true);
                cmb_ch7.setVisible(true);
                txt_marks7.setVisible(true);
                txt_sub7.setVisible(true);
          

                
                      
                break;
            }
            case 8:{
                this.subject2.setVisible(true);
                cmb_ch2.setVisible(true);
                txt_marks2.setVisible(true);
                txt_sub2.setVisible(true);
     

                this.subject3.setVisible(true);
                cmb_ch3.setVisible(true);
                txt_marks3.setVisible(true);
                txt_sub3.setVisible(true);
  

                this.subject4.setVisible(true);
                cmb_ch4.setVisible(true);
                txt_marks4.setVisible(true);
                txt_sub4.setVisible(true);
 

                this.subject5.setVisible(true);
                cmb_ch5.setVisible(true);
                txt_marks5.setVisible(true);
                txt_sub5.setVisible(true);
 
                
                                this.subject6.setVisible(true);
                cmb_ch6.setVisible(true);
                txt_marks6.setVisible(true);
                txt_sub6.setVisible(true);

                
                                this.subject7.setVisible(true);
                cmb_ch7.setVisible(true);
                txt_marks7.setVisible(true);
                txt_sub7.setVisible(true);


                
                                this.subject8.setVisible(true);
                cmb_ch8.setVisible(true);
                txt_marks8.setVisible(true);
                txt_sub8.setVisible(true);
       
                break;
            }
        }
        
        this.total_subjects = total_subjects;
        this.rollNo = rollNo;
        lbl_rollNo.setText(Integer.toString(this.rollNo));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        subjec1 = new javax.swing.JLabel();
        subject2 = new javax.swing.JLabel();
        subject3 = new javax.swing.JLabel();
        subject4 = new javax.swing.JLabel();
        subject5 = new javax.swing.JLabel();
        subject6 = new javax.swing.JLabel();
        txt_sub1 = new javax.swing.JTextField();
        txt_sub2 = new javax.swing.JTextField();
        txt_sub3 = new javax.swing.JTextField();
        txt_sub4 = new javax.swing.JTextField();
        txt_sub5 = new javax.swing.JTextField();
        txt_sub6 = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        txt_gpa = new javax.swing.JTextField();
        txt_marks1 = new javax.swing.JTextField();
        txt_marks2 = new javax.swing.JTextField();
        txt_marks3 = new javax.swing.JTextField();
        txt_marks4 = new javax.swing.JTextField();
        txt_marks5 = new javax.swing.JTextField();
        txt_marks6 = new javax.swing.JTextField();
        cmb_ch1 = new javax.swing.JComboBox<>();
        cmb_ch2 = new javax.swing.JComboBox<>();
        cmb_ch3 = new javax.swing.JComboBox<>();
        cmb_ch4 = new javax.swing.JComboBox<>();
        cmb_ch5 = new javax.swing.JComboBox<>();
        cmb_ch6 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lbl_rollNo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_marks7 = new javax.swing.JTextField();
        cmb_ch7 = new javax.swing.JComboBox<>();
        txt_sub7 = new javax.swing.JTextField();
        subject7 = new javax.swing.JLabel();
        txt_marks8 = new javax.swing.JTextField();
        cmb_ch8 = new javax.swing.JComboBox<>();
        txt_sub8 = new javax.swing.JTextField();
        subject8 = new javax.swing.JLabel();
        lbl_grade1 = new javax.swing.JLabel();
        lbl_grade2 = new javax.swing.JLabel();
        lbl_grade3 = new javax.swing.JLabel();
        lbl_grade4 = new javax.swing.JLabel();
        lbl_grade5 = new javax.swing.JLabel();
        lbl_grade6 = new javax.swing.JLabel();
        lbl_grade7 = new javax.swing.JLabel();
        lbl_grade8 = new javax.swing.JLabel();
        cmb_sem = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GPA CALCULATOR");

        subjec1.setText("Subect 1");

        subject2.setText("Subect 2");

        subject3.setText("Subject 3");

        subject4.setText("Subject 4");

        subject5.setText("Subject 5");

        subject6.setText("Subject 6");

        txt_sub6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sub6ActionPerformed(evt);
            }
        });

        btn_calculate.setText("Calculate SGPA");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        txt_gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gpaActionPerformed(evt);
            }
        });

        cmb_ch1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        cmb_ch2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        cmb_ch3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        cmb_ch4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        cmb_ch5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        cmb_ch6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        lbl_rollNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_rollNo.setText("Your Roll# Here");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Marks");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Credit Hours");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("WELCOME ");

        cmb_ch7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        subject7.setText("Subject 7");

        cmb_ch8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1" }));

        subject8.setText("Subject 8");

        lbl_grade1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade1.setText("Grade");

        lbl_grade2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade2.setText("Grade");

        lbl_grade3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade3.setText("Grade");

        lbl_grade4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade4.setText("Grade");

        lbl_grade5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade5.setText("Grade");

        lbl_grade6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade6.setText("Grade");

        lbl_grade7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade7.setText("Grade");

        lbl_grade8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_grade8.setText("Grade");

        cmb_sem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8", "Semester 9" }));

        jButton1.setText("GO BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel11)
                        .addGap(13, 13, 13)
                        .addComponent(lbl_rollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225)
                                .addComponent(jButton1))
                            .addComponent(cmb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_marks1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_marks2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_marks6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_marks7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_marks8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmb_ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cmb_ch7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmb_ch3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmb_ch8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmb_ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_ch6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_grade5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_grade2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_grade3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_grade4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_grade6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_grade8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_grade7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(subject8)
                                            .addComponent(subject7))
                                        .addGap(27, 27, 27)
                                        .addComponent(txt_sub8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(subject3)
                                        .addGap(147, 147, 147))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subjec1)
                                            .addComponent(subject2)))
                                    .addComponent(subject4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subject5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subject6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sub5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sub6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sub7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_marks3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbl_rollNo))
                .addGap(52, 52, 52)
                .addComponent(cmb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjec1)
                            .addComponent(txt_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subject2)
                            .addComponent(txt_sub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_grade2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_marks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_grade1))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject3)
                    .addComponent(txt_sub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_marks3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_ch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_grade3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject4)
                    .addComponent(txt_marks4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_ch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_grade4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subject5)
                            .addComponent(txt_sub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ch5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subject8)
                            .addComponent(txt_sub8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ch8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_grade8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_calculate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbl_grade5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_ch6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject6)
                            .addComponent(txt_sub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_grade6))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_ch7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject7)
                            .addComponent(txt_sub7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_marks7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_grade7))
                        .addGap(320, 320, 320))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        // TODO add your handling code here:
        gpaLogic gpalogic = new gpaLogic();
        String g1, g2, g3, g4, g5, g6, g7, g8, subject1, subject2, subject3, subject4, subject5, subject6, subject7, subject8, semester;
        float sub1, sub2, sub3, sub4, sub5, sub6, SGPA = 0;
        int ch1, ch2, ch3, ch4, ch5, ch6, ch7;
        switch (total_subjects) {
            case 1:{
                lbl_grade1.setVisible(true);
                sub1 = Float.parseFloat(txt_marks1.getText());
//        sub6 = Float.parseFloat(txt_marks6.getText());
                subject1 = txt_sub1.getText();

                ch1 = Integer.parseInt(cmb_ch1.getSelectedItem().toString());
                
//        ch6 = Integer.parseInt(txt_ch6.getText());
                float gpa1, gpa2, gpa3, gpa4, gpa5;
                gpa1 = gpalogic.gpa_logic(sub1, ch1);

                g1 = gpalogic.marks_grade(sub1);

                lbl_grade1.setText(g1);

                semester = cmb_sem.getSelectedItem().toString();

                students_data sd = new students_data();

//        sub6 = gpalogic.gpa_logic(sub6, ch6);
                float total_gpa = (float) gpa1;
                float total_ch = (float) ch1;
//        System.out.print("TOTAL GPA = " + total_gpa);
                SGPA = (float) total_gpa / total_ch;
                dao dao = new dao();
                sd.rollNo = this.rollNo;
                sd.semester = semester;
                sd.subject = subject1;
                sd.creditHour = ch1;
                sd.marks = sub1;
                sd.grade = g1;

                dao.insertStudentData(sd);
                                break;
            }
            case 2: {
                lbl_grade1.setVisible(true);
                lbl_grade2.setVisible(true); 
                sub1 = Float.parseFloat(txt_marks1.getText());
                sub2 = Float.parseFloat(txt_marks2.getText());
                
//        sub6 = Float.parseFloat(txt_marks6.getText());
                subject1 = txt_sub1.getText();
                subject2 = txt_sub2.getText();

                ch1 = Integer.parseInt(cmb_ch1.getSelectedItem().toString());
                ch2 = Integer.parseInt(cmb_ch2.getSelectedItem().toString());
//        ch6 = Integer.parseInt(txt_ch6.getText());
                float gpa1, gpa2, gpa3, gpa4, gpa5;
                gpa1 = gpalogic.gpa_logic(sub1, ch1);
                gpa2 = gpalogic.gpa_logic(sub2, ch2);

                g1 = gpalogic.marks_grade(sub1);
                g2 = gpalogic.marks_grade(sub2);

                lbl_grade1.setText(g1);
                lbl_grade2.setText(g2);

                semester = cmb_sem.getSelectedItem().toString();

                students_data sd = new students_data();

//        sub6 = gpalogic.gpa_logic(sub6, ch6);
                float total_gpa = (float) gpa1 + gpa2;
                float total_ch = (float) ch1 + ch2 ;
//        System.out.print("TOTAL GPA = " + total_gpa);
                SGPA = (float) total_gpa / total_ch;
                dao dao = new dao();
                sd.rollNo = this.rollNo;
                sd.semester = semester;
                sd.subject = subject1;
                sd.creditHour = ch1;
                sd.marks = sub1;
                sd.grade = g1;

                dao.insertStudentData(sd);

                sd.subject = subject2;
                sd.creditHour = ch2;
                sd.marks = sub2;
                sd.grade = g2;

                dao.insertStudentData(sd);

                break;
            }
            
            case 3:{
                 
                lbl_grade1.setVisible(true);
                lbl_grade2.setVisible(true);
                lbl_grade3.setVisible(true);
                
                sub1 = Float.parseFloat(txt_marks1.getText());
                sub2 = Float.parseFloat(txt_marks2.getText());
                sub3 = Float.parseFloat(txt_marks3.getText());
//        sub6 = Float.parseFloat(txt_marks6.getText());
                subject1 = txt_sub1.getText();
                subject2 = txt_sub2.getText();
                subject3 = txt_sub3.getText();

                ch1 = Integer.parseInt(cmb_ch1.getSelectedItem().toString());
                ch2 = Integer.parseInt(cmb_ch2.getSelectedItem().toString());
                ch3 = Integer.parseInt(cmb_ch3.getSelectedItem().toString());
//        ch6 = Integer.parseInt(txt_ch6.getText());
                float gpa1, gpa2, gpa3, gpa4, gpa5;
                gpa1 = gpalogic.gpa_logic(sub1, ch1);
                gpa2 = gpalogic.gpa_logic(sub2, ch2);
                gpa3 = gpalogic.gpa_logic(sub3, ch3);

                g1 = gpalogic.marks_grade(sub1);
                g2 = gpalogic.marks_grade(sub2);
                g3 = gpalogic.marks_grade(sub3);

                lbl_grade1.setText(g1);
                lbl_grade2.setText(g2);
                lbl_grade3.setText(g3);

                semester = cmb_sem.getSelectedItem().toString();

                students_data sd = new students_data();

//        sub6 = gpalogic.gpa_logic(sub6, ch6);
                float total_gpa = (float) gpa1 + gpa2 + gpa3 ;
                float total_ch = (float) ch1 + ch2 + ch3 ;
//        System.out.print("TOTAL GPA = " + total_gpa);
                SGPA = (float) total_gpa / total_ch;
                dao dao = new dao();
                sd.rollNo = this.rollNo;
                sd.semester = semester;
                sd.subject = subject1;
                sd.creditHour = ch1;
                sd.marks = sub1;
                sd.grade = g1;

                dao.insertStudentData(sd);

                sd.subject = subject2;
                sd.creditHour = ch2;
                sd.marks = sub2;
                sd.grade = g2;

                dao.insertStudentData(sd);

                sd.subject = subject3;
                sd.creditHour = ch3;
                sd.marks = sub3;
                sd.grade = g3;

                dao.insertStudentData(sd);
                break;
            }
            case 4: {
                
                lbl_grade1.setVisible(true);
                lbl_grade2.setVisible(true);
                lbl_grade3.setVisible(true);
                lbl_grade4.setVisible(true);
                
                 
                sub1 = Float.parseFloat(txt_marks1.getText());
                sub2 = Float.parseFloat(txt_marks2.getText());
                sub3 = Float.parseFloat(txt_marks3.getText());
                sub4 = Float.parseFloat(txt_marks4.getText());
//        sub6 = Float.parseFloat(txt_marks6.getText());
                subject1 = txt_sub1.getText();
                subject2 = txt_sub2.getText();
                subject3 = txt_sub3.getText();
                subject4 = txt_sub4.getText();

                ch1 = Integer.parseInt(cmb_ch1.getSelectedItem().toString());
                ch2 = Integer.parseInt(cmb_ch2.getSelectedItem().toString());
                ch3 = Integer.parseInt(cmb_ch3.getSelectedItem().toString());
                ch4 = Integer.parseInt(cmb_ch4.getSelectedItem().toString());
//        ch6 = Integer.parseInt(txt_ch6.getText());
                float gpa1, gpa2, gpa3, gpa4, gpa5;
                gpa1 = gpalogic.gpa_logic(sub1, ch1);
                gpa2 = gpalogic.gpa_logic(sub2, ch2);
                gpa3 = gpalogic.gpa_logic(sub3, ch3);
                gpa4 = gpalogic.gpa_logic(sub4, ch4);
                
                g1 = gpalogic.marks_grade(sub1);
                g2 = gpalogic.marks_grade(sub2);
                g3 = gpalogic.marks_grade(sub3);
                g4 = gpalogic.marks_grade(sub4);
                
                lbl_grade1.setText(g1);
                lbl_grade2.setText(g2);
                lbl_grade3.setText(g3);
                lbl_grade4.setText(g4);
                
                semester = cmb_sem.getSelectedItem().toString();

                students_data sd = new students_data();

//        sub6 = gpalogic.gpa_logic(sub6, ch6);
                float total_gpa = (float) gpa1 + gpa2 + gpa3 + gpa4 ;
                float total_ch = (float) ch1 + ch2 + ch3 + ch4 ;
//        System.out.print("TOTAL GPA = " + total_gpa);
                SGPA = (float) total_gpa / total_ch;
                dao dao = new dao();
                sd.rollNo = this.rollNo;
                sd.semester = semester;
                sd.subject = subject1;
                sd.creditHour = ch1;
                sd.marks = sub1;
                sd.grade = g1;

                dao.insertStudentData(sd);

                sd.subject = subject2;
                sd.creditHour = ch2;
                sd.marks = sub2;
                sd.grade = g2;

                dao.insertStudentData(sd);

                sd.subject = subject3;
                sd.creditHour = ch3;
                sd.marks = sub3;
                sd.grade = g3;

                dao.insertStudentData(sd);

                sd.subject = subject4;
                sd.creditHour = ch4;
                sd.marks = sub4;
                sd.grade = g4;

                dao.insertStudentData(sd);

                
                break;
            }
                
            case 5: {

                
                lbl_grade1.setVisible(true);
                lbl_grade2.setVisible(true);
                lbl_grade3.setVisible(true);
                lbl_grade4.setVisible(true);
                lbl_grade5.setVisible(true);
                
                sub1 = Float.parseFloat(txt_marks1.getText());
                sub2 = Float.parseFloat(txt_marks2.getText());
                sub3 = Float.parseFloat(txt_marks3.getText());
                sub4 = Float.parseFloat(txt_marks4.getText());
                sub5 = Float.parseFloat(txt_marks5.getText());
//        sub6 = Float.parseFloat(txt_marks6.getText());
                subject1 = txt_sub1.getText();
                subject2 = txt_sub2.getText();
                subject3 = txt_sub3.getText();
                subject4 = txt_sub4.getText();
                subject5 = txt_sub5.getText();

                ch1 = Integer.parseInt(cmb_ch1.getSelectedItem().toString());
                ch2 = Integer.parseInt(cmb_ch2.getSelectedItem().toString());
                ch3 = Integer.parseInt(cmb_ch3.getSelectedItem().toString());
                ch4 = Integer.parseInt(cmb_ch4.getSelectedItem().toString());
                ch5 = Integer.parseInt(cmb_ch5.getSelectedItem().toString());
//        ch6 = Integer.parseInt(txt_ch6.getText());
                float gpa1, gpa2, gpa3, gpa4, gpa5;
                gpa1 = gpalogic.gpa_logic(sub1, ch1);
                gpa2 = gpalogic.gpa_logic(sub2, ch2);
                gpa3 = gpalogic.gpa_logic(sub3, ch3);
                gpa4 = gpalogic.gpa_logic(sub4, ch4);
                gpa5 = gpalogic.gpa_logic(sub5, ch5);

                g1 = gpalogic.marks_grade(sub1);
                g2 = gpalogic.marks_grade(sub2);
                g3 = gpalogic.marks_grade(sub3);
                g4 = gpalogic.marks_grade(sub4);
                g5 = gpalogic.marks_grade(sub5);

                lbl_grade1.setText(g1);
                lbl_grade2.setText(g2);
                lbl_grade3.setText(g3);
                lbl_grade4.setText(g4);
                lbl_grade5.setText(g5);

                semester = cmb_sem.getSelectedItem().toString();

                students_data sd = new students_data();

//        sub6 = gpalogic.gpa_logic(sub6, ch6);
                float total_gpa = (float) gpa1 + gpa2 + gpa3 + gpa4 + gpa5;
                float total_ch = (float) ch1 + ch2 + ch3 + ch4 + ch5;
//        System.out.print("TOTAL GPA = " + total_gpa);
                SGPA = (float) total_gpa / total_ch;
                dao dao = new dao();
                sd.rollNo = this.rollNo;
                sd.semester = semester;
                sd.subject = subject1;
                sd.creditHour = ch1;
                sd.marks = sub1;
                sd.grade = g1;

                dao.insertStudentData(sd);

                sd.subject = subject2;
                sd.creditHour = ch2;
                sd.marks = sub2;
                sd.grade = g2;

                dao.insertStudentData(sd);

                sd.subject = subject3;
                sd.creditHour = ch3;
                sd.marks = sub3;
                sd.grade = g3;

                dao.insertStudentData(sd);

                sd.subject = subject4;
                sd.creditHour = ch4;
                sd.marks = sub4;
                sd.grade = g4;

                dao.insertStudentData(sd);

                sd.subject = subject5;
                sd.creditHour = ch5;
                sd.marks = sub5;
                sd.grade = g5;
                dao.insertStudentData(sd);
                break;
            }
            case 6: {
                lbl_grade1.setVisible(true);
                lbl_grade2.setVisible(true);
                lbl_grade3.setVisible(true);
                lbl_grade4.setVisible(true);
                lbl_grade5.setVisible(true);
                
                sub1 = Float.parseFloat(txt_marks1.getText());
                sub2 = Float.parseFloat(txt_marks2.getText());
                sub3 = Float.parseFloat(txt_marks3.getText());
                sub4 = Float.parseFloat(txt_marks4.getText());
                sub5 = Float.parseFloat(txt_marks5.getText());
//        sub6 = Float.parseFloat(txt_marks6.getText());
                subject1 = txt_sub1.getText();
                subject2 = txt_sub2.getText();
                subject3 = txt_sub3.getText();
                subject4 = txt_sub4.getText();
                subject5 = txt_sub5.getText();

                ch1 = Integer.parseInt(cmb_ch1.getSelectedItem().toString());
                ch2 = Integer.parseInt(cmb_ch2.getSelectedItem().toString());
                ch3 = Integer.parseInt(cmb_ch3.getSelectedItem().toString());
                ch4 = Integer.parseInt(cmb_ch4.getSelectedItem().toString());
                ch5 = Integer.parseInt(cmb_ch5.getSelectedItem().toString());
//        ch6 = Integer.parseInt(txt_ch6.getText());
                float gpa1, gpa2, gpa3, gpa4, gpa5;
                gpa1 = gpalogic.gpa_logic(sub1, ch1);
                gpa2 = gpalogic.gpa_logic(sub2, ch2);
                gpa3 = gpalogic.gpa_logic(sub3, ch3);
                gpa4 = gpalogic.gpa_logic(sub4, ch4);
                gpa5 = gpalogic.gpa_logic(sub5, ch5);

                g1 = gpalogic.marks_grade(sub1);
                g2 = gpalogic.marks_grade(sub2);
                g3 = gpalogic.marks_grade(sub3);
                g4 = gpalogic.marks_grade(sub4);
                g5 = gpalogic.marks_grade(sub5);

                lbl_grade1.setText(g1);
                lbl_grade2.setText(g2);
                lbl_grade3.setText(g3);
                lbl_grade4.setText(g4);
                lbl_grade5.setText(g5);

                semester = cmb_sem.getSelectedItem().toString();

                students_data sd = new students_data();

//        sub6 = gpalogic.gpa_logic(sub6, ch6);
                float total_gpa = (float) gpa1 + gpa2 + gpa3 + gpa4 + gpa5;
                float total_ch = (float) ch1 + ch2 + ch3 + ch4 + ch5;
//        System.out.print("TOTAL GPA = " + total_gpa);
                SGPA = (float) total_gpa / total_ch;
                dao dao = new dao();
                sd.rollNo = this.rollNo;
                sd.semester = semester;
                sd.subject = subject1;
                sd.creditHour = ch1;
                sd.marks = sub1;
                sd.grade = g1;

                dao.insertStudentData(sd);

                sd.subject = subject2;
                sd.creditHour = ch2;
                sd.marks = sub2;
                sd.grade = g2;

                dao.insertStudentData(sd);

                sd.subject = subject3;
                sd.creditHour = ch3;
                sd.marks = sub3;
                sd.grade = g3;

                dao.insertStudentData(sd);

                sd.subject = subject4;
                sd.creditHour = ch4;
                sd.marks = sub4;
                sd.grade = g4;

                dao.insertStudentData(sd);

                sd.subject = subject5;
                sd.creditHour = ch5;
                sd.marks = sub5;
                sd.grade = g5;
                dao.insertStudentData(sd);
                
                break;
            }
            default: {
                System.out.print("Hello from default");
            }
        }
        txt_gpa.setText("" + SGPA);
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void txt_gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gpaActionPerformed

    private void txt_sub6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sub6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sub6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChoiceScreen(rollNo).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI(0, 2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JComboBox<String> cmb_ch1;
    private javax.swing.JComboBox<String> cmb_ch2;
    private javax.swing.JComboBox<String> cmb_ch3;
    private javax.swing.JComboBox<String> cmb_ch4;
    private javax.swing.JComboBox<String> cmb_ch5;
    private javax.swing.JComboBox<String> cmb_ch6;
    private javax.swing.JComboBox<String> cmb_ch7;
    private javax.swing.JComboBox<String> cmb_ch8;
    private javax.swing.JComboBox<String> cmb_sem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_grade1;
    private javax.swing.JLabel lbl_grade2;
    private javax.swing.JLabel lbl_grade3;
    private javax.swing.JLabel lbl_grade4;
    private javax.swing.JLabel lbl_grade5;
    private javax.swing.JLabel lbl_grade6;
    private javax.swing.JLabel lbl_grade7;
    private javax.swing.JLabel lbl_grade8;
    private javax.swing.JLabel lbl_rollNo;
    private javax.swing.JLabel subjec1;
    private javax.swing.JLabel subject2;
    private javax.swing.JLabel subject3;
    private javax.swing.JLabel subject4;
    private javax.swing.JLabel subject5;
    private javax.swing.JLabel subject6;
    private javax.swing.JLabel subject7;
    private javax.swing.JLabel subject8;
    private javax.swing.JTextField txt_gpa;
    private javax.swing.JTextField txt_marks1;
    private javax.swing.JTextField txt_marks2;
    private javax.swing.JTextField txt_marks3;
    private javax.swing.JTextField txt_marks4;
    private javax.swing.JTextField txt_marks5;
    private javax.swing.JTextField txt_marks6;
    private javax.swing.JTextField txt_marks7;
    private javax.swing.JTextField txt_marks8;
    private javax.swing.JTextField txt_sub1;
    private javax.swing.JTextField txt_sub2;
    private javax.swing.JTextField txt_sub3;
    private javax.swing.JTextField txt_sub4;
    private javax.swing.JTextField txt_sub5;
    private javax.swing.JTextField txt_sub6;
    private javax.swing.JTextField txt_sub7;
    private javax.swing.JTextField txt_sub8;
    // End of variables declaration//GEN-END:variables
}
