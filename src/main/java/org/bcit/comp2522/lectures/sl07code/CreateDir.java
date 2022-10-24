package org.bcit.comp2522.lectures.sl07code;

import java.io.File;
public class CreateDir {

  public static void main(String args[]) {
    // from https://www.tutorialspoint.com/java/java_files_io.htm
    String dirname = "text/more";
    File d = new File(dirname);

    // Create directory now.
    d.mkdirs();
  }
}