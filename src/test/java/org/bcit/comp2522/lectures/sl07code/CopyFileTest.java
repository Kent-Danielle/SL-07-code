package org.bcit.comp2522.lectures.sl07code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CopyFileTest {
  CopyFile cp;

  @BeforeEach
  void setup() {
    cp = new CopyFile();
  }

  @Test
  void readFile() {
    String contents = cp.readFile("text/input.txt");
    assertEquals("OK", contents);
  }

  @Test
  void writeFile() {
    Random r = new Random();
    String content = r.ints(97,122)
      .limit(10)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
    cp.writeFile("text/output.txt", content);
    assertEquals(content, cp.readFile("text/output.txt"));
  }
}