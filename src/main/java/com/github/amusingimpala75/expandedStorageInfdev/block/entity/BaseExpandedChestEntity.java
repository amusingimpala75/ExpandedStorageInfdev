package com.github.amusingimpala75.expandedStorageInfdev.block.entity;

import net.minecraft.block.tile.Chest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;

public class BaseExpandedChestEntity extends Chest {

    protected int slots;
    //protected ItemStack[] stacks;

    //New
    public BaseExpandedChestEntity(int slots) {
        super();
        this.slots = slots;
        this.stacks = new ItemStack[slots];
    }

    //From Save
    public BaseExpandedChestEntity() {
        super();
    }

    @Override
    public int size() {
        return slots;
    }

    /*@Override
    public ItemStack get(int i) {
        return this.stacks[i];
    }

    @Override
    public ItemStack damage(int slot, int amount) {
        if (this.stacks[slot] != null) {
            ItemStack amount2;
            if (this.stacks[slot].count <= amount) {
                amount2 = this.stacks[slot];
                this.stacks[slot] = null;
                return amount2;
            } else {
                amount2 = this.stacks[slot].split(amount);
                if (this.stacks[slot].count == 0) {
                    this.stacks[slot] = null;
                }

                return amount2;
            }
        } else {
            return null;
        }
    }

    @Override
    public void set(int slot, ItemStack stack) {
        this.stacks[slot] = stack;
        if (stack != null && stack.count > 64) {
            stack.count = 64;
        }
    }*/

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void deserialize(CompoundTag tag) {
        super.deserialize(tag);

        this.slots = tag.getInt("slots");

        ListTag listTag = tag.getList("Items");
        this.stacks = new ItemStack[slots];
        for(int var2 = 0; var2 < listTag.size(); ++var2) {
            CompoundTag var3;
            int var4;
            if ((var4 = (var3 = (CompoundTag)listTag.get(var2)).getByte("Slot") & 255) >= 0 && var4 < this.stacks.length) {
                this.stacks[var4] = new ItemStack(var3);
            }
        }
    }

    @Override
    public void serialize(CompoundTag tag) {
        super.serialize(tag);

        tag.putInt("slots", slots);

        ListTag var2 = new ListTag();
        for(int var3 = 0; var3 < this.stacks.length; ++var3) {
            if (this.stacks[var3] != null) {
                CompoundTag var4;
                (var4 = new CompoundTag()).putByte("Slot", (byte)var3);
                this.stacks[var3].write(var4);
                var2.add(var4);
            }
        }

        tag.put("Items", var2);
    }

    @Override
    public int method_294() {
        return super.method_294();
    }
}
