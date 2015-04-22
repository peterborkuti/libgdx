package hu.bp.gdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BrickGame extends Game {
	public SpriteBatch batch;
	public Texture brick;
	public Texture ladder;
	public BitmapFont font;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		brick = new Texture("brick_wall_single_perfect.png");
		ladder = new Texture("ladder.png");
		font = new BitmapFont();
		this.setScreen(new BrickScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	public void dispose() {
		batch.dispose();
		brick.dispose();
		ladder.dispose();
		font.dispose();
	}
}
