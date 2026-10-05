package org.chaiaurcode.springcoreconcepts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    MySQLDatabase mySQLDatabase = new MySQLDatabase();
    Database dataBase;

//    UserService(@Qualifier("mySQLDatabase") Database dataBase){
UserService(@Qualifier("mySQLDatabase") Database dataBase){
    this.dataBase = dataBase;
    }
    public void saveUser(String user) {
        System.out.println("User "+ user +" saved in the Database");
        dataBase.save(user);
    }
}
