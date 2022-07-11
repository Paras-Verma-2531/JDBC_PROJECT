package com.app.StudentManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCManager {
    static Connection con=null;
    public void setData(Students student) throws SQLException {
        String query="insert into students(?,?,?,?,?,?,?,?)";// dynamic query
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
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
      con = CreateConnection.createConnection();

    }
}
