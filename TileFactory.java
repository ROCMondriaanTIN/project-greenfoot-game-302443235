
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
    tile = new Tile("snow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 1:
    tile = new Tile("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 2:
    tile = new Tile("spring.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 3:
    tile = new Tile("sprung.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 4:
    tile = new Tile("switchBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 5:
    tile = new Tile("switchBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 6:
    tile = new Tile("switchGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 7:
    tile = new Tile("switchGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 8:
    tile = new Tile("switchRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 9:
    tile = new Tile("switchRed_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 10:
    tile = new Tile("switchYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 11:
    tile = new Tile("switchYellow_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 12:
    tile = new Tile("torch1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 13:
    tile = new Tile("torch2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 14:
    tile = new Tile("torchOff.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 15:
    tile = new Tile("water.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 16:
    tile = new Tile("waterTop_high.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 17:
    tile = new Tile("waterTop_low.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 18:
    tile = new Tile("weight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 19:
    tile = new Tile("weightAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 20:
    tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 21:
    tile = new Tile("bomb.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 22:
    tile = new Tile("bombWhite.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 23:
    tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 24:
    tile = new Tile("boxCoin_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 25:
    tile = new Tile("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 26:
    tile = new Tile("boxCoin_disabled_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 27:
    tile = new Tile("boxCrate.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 28:
    tile = new Tile("boxCrate_double.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 29:
    tile = new Tile("boxCrate_single.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 30:
    tile = new Tile("boxCrate_warning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 31:
    tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 32:
    tile = new Tile("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 33:
    tile = new Tile("boxExplosive_used.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 34:
    tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 35:
    tile = new Tile("boxItem_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 36:
    tile = new Tile("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 37:
    tile = new Tile("boxItem_disabled_boxed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 38:
    tile = new Tile("brickBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 39:
    tile = new Tile("brickGrey.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 40:
    tile = new Tile("bridgeA.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 41:
    tile = new Tile("bridgeB.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 42:
    tile = new Tile("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 43:
    tile = new Tile("cactus.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 44:
    tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 45:
    tile = new Tile("doorClosed_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 46:
    tile = new Tile("doorClosed_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 47:
    tile = new Tile("doorOpen_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 48:
    tile = new Tile("doorOpen_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 49:
    tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 50:
    tile = new Tile("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 51:
    tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 52:
    tile = new Tile("ladderMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 53:
    tile = new Tile("ladderTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 54:
    tile = new Tile("lava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 55:
    tile = new Tile("lavaTop_high.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 56:
    tile = new Tile("lavaTop_low.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 57:
    tile = new Tile("leverLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 58:
    tile = new Tile("leverMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 59:
    tile = new Tile("leverRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 60:
    tile = new Tile("lockBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 61:
    tile = new Tile("lockGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 62:
    tile = new Tile("lockRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 63:
    tile = new Tile("lockYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 64:
    tile = new Tile("mushroomBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 65:
    tile = new Tile("mushroomRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 66:
    tile = new Tile("plantPurple.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 67:
    tile = new Tile("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 68:
    tile = new Tile("sign.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 69:
    tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 70:
    tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 71:
    tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 73:
    tile = new Tile("stoneHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 74:
    tile = new Tile("stoneHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 75:
    tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 76:
    tile = new Tile("stoneRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 77:
    tile = new Tile("stone.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 78:
    tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 79:
    tile = new Tile("stoneCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 80:
    tile = new Tile("stoneCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 81:
    tile = new Tile("stoneCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 82:
    tile = new Tile("stoneCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 83:
    tile = new Tile("stoneCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 84:
    tile = new Tile("stoneHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 85:
    tile = new Tile("stoneHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 86:
    tile = new Tile("stoneHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 87:
    tile = new Tile("stoneHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 88:
    tile = new Tile("grassCliff_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 89:
    tile = new Tile("grassCliffAlt_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 90:
    tile = new Tile("grassCliffAlt_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 91:
    tile = new Tile("grassCorner_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 92:
    tile = new Tile("grassCorner_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 93:
    tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 94:
    tile = new Tile("grassHalf_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 95:
    tile = new Tile("grassHalf_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 96:
    tile = new Tile("grassHalf_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 97:
    tile = new Tile("grassHill_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 98:
    tile = new Tile("grassHill_right.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 99:
    tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 100:
    tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 101:
    tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 102:
    tile = new Tile("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 103:
    tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 104:
    tile = new Tile("grassCenter_round.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
case 105:
    tile = new Tile("grassCliff_left.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
    tile.isSolid = true;
    break;
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}
