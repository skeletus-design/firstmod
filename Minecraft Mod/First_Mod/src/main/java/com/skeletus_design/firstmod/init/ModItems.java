package com.skeletus_design.firstmod.init;

import com.skeletus_design.firstmod.firstmod;
import javafx.scene.paint.Material;
import com.skeletus_design.firstmod.items.MaterialItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, firstmod.MOD_ID);//Важно, что <Item> нужно импортировать

    //Создаем предмет
    public static final RegistryObject<Item> CITRIN = ITEMS.register("citrine", MaterialItem::new);
}
