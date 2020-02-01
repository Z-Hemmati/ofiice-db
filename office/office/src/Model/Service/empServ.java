package Model.Service;

import Model.Entity.empEn;
import Model.Repository.empRepo;

import java.sql.ResultSet;

public class empServ {

    private static empServ empServ = new empServ();

    public static empServ getInstance() {
        return empServ;
    }



    public ResultSet select() throws Exception {
        ResultSet rs;
        empRepo empRepo = new empRepo();
        rs = empRepo.select();
        empRepo.commit();
        return rs;
    }

    public void insert(empEn empEn) throws Exception {
        empRepo empRepo = new empRepo();
        empRepo.insert(empEn);
        empRepo.commit();
    }

    public void update(empEn empEn) throws Exception {
        empRepo empRepo = new empRepo();
        empRepo.update(empEn);
        empRepo.commit();
    }

    public void delete(empEn empEn) throws Exception {
        empRepo empRepo = new empRepo();
        empRepo.delete(empEn);
        empRepo.commit();
    }


    public ResultSet findByCode(empEn empEn) throws Exception {
        ResultSet rs;
        empRepo empRepo = new empRepo();
        rs = empRepo.findByCode(empEn);
        empRepo.commit();

        return rs;
    }


}
