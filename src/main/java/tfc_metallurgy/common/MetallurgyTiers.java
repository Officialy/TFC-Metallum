package tfc_metallurgy.common;

import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.ToolTier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.TierSortingRegistry;
import tfc_metallurgy.MetallurgyTags;
import tfc_metallurgy.TFCMetallurgy;

import javax.annotation.Nullable;
import java.util.List;

import static net.dries007.tfc.common.TFCTiers.*;

public final class MetallurgyTiers {

    public static final Tier FLORENTINE_BRONZE = register("florentine_bronze", Tiers.IRON, Tiers.DIAMOND, TFCTags.Blocks.NEEDS_BRONZE_TOOL, 2, 1300, 7.3F, 4.0F, 13);
    public static final Tier ALUMINUM = register("aluminum", Tiers.STONE, Tiers.IRON, MetallurgyTags.Blocks.NEEDS_ALUMINUM_TOOLS, 2, 880, 8f, 4f, 32);
    public static final Tier MITHRIL = register("mithril", Tiers.IRON, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_MITHRIL_TOOLS, 2, 1600, 10f, 4.25f, 12);
    public static final Tier NICKEL_SILVER = register("nickel_silver", Tiers.IRON, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_NICKEL_SILVER_TOOLS, 2, 4490, 11.9f, 5.3f, 19);
    public static final Tier INVAR = register("invar", Tiers.IRON, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_INVAR_TOOLS, 2, 4500, 12f, 5.25f, 14);
    public static final Tier COMPRESSED_IRON = register("compressed_iron", WROUGHT_IRON, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_COMPRESSED_IRON_TOOLS, 3, 2500, 8.2f, 4.8f, 15);
    public static final Tier COBALT = register("cobalt", List.of(WROUGHT_IRON, COMPRESSED_IRON), List.of(Tiers.DIAMOND), MetallurgyTags.Blocks.NEEDS_COBALT_TOOLS, 2, 2200, 13f, 4.75f, 13);
    public static final Tier OSMIUM = register("osmium", List.of(WROUGHT_IRON, COMPRESSED_IRON), List.of(Tiers.DIAMOND), MetallurgyTags.Blocks.NEEDS_OSMIUM_TOOLS, 3, 5000, 17f, 7f, 15);
    public static final Tier OSMIRIDIUM = register("osmiridium", OSMIUM, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_OSMIRIDIUM_TOOLS, 3, 5900, 17.5f, 7.5f, 15);
    public static final Tier BORON = register("boron", List.of(WROUGHT_IRON, COMPRESSED_IRON), List.of(Tiers.DIAMOND), MetallurgyTags.Blocks.NEEDS_BORON_TOOLS, 3, 6200, 15f, 5.9f, 28);
    public static final Tier URANIUM = register("uranium", List.of(WROUGHT_IRON, COMPRESSED_IRON), List.of(Tiers.DIAMOND), MetallurgyTags.Blocks.NEEDS_URANIUM_TOOLS, 3, 3900, 12f, 5.1f, 12);
    public static final Tier BERYLLIUM_COPPER = register("beryllium_copper", List.of(WROUGHT_IRON, COMPRESSED_IRON, URANIUM), List.of(Tiers.DIAMOND), MetallurgyTags.Blocks.NEEDS_BERYLLIUM_COPPER_TOOLS, 3, 5200, 13.9f, 6.1f, 15);
    public static final Tier PEWTER = register("pewter", List.of(WROUGHT_IRON, COMPRESSED_IRON, URANIUM), List.of(Tiers.DIAMOND), MetallurgyTags.Blocks.NEEDS_PEWTER_TOOLS, 3, 4900, 9.9f, 4.7f, 23);
    public static final Tier FERROBORON = register("steel", Tiers.DIAMOND, Tiers.NETHERITE, MetallurgyTags.Blocks.NEEDS_FERROBORON_TOOLS, 4, 4500, 12.5f, 6.75f, 19);
    public static final Tier SIGNALUM = register("signalum", FERROBORON, Tiers.NETHERITE, MetallurgyTags.Blocks.NEEDS_SIGNALUM_TOOLS, 4, 5900, 16f, 7f, 12);
    public static final Tier LUMIUM = register("lumium", SIGNALUM, Tiers.NETHERITE, MetallurgyTags.Blocks.NEEDS_LUMIUM_TOOLS, 4, 6500, 16f, 7f, 13);
    public static final Tier REFINED_OBSIDIAN = register("refined_osbidian", LUMIUM, Tiers.NETHERITE, MetallurgyTags.Blocks.NEEDS_REFINED_OBSIDIAN_TOOLS, 4, 5900, 15.9f, 7.1f, 15);
    public static final Tier REFINED_GLOWSTONE = register("refined_glowstone", REFINED_OBSIDIAN, Tiers.NETHERITE, MetallurgyTags.Blocks.NEEDS_REFINED_GLOWSTONE_TOOLS, 4, 6300, 15.9f, 7.1f, 15);
    public static final Tier ENDERIUM = register("enderium", STEEL, Tiers.NETHERITE, MetallurgyTags.Blocks.NEEDS_ENDERIUM_TOOLS, 5, 7900, 19f, 10f, 10);
    public static final Tier TITANIUM = register("titanium", WROUGHT_IRON, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_TITANIUM_TOOLS, 3, 3900, 10.9f, 5.5f, 20);
    public static final Tier THORIUM = register("thorium", TITANIUM, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_THORIUM_TOOLS, 3, 3900, 11.5f, 5.2f, 12);
    public static final Tier TUNGSTEN = register("tungsten", THORIUM, Tiers.DIAMOND, MetallurgyTags.Blocks.NEEDS_TUNGSTEN_TOOLS, 3, 4000, 11f, 5.8f, 18);
    public static final Tier TUNGSTEN_STEEL = register("tungsten_steel", Tiers.NETHERITE, null, TFCTags.Blocks.NEEDS_COLORED_STEEL_TOOL, 6, 9200, 18f, 9.1f, 24);

    private static Tier register(String name, Tier before, @Nullable Tier after, TagKey<Block> tag, int level, int uses, float speed, float damage, int enchantmentValue)
    {
        return register(name, List.of(before), after == null ? List.of() : List.of(after), tag, level, uses, speed, damage, enchantmentValue);
    }

    private static Tier register(String name, List<Object> before, List<Object> after, TagKey<Block> tag, int level, int uses, float speed, float damage, int enchantmentValue)
    {
        final Tier tier = new ToolTier(name, level, uses, speed, damage, enchantmentValue, tag, () -> Ingredient.EMPTY);
        if (!Helpers.BOOTSTRAP_ENVIRONMENT) TierSortingRegistry.registerTier(tier, new ResourceLocation(TFCMetallurgy.mod_id, name), before, after);
        return tier;
    }
}