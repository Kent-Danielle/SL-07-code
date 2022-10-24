package org.bcit.comp2522.lectures.sl07code;
import java.io.*;

public class ReadConsole {

  public static void main(String args[]) throws IOException {
    // from https://www.tutorialspoint.com/java/java_files_io.htm
    InputStreamReader cin = null;

    try {
      cin = new InputStreamReader(System.in);
      System.out.println("Enter characters, 'q' to quit.");
      char c;
      do {
        c = (char) cin.read();
        System.out.print(c);
      } while(c != 'q');
    }finally {
      if (cin != null) {
        cin.close();
      }
    }
  }
}