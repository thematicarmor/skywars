package us.potatoboy.skywars.game;

import bond.thematic.minigamemanager.MinigameManagerMod;
import bond.thematic.minigamemanager.kit.Kit;
import bond.thematic.minigamemanager.kit.KitRegistry;
import net.minecraft.server.network.ServerPlayerEntity;
import xyz.nucleoid.plasmid.game.common.team.GameTeam;

public class SkyWarsPlayer {
    public int kills = 0;
    public Kit selectedKit;
    public GameTeam team = null;

    public SkyWarsPlayer(ServerPlayerEntity player) {
        this.selectedKit = KitRegistry.get(MinigameManagerMod.KIT_STORAGE.getPlayerKit(player.getUuid()));
    }
}
