package com.bridgelabz.EmployeePayrollService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollServiceTest {
	private static String HOME = System.getProperty("user.home");
	private static String PLAY_WITH_NIO = "TepmPLayGround";

	@Test
	public void givenPathWhenCheckedThenConfirm() throws IOException{
		Path homePath = Paths.get(HOME);
		Assert.assertTrue(Files.exists(homePath));

		Path playPath = Paths.get(HOME, PLAY_WITH_NIO);
		if(Files.exists(playPath)) FileUtils.deleteFiles(playPath.toFile());
		Assert.assertTrue(Files.notExists(playPath));

		Files.createDirectories(playPath);
		Assert.assertTrue(Files.exists(playPath));

		IntStream.range(1, 10).forEach(cntr -> {
			Path tempFile = Paths.get(playPath + "/temp"+cntr);
			Assert.assertTrue(Files.notExists(tempFile));
			try {Files.createDirectories(tempFile);}
			catch (IOException e) {}
			Assert.assertTrue(Files.exists(tempFile));
		});

		Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
		Files.newDirectoryStream(playPath).forEach(System.out::println);
		Files.newDirectoryStream(playPath, path ->path.getFileName().toString().startsWith("temp")).forEach(System.out::println);
	}
}

