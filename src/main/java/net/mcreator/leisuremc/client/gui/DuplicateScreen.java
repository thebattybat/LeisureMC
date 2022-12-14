
package net.mcreator.leisuremc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.leisuremc.world.inventory.DuplicateMenu;
import net.mcreator.leisuremc.network.DuplicateButtonMessage;
import net.mcreator.leisuremc.LeisuremcMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DuplicateScreen extends AbstractContainerScreen<DuplicateMenu> {
	private final static HashMap<String, Object> guistate = DuplicateMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public DuplicateScreen(DuplicateMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("leisuremc:textures/duplicate.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("leisuremc:textures/q_u_a_g_o_a_t.png"));
		this.blit(ms, this.leftPos + 102, this.topPos + -25, 0, 0, 200, 200, 200, 200);

		RenderSystem.setShaderTexture(0, new ResourceLocation("leisuremc:textures/arrow.png"));
		this.blit(ms, this.leftPos + 77, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "duplicator menu", 41, 10, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 46, this.topPos + 57, 72, 20, new TextComponent("duplicate"), e -> {
			if (true) {
				LeisuremcMod.PACKET_HANDLER.sendToServer(new DuplicateButtonMessage(0, x, y, z));
				DuplicateButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
