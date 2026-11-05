package com.blackcross;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Util;

public final class BlackCrossClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> client.setScreen(new BlackCrossTitleScreen()));
    }

    public static void openModsFolder() {
        MinecraftClient client = MinecraftClient.getInstance();
        Util.getOperatingSystem().open(client.runDirectory.toPath().resolve("mods").toFile());
    }
}
