package org.bcit.comp2522.lectures.sl07code;

import java.io.File;
public class ReadDir {

  public static void main(String[] args) {
    // from https://www.tutorialspoint.com/java/java_files_io.htm
    File file = null;
    String[] paths;

    try {
      // create new file object
      file = new File("text/");

      // array of files and directory
      paths = file.list();

      // for each name in the path array
      for(String path:paths) {
        // prints filename and directory name
        System.out.println(path);
      }
    } catch (Exception e) {
      // if any error occurs
      e.printStackTrace();
    }
  }
}