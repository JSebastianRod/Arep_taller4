package edu.escuelaing.arep.app1.spark;

import edu.escuelaing.arep.app1.HttpServer;

public class Spark {
    public static void main(String[] args) {
        try {
            HttpServer.getInstance();
            HttpServer.start(args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}