package crazypants.enderzoo.config;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class ConfigFactoryEnderZoo implements IModGuiFactory {

  @Override
  public void initialize(Minecraft minecraftInstance) {
  }

  @Override
  public GuiScreen createConfigGui(GuiScreen current) {
    return new GuiConfigFactoryEnderZoo(current);
  }

  @Override
  public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
    return null;
  }

  @Override
  public boolean hasConfigGui() {
	return true;
  }

}
