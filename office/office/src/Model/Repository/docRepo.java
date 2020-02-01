package Model.Repository;

import Model.Connection.connectionToDB;
import Model.Entity.docEn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class docRepo {
    private PreparedStatement preparedStatement;
    private Connection conn;

    public docRepo() throws Exception {
        conn = connectionToDB.ConectorDb();
    }



    public ResultSet select() throws Exception {
        preparedStatement = conn.prepareStatement("select * from documentrecord");
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
    }


    public void insert(docEn docEn) throws Exception {
        preparedStatement = conn.prepareStatement("insert into documentrecord(code,name,subject,dfrom,dto,date,time)values(?,?,?,?,?,?,?)");
        preparedStatement.setString(1, docEn.getCode());
        preparedStatement.setString(2, docEn.getName());
        preparedStatement.setString(3, docEn.getSubject());
        preparedStatement.setString(4, docEn.getDfrom());
        preparedStatement.setString(5, docEn.getDto());
        preparedStatement.setString(6, docEn.getDate());
        preparedStatement.setString(7, docEn.getTime());
        preparedStatement.executeUpdate();
    }


    public void update(docEn docEn) throws Exception {
        preparedStatement = conn.prepareStatement("update documentrecord  set name=? ,subject=?,dfrom=?,dto=?,date=?,time=? where code=?");

        preparedStatement.setString(1, docEn.getName());
        preparedStatement.setString(2, docEn.getSubject());
        preparedStatement.setString(3, docEn.getDfrom());
        preparedStatement.setString(4, docEn.getDto());
        preparedStatement.setString(5, docEn.getDate());
        preparedStatement.setString(6, docEn.getTime());
        preparedStatement.setString(7, docEn.getCode());

        preparedStatement.executeUpdate();
    }


    public void delete(docEn docEn) throws Exception {
        preparedStatement = conn.prepareStatement("delete from documentrecord  where code=?");
        preparedStatement.setString(1, docEn.getCode());
        preparedStatement.executeUpdate();

    }


    public ResultSet findByCode(docEn docEn) throws Exception {
        preparedStatement = conn.prepareStatement("select * from documentrecord  where code=?");
        preparedStatement.setString(1, docEn.getCode());
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
