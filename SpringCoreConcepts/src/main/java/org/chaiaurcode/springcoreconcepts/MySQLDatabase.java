package org.chaiaurcode.springcoreconcepts;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component()
//@Profile("prod")
@ConditionalOnProperty(name = "db.type", havingValue = "sqlDb")
public class MySQLDatabase implements Database{
//    public void saveToDb(String user) {
//        System.out.println("My SQL Database is saving the User");
//    }
    @Override
    public void save(String user){
        System.out.println("My SQL Database is saving the User"); //integer wala
    }
}
