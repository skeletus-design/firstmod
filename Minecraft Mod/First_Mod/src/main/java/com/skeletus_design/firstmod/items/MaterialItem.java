package com.skeletus_design.firstmod.items;

import com.skeletus_design.firstmod.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MaterialItem extends Item {

    public MaterialItem() {
        super(new Item.Properties().group(ModItemGroups.MOD_MATERIALS_TAB));
    }
}
