package org.example;

public interface IAttractionParkDatabaseDriverAdapter {
    String[] executeQuery(int[] ticketNumbers);
    void executeQueryNoResult(int[] ticketNumbers);
    boolean checkDatabaseStatus();
    void open(String url);
    void close();
    void commit();
    void rollback(String type);
}
