package com.umiitkose.java.basic.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class DosyaOkumaYazma {


    public static final Logger logger = Logger.getLogger(DosyaOkumaYazma.class.getName());

    public static void main(String[] args) {

        DosyaOkumaYazma DosyaOkumaYazma = new DosyaOkumaYazma();
        DosyaOkumaYazma.writeFile(getFile());
        DosyaOkumaYazma.readFile(getFile());

    }

    private static File getFile() {
        String filePath = "file_path";
        return new File(filePath);
    }

    private void readFile(File file) {
        // if(file.canRead() && file.canExecute() && file.isFile()){ //--> Farklı kontrolleri var.
        try (InputStream in = new FileInputStream(file)) {
            logger.info("File Opened");
            int ch = 0;
            while (ch != -1) {
                ch = in.read();
                char karakter = (char) ch;
                System.out.println(karakter);
            }

            logger.info("File Closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(File file) {

        try (OutputStream in = new FileOutputStream(file)) {

            logger.info("File Opened");
            String write = "Ümit KÖSE";
            byte[] bytes = write.getBytes(StandardCharsets.US_ASCII);
            in.write(bytes);

            logger.info("File Closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
