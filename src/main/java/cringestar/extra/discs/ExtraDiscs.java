package cringestar.extra.discs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ExtraDiscs implements ModInitializer {

public static final Item MUSIC_DISC_SHULK = new ExtraDiscItem(12,Sounds.SHULK, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_PILLAGED = new ExtraDiscItem(6,Sounds.PILLAGED, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_18 = new ExtraDiscItem(8,Sounds.EIGHTEEN, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_TALL = new ExtraDiscItem(9,Sounds.TALL, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_ANTI = new ExtraDiscItem(10,Sounds.ANTI, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_BIRCH_BOP = new ExtraDiscItem(11,Sounds.BIRCH_BOP, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_CLOCK_CRAFT = new ExtraDiscItem(9,Sounds.CLOCKWORK_CRAFTER, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_DRUNK_STORM = new ExtraDiscItem(4,Sounds.DRUNKEN_STORM, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_FORT_STRESS = new ExtraDiscItem(2,Sounds.FORTSTRESS, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_FUNKY_SHULK = new ExtraDiscItem(15,Sounds.FUNKY_SHULK, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_NEON = new ExtraDiscItem(7,Sounds.NEON, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_NULL = new ExtraDiscItem(3,Sounds.NULL, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_OVER = new ExtraDiscItem(8,Sounds.OVER, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_SHULKEYED = new ExtraDiscItem(15,Sounds.SHULKEYED, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_STORM = new ExtraDiscItem(6,Sounds.STORM, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));

public static final Item MUSIC_DISC_VIBRATE = new ExtraDiscItem(2,Sounds.VIBRATE, new Item.Settings().maxCount(1).rarity(Rarity.EPIC));


public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
		new Identifier("extradiscs","general"))
			.icon(() -> new ItemStack(ExtraDiscs.MUSIC_DISC_SHULK))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Blocks.JUKEBOX));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_SHULK));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_PILLAGED));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_18));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_TALL));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_ANTI));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_BIRCH_BOP));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_CLOCK_CRAFT));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_DRUNK_STORM));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_FORT_STRESS));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_FUNKY_SHULK));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_NEON));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_NULL));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_OVER));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_SHULKEYED));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_STORM));
				stacks.add(new ItemStack(ExtraDiscs.MUSIC_DISC_VIBRATE));
		})
			.build();



	@Override

	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_shulk"), MUSIC_DISC_SHULK);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_pillaged"), MUSIC_DISC_PILLAGED);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_18"), MUSIC_DISC_18);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_tall"), MUSIC_DISC_TALL);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_anti"), MUSIC_DISC_ANTI);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_birch_bop"), MUSIC_DISC_BIRCH_BOP);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_clock_craft"), MUSIC_DISC_CLOCK_CRAFT);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_drunk_storm"), MUSIC_DISC_DRUNK_STORM);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_fort_stress"), MUSIC_DISC_FORT_STRESS);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_funky_shulk"), MUSIC_DISC_FUNKY_SHULK);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_neon"), MUSIC_DISC_NEON);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_null"), MUSIC_DISC_NULL);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_over"), MUSIC_DISC_OVER);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_shulkeyed"), MUSIC_DISC_SHULKEYED);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_storm"), MUSIC_DISC_STORM);
		Registry.register(Registry.ITEM, new Identifier("extradiscs","music_disc_vibrate"), MUSIC_DISC_VIBRATE);
		Registry.register(Registry.SOUND_EVENT, Sounds.SHULK_ID, Sounds.SHULK);
		Registry.register(Registry.SOUND_EVENT, Sounds.PILLAGED_ID, Sounds.PILLAGED);
		Registry.register(Registry.SOUND_EVENT, Sounds.EIGHTEEN_ID, Sounds.EIGHTEEN);
		Registry.register(Registry.SOUND_EVENT, Sounds.TALL_ID, Sounds.TALL);
		Registry.register(Registry.SOUND_EVENT, Sounds.ANTI_ID, Sounds.ANTI);
		Registry.register(Registry.SOUND_EVENT, Sounds.BIRCH_BOP_ID, Sounds.BIRCH_BOP);
		Registry.register(Registry.SOUND_EVENT, Sounds.CLOCKWORK_CRAFTER_ID, Sounds.CLOCKWORK_CRAFTER);
		Registry.register(Registry.SOUND_EVENT, Sounds.DRUNKEN_STORM_ID, Sounds.DRUNKEN_STORM);
		Registry.register(Registry.SOUND_EVENT, Sounds.FORTSTRESS_ID, Sounds.FORTSTRESS);
		Registry.register(Registry.SOUND_EVENT, Sounds.FUNKY_SHULK_ID, Sounds.FUNKY_SHULK);
		Registry.register(Registry.SOUND_EVENT, Sounds.NEON_ID, Sounds.NEON);
		Registry.register(Registry.SOUND_EVENT, Sounds.NULL_ID, Sounds.NULL);
		Registry.register(Registry.SOUND_EVENT, Sounds.OVER_ID, Sounds.OVER);
		Registry.register(Registry.SOUND_EVENT, Sounds.SHULKEYED_ID, Sounds.SHULKEYED);
		Registry.register(Registry.SOUND_EVENT, Sounds.STORM_ID, Sounds.STORM);
		Registry.register(Registry.SOUND_EVENT, Sounds.VIBRATE_ID, Sounds.VIBRATE);


		
	}
}
