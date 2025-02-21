package org.example;

public class RollerCoasterParkDatabaseAdapter implements IAttractionParkDatabaseDriverAdapter {
    private String _url;

    public String[] executeQuery(int[] ticketNumbers) { return new String[]{"Query result"}; }
    public void executeQueryNoResult(int[] ticketNumbers) {}
    public boolean checkDatabaseStatus() { return true; }
    public void open(String url) { this._url = url; }
    public void close() {}
    public void commit() {}
    public void rollback(String type) {}
}