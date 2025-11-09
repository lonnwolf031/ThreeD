package lonnwolf.threed.application.gui.views;

import java.beans.EventHandler;

public interface RenderView {
    void setImage();
    void updateImage();
    EventHandler needsUpdate();
}
