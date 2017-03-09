package Equipment;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Customization.Color;
import Customization.Form;
import Customization.Texture;
import Customization.Visual;

@ManagedBean
@RequestScoped
@SessionScoped
public class RecupererCCWBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int num = 1;
	/*ArrayList<CloseCombatWeapon> _ccw = new ArrayList<>();
	private int _weight;
	private Color _color;
	private Form _form;
	private Texture _texture;
	private Visual _visual;*/
	
	public RecupererCCWBean() {
		
	}

}
