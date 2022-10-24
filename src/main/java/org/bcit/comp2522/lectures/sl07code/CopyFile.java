package org.bcit.comp2522.lectures.sl07code;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {
  public String readFile(String path) {
    // refactored from https://www.tutorialspoint.com/java/java_files_io.htm
    FileInputStream inFile;
    try {
      ArrayList<Byte> contents = new ArrayList<Byte>();
      inFile = new FileInputStream(path);
      int chunk;
      while ((chunk = inFile.read()) != -1) {
        contents.add((byte) chunk);
      }
      inFile.close();

      byte[] barr = new byte[contents.size()];

      int i = 0;
      for (Byte b : contents) {
        barr[i] = b;
        i++;
      }

      String s = new String(barr);
      System.out.println(s);

      return s;
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return null;
  }

  public void writeFile(String path, String content) {
    try {
      FileOutputStream outFile = new FileOutputStream(path);
      for (Byte b : content.getBytes()) {
        outFile.write(b);
      }
      outFile.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}