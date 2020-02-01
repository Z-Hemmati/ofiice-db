package Model.Service;

import Model.Entity.docEn;
import Model.Repository.docRepo;

import java.sql.ResultSet;

public class docServ {


    private static docServ docServ = new docServ();

    public static docServ getInstance() {
        return docServ;
    }

    public ResultSet select() throws Exception {
        ResultSet rs;
        docRepo docRepo = new docRepo();
        rs = docRepo.select();
        docRepo.commit();

        return rs;
    }


    public void insert(docEn docEn) throws Exception {
        docRepo docRepo = new docRepo();
        docRepo.insert(docEn);
        docRepo.commit();
    }


    public void update(docEn docEn) throws Exception {
        docRepo docRepo = new docRepo();
        docRepo.update(docEn);
        docRepo.commit();
    }


    public void delete(docEn docEn) throws Exception {
        docRepo docRepo = new docRepo();
        docRepo.delete(docEn);
        docRepo.commit();
    }


    public ResultSet findByCode(docEn docEn) throws Exception {
        ResultSet rs;
        docRepo docRepo = new docRepo();
        rs = docRepo.findByCode(docEn);
        docRepo.commit();

        return rs;
    }



}
