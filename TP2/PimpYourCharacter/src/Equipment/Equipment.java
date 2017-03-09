package Equipment;

import Customization.*;

public abstract class Equipment {

	private Color _color;
	private Form _form;
	private Texture _texture;
	private Visual _visual;

	public Color getColor() {
		return this._color;
	}

	public Form getForm() {
		return this._form;
	}

	public Texture getTexture() {
		return this._texture;
	}

	public Visual getVisual() {
		return this._visual;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this._color = color;
	}

	/**
	 * 
	 * @param form
	 */
	public void setForm(Form form) {
		this._form = form;
	}

	/**
	 * 
	 * @param texture
	 */
	public void setTexture(Texture texture) {
		this._texture = texture;
	}

	/**
	 * 
	 * @param visual
	 */
	public void setVisual(Visual visual) {
		this._visual = visual;
	}

}