package c322.homework.homework5.parte;

import java.io.File;

public abstract class DataMiner {

    public void mine(String path) {
        File file = openFile(path);
        String rawData = extractData(file);
        Object data = parseData(rawData);
        Object analysis = analyzeData(data);
        sendReport(analysis);
        closeFile(file);
    }

    protected abstract String extractData(File file);

    protected abstract Object parseData(String rawData);

    protected abstract Object analyzeData(Object data);

    protected void sendReport(Object analysis) {
        // Code to send report
    }

    private File openFile(String path) {
        // Code to open file
    }

    private void closeFile(File file) {
        // Code to close file
    }
}
