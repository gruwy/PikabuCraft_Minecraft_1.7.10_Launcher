package net.launcher.theme;

import java.awt.Color;

import net.launcher.components.DragbuttonStyle;
import net.launcher.components.DraggerStyle;
import net.launcher.components.TitleStyle;

public class DraggerTheme {
	public static TitleStyle      title	    = new TitleStyle(155, 10, 180, 40, "font", 30F, Color.decode("#FFFFFF"));
	public static DragbuttonStyle dbuttons	= new DragbuttonStyle(880, 14, 35, 24, 915, 14, 35, 24, "draggbutton", true);
	public static DraggerStyle	  dragger	= new DraggerStyle(0, 0, 550, 977);
}
