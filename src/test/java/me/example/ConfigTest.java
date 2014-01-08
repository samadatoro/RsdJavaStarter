package me.example;

import static org.junit.Assert.*;

import java.io.IOException;

import me.example.Config;

import org.junit.Test;

public class ConfigTest {

	@Test
	public void testGetInstance() {
		Config config = null;
		try {
			config = Config.getInstance();
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(config != null);
	}

	@Test
	public void testAsStringString() {
		Config config = null;
		try {
			config = Config.getInstance();
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(config!= null && !config.asString("application.name").isEmpty());
	}

}
