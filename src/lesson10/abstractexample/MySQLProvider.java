package lesson10.abstractexample;

public class  MySQLProvider extends DbProvider {

   // public MySQLProvider(String dbHost) {
   //     super(dbHost);
   // }

    @Override
    void connectToDb(){
        //logic for MySQL
    }

    @Override
    void disconnectFromDb() {
        //logic for MySQL
    }
}
