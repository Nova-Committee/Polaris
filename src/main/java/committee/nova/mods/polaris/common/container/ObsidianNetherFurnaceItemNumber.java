package committee.nova.mods.polaris.common.container;


import net.minecraft.world.inventory.ContainerData;

public class ObsidianNetherFurnaceItemNumber implements ContainerData {
    int i = 0;
    @Override
    public int get(int index) {
        return i;
    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public int getCount() {
        return 4;
    }
}
