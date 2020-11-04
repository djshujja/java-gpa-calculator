/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcal;

import java.sql.*;

/**
 *
 * @author DjShujja
 */
public class dao {
    Connection con = null;
    public dao(){
        connection();
    }
    public void connection() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/shujja-gpa-calculator";
            con = DriverManager.getConnection(url, "root", "");
            System.out.print("Connected to DB");          
            
        }
        catch(Exception ex){
            System.out.print(ex);
        }
    }
    
    public int formulaInsert(formula f){
        int res = 0;
        try{
           
            String query = "INSERT INTO formula_tbl values(?,?,?,?)"; //Grade, Min, Max, Points
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, f.grade);
            pst.setFloat(2, f.min);
            pst.setFloat(3, f.max);
            pst.setFloat(4, f.points);
            res = pst.executeUpdate();
            
        }
        catch(Exception ex){
            res = 0;
            System.out.print(ex);
        }
        
        return res;
    }
    
    public ResultSet formulaSearchByGrade(formula f){
        ResultSet res = null;
        try{
            String query = "Select * from formula_tbl where grade = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, f.grade);
            res = pst.executeQuery();
            
        }
        catch(Exception ex){
            res = null;
            System.out.print(ex);
                    
        }
        
        return res;
    }
    
    public ResultSet formulaSearchByPoints(formula f){
        ResultSet res = null;
        try{
            String query = "Select * from formula_tbl where points = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setFloat(1, f.points);
            res = pst.executeQuery();
            
        }
        catch(Exception ex){
            res = null;
            System.out.print(ex);
                    
        }
        
        return res;
    }
    
    public ResultSet selectAll(String tbl_name){
        ResultSet rs = null;
        try{
            String query = "Select * from "+tbl_name;
            PreparedStatement pst = con.prepareStatement(query);
            
            System.out.print(query);
            rs = pst.executeQuery();
        }
        catch(Exception ex){
            
            rs=null;
        }
        return rs;
    } 
    
    public int insert(student s){
        int res = 0;
        try{
           
            String query = "INSERT INTO student VALUES(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, s.rollNo);
            pst.setString(2, s.name);
            pst.setString(3, s.department);
            res = pst.executeUpdate();
        }
        catch(Exception ex){
            System.out.print(ex);
        }
        
        
        return res;
    }
    
    //This is being used
    public ResultSet singleStudent(student s){
        ResultSet rs = null;
        
        try{
          
            String query = "SELECT * FROM student WHERE rollNo=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, s.rollNo);
            rs = pst.executeQuery();
        }        
        catch(Exception ex){
            rs = null;
            System.out.print(ex);
        }
        
        return rs;
    }
    
    public int insertStudentData(students_data sd){
        int res = 0;
        try{
           
            String query = "INSERT INTO students_data VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, sd.rollNo);
            pst.setString(2, sd.subject);
            pst.setInt(3,sd.creditHour);
            pst.setFloat(4,sd.marks);
            pst.setString(5, sd.grade);
            pst.setString(6, sd.semester);
            res = pst.executeUpdate();
            System.out.print("Successfully Inserted into DB");
        }
        catch(Exception ex){
            System.out.print(ex);
        }
        
        
        return res;
    }
    
}
