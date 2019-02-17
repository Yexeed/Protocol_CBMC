package com.nukkitx.protocol.bedrock.v313;

import com.nukkitx.protocol.bedrock.BedrockPacketCodec;
import com.nukkitx.protocol.bedrock.packet.*;
import com.nukkitx.protocol.bedrock.v313.serializer.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Bedrock_v313 {
    public static BedrockPacketCodec V313_CODEC = BedrockPacketCodec.builder()
            .protocolVersion(313)
            .headerSerializer(PacketHeaderSerializer_v313.INSTANCE)
            .registerPacket(LoginPacket.class, LoginSerializer_v313.INSTANCE, 1)
            .registerPacket(PlayStatusPacket.class, PlayStatusSerializer_v313.INSTANCE, 2)
            .registerPacket(ServerToClientHandshakePacket.class, ServerToClientHandshakeSerializer_v313.INSTANCE, 3)
            .registerPacket(ClientToServerHandshakePacket.class, ClientToServerHandshakeSerializer_v313.INSTANCE, 4)
            .registerPacket(DisconnectPacket.class, DisconnectSerializer_v313.INSTANCE, 5)
            .registerPacket(ResourcePacksInfoPacket.class, ResourcePacksInfoSerializer_v313.INSTANCE, 6)
            .registerPacket(ResourcePackStackPacket.class, ResourcePackStackSerializer_v313.INSTANCE, 7)
            .registerPacket(ResourcePackClientResponsePacket.class, ResourcePackClientResponseSerializer_v313.INSTANCE, 8)
            .registerPacket(TextPacket.class, TextSerializer_v313.INSTANCE, 9)
            .registerPacket(SetTimePacket.class, SetTimeSerializer_v313.INSTANCE, 10)
            .registerPacket(StartGamePacket.class, StartGameSerializer_v313.INSTANCE, 11)
            .registerPacket(AddPlayerPacket.class, AddPlayerSerializer_v313.INSTANCE, 12)
            .registerPacket(AddEntityPacket.class, AddEntitySerializer_v313.INSTANCE, 13)
            .registerPacket(RemoveEntityPacket.class, RemoveEntitySerializer_v313.INSTANCE, 14)
            .registerPacket(AddItemEntityPacket.class, AddItemEntitySerializer_v313.INSTANCE, 15)
            .registerPacket(AddHangingEntityPacket.class, AddHangingEntitySerializer_v313.INSTANCE, 16)
            .registerPacket(TakeItemEntityPacket.class, TakeItemEntitySerializer_v313.INSTANCE, 17)
            .registerPacket(MoveEntityAbsolutePacket.class, MoveEntityAbsoluteSerializer_v313.INSTANCE, 18)
            .registerPacket(MovePlayerPacket.class, MovePlayerSerializer_v313.INSTANCE, 19)
            .registerPacket(RiderJumpPacket.class, RiderJumpSerializer_v313.INSTANCE, 20)
            .registerPacket(UpdateBlockPacket.class, UpdateBlockSerializer_v313.INSTANCE, 21)
            .registerPacket(AddPaintingPacket.class, AddPaintingSerializer_v313.INSTANCE, 22)
            .registerPacket(ExplodePacket.class, ExplodeSerializer_v313.INSTANCE, 23)
            .registerPacket(LevelSoundEventPacket.class, LevelSoundEventSerializer_v313.INSTANCE, 24)
            .registerPacket(LevelEventPacket.class, LevelEventSerializer_v313.INSTANCE, 25)
            .registerPacket(BlockEventPacket.class, BlockEventSerializer_v313.INSTANCE, 26)
            .registerPacket(EntityEventPacket.class, EntityEventSerializer_v313.INSTANCE, 27)
            .registerPacket(MobEffectPacket.class, MobEffectSerializer_v313.INSTANCE, 28)
            .registerPacket(UpdateAttributesPacket.class, UpdateAttributesSerializer_v313.INSTANCE, 29)
            .registerPacket(InventoryTransactionPacket.class, InventoryTransactionSerializer_v313.INSTANCE, 30)
            .registerPacket(MobEquipmentPacket.class, MobEquipmentSerializer_v313.INSTANCE, 31)
            .registerPacket(MobArmorEquipmentPacket.class, MobArmorEquipmentSerializer_v313.INSTANCE, 32)
            .registerPacket(InteractPacket.class, InteractSerializer_v313.INSTANCE, 33)
            .registerPacket(BlockPickRequestPacket.class, BlockPickRequestSerializer_v313.INSTANCE, 34)
            .registerPacket(EntityPickRequestPacket.class, EntityPickRequestSerializer_v313.INSTANCE, 35)
            .registerPacket(PlayerActionPacket.class, PlayerActionSerializer_v313.INSTANCE, 36)
            .registerPacket(EntityFallPacket.class, EntityFallSerializer_v313.INSTANCE, 37)
            .registerPacket(HurtArmorPacket.class, HurtArmorSerializer_v313.INSTANCE, 38)
            .registerPacket(SetEntityDataPacket.class, SetEntityDataSerializer_v313.INSTANCE, 39)
            .registerPacket(SetEntityMotionPacket.class, SetEntityMotionSerializer_v313.INSTANCE, 40)
            .registerPacket(SetEntityLinkPacket.class, SetEntityLinkSerializer_v313.INSTANCE, 41)
            .registerPacket(SetHealthPacket.class, SetHealthSerializer_v313.INSTANCE, 42)
            .registerPacket(SetSpawnPositionPacket.class, SetSpawnPositionSerializer_v313.INSTANCE, 43)
            .registerPacket(AnimatePacket.class, AnimateSerializer_v313.INSTANCE, 44)
            .registerPacket(RespawnPacket.class, RespawnSerializer_v313.INSTANCE, 45)
            .registerPacket(ContainerOpenPacket.class, ContainerOpenSerializer_v313.INSTANCE, 46)
            .registerPacket(ContainerClosePacket.class, ContainerCloseSerializer_v313.INSTANCE, 47)
            .registerPacket(PlayerHotbarPacket.class, PlayerHotbarSerializer_v313.INSTANCE, 48)
            .registerPacket(InventoryContentPacket.class, InventoryContentSerializer_v313.INSTANCE, 49)
            .registerPacket(InventorySlotPacket.class, InventorySlotSerializer_v313.INSTANCE, 50)
            .registerPacket(ContainerSetDataPacket.class, ContainerSetDataSerializer_v313.INSTANCE, 51)
            .registerPacket(CraftingDataPacket.class, CraftingDataSerializer_v313.INSTANCE, 52)
            .registerPacket(CraftingEventPacket.class, CraftingEventSerializer_v313.INSTANCE, 53)
            .registerPacket(GuiDataPickItemPacket.class, GuiDataPickItemSerializer_v313.INSTANCE, 54)
            .registerPacket(AdventureSettingsPacket.class, AdventureSettingsSerializer_v313.INSTANCE, 55)
            .registerPacket(BlockEntityDataPacket.class, BlockEntityDataSerializer_v313.INSTANCE, 56)
            .registerPacket(PlayerInputPacket.class, PlayerInputSerializer_v313.INSTANCE, 57)
            .registerPacket(FullChunkDataPacket.class, FullChunkDataSerializer_v313.INSTANCE, 58)
            .registerPacket(SetCommandsEnabledPacket.class, SetCommandsEnabledSerializer_v313.INSTANCE, 59)
            .registerPacket(SetDifficultyPacket.class, SetDifficultySerializer_v313.INSTANCE, 60)
            .registerPacket(ChangeDimensionPacket.class, ChangeDimensionSerializer_v313.INSTANCE, 61)
            .registerPacket(SetPlayerGameTypePacket.class, SetPlayerGameTypeSerializer_v313.INSTANCE, 62)
            .registerPacket(PlayerListPacket.class, PlayerListSerializer_v313.INSTANCE, 63)
            .registerPacket(SimpleEventPacket.class, SimpleEventSerializer_v313.INSTANCE, 64)
            .registerPacket(EventPacket.class, EventSerializer_v313.INSTANCE, 65)
            .registerPacket(SpawnExperienceOrbPacket.class, SpawnExperienceOrbSerializer_v313.INSTANCE, 66)
            .registerPacket(ClientboundMapItemDataPacket.class, ClientboundMapItemDataSerializer_v313.INSTANCE, 67)
            .registerPacket(MapInfoRequestPacket.class, MapInfoRequestSerializer_v313.INSTANCE, 68)
            .registerPacket(RequestChunkRadiusPacket.class, RequestChunkRadiusSerializer_v313.INSTANCE, 69)
            .registerPacket(ChunkRadiusUpdatedPacket.class, ChunkRadiusUpdatedSerializer_v313.INSTANCE, 70)
            .registerPacket(ItemFrameDropItemPacket.class, ItemFrameDropItemSerializer_v313.INSTANCE, 71)
            .registerPacket(GameRulesChangedPacket.class, GameRulesChangedSerializer_v313.INSTANCE, 72)
            .registerPacket(CameraPacket.class, CameraSerializer_v313.INSTANCE, 73)
            .registerPacket(BossEventPacket.class, BossEventSerializer_v313.INSTANCE, 74)
            .registerPacket(ShowCreditsPacket.class, ShowCreditsSerializer_v313.INSTANCE, 75)
            .registerPacket(AvailableCommandsPacket.class, AvailableCommandsSerializer_v313.INSTANCE, 76)
            .registerPacket(CommandRequestPacket.class, CommandRequestSerializer_v313.INSTANCE, 77)
            .registerPacket(CommandBlockUpdatePacket.class, CommandBlockUpdateSerializer_v313.INSTANCE, 78)
            .registerPacket(CommandOutputPacket.class, CommandOutputSerializer_v313.INSTANCE, 79)
            .registerPacket(UpdateTradePacket.class, UpdateTradeSerializer_v313.INSTANCE, 80)
            .registerPacket(UpdateEquipPacket.class, UpdateEquipSerializer_v313.INSTANCE, 81)
            .registerPacket(ResourcePackDataInfoPacket.class, ResourcePackDataInfoSerializer_v313.INSTANCE, 82)
            .registerPacket(ResourcePackChunkDataPacket.class, ResourcePackChunkDataSerializer_v313.INSTANCE, 83)
            .registerPacket(ResourcePackChunkRequestPacket.class, ResourcePackChunkRequestSerializer_v313.INSTANCE, 84)
            .registerPacket(TransferPacket.class, TransferSerializer_v313.INSTANCE, 85)
            .registerPacket(PlaySoundPacket.class, PlaySoundSerializer_v313.INSTANCE, 86)
            .registerPacket(StopSoundPacket.class, StopSoundSerializer_v313.INSTANCE, 87)
            .registerPacket(SetTitlePacket.class, SetTitleSerializer_v313.INSTANCE, 88)
            .registerPacket(AddBehaviorTreePacket.class, AddBehaviorTreeSerializer_v313.INSTANCE, 89)
            .registerPacket(StructureBlockUpdatePacket.class, StructureBlockUpdateSerializer_v313.INSTANCE, 90)
            .registerPacket(ShowStoreOfferPacket.class, ShowStoreOfferSerializer_v313.INSTANCE, 91)
            .registerPacket(PurchaseReceiptPacket.class, PurchaseReceiptSerializer_v313.INSTANCE, 92)
            .registerPacket(PlayerSkinPacket.class, PlayerSkinSerializer_v313.INSTANCE, 93)
            .registerPacket(SubClientLoginPacket.class, SubClientLoginSerializer_v313.INSTANCE, 94)
            .registerPacket(WSConnectPacket.class, WSConnectSerializer_v313.INSTANCE, 95)
            .registerPacket(SetLastHurtByPacket.class, SetLastHurtBySerializer_v313.INSTANCE, 96)
            .registerPacket(BookEditPacket.class, BookEditSerializer_v313.INSTANCE, 97)
            .registerPacket(NpcRequestPacket.class, NpcRequestSerializer_v313.INSTANCE, 98)
            .registerPacket(PhotoTransferPacket.class, PhotoTransferSerializer_v313.INSTANCE, 99)
            .registerPacket(ModalFormRequestPacket.class, ModalFormRequestSerializer_v313.INSTANCE, 100)
            .registerPacket(ModalFormResponsePacket.class, ModalFormResponseSerializer_v313.INSTANCE, 101)
            .registerPacket(ServerSettingsRequestPacket.class, ServerSettingsRequestSerializer_v313.INSTANCE, 102)
            .registerPacket(ServerSettingsResponsePacket.class, ServerSettingsResponseSerializer_v313.INSTANCE, 103)
            .registerPacket(ShowProfilePacket.class, ShowProfileSerializer_v313.INSTANCE, 104)
            .registerPacket(SetDefaultGameTypePacket.class, SetDefaultGameTypeSerializer_v313.INSTANCE, 105)
            .registerPacket(RemoveObjectivePacket.class, RemoveObjectiveSerializer_v313.INSTANCE, 106)
            .registerPacket(SetDisplayObjectivePacket.class, SetDisplayObjectiveSerializer_v313.INSTANCE, 107)
            .registerPacket(SetScorePacket.class, SetScoreSerializer_v313.INSTANCE, 108)
            .registerPacket(LabTablePacket.class, LabTableSerializer_v313.INSTANCE, 109)
            .registerPacket(UpdateBlockSyncedPacket.class, UpdateBlockSyncedSerializer_v313.INSTANCE, 110)
            .registerPacket(MoveEntityDeltaPacket.class, MoveEntityDeltaSerializer_v313.INSTANCE, 111)
            .registerPacket(SetScoreboardIdentityPacket.class, SetScoreboardIdentitySerializer_v313.INSTANCE, 112)
            .registerPacket(SetLocalPlayerAsInitializedPacket.class, SetLocalPlayerAsInitializedSerializer_v313.INSTANCE, 113)
            .registerPacket(UpdateSoftEnumPacket.class, UpdateSoftEnumSerializer_v313.INSTANCE, 114)
            .registerPacket(NetworkStackLatencyPacket.class, NetworkStackLatencySerializer_v313.INSTANCE, 115)
            .registerPacket(ScriptCustomEventPacket.class, ScriptCustomEventSerializer_v313.INSTANCE, 117)
            .registerPacket(SpawnParticleEffectPacket.class, SpawnParticleEffectSerializer_v313.INSTANCE, 118)
            .registerPacket(AvailableEntityIdentifiersPacket.class, AvailableEntityIdentifiersSerializer_v313.INSTANCE, 119)
            .registerPacket(LevelSoundEvent2Packet.class, LevelSoundEvent2Serializer_v313.INSTANCE, 120)
            .registerPacket(NetworkChunkPublisherUpdatePacket.class, NetworkChunkPublisherUpdateSerializer_v313.INSTANCE, 121)
            .registerPacket(BiomeDefinitionListPacket.class, BiomeDefinitionListSerializer_v313.INSTANCE, 122)
            .build();
}