package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.OracleDriver;

public class DatadaseConnection {
    public static void main(String[] args) {
        //oracle DB접속 (가상)
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");

    }
}
