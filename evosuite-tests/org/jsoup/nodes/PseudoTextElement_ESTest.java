/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:57:20 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PseudoTextElement_ESTest extends PseudoTextElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("NEM_,.<;]B0hWCzQ&hI", parseSettings0);
      CDataNode cDataNode0 = new CDataNode("$WxzY@^[+12Q");
      Attributes attributes0 = cDataNode0.attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "2CX&[;}DPSkv", attributes0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("2CX&[;}DPSkv");
      pseudoTextElement0.outerHtmlHead(mockFileWriter0, 0, (Document.OutputSettings) null);
      assertFalse(pseudoTextElement0.isBlock());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("NEM_,.<;]B0hWCzQ&hI", parseSettings0);
      CDataNode cDataNode0 = new CDataNode("$WxzY@^[+12Q");
      Attributes attributes0 = cDataNode0.attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "2CX&[;}DPSkv", attributes0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("2CX&[;}DPSkv");
      pseudoTextElement0.outerHtmlTail(mockFileWriter0, 24576, (Document.OutputSettings) null);
      assertEquals("nem_,.<;]b0hwczq&hi", pseudoTextElement0.nodeName());
  }
}
