package committee.nova.mods.polaris.client.screen;

import committee.nova.mods.polaris.common.container.ObsidianNetherFurnaceMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class ObsidianNetherFurnaceScreen extends AbstractFurnaceScreen<ObsidianNetherFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/furnace.png");

    public ObsidianNetherFurnaceScreen(ObsidianNetherFurnaceMenu container, Inventory playerInventory, Component titleIn) {
        super(container, new SmeltingRecipeBookComponent(), playerInventory, titleIn, TEXTURE);
    }

//    @Override
//    protected void renderBg(GuiGraphics matrixStack, float partialTicks, int mouseX, int mouseY) {
//        List<Component> list = new ArrayList<>();
//        list.add(Component.literal("test"));
//        this.renderBackground(matrixStack);
//        this.render(matrixStack, mouseX, mouseY, partialTicks);
//        matrixStack.renderComponentTooltip(font, list, mouseX, mouseY);
//    }
}
