package br.edu.ifpb.padroes.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private final String arquivoBanco;

    public DatabaseConfig(String arquivoBanco) {
        this.arquivoBanco = arquivoBanco;
    }

    Connection openConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:"+arquivoBanco);
    }
}
