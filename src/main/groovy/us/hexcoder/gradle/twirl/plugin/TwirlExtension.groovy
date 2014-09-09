package us.hexcoder.gradle.twirl.plugin

import java.nio.charset.Charset

/**
 * @author 67726e
 *
 * See: https://github.com/spray/twirl/blob/caa18e5727861ccba3116021576e7dad58893754/sbt-twirl/src/main/scala/twirl/sbt/TwirlKeys.scala
 */
class TwirlExtension {
	String sourceDirectory = "src/main/twirl"
	String testSourceDirectory = "src/test/twirl"
	String targetDirectory = "build/generated-sources/main/twirl"
	String testTargetDirectory = "build/generated-sources/test/twirl"
	Set<String> imports = new HashSet<>()
	Charset charset = Charset.forName("UTF8")

	public TwirlExtension() {
		// Default imports from Twirl-Maven
		// See: https://github.com/JakeWharton/twirl-maven-plugin/blob/d58dc907b33f0088f4e827899ad078ce706840b9/twirl-maven-plugin/src/main/java/com/jakewharton/twirl/CompileMojo.java#L37
		imports.addAll(
				"import java.lang._",
				"import java.util._",
				"import scala.collection.JavaConversions._",
				"import scala.collection.JavaConverters._")
	}
}
