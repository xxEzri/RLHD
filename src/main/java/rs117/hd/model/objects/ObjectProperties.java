/*
 * Copyright (c) 2021, 117 <https://twitter.com/117scape>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package rs117.hd.model.objects;

import java.util.HashMap;
import lombok.Getter;
import rs117.hd.data.materials.Material;
import rs117.hd.data.materials.UvType;

import static net.runelite.api.ObjectID.*;

@Getter
public enum ObjectProperties
{
	NONE(Material.NONE, -1),

	// Trees
	TREES(Material.BARK, 1276, 1278, 1282, 1286, 1289, 1293, 1294, 1295, 1383, 2092, 9661, 10819, 10820, 10823, 10832, 10833, 10834, 37329),
	TREE_ROOTS(Material.BARK, 9664, 9665),
	BUSH_DEAD(Material.BARK, 1122, 4729, 5536, 13840),
	STICKS(Material.BARK, new Properties().setUvType(UvType.GROUND_PLANE), 1246, 1247),
	SWAMP_TREE_DEAD(Material.BARK, 1365, 3508, 3510, 3515,3519, 4048, 4049, 4050, 4052, 4054),
	TREE_DEAD(Material.BARK, 1282, 1283, 1284, 1285, 1286),
	TREE_FALLEN(Material.BARK, 1297, 1322, 1335, 1338, 1341, 9663),
	SWAMP_TREE_FALLEN(Material.BARK,3512, 3514),
	SWAMP_TREE(Material.BARK,1369),
	SWAMP_ROOT(Material.BARK, 1363, 1364, 1366, 1367, 1368),
	BARROWS_TREE_DEAD(Material.BARK, 4051, 4053),

	// Farming patches
	FARMING_PATCH_1(Material.DIRT_1, new Properties().setUvType(UvType.GROUND_PLANE), 7517),
	FARMING_PATCH_2(Material.GRUNGE_1, new Properties().setUvType(UvType.GROUND_PLANE), 7522),

	GRASS(Material.NONE, new Properties().setFlatNormals(true).setInheritTileColor(true), 1257, 1258, 3547, 3548, 3549, 4333, 4334, 4335, 4336, 4530, 4735, 4736, 4737, 4738, 4739, 4740, 4741, 4742, 4809, 4810, 4811, 4812, 4813, 4814, 5236, 5335, 5336, 5337, 5338, 5339, 5340, 5341, 5342, 5533, 5534, 5535, 5536, 6817, 6818, 6819, 6835, 6836, 6837, 6838, 7049, 7050, 9485, 9486, 9487, 9488, 9489, 9490, 9491, 9502, 9503, 9504, 9505, 9506, 9507, 13861, 13862, 13863, 14775, 14776, 14777, 14778, 16382, 16383, 16384, 16385, 19823, 19824, 19825, 19826, 19827, 19828, 19829, 19830, 19831, 19832, 19833, 19834, 19835, 19836, 19837, 19838, 20742, 20743, 20744, 20745, 23914, 23915, 31777, 31778, 31779, 31780, 34490, 34491, 34492),
	GRASS_MAINTAIN_ORIGINAL_COLOR(Material.NONE, new Properties().setFlatNormals(true), 16823, 16824, 16825, 16826),
	FERN(Material.NONE, new Properties().setInheritTileColor(true), 19827, 19833, 19839),

	// Wooden Fences
	WOODEN_FENCES(Material.WOOD_GRAIN,new Properties().setFlatNormals(true),  446, 814, 980, 981, 991, 992, 993, 1007, 1008, 1558, 1559, 1560, 1561, 1562, 1563, 1564, 1565, 1566, 1567, 1739, 1740, 3729, 5432, 5433, 5434, 5435, 5436, 5437, 5438, 7055,7527, 9511, 9623, 9589, 12430, 12431, 15514, 15516, 23848, 23849, 23820, 23851, 23905),
	WOODEN_FENCE_GATES(Material.WOOD_GRAIN,new Properties().setFlatNormals(true), 166, 167, 2050, 2051),

	// Wooden Railing
	WOODEN_RAILING(Material.WOOD_GRAIN,new Properties().setFlatNormals(true), 994, 3125, 9585, 23852, 23857),

	// Wooden Bridges
	WOODEN_BRIDGE(Material.WOOD_GRAIN, new Properties().setFlatNormals(true), 799, 810, 811, 812, 4256, 4257, 4258, 4259, 4262, 5239),
	LOG_STAIRS(Material.WOOD_GRAIN, new Properties().setFlatNormals(true), 42349),

	// Furniture - Probably will need custom UVs per object.
	WOODEN_FURNITURE(Material.WOOD_GRAIN,new Properties().setFlatNormals(true).setUvType(UvType.GROUND_PLANE), 593, 598, 611, 616, 1088, 1089, 1102, 1106, 1902, 4269, 4270, 4271, 4272, 4702, 5615, 9531, 9613, 9614, 9615, 9616, 9617, 9621, 11490, 12543, 12544, 15088),
	BOOKCASE(Material.BOOKCASE, new Properties().setUvType(UvType.GROUND_PLANE), 380),
	WOODEN_LADDER(Material.WOOD_GRAIN, 9558, 16450, 15116, 17026),
	WOODEN_STEPSTOOL(Material.WOOD_GRAIN, 17390),
	WOODEN_STAIRS(Material.WOOD_GRAIN, 18991),
	GNOME_BATTLEFIELD_WOOD_RAMPART(Material.WOOD_GRAIN, 824, 1864),

	// Wooden House
	WOODEN_HOUSE_WALLS(Material.WOOD_GRAIN, 11560, 11561),
	WOODEN_POSTS(Material.WOOD_GRAIN, 1870),

	// Carpet - Not sure if i want to add it; causes graphical glitches enable and see Yanille wizard tower
	CARPET(Material.CARPET, new Properties().setFlatNormals(false).setUvType(UvType.GROUND_PLANE), 917, 916, 918, 925, 926, 927, 928, 929, 930, 931, 932, 933, 937, 938, 940, 941, 942, 943, 944, 945, 976, 977, 978, 2382, 2455, 2456, 2457, 2508, 2509, 2510, 4663, 4664, 4665, 4666, 4687, 4688, 4689, 5243, 6251, 6252, 6253, 6762, 6763, 6812, 6813, 6814, 7172, 7173, 7174, 7435, 7436, 7437, 7447, 7480, 7481, 9679, 9680, 9681, 11475, 11476, 11477, 11478, 11479, 11480, 11481, 11482, 21786, 21787, 21788, 21789, 21790, 21791, 24093, 24094, 24095, 25596, 25597, 25598, 40304, 40305, 40306),

	// Mason
	GRAVESTONES_MORYTANIA(Material.ROCK_1, 5167, 5168), // Probably elsewhere, feel free to rename and expand
	MARBLE_STATUES(Material.MARBLE, 563, 574, 575, 576, 3479, 3699, 3700, 5791, 9668, 24037, 24716),
	STATUE_STONE(Material.ROCK_2, 569, 570, 17140, 17141),
	WIZARD_TOWER_BRIDGE(Material.GRUNGE_2, 12671, 12383, 12384, 12685, 12686, 12687, 12688, 12689, 12692, 12693, 12694, 12695, 12696),
	WIZARD_TOWER(Material.GRUNGE_2, 12662, 12663, 12664, 12669, 12670, 12671, 12672, 12673, 12674, 12680, 12695),
	WIZARD_TOWER_FOUNTAIN_STATUE(Material.GRUNGE_1, 879),
	REMMINGTON_WELL_BRICKS(Material.GRUNGE_1,9675, 9676, 9677, 9677),

	// Metals
	CLAY_ROCK(Material.GRAVEL_SHINY, 11362, 11363),
	ORE_TIN(Material.DIRT_SHINY_2, 11360, 11361),
	ORE_COPPER(Material.DIRT_SHINY_2, 10943, 11161),
	ORE_IRON(Material.DIRT_SHINY_2, 11364, 11365),
	ORE_COAL(Material.DIRT_SHINY_2, 11366, 11367),
	ORE_GOLD(Material.DIRT_SHINY_1, 11370, 11371),
	ORE_MITHRIL(Material.DIRT_SHINY_2, 11372, 11373),
	ORE_ADAMENTITE(Material.DIRT_SHINY_2, 11374, 11375),

	// Metal objects
	POTS_PILE(Material.BLANK_GLOSS, 5610),
	IRON_BARS(Material.BLANK_SEMIGLOSS, 24097),
	GOLDEN_CANDELABRA(Material.BLANK_SEMIGLOSS, 203),
	ARMOR_STANDS_METAL(Material.BLANK_SEMIGLOSS, 817),
	GROUND_ARMOR(Material.BLANK_SEMIGLOSS, 825, 827),

	// Lumbridge
	LUMBRIDGE_CASTLE_WALLS(Material.NONE, new Properties().setFlatNormals(true), 1651, 1911, 1912, 1913),

	// Varrock fountain floor
	VARROCK_FOUNTAIN_FLOOR(Material.GRUNGE_1, new Properties().setFlatNormals(true).setUvType(UvType.GROUND_PLANE), 7149, 7150, 7151, 7152, 7153),
	VARROCK_FOUNTAIN_STATUE(Material.GRUNGE_1, 7144),
	VARROCK_KNIGHT_STATUE(Material.MARBLE_1_SEMIGLOSS, 3642),
	// Grand Exchange
	GRAND_EXCHANGE_FLOOR(Material.GRUNGE_2, new Properties().setFlatNormals(true).setUvType(UvType.GROUND_PLANE), 9371, 10689, 10690, 10691, 10692, 10693, 10694, 10695, 10696, 10699, 10700, 10701, 10702, 10703, 10704, 10705, 10706, 10711, 10712, 10713, 11703, 11704, 11705, 11706, 11707, 11708, 11709, 11710, 11711, 11712, 11713, 11714, 11715, 11716, 11717, 15810, 16010, 16155),
	GRAND_EXCHANGE_WALL(Material.GRUNGE_1, new Properties().setFlatNormals(true), 23755, 23775, 23776, 23777, 23778, 23779, 23795, 23810, 23811),
	GRAND_EXCHANGE_CLAN_PORTAL(Material.GRUNGE_1, new Properties().setFlatNormals(true), 41724),
	WORN_CINDERBLOCK_WALL(Material.GRUNGE_1, new Properties().setFlatNormals(true), 436, 441, 443, 450, 455, 462, 477, 490, 493, 494, 495, 496, 497, 500, 501, 504, 505, 506, 511, 512, 517, 519, 520, 9269, 9265, 9264, 23734, 23735, 23736, 23737, 23738, 23739, 23740, 23741, 23742, 23743, 23744, 23745, 23746, 23747, 23757, 23758, 23759, 23775, 23780, 23783, 23784, 23794, 23797, 23801, 23802, 23803, 23804, 23805, 23806, 23807, 23809, 23810, 23811, 23812, 23813, 23814, 23815, 23816, 23817, 23818, 23819, 23820, 23821, 23822, 23823, 23824, 23825, 23826, 23827, 23828, 23829, 23835, 23836, 23837, 23838, 23839, 23840, 23841, 23842, 23843, 23844, 23859, 23860, 23861, 23862, 23863, 23864, 23865, 23874, 23875, 23876, 23877, 23878, 23879, 23880, 23881, 23882, 23883, 23884, 23885, 23907, 23908, 23909, 23910, 24428, 40285),

	VARROCK_RATCATCHERS_MANHOLE(Material.DIRT_2, new Properties().setFlatNormals(true), 10321),

	// Falador
	FALADOR_WALLS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 23982, 23983, 23984, 23985, 23986, 23987, 23988, 23989, 23990, 23991, 23992, 23993, 23997, 23999, 24026, 24029, 24033, 24034, 24035, 24119, 24125, 24127, 24128, 24131, 24132, 24134, 24135, 24137, 24175, 24176, 24183, 24184, 24185, 24186, 24188, 24191, 24198, 24199, 24200, 24203, 24206, 24207, 24210, 24211, 24212, 24213, 24215, 24220, 24221, 24222, 24227, 24235, 24242, 24245, 24246, 24247, 24260, 24261, 24262, 24264, 24273, 24274, 23744, 23806, 23826, 23834, 23835, 23836, 23837, 23838, 23839, 23841, 23844, 23994, 23995, 23996, 23998, 24027, 24028, 24030, 24031, 24032, 24115, 24116, 24120, 24178, 24180, 24182, 24189, 24193, 24194, 24195, 24196, 24236, 24237, 24238, 24239, 24243, 24244, 24256, 24266, 24267, 24268, 24269, 24270, 24271, 24272),
	FALADOR_MINES_TORCH_WALL(Material.GRUNGE_1, new Properties(), 1422),
	FALADOR_FURNITURE(Material.WOOD_GRAIN, 7331, 7388, 24025, 24077, 24078,24080, 24081, 24082, 24083, 24084, 24086, 24079, 24089, 24090, 24107, 40097, 900908),
	STATUE_OF_SARADOMIN_1(Material.MARBLE_1_SEMIGLOSS, 24043, 24044),
	STONE_SIGNPOST(Material.GRUNGE_1, 23970, 23971),
	FALADOR_STEPS_1(Material.GRUNGE_1, new Properties().setFlatNormals(true), 7386, 7387, 10729, 10730, 10731, 23885),
	FALADOR_UNKNOWN_1(Material.GRUNGE_1, 24022, 24023, 24024),

	// Port Sarim
	PORT_SARIM_DOCK(Material.GRUNGE_2, 9413, 9541, 9542),
	PORT_SARIM_DOCK_RAILS(Material.WOOD_GRAIN, 9539),

	// Port Khazard
	PORT_KHAZARD_DOCK(Material.GRUNGE_2, 796, 800, 801, 802, 803),

	// Goblin Village
	GOBLIN_VILLAGE_LOGS(Material.BARK, 12275, 23332, 23333, 23334, 23335, 23336, 23337),
	GOBLIN_VILLAGE_WOOD(Material.WOOD_GRAIN,12416, 12429, 12436, 12437, 12439, 12441, 23320, 23321),
	// Al Kharid
	AL_KHARID_WALLS(Material.NONE, new Properties().setFlatNormals(true), 1415, 1416, 21799, 33348),
	// Citharede Abbey
	CITHAREDE_ABBEY_WALLS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 39725, 39726, 39727, 39728, 39729, 39730, 39731, 39732, 39733, 39734, 39735, 39736, 39737, 39738, 39739, 39740),

	// Seers Village
	SEERS_COURTHOUSE_WALLS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 25966, 25967, 25969, 25970, 25971, 25972, 25973, 25974, 25975, 25978, 25979, 25980, 25981, 26010),
	SEERS_BUILDING_WALLS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 25753, 25755, 25756, 25757, 25890, 25896, 25897, 25898, 25899, 25901, 25902, 25904, 25957, 25958, 25959, 25960, 25961, 25962, 25963, 25964, 25965, 25905),


	SEERS_FENCE_WHITE(Material.WOOD_GRAIN, 25760),
	// Stone walls (north of Falador)
	STONE_WALL(Material.GRUNGE_1, new Properties().setFlatNormals(true), 979 , 5566, 5567, 5568, 5569, 5570),

	// Temple of Ikov
	STATUE_OF_A_WARRIOR_1(Material.MARBLE_2_GLOSS, 562, 566),

	// Karamja
	KARAMJA_DUNGEON_WALLS(Material.GRUNGE_1, 1428, 21719, 21725, 21726, 21729, 21730, 21736, 21737),

	// TzHaar
	TZHAAR_ROCK_GRADIENT(Material.ROCK_1, new Properties().setTzHaarRecolorType(TzHaarRecolorType.GRADIENT), 11818, 11819, 11820, 11821, 11822, 11823, 11824, 11825, 11826, 11827, 11828, 11829, 11833, 11834, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11971, 11972, 11973, 11974, 11981, 11983, 11984, 11985, 30269, 30270, 30271, 30272, 30273, 41013),
	TZHAAR_GRADIENT(Material.NONE, new Properties().setTzHaarRecolorType(TzHaarRecolorType.GRADIENT), 11847, 11848, 11849, 11850, 11982),
	TZHAAR_ROCK_HUESHIFT(Material.ROCK_1, new Properties().setTzHaarRecolorType(TzHaarRecolorType.HUE_SHIFT), 26723, 26724, 26725, 30263, 30264, 30265),

	// Ape Atoll
	APE_ATOLL_DUNGEON_WALLS(Material.GRUNGE_1, 4898),

	// Zeah
	SHAYZIEN_SHAY_SHRINE(Material.MARBLE_3_GLOSS, CAT_SHRINE),
	SHAYZIEN_HERO_STATUE(Material.GRUNGE_1, DRAGON_STATUE),
	SHAYZIEN_DRAGON_STATUE(Material.MARBLE_2_GLOSS, SHAYZIEN_STATUE_42178),
	SHAYZIEN_GRAVE(Material.GRUNGE_1, GRAVE_28451),
	SHAYZIEN_CEREMONIAL_PILLAR(Material.BLANK_GLOSS, new Properties().setFlatNormals(true), CEREMONIAL_PILLAR, CEREMONIAL_PILLAR_42168, CEREMONIAL_PILLAR_42169, CEREMONIAL_PILLAR_42170, CEREMONIAL_PILLAR_42171, CEREMONIAL_PILLAR_42172, CEREMONIAL_PILLAR_42173, CEREMONIAL_PILLAR_42174, CEREMONIAL_PILLAR_42175, CEREMONIAL_PILLAR_42176, CEREMONIAL_PILLAR_42177, CEREMONIAL_PILLAR_42179, CEREMONIAL_PILLAR_42180),
	SHAYZIEN_WALLS_ROCK(Material.ROCK_1, new Properties().setFlatNormals(true), 14543, 14544, 14545, 14546, 14547, 14548, 14549, 14550, 14551, 14558, 42110, 42111, 42116),
	SHAYZIEN_WALLS_WOOD(Material.GRUNGE_1, new Properties().setFlatNormals(true), 42107, 42108, 42109, 42112, 42113),
	SHAYZIEN_STAIRS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 42193, 42195, 42196),
	STATUE_BUST(Material.MARBLE_1_GLOSS, 26129),

	// Castle Wars
	CASTLE_WARS_WALLS(Material.NONE, new Properties().setFlatNormals(true), 1620, 1622, 1631, 4409, 4410, 4445, 4446, 4447, 4908),
	CASTLE_WARS_UNDERGROUND_WALLS(Material.GRUNGE_1, 1417, 1434, 1435, 4448, 27122), // Is also other underground walls
	CASTLE_WARS_UNDERGROUND_ROCKS(Material.GRUNGE_1, 314, 315, 316, 317, 318, 319, 320, 321),
	CASTLE_WARS_DECORATION(Material.NONE, new Properties().setFlatNormals(true), 4435, 4436),

	// Morytania
	MORYTANIA_SLAYER_TOWER_WALLS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 2114, 2160, 2161, 2162, 2163, 2164, 2165, 2166, 2167, 2168, 2169, 2170, 2171, 2172, 2173, 2173, 4332),
	CANIFIS_AGILITY_COURSE_TREE(Material.BARK,14843),
	MORYTANIA_GRAVEMOUNDS(Material.DIRT_1, 4136, 4137),
	//MORYTANIA_SWAMP_MARQUIS_BRIDGE_POST(Material.BARK, 5002, 5003, 26245, 26246, 26247), // Does not actually fully apply.
	MORYTANIA_SWAMP_MARQUIS_TREE(Material.BARK, 5045), // Needs a proper UV Map
	MORITANIA_WELL_STONES(Material.CONCRETE, 20735, 20736),
	MORYTANIA_RUNDOWN_HOUSE_WALLS(Material.WOOD_GRAIN, 5240, 5241, 5245, 20774, 20775),
	MORYTANIA_RUNDOWN_DOORS(Material.WOOD_GRAIN, 20773),
	MORYTANIA_BARROWS_BRIDGE_RAILING(Material.WOOD_GRAIN, 5236),
	MORYTANIA_HAUNTED_MINE_LARGE_ROCKS(Material.ROCK_1, 15806, 15807, 15808),
	MORYTANIA_NATURE_SPIRIT_GROTTO_RAILING(Material.WOOD_GRAIN, new Properties().setFlatNormals(true),3524),
	MORYTANIA_NATURE_SPIRIT_GROTTO_BRIDGE(Material.WOOD_GRAIN, 3522),
	MORYTANIA_NATURE_SPIRIT_GROTTO_STONES(Material.ROCK_1, 3527, 3528, 3529),

	// Theatre of Blood
	TOB_VERZIK_TILE_FLOOR(Material.BLANK_SEMIGLOSS, 32719, 32720, 32721, 32722, 32723, 32724, 32725, 32726, 32727, 32728),

	// Chambers of Xeric
	COX_OUTSIDE_RUINS(Material.GRUNGE_1, new Properties().setFlatNormals(true), 29921, 29922, 29923, 29924, 29925, 29926, 29927, 29928, 29929, 29930, 29931, 29932, 29933, 29934, 29935, 29936, 29937, 29938, 29939, 29940, 29941, 29942, 29943),
	COX_PILLAR(Material.GRUNGE_1, new Properties().setFlatNormals(true), 29806, 29807, 29808, 29809, 29810),

	// Ground decoration rocks
	GROUND_DECORATION_TAN_ROCK(Material.DIRT_1, new Properties().setInheritTileColor(true),  7107),

	// environment rock objects such as piles of rocks, stalagmites, or rock like structures.
	ROCK_LIKE_OBJECT(Material.ROCK_1, new Properties().setInheritTileColor(true),84, 179, 184, 185, 186, 322, 323, 329, 330, 331, 335, 336, 337, 3169, 3170, 3171, 3172, 3173, 3634, 3635, 3636, 3637, 3638, 3639, 3702, 3703, 3704, 3705, 3706, 3707, 3708, 3709, 3710, 3711, 3720, 3948 , 3950, 3440, 5203, 5204, 5205, 5324, 5325, 5326, 5327, 5328, 5329, 5519, 5520, 5521, 5950, 5953, 7057, 7103, 7104, 11438, 11439, 11440, 15801, 15802, 15803, 15798, 20750, 20777, 20778, 20779 ,20751, 22541, 22542, 22543, 25077,25078,25079,25080,25081,25082,25083,25084,25085,25086, 25102, 25103, 25104, 25105, 25106, 25107, 25108, 25109, 25110, 25112, 25113, 25114, 25161),
	SANDSTONE_LIKE_OBJECT(Material.ROCK_2,728, 729, 730, 3204, 3614, 3615),
	DIRT_LIKE_OBJECT(Material.DIRT_2,  new Properties().setInheritTileColor(true),314, 315, 316, 319, 320, 321, 324, 325, 326, 340, 3949, 4339, 4340, 4341, 4342, 4343, 4344, 7105, 7106, 7120, 7121, 7122, 7123, 7124, 7125, 7126, 9763, 6973, 9674),
	WHITE_ROCK(Material.ROCK_2, 11436, 11437),

	WILDERNESS_DITCH(Material.DIRT_1, new Properties().setFlatNormals(true), 23261, 23262 ,23263, 23264, 23265, 23266, 23267, 23268, 23272, 23273),

	// Wall decorations
	WALL_DECORATION_TAN_ROCK(Material.ROCK_1,  1453),
	CASTLE_WINDOWS(Material.ROCK_1, 1646,1938),

	// Game object rocks
	GAME_OBJECT_EMPTY_ROCK(Material.ROCK_1, 11390, 11391),
	GAME_OBJECT_WHITE_ROCK(Material.ROCK_1, 11432, 11433, 11434, 11435),
	GAME_OBJECT_DESERT_ROCK(Material.ROCK_2, 11190, 11191, 11192, 11193, 18892, 18893, 18894, 18895, 26640, 26641, 39742, 39743, 39744, 39745, 39746, 39747),
	GAME_OBJECT_GREY_ROCK(Material.ROCK_2, 3658, 3659, 3660, 3661, 3714, 3716, 3717, 3718, 3794, 3805, 3806, 3807, 3808, 12591, 12592, 12593, 12594, 28987, 29918),
	GAME_OBJECT_TAN_ROCK(Material.ROCK_2, 10782, 10783, 10784, 10785, 11604, 11605, 12582, 12583, 12584, 12585),
	GAME_OBJECT_DIRT_ROCK(Material.DIRT_2, new Properties().setInheritTileColor(true), 9662, 9669, 9670, 9671, 11931, 11932, 11933, 11934, 18478, 18478),

	// Cave Walls
	ROCK_CAVE_ENTRANCES(Material.ROCK_2, new Properties().setFlatNormals(true), 3735, 6659, 11835, 29627),
	DIRT_CAVE_ENTRANCES(Material.DIRT_2, new Properties().setFlatNormals(true), 30177, 40887),
	CAVE_WALLS_BLEND(Material.ROCK_2, new Properties().setFlatNormals(true).setUvType(UvType.GROUND_PLANE), 17211, 17210, 17215, 17216, 17217,25049,25050, 25051, 25052,25053,25054,25055,25056,25052, 25059,25060, 25061,25062, 25063,25064,29634),
	CAVE_WALL_OPENINGS(Material.GRUNGE_1, new Properties().setFlatNormals(true),5046, 12770, 43759),
	CAVE_WALL_ABOVE_FLOOR_TILE(Material.ROCK_2, new Properties().setFlatNormals(true).setUvType(UvType.GROUND_PLANE), 17224, 25057, 25058,1459,6628,176, 177,178),

	// All Lumbridge wall IDs
	LUMBRIDGE_CAVE_WALLS(Material.ROCK_2, new Properties().setFlatNormals(true), 5912, 5913, 5914, 5915, 5916, 5917, 5918, 5919, 5920, 5921, 5922, 5923, 5924, 5925, 5926, 5927, 5928, 5929, 5930, 5931, 5932, 5933, 5934, 5935, 5936, 5937, 5938, 5939, 5940, 5941, 5942, 5943, 5944,6903,6925,6927,6929,6930,6931,6932,6933,6939,6940),

	// kinda glitchy until new water is implemented..
	// BLOOD_STAINS(Material.BLOOD, new Properties().setFlatNormals(true), 653, 652, 654),

	// Agility shortcuts
	ABILITY_WOODEN_LOGS(Material.BARK, new Properties().setFlatNormals(true), 16546, 16547, 16548),
	AGILITY_FENCE_HOLE(Material.WOOD_GRAIN, new Properties().setFlatNormals(true), 12776),
	AGILITY_STEPPING_STONES(Material.ROCK_1, new Properties().setFlatNormals(true), 13504), // Does not work for animations
	AGILITY_CLIMBING_ROCKS(Material.ROCK_1, new Properties().setFlatNormals(true), 16549, 16550, 19551, 16998, 16999, 19849, 19850),


	// Unknown
	UNKNOWN_1(Material.GRUNGE_1, new Properties().setFlatNormals(true), 677),
	UNKNOWN_2(Material.NONE, new Properties().setFlatNormals(true), 1602, 2569, 3089, 3090, 3091, 3096, 3097, 3102, 3103, 3111, 3112, 3113, 3114, 3192, 10748, 10767, 10770),
	UNKNOWN_3(Material.GRUNGE_1, 2141, 3669, 3714, 3737, 3738, 3759, 3760, 3770, 3772, 3773, 3774, 3805, 3806, 3807, 3808, 3812, 6820, 6822, 6826, 6827),
	UNKNOWN_4(Material.NONE, new Properties().setFlatNormals(true), 39617),
	UNKNOWN_5(Material.GRUNGE_1, 29032),
	UNKNOWN_6(Material.NONE, new Properties().setFlatNormals(true), 436, 441, 443, 455, 458, 461, 462, 477),
	UNKNOWN_7(Material.GRUNGE_1, 679),
	UNKNOWN_8(Material.NONE, new Properties().setFlatNormals(true), 10743, 10744, 10749, 10750, 10769, 17349),
	UNKNOWN_9(Material.NONE, new Properties().setFlatNormals(true), 3110, 3174),
	UNKNOWN_10(Material.GRUNGE_1, 3709, 3724, 3803, 3804, 3948, 3950),

	;

	private final int[] id;
	private final Material material;
	private final boolean flatNormals;
	private final UvType uvType;
	private final TzHaarRecolorType tzHaarRecolorType;
	private final boolean inheritTileColor;

	private static class Properties
	{
		private boolean flatNormals = false;
		private UvType uvType = UvType.GEOMETRY;
		private TzHaarRecolorType tzHaarRecolorType = TzHaarRecolorType.NONE;
		private boolean inheritTileColor = false;

		public Properties setFlatNormals(boolean flatNormals)
		{
			this.flatNormals = flatNormals;
			return this;
		}

		public Properties setUvType(UvType uvType)
		{
			this.uvType = uvType;
			return this;
		}

		public Properties setTzHaarRecolorType(TzHaarRecolorType tzHaarRecolorType)
		{
			this.tzHaarRecolorType = tzHaarRecolorType;
			return this;
		}

		public Properties setInheritTileColor(boolean inheritTileColor)
		{
			this.inheritTileColor = inheritTileColor;
			return this;
		}
	}

	ObjectProperties(Material material, int... ids)
	{
		this.id = ids;
		this.material = material;
		this.flatNormals = false;
		this.uvType = UvType.GEOMETRY;
		this.tzHaarRecolorType = TzHaarRecolorType.NONE;
		this.inheritTileColor = false;
	}

	ObjectProperties(Material material, Properties properties, int... ids)
	{
		this.id = ids;
		this.material = material;
		this.flatNormals = properties.flatNormals;
		this.uvType = properties.uvType;
		this.tzHaarRecolorType = properties.tzHaarRecolorType;
		this.inheritTileColor = properties.inheritTileColor;
	}

	private static final HashMap<Integer, ObjectProperties> OBJECT_ID_MAP;

	static
	{
		OBJECT_ID_MAP = new HashMap<>();
		for (ObjectProperties objectProperties : values())
		{
			for (int id : objectProperties.id)
			{
				OBJECT_ID_MAP.put(id, objectProperties);
			}
		}
	}

	public static ObjectProperties getObjectProperties(int objectId)
	{
		return OBJECT_ID_MAP.getOrDefault(objectId, ObjectProperties.NONE);
	}
}
