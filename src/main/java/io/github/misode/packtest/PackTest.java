package io.github.misode.packtest;

import io.github.misode.packtest.commands.FailCommand;
import io.github.misode.packtest.commands.SucceedCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackTest implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("packtest");

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			FailCommand.register(dispatcher);
			SucceedCommand.register(dispatcher);
		});
	}
}
