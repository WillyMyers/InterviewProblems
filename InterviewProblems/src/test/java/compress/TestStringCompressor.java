//package test.java.compress;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import main.java.compress.StringCompressor;
//
//public class TestStringCompressor {
//
//	StringCompressor compressor = new StringCompressor();
//
//	@Test
//	public void testString() {
//		assertEquals("a2b1c3b2a4", compressor.compress("aabcccbbaaaa" ));
//	}
//
//	@Test
//	public void testShortString() {
//		assertEquals("aa", compressor.compress("aa" ));
//	}
//
//	@Test
//	public void testNull() {
//		assertEquals(null, compressor.compress(null));
//	}
//
//	@Test
//	public void testEmpty() {
//		assertEquals("", compressor.compress(""));
//	}
//
//}
