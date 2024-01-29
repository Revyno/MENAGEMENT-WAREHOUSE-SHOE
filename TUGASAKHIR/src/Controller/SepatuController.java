package Controller;

import Entity.*;
import Model.Model;

import java.util.ArrayList;

public class SepatuController {

    public Orang loginAdmin(String username, String password){
        return Model.loginAdmin(username, password);
    }
    public ArrayList<Sepatu>allarraylistSepatu(){
        return Model.getSepatuList();
    }

    public ArrayList<Orang> allarraylistAdmin(){
        return Model.allarraylisAdmin();
    }

}
