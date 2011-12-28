package wecui.render.region;

import wecui.InitializationFactory;
import wecui.WorldEditCUI;

/**
 * Base region storage class. Provides
 * abstract methods for setting various
 * points in the region. 
 * 
 * @author yetanotherx
 * @author lahwran
 */
public abstract class BaseRegion implements InitializationFactory {

    protected WorldEditCUI controller;

    public BaseRegion(WorldEditCUI controller) {
        this.controller = controller;
    }

    @Override
    public void initialize() {
    }

    public abstract void render();

    public void setCuboidPoint(int id, int x, int y, int z) {
    }

    public void setPolygonPoint(int id, int x, int z) {
    }

    public void setEllipsoidCenter(int x, int y, int z) {
    }

    public void setEllipsoidRadii(double x, double y, double z) {
    }

    public void setPolygonMinMax(int min, int max) {
    }

    public abstract RegionType getType();
}