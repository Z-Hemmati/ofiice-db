package Model.Service;

import Model.Entity.userEn;
import Model.Repository.userRepo;

import java.sql.ResultSet;

public class userServ {

    private static userServ userServ = new userServ();


    public static userServ getInstance() {
        return userServ;
    }

    public void insert(userEn userEn) throws Exception {
        ResultSet rs;
        userRepo userRepo = new userRepo();
        userRepo.insert(userEn);
        userRepo.commit();

    }


    public ResultSet select() throws Exception {
        ResultSet rs;
        userRepo userRepo = new userRepo();
        rs = userRepo.select();
        userRepo.commit();

        return rs;
    }


    public ResultSet find(userEn userEn) throws Exception {
        ResultSet rs;
        userRepo userRepo = new userRepo();
        rs = userRepo.find(userEn);
        userRepo.commit();

        return rs;
    }


    public ResultSet findById(userEn userEn) throws Exception {
        ResultSet rs;
        userRepo userRepo = new userRepo();
        rs = userRepo.findById(userEn);
        userRepo.commit();

        return rs;
    }


}
