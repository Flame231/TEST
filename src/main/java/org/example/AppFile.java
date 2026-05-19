package org.example;

import java.io.*;

public class AppFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = FileUtil.getFile("user_ids.bin");


        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            byte[] array = {(byte) 130, 2, 3, 4, 5};
            System.out.println(array[0]);
            for (byte number : array) {
                fileOutputStream.write(number);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            while (fileInputStream.available() > 0) {
                System.out.println(fileInputStream.read());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
