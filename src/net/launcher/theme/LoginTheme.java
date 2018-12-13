package net.launcher.theme;

import java.awt.Color;

import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.ComboboxStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.LinklabelStyle;
import net.launcher.components.PassfieldStyle;
import net.launcher.components.ServerbarStyle;
import net.launcher.components.TextfieldStyle;

public class LoginTheme
{	
	public static int			 frameW 	 = 977; 
	public static int			 frameH		 = 550;	

	public static ButtonStyle	 toAuth	     = new ButtonStyle(784, 307, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	public static ButtonStyle	 toLogout    = new ButtonStyle(618, 367, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	
	public static ButtonStyle	 toGame	     = new ButtonStyle(784, 307, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	public static ButtonStyle	 toPersonal  = new ButtonStyle(784, 367, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	public static ButtonStyle	 toOptions   = new ButtonStyle(618, 307, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	public static ButtonStyle	 toRegister  = new ButtonStyle(618, 367, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	
	public static TextfieldStyle login		= new TextfieldStyle(650, 200, 260, 50, "textfield", "font", 16F, Color.decode("#411b02"), Color.decode("#411b02"), new EmptyBorder(0, 10, 0, 10));
	public static PassfieldStyle password	= new PassfieldStyle(650, 250, 260, 50, "textfield", "font", 19F, Color.decode("#411b02"), Color.decode("#411b02"), "1", new EmptyBorder(0, 10, 0, 10));
	
	public static ComponentStyle newsBrowser= new ComponentStyle(20, 165, 370, 320, "font", 16F, Color.WHITE, true);
	public static LinklabelStyle links		= new LinklabelStyle(23, 510, 200, "font", 20F, Color.WHITE, Color.LIGHT_GRAY);
	
	public static ButtonStyle	 update_exe	= new ButtonStyle(415, 440, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	//public static ButtonStyle	 update_jar	= new ButtonStyle(275, 440, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	public static ButtonStyle    update_no	= new ButtonStyle(600, 0, 0, 0, "font", "button", 0F, Color.decode("#411b02"), true, Align.CENTER);
	
	public static ComboboxStyle	 servers	= new ComboboxStyle(650, 431, 250, 25, "font", "combobox", 14F, Color.decode("#411b02"), true, Align.CENTER);
	public static ServerbarStyle serverbar	= new ServerbarStyle(650, 470, 260, 16, "font", 15F, Color.decode("#411b02"), true);
	
	public static float fontbasesize		= 14F;
	public static float fonttitlesize		= 20F;
}