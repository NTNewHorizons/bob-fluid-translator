package com.ezzo.fluidtranslator.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HBMAdapterItemBlock extends ItemBlock {

    public HBMAdapterItemBlock(Block block) {
        super(block);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(EnumChatFormatting.YELLOW + "" + EnumChatFormatting.ITALIC + "Hold SHIFT");

        if (GuiScreen.isShiftKeyDown()) {
            String formatting = EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC;
            list.add(formatting + "Bridges NTM machines to Forge fluids.");
            list.add(formatting + "Connects to a machine from NTM and emulates one");
            list.add(formatting + "of its internal tanks. Only works with NTM fluids.");
        }
    }
}
