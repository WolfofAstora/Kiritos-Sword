package kiritossword;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import org.jetbrains.annotations.NotNull;

public class Elucidator extends Item{

    public Elucidator(ResourceKey<Item> p_365136_)
    {
        super(new Item.Properties()
                .durability(3000) // sword durability
                .rarity(Rarity.EPIC)
                .attributes(ItemAttributeModifiers.builder()
                        .add(Attributes.ATTACK_DAMAGE,
                                new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, 15.0D, AttributeModifier.Operation.ADD_VALUE),
                                EquipmentSlotGroup.MAINHAND)
                        .add(Attributes.ATTACK_SPEED,
                                new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, 4.0D, AttributeModifier.Operation.ADD_VALUE),
                                EquipmentSlotGroup.MAINHAND)
                        .build()
                )
                .setId(p_365136_)
        );
    }
}