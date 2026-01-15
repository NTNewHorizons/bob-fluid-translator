package com.ezzo.fluidtranslator.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.ezzo.fluidtranslator.blocks.BlockUniversalTank;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class UniversalTankItemBlock extends ItemBlock {

    public UniversalTankItemBlock(Block block) {
        super(block);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(((BlockUniversalTank) field_150939_a).getCapacity() + "mb");
        list.add(EnumChatFormatting.YELLOW + "" + EnumChatFormatting.ITALIC + "Hold SHIFT");

        if (GuiScreen.isShiftKeyDown()) {
            String formatting = EnumChatFormatting.GRAY + "" + EnumChatFormatting.ITALIC;
            list.add(formatting + "Can store fluids from NTM and convert them to Forge fluids.");
            list.add(formatting + "Acts as a Forge tank and connects to NTM's fluid network.");
            list.add(formatting + "Only accepts NTM fluids.");
        }
    }
}
