package org.example;

public class AttractionParkDatabaseProxy {
    private AttractionParkDatabaseAccess _dbHandle;

    public AttractionParkDatabaseProxy(AttractionParkDatabaseAccess dbHandle) {
        this._dbHandle = dbHandle;
    }

    public String[] executeQuery(int[] ticketNumbers) {
        return _dbHandle.executeQuery(ticketNumbers);
    }
    public void executeQueryNoResult(int[] ticketNumbers) {
        _dbHandle.executeQueryNoResult(ticketNumbers);
    }
    public boolean checkDatabaseStatus() {
        return _dbHandle.checkDatabaseStatus();
    }
    public void open(String url) {
        _dbHandle.open(url);
    }
    public void close() {
        _dbHandle.close();
    }
    public void commit() {
        _dbHandle.commit();
    }
    public void rollback(String type) {
        _dbHandle.rollback(type);
    }
}
