package org.chaiaurcode.springcoreconcepts;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
@Component
//@Primary
//@Profile("dev")
@ConditionalOnProperty(name = "db.type", havingValue = "postgresDb")
public class MyPostgresDatabase implements Database {
    public void save(String user) {
        System.out.println("My Postgres Database is saving the User"); //integer wala
    }
}
