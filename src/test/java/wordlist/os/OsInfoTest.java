package wordlist.os;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class OsInfoTest {
	@Test
	void getOS() {
		if (OsInfo.isWindows() == true) {
			assertEquals(OsInfo.getOS(), "windows");
		} else if (OsInfo.isMac() == true) {
			assertEquals(OsInfo.getOS(), "osx");
		} else if (OsInfo.isUnix() == true) {
			assertEquals(OsInfo.getOS(), "unix");
		} else if (OsInfo.isSolaris() == true) {
			assertEquals(OsInfo.getOS(), "solaris");
		} else {
			assertEquals(OsInfo.getOS(), "err");
			fail("Current operating system could not be detected!");
		}
	}
}