package com.icicles;

/**
 * Created by samue_000 on 12/3/2016.
 */

public class Player {
    public static final String TAG = Player.class.getName();

    Vector2 position;

    Viewport viewport;

    public Player(Viewport viewport) {
        this.viewport = viewport;
        init();
    }

    public void init() {
        position = new Vector2(viewport.getWorldWidth / 2, Constants.PLAYER_HEAD_HEIGHT);
    }

    public void Renderer(ShapeRenderer renderer) {
        renderer.setColor(Constants.PLAYER_COLOR);
    }




}
