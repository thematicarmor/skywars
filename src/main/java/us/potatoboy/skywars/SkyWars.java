package us.potatoboy.skywars;

import bond.thematic.minigamemanager.kit.KitRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import us.potatoboy.skywars.custom.SWBlocks;
import us.potatoboy.skywars.game.SkyWarsConfig;
import us.potatoboy.skywars.game.SkyWarsWaiting;
import xyz.nucleoid.plasmid.game.GameType;
import xyz.nucleoid.plasmid.game.rule.GameRuleType;

public class SkyWars implements ModInitializer {
    public static final String ID = "skywars";
    public static final Logger LOGGER = LogManager.getLogger(ID);

    public static GameRuleType PROJECTILE_PLAYER_MOMENTUM = GameRuleType.create();
    public static GameRuleType REDUCED_EXPLOSION_DAMAGE = GameRuleType.create();

    public static final GameType<SkyWarsConfig> TYPE = GameType.register(
            new Identifier(ID, "skywars"),
            SkyWarsConfig.CODEC,
            SkyWarsWaiting::open
    );

    @Override
    public void onInitialize() {
        SWBlocks.register();

        KitRegistry.register("skywars");
    }

    public static Identifier identifier(String value) {
        return new Identifier(ID, value);
    }
}
