package tfc_metallurgy.common.block_entities;

import net.dries007.tfc.common.blockentities.TFCBellBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class MetallurgyBellBlockEntity extends TFCBellBlockEntity {

    public MetallurgyBellBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return MetallurgyBlockEntities.BELL.get();
    }
}
