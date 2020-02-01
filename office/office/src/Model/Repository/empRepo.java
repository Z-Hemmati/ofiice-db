package Model.Repository;

import Model.Connection.connectionToDB;
import Model.Entity.empEn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class empRepo {
    private PreparedStatement preparedStatement;
    private Connection conn;

    public empRepo() throws Exception {
        conn = connectionToDB.ConectorDb();
    }


    public ResultSet select() throws Exception {
        preparedStatement = conn.prepareStatement("select * from employeerecord");
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }



    public void insert(empEn empEn) throws Exception {
        preparedStatement = conn.prepareStatement("insert into employeerecord(code,name,age,fname,education,salary,roll,address,phone)values(?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1, empEn.getCode());
        preparedStatement.setString(2, empEn.getName());
        preparedStatement.setString(3, empEn.getAge());
        preparedStatement.setString(4, empEn.getFname());
        preparedStatement.setString(5, empEn.getEducation());
        preparedStatement.setString(6, empEn.getSalary());
        preparedStatement.setString(7, empEn.getRoll());
        preparedStatement.setString(8, empEn.getAddress());
        preparedStatement.setString(9, empEn.getPhone());
        preparedStatement.executeUpdate();
    }


    public void update(empEn empEn) throws Exception {
        preparedStatement = conn.prepareStatement("update employeerecord  set name=?,age=?,fname=?,education=?,salary=? ,roll=?,address=?,phone=? where code=?");

        preparedStatement.setString(1, empEn.getName());
        preparedStatement.setString(2, empEn.getAge());
        preparedStatement.setString(3, empEn.getFname());
        preparedStatement.setString(4, empEn.getEducation());
        preparedStatement.setString(5, empEn.getSalary());
        preparedStatement.setString(6, empEn.getRoll());
        preparedStatement.setString(7, empEn.getAddress());
        preparedStatement.setString(8, empEn.getPhone());
        preparedStatement.setString(9, empEn.getCode());

        preparedStatement.executeUpdate();
    }
    public void delete(empEn empEn) throws Exception {
        preparedStatement = conn.prepareStatement("delete from employeerecord where code=?");
        preparedStatement.setString(1, empEn.getCode());
        preparedStatement.executeUpdate();

    }

    public ResultSet findByCode(empEn empEn) throws Exception {
        preparedStatement = conn.prepareStatement("select * from employeerecord  where code=?");
        preparedStatement.setString(1, empEn.getCode());
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }

    public void commit() throws Exception {
        conn.commit();
    }

    public void rollback() throws Exception {
        conn.rollback();
    }


    public void close() throws Exception {
        preparedStatement.close();
        conn.close();
    }

}
