package database;

import Config.Config;
import flowers.Order;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataBase {

    private static DataBase ourInstance;
    private static BufferedWriter file;

    public static DataBase getInstance() throws IOException {
        if (ourInstance == null) {
            ourInstance = new DataBase();
        }
        return ourInstance;
    }

    private DataBase() throws IOException {

    }

    public void add(Order order) throws IOException {
        String user = Config.USER;
        if (file == null) {
            file = new BufferedWriter(new FileWriter("database.txt", true));

        }
        file.append(order.toString());

        file.newLine();
    }

    public void commit() throws IOException {
        file.close();
        file = null;
    }
}

