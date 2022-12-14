package net.mcreator.strangerthin.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.strangerthin.StrangerthinMod;

import java.util.Map;

public class MindflayerLorsDeLapparitionInitialeDeLentiteProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				StrangerthinMod.LOGGER.warn("Failed to load dependency world for procedure MindflayerLorsDeLapparitionInitialeDeLentite!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("Le Mindflayer vient de surgir des entrailles de l'Upside Down"),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
