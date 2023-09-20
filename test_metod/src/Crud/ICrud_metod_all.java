package Crud;

import Anim.Cat;

import java.sql.SQLException;
import java.util.Collection;

public interface ICrud_metod_all {

    Collection<Cat> Look_All_BD() throws SQLException, ClassNotFoundException;
    void Add_BD();
    void Wiew_BD();
    void Creat_BD();
    void Delete_id_BD();
}
