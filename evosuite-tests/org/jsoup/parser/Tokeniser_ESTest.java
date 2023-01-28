/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:51:39 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Attributes incorrectly present on end tag");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2125);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.error("Attributes");
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(95, 95);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.AttributeName;
      tokeniser0.eofError(tokeniserState0);
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("w&#79%");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.Comment;
      tokeniser0.eofError(tokeniserState0);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Unexpected characters returned for ");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(38);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.BeforeAttributeValue;
      tokeniser0.error(tokeniserState0);
      assertFalse(parseErrorList0.isEmpty());
      assertEquals(1, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("X");
      ParseErrorList parseErrorList0 = new ParseErrorList(65, 60);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.StartTag token_StartTag0 = tokeniser0.startPending;
      token_StartTag0.tagName = "X";
      tokeniser0.emit(token_StartTag0);
      // Undeclared exception!
      try { 
        tokeniser0.isAppropriateEndTagToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Unexpected characters returned for ");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      Token.Tag token_Tag0 = tokeniser0.createTagPending(true);
      assertNotNull(token_Tag0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&lt{");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(46);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(4, characterReader0.pos());
      assertEquals("<{", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&lt;");
      ParseErrorList parseErrorList0 = new ParseErrorList(2274, (-319));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(false);
      assertEquals(4, characterReader0.pos());
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader(";");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(56);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = Character.valueOf('o');
      tokeniser0.consumeCharacterReference(character0, true);
      assertEquals(1, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&Lt;");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(4, characterReader0.pos());
      assertEquals("\u226A", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&Lt");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(false);
      assertEquals(3, characterReader0.pos());
      assertEquals("&Lt", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(3);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = Character.valueOf('T');
      tokeniser0.consumeCharacterReference(character0, true);
      assertTrue(parseErrorList0.isEmpty());
      assertEquals(0, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&#xaaa00");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(8, characterReader0.pos());
      assertEquals("\uDA6A\uDE00", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&#7xe");
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(5, characterReader0.pos());
      assertEquals("\u0007xe", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&#xa0;");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.unescapeEntities(true);
      assertEquals(6, characterReader0.pos());
      assertEquals("\u00A0", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#BVXt3fKQw_+>((WU(.");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 160);
      ParseErrorList parseErrorList0 = new ParseErrorList(160, 160);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.consumeCharacterReference((Character) null, false);
      assertFalse(parseErrorList0.isEmpty());
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Attributes incorrectly present on end tag");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2125);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      characterReader0.consumeLetterSequence();
      Character character0 = new Character('p');
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, false);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Q8Nyb$tc");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-673));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Character character0 = Character.valueOf('Q');
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, false);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Q8Nyb$tc");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-673));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      characterReader0.consumeTo('z');
      Character character0 = new Character('E');
      int[] intArray0 = tokeniser0.consumeCharacterReference(character0, true);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o9QsWfH>`Lro~]dB");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emit("o9QsWfH>`Lro~]dB");
      tokeniser0.emit(' ');
      char[] charArray0 = new char[6];
      tokeniser0.emit(charArray0);
      assertEquals(6, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("Q8Nyb$tc");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-673));
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.EndTag token_EndTag0 = (Token.EndTag)tokeniser0.createTagPending(false);
      token_EndTag0.newAttribute();
      tokeniser0.emit(token_EndTag0);
      assertTrue(parseErrorList0.isEmpty());
      assertEquals(0, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[T.<");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 2800);
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.EndTag token_EndTag0 = tokeniser0.endPending;
      tokeniser0.emit(token_EndTag0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("37(Tnyk&g+-eqbkkf");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token token0 = tokeniser0.read();
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Attributes incorrectly present on end tag");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2125);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emit("\"=#f[j5)E(&JI");
      tokeniser0.read();
      assertEquals(41, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Unexpected characters returned for ");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.read();
      assertEquals(35, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Unexpected characters returned for ");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = tokeniser0.getState();
      tokeniser0.error(tokeniserState0);
      assertEquals(0, parseErrorList0.size());
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      tokeniser0.createDoctypePending();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("wJ?>DC5vkDC$fPrV0");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      boolean boolean0 = tokeniser0.currentNodeInHtmlNS();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o9QsWfH>`Lro~]dB");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.emitCommentPending();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Invalid character reference: %s");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
      TokeniserState tokeniserState0 = TokeniserState.RawtextLessthanSign;
      tokeniser0.advanceTransition(tokeniserState0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Attributes incorrectly present on end tag");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2125);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      // Undeclared exception!
      try { 
        tokeniser0.emit((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A~'HTd$*B3m");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 1126);
      ParseErrorList parseErrorList0 = new ParseErrorList(1126, 22);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      // Undeclared exception!
      try { 
        tokeniser0.emitTagPending();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tokeniser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o9QsWfH>`Lro~]dB");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      TokeniserState tokeniserState0 = TokeniserState.BeforeDoctypeName;
      tokeniser0.transition(tokeniserState0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.createCommentPending();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
      tokeniser0.emitDoctypePending();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o9QsWfH>`Lro~]dB");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      String string0 = tokeniser0.appropriateEndTagName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("&Lt");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      tokeniser0.createTempBuffer();
  }
}
