package com.icicles;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by samue_000 on 12/3/2016.
 */

public class Icicle {

    public static final String TAG = Icicle.class.getName();

    Vector2 position;

    public Icicle(Vector2 position) {
        this.position = position;
    }

    public void render (ShapeRenderer renderer) {
        renderer.setColor(Constants.ICICLE_COLOR);
        renderer.set(ShapeRenderer.ShapeType.Filled);
        renderer.triangle(
                position.x, position.y,
                position.x - Constants.ICICLES_WIDTH / 2, position.y + Constants.ICICLES_HEIGHT,
                position.x + Constants.ICICLES_WIDTH / 2, position.y + Constants.ICICLES_HEIGHT
        );
    }
}
