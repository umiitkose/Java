package com.umiitkose.java.basic.file;

import java.io.*;

public class DosyaOkumaYazma {

    public static void main(String[] args) {

        DosyaOkumaYazma dosyaOkumaKapatma = new DosyaOkumaYazma();
        dosyaOkumaKapatma.writeFile(getFile());
        dosyaOkumaKapatma.readFile(getFile());

    }

    private static File getFile() {
        String filePath = "/Users/kemalcagri/Documents/TCKimlikNoTest.txt";
        return new File(filePath);
    }

    private void readFile(File file) {
        // if(file.canRead() && file.canExecute() && file.isFile()){ //--> Farklı kontrolleri var.
        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File Opened");
            int ch = 0;
            while (ch != -1) {
                ch = in.read();
                char karakter = (char) ch;
                System.out.print(karakter);
            }
            System.out.println();
            in.close();
            System.out.println("File Closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // }
    }

    private void writeFile(File file) {

        try {
            OutputStream in = new FileOutputStream(file);
            System.out.println("File Opened");
            String write = "Ümit KÖSE";
            byte[] bytes = write.getBytes("US-ASCII");
            in.write(bytes);
            in.close();
            System.out.println("File Closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}