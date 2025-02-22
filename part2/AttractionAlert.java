package practise.task4.part2;

import java.time.LocalDate;

public class AttractionAlert {
    private AlertSeverity _severity;
    private String _message;
    private int _attractionId;
    private LocalDate _timestamp;
    private String _process;

    public AttractionAlert(AlertSeverity severity, String message, int attractionId, LocalDate timestamp, String process) {
        this._severity = severity;
        this._message = message;
        this._attractionId = attractionId;
        this._timestamp = timestamp;
        this._process = process;
    }

    public AlertSeverity get_severity() {
        return _severity;
    }

    public String get_message() {
        return _message;
    }

    public int get_attractionId() {
        return _attractionId;
    }

    public LocalDate get_timestamp() {
        return _timestamp;
    }

    public String get_process() {
        return _process;
    }

    @Override
    public String toString() {
        return "AttractionAlert{" +
                "_severity=" + _severity +
                ", _message='" + _message + '\'' +
                ", _attractionId=" + _attractionId +
                ", _timestamp=" + _timestamp +
                ", _process='" + _process + '\'' +
                '}';
    }
}
