package xyz.apfelmus.cheeto.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Minecraft.class})
public interface MinecraftAccessor {
  @Accessor("timer")
  Timer getTimer();
}


/* Location:              C:\Users\AverageDev\AppData\Roaming\.minecraft\mods\1.8.9\w\mg_chee.jar!\xyz\apfelmus\cheeto\mixin\mixins\MinecraftAccessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */