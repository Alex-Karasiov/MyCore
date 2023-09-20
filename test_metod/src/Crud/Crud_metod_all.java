package Crud;

import Anim.Cat;
import BD.Conection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Crud_metod_all implements ICrud_metod_all{

    @Override
    public Collection<Cat> Look_All_BD() throws SQLException, ClassNotFoundException {
        Collection<Cat> catList = new ArrayList<>();
        try (var conn = new Conection().connection()) {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Cat");

            while (resultSet.next()) {
                Cat allValues = new Cat();
                allValues.setId(resultSet.getInt("id"));
                allValues.setBreed_of_pet(resultSet.getString("breed_of_pet"));
                allValues.setId_pet_breeder(resultSet.getString("id_pet_breeder"));
                allValues.setAge(resultSet.getInt("age"));

                catList.add(allValues);

            }

            resultSet.close();
            new Conection().connection().close();
            System.out.println(catList);

            return catList;
        }
    }

        @Override
    public void Add_BD() {
            try (var conn = new Conection().connection()) {

                System.out.println("Введите парода домашнего животного");
                Scanner scannerBreedOfPet = new Scanner(System.in);
                String breed_of_pet = scannerBreedOfPet.nextLine();
                System.out.println("Введите заводчик домашнего животного");
                Scanner scannerIdPetBreeder = new Scanner(System.in);
                String id_pet_breeder = scannerIdPetBreeder.nextLine();
                System.out.println("Введите возрост питомца ");
                Scanner scannerAge = new Scanner(System.in);
                String age = scannerAge.nextLine();


                String sql = "INSERT INTO Cat (breed_of_pet, id_pet_breeder, age) VALUES (?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);

                statement.setString(1, breed_of_pet);
                statement.setString(2, id_pet_breeder);
                statement.setInt(3, Integer.parseInt(age));
                statement.executeUpdate();



                new Conection().connection().close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public  void Wiew_BD() {


    }

    @Override
    public void Creat_BD() {

    }

    @Override
    public void Delete_id_BD() {

    }
}
