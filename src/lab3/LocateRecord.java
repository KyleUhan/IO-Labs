package lab3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class LocateRecord {

    private FileChecker file;
    private static final int MIN_RECORD_NUMBER = 1;

    public LocateRecord(FileChecker file) throws NullPointerException {
        setFile(file);
    }

    public final String getRecord(final int recordNum) {
        validateRecordNum(recordNum);
        int startPosition;
        if (recordNum != MIN_RECORD_NUMBER) {
            startPosition = recordNum * FileChecker.getRECORD_SIZE()
                    - FileChecker.getRECORD_SIZE();
        } else {
            startPosition = recordNum - 1;
        }
        int endPosition = startPosition + FileChecker.getRECORD_SIZE();
        String recordHolder = "";
        for (int i = startPosition; i < endPosition; i++) {
            recordHolder += getFile().getFileContent().get(i) + "\n";
        }

        return recordHolder;
    }

    public final String getRecordCity(final int recordNum) {
        int cityPosition = 3;
        int cityArrayPosition;
        validateRecordNum(recordNum);
        String city;
        if (recordNum != MIN_RECORD_NUMBER) {
            cityArrayPosition = recordNum * FileChecker.getRECORD_SIZE()
                    - FileChecker.getRECORD_SIZE() + cityPosition;
            city = getFile().getFileContent().get(cityArrayPosition);
        } else {
            cityArrayPosition = recordNum - 1 + cityPosition;
            city = getFile().getFileContent().get(cityArrayPosition);
        }

        return city;
    }

    public final FileChecker getFile() {
        return file;
    }

    public final void setFile(final FileChecker file) throws NullPointerException {
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

    public static void main(String[] args) throws IOException {
        FileChecker fc = new FileChecker();
        LocateRecord lr = new LocateRecord(fc);
        System.out.println(lr.getRecord(3));
        System.out.println(lr.getRecordCity(3));
        
        System.out.println(lr.getRecord(2));
        System.out.println(lr.getRecordCity(2));

    }

}
