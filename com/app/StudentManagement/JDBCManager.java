package com.app.StudentManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCManager {
    static Connection con=null;
    static JDBCManager jdbc=null;
    private JDBCManager() throws SQLException, ClassNotFoundException {
        con=CreateConnection.createConnection();
    }
    public static JDBCManager getObject() throws SQLException, ClassNotFoundException {
        if(jdbc==null)
        {
            jdbc= new JDBCManager();
        }return jdbc;
    }
    public void setData(Students student) throws SQLException {
        String query="insert into students(name,course_name,branch,date_of_birth,year,semester,email_id,phn_no) values(?,?,?,?,?,?,?,?)";// dynamic query
        PreparedStatement stm= con.prepareStatement(query);
        stm.setString(1,student.getName());
        stm.setString(2,student.getCourse_name());
        stm.setString(3,student.getBranch());
        stm.setString(4,student.getDateOfBirth());
        stm.setInt(5,student.getYear());
        stm.setInt(6,student.getSemester());
        stm.setString(7,student.getEmail_id());
        stm.setString(8,student.getPhn_no());
        stm.executeUpdate();// execute update[set data]
    }

}
