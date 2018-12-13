package net.launcher.theme;

import java.awt.Color;
import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.CheckboxStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.TextfieldStyle;

public class OptionsTheme {	
	
	public static ComponentStyle    panelOpt	= new ComponentStyle(320, 140, 400, 300, "font", 16F, Color.decode("#411b02"), true);
	
	public static CheckboxStyle		loadnews	= new CheckboxStyle(335, 182, 230, 23, "font", "checkbox", 16F, Color.decode("#411b02"), true);
        //public static CheckboxStyle		Music	        = new CheckboxStyle(147, 182, 300, 23, "font", "checkbox", 16F, Color.decode("#411b02"), true);
	public static CheckboxStyle		updatepr	= new CheckboxStyle(335, 207, 300, 23, "font", "checkbox", 16F, Color.decode("#411b02"), true);
	public static CheckboxStyle		cleandir	= new CheckboxStyle(335, 232, 300, 23, "font", "checkbox", 16F, Color.decode("#411b02"), true);
	public static CheckboxStyle		fullscrn	= new CheckboxStyle(335, 257, 300, 23, "font", "checkbox", 16F, Color.decode("#411b02"), true);
	public static CheckboxStyle		offline		= new CheckboxStyle(335, 282, 300, 23, "font", "checkbox", 16F, Color.decode("#411b02"), true);
	public static TextfieldStyle	        memory		= new TextfieldStyle(385, 307, 260, 50, "textfield", "font", 16F, Color.decode("#411b02"), Color.decode("#411b02"), new EmptyBorder(0, 10, 0, 10));
	public static ButtonStyle		close		= new ButtonStyle(455, 370, 150, 47, "font", "button", 16F, Color.decode("#411b02"), true, Align.CENTER);
	
	public static FontBundle		memoryDesc	= new FontBundle("font", 16F, Color.WHITE);
	
	public static int titleX 		= 465;
	public static int titleY 		= 165;
}