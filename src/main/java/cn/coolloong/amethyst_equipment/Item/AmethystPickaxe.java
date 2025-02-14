package cn.coolloong.amethyst_equipment.Item;

import cn.nukkit.item.Item;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;

import java.util.List;

/**
 * The type My pickaxe.
 */
public class AmethystPickaxe extends ItemCustomTool {
    public AmethystPickaxe() {
        super("yes:amethyst_pickaxe", null, "amethyst_pickaxe");
    }

    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .toolBuilder(this, ItemCreativeCategory.EQUIPMENT)
        //         .addRepairItems(List.of(Item.fromString("minecraft:amethyst_shard")), 100)
        //         .addRepairItems(List.of(Item.fromString("yes:amethyst_pickaxe")), 400)
                .speed(12)
                .creativeGroup("itemGroup.name.pickaxe")
                .allowOffHand(true)
                .handEquipped(true)
                .build();
    }

    @Override
    public int getMaxDurability() {
        return 500;
    }

    @Override
    public boolean isPickaxe() {
        return true;
    }

    @Override
    public int getAttackDamage() {
        return 5;
    }

    @Override
    public int getEnchantAbility() {
        return 22;
    }

    @Override
    public int getTier() {
        return ItemCustomTool.TIER_DIAMOND;
    }

}
