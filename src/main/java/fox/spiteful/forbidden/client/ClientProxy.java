package fox.spiteful.forbidden.client;

import fox.spiteful.forbidden.Proxy;
import fox.spiteful.forbidden.blocks.ForbiddenBlocks;
import fox.spiteful.forbidden.items.ForbiddenItems;
import fox.spiteful.forbidden.items.ItemResource;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends Proxy {

    @Override
    public void stupidJsonBullshit(){

        for(int x = 0;x < ItemResource.getTypes().length;x++){
            setCustomModelResourceLocation(ForbiddenItems.resource, x, ItemResource.getTypes()[x]);
        }
        //setCustomModelResourceLocation(Item.getItemFromBlock(ForbiddenBlocks.chalk_rune), 0, "chalk_rune");
        setCustomModelResourceLocation(ForbiddenItems.demon_chalk, 0, "demon_chalk");
        setCustomModelResourceLocation(Item.getItemFromBlock(ForbiddenBlocks.ritual_table), 0, "ritual_table");
    }

    public void setCustomModelResourceLocation(Item item, int meta, String name){
        if(item == null)
            return;
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("forbidden:" + name, "inventory"));
    }
}
