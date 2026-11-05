package com.blackcross;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public final class BlackCrossTitleScreen extends Screen {
    private static final int SILVER = 0xFFC0C0C0;

    public BlackCrossTitleScreen() {
        super(Text.literal("BlackCross"));
    }

    @Override
    protected void init() {
        int x = this.width / 2;
        int y = this.height / 2;
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Play"), button ->
                MinecraftClient.getInstance().setScreen(null))
            .dimensions(x - 100, y + 75, 200, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Mods Folder"), button ->
                BlackCrossClient.openModsFolder())
            .dimensions(x - 100, y + 101, 200, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.fill(0, 0, this.width, this.height, 0xFF08090B);
        int cx = this.width / 2;
        int cy = this.height / 2 - 20;
        context.fill(cx - 4, cy - 28, cx + 4, cy + 28, SILVER);
        context.fill(cx - 28, cy - 4, cx + 28, cy + 4, SILVER);
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, cx, cy + 39, 0xFFE7E7E7);
        super.render(context, mouseX, mouseY, delta);
    }
}
