package Model.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Connection.connectionToDB;
import Model.Entity.depEn;

public class depRepo {
    private PreparedStatement preparedStatement;
    private Connection conn;

    public depRepo() throws Exception {
        conn = connectionToDB.ConectorDb();
    }


    public void insert(depEn depEn) throws Exception {
        preparedStatement = conn.prepareStatement("insert into departmentrecord(code,name,roll,number,date,time)values(?,?,?,?,?,?)");
        preparedStatement.setString(1, depEn.getCode());
        preparedStatement.setString(2, depEn.getName());
        preparedStatement.setString(3, depEn.getRoll());
        preparedStatement.setString(4, depEn.getNumber());
        preparedStatement.setString(5, depEn.getDate());
        preparedStatement.setString(6, depEn.getTime());
        preparedStatement.executeUpdate();
    }



    public void update(depEn depEn) throws Exception {
        preparedStatement = conn.prepareStatement("update departmentrecord  set name=? ,roll=?,number=?,date=?,time=? where code=?");

        preparedStatement.setString(1, depEn.getName());
        preparedStatement.setString(2, depEn.getRoll());
        preparedStatement.setString(3, depEn.getNumber());
        preparedStatement.setString(4, depEn.getDate());
        preparedStatement.setString(5, depEn.getTime());
        preparedStatement.setString(6, depEn.getCode());
        preparedStatement.executeUpdate();
    }



    public ResultSet select() throws Exception {
        preparedStatement = conn.prepareStatement("select * from departmentrecord");
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }



    public void delete(depEn depEn) throws Exception {
        preparedStatement = conn.prepareStatement("delete from departmentrecord  where code=?");
        preparedStatement.setString(1, depEn.getCode());
        preparedStatement.executeUpdate();

    }




    public ResultSet findByCode(depEn depEn) throws Exception {
        preparedStatement = conn.prepareStatement("select * from departmentrecord  where code=?");
        preparedStatement.setString(1, depEn.getCode());
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
