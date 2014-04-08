package lab3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class LocateRecord {

    private FileManager file;
    private static final int MIN_RECORD_NUMBER = 1;

    public LocateRecord(FileManager file) throws NullPointerException {
        setFile(file);
    }

    public final String getRecord(final int recordNum) throws IllegalArgumentException{
        validateRecordNum(recordNum);
        int startPosition;
        if (recordNum != MIN_RECORD_NUMBER) {
            startPosition = recordNum * FileManager.getRECORD_SIZE()
                    - FileManager.getRECORD_SIZE();
        } else {
            startPosition = recordNum - MIN_RECORD_NUMBER;
        }
        int endPosition = startPosition + FileManager.getRECORD_SIZE();
        String recordHolder = "";
        for (int i = startPosition; i < endPosition; i++) {
            recordHolder += getFile().getFileContent().get(i) + "\n";
        }

        return recordHolder;
    }

    public final String getRecordCity(final int recordNum) throws IllegalArgumentException{
        int cityPosition = 3;
        int cityArrayPosition;
        validateRecordNum(recordNum);
        String city;
        if (recordNum != MIN_RECORD_NUMBER) {
            cityArrayPosition = recordNum * FileManager.getRECORD_SIZE()
                    - FileManager.getRECORD_SIZE() + cityPosition;
            city = getFile().getFileContent().get(cityArrayPosition);
        } else {
            cityArrayPosition = cityPosition;
            city = getFile().getFileContent().get(cityArrayPosition);
        }

        return city;
    }

    public final FileManager getFile() {
        return file;
    }

    public final void setFile(final FileManager file) throws NullPointerException {
        if (file == null) {
            throw new NullPointerException("Must not be Null");
        }
        this.file = file;
    }

    private void validateRecordNum(final int recordNum) throws IllegalArgumentException {
        if (recordNum < MIN_RECORD_NUMBER || recordNum > getFile().fileSize()) {
            throw new IllegalArgumentException("Record number must be between "
                    + MIN_RECORD_NUMBER + " and " + getFile().fileSize());
        }
    }

}
