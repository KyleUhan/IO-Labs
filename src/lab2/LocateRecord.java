/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class LocateRecord {

    private String recordContent = "";
    private int recordNumber;
    private FileChecker file;

    public LocateRecord(final int recordNumber, final FileChecker file) throws IndexOutOfBoundsException, NullPointerException {
        setFile(file);
        setRecordNumber(recordNumber);
        getRecord();
    }

    public final void getRecord() {
        int endPosition = getRecordNumber() * getFile().getRecordSize();
        int startPosition = endPosition - getFile().getRecordSize();

        BufferedReader input = null;

        try {
            input = new BufferedReader(new FileReader(getFile().getFile()));
            String valueHolder = "";
            String line = input.readLine();
            int count = 1;
            while (line != null) {
                if (count > startPosition && count <= endPosition) {
                    valueHolder += line + "\n";
                }
                count++;
                line = input.readLine();

            }
            setRecordContent(valueHolder);

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                input.close();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

    }

    public final int getRecordNumber() {
        return recordNumber;
    }

    public final void setRecordNumber(final int recordNumber) throws IndexOutOfBoundsException {
        if (recordNumber > getFile().getFileSize() || recordNumber < 0) {
            throw new IndexOutOfBoundsException("Sorry there are only " + getFile().getFileSize() + " records.");
        }
        this.recordNumber = recordNumber;
    }

    public final FileChecker getFile() {
        return file;
    }

    public final void setFile(final FileChecker file) throws NullPointerException {
        if (file == null) {
            throw new NullPointerException();
        }
        this.file = file;
    }

    public final String getRecordContent() {
        return recordContent;
    }

    public final void setRecordContent(final String recordContent) {
        this.recordContent = recordContent;
    }

}
