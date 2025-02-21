package org.example;

public class AttractionParkDatabaseAccess {
    private String _url;
    private boolean _isOpen;
    private IAttractionParkDatabaseDriverAdapter _impl;

    public AttractionParkDatabaseAccess(IAttractionParkDatabaseDriverAdapter impl) {
        this._impl = impl;
    }

    public String[] executeQuery(int[] ticketNumbers) {
        return _impl.executeQuery(ticketNumbers);
    }
    public void executeQueryNoResult(int[] ticketNumbers) {
        _impl.executeQueryNoResult(ticketNumbers);
    }
    public boolean checkDatabaseStatus() {
        return _impl.checkDatabaseStatus();
    }
    public void open(String url) {
        _impl.open(url);
        _isOpen = true;
    }
    public void close() {
        _impl.close();
        _isOpen = false;
    }
    public void commit() {
        _impl.commit();
    }
    public void rollback(String type) {
        _impl.rollback(type);
    }
}
