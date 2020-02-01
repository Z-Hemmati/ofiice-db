package Model.Service;


import Model.Entity.depEn;
import Model.Repository.depRepo;

import java.sql.ResultSet;

public class depServ {

    private static depServ depServ = new depServ();

    public static depServ getInstance() {
        return depServ;
    }

    public void insert(depEn depEn) throws Exception {
        depRepo depRepo = new depRepo();
        depRepo.insert(depEn);
        depRepo.commit();
    }


    public void update(depEn depEn) throws Exception {
        depRepo depRepo = new depRepo();
        depRepo.update(depEn);
        depRepo.commit();
    }


    public ResultSet select() throws Exception {
        ResultSet rs;
        depRepo depRepo = new depRepo();
        rs = depRepo.select();
        depRepo.commit();

        return rs;
    }

    public void delete(depEn depEn) throws Exception {
        depRepo depRepo = new depRepo();
        depRepo.delete(depEn);
        depRepo.commit();
    }


    public ResultSet findByCode(depEn depEn) throws Exception {
        ResultSet rs;
        depRepo depRepo = new depRepo();
        rs = depRepo.findByCode(depEn);
        depRepo.commit();

        return rs;
    }


}
