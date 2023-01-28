/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:31:37 GMT 2023
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataUtil_ESTest extends DataUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Parser parser0 = Parser.xmlParser();
      // Undeclared exception!
      try { 
        DataUtil.parseInputStream(byteArrayInputStream0, "", "", parser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Parser parser0 = Parser.xmlParser();
      // Undeclared exception!
      try { 
        DataUtil.parseInputStream(byteArrayInputStream0, "", "", parser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = DataUtil.mimeBoundary();
      assertEquals("--------------------------------", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = DataUtil.getCharsetFromContentType("charset=");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DataUtil.getCharsetFromContentType((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DataUtil.getCharsetFromContentType("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      try { 
        DataUtil.readFileToByteBuffer(mockFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        DataUtil.readFileToByteBuffer((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("Up\"E", (String) null);
      ByteBuffer byteBuffer0 = DataUtil.readFileToByteBuffer(file0);
      assertTrue(byteBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        DataUtil.readToByteBuffer(pipedInputStream0, (-202));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Parser parser0 = Parser.xmlParser();
      try { 
        DataUtil.load((InputStream) byteArrayInputStream0, ";'Kb6c.B'", "T.y{5b:QpPCGE(Mx$L8", parser0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DataUtil.crossStreams(byteArrayInputStream0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.DataUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      File file0 = MockFile.createTempFile(";'Kb6c.B'", "4");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataUtil.crossStreams(byteArrayInputStream0, mockPrintStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("Up\"E", (String) null);
      Document document0 = DataUtil.load(file0, (String) null, "tbody");
      assertEquals("tbody", document0.location());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteBuffer byteBuffer0 = DataUtil.emptyByteBuffer();
      assertEquals(0, byteBuffer0.limit());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = DataUtil.load((InputStream) null, "e;W", "z`P{.5Q-&Gw");
      assertEquals("z`P{.5Q-&Gw", document0.location());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      try { 
        DataUtil.readToByteBuffer((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}