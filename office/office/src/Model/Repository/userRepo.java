package Model.Repository;

import Model.Connection.connectionToDB;
import Model.Entity.userEn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userRepo {
    private PreparedStatement preparedStatement;
    private Connection conn;

    public userRepo() throws Exception {
        conn = connectionToDB.ConectorDb();
    }


    public ResultSet select() throws Exception {
        preparedStatement = conn.prepareStatement("select * from loginrecord");
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }

    public void insert(userEn userEn) throws Exception {
        preparedStatement = conn.prepareStatement("insert into loginrecord(id,password,division)values(?,?,?)");
        preparedStatement.setString(1, userEn.getId());
        preparedStatement.setString(2, userEn.getPassword());
        preparedStatement.setString(3, userEn.getDivision());
        preparedStatement.executeUpdate();
    }

    public ResultSet find(userEn userEn) throws Exception {
        preparedStatement = conn.prepareStatement("select * from loginrecord where id =? and password =? and division=?");
        preparedStatement.setString(1, userEn.getId());
        preparedStatement.setString(2, userEn.getPassword());
        preparedStatement.setString(3, userEn.getDivision());
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }



    public ResultSet findById(userEn userEn) throws Exception {
        preparedStatement = conn.prepareStatement("select * from loginrecord where id =?");
        preparedStatement.setString(1, userEn.getId());
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
