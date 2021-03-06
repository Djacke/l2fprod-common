package com.github.sarxos.l2fprod.sheet.renderer;

import java.awt.Dimension;
import java.text.NumberFormat;

import com.l2fprod.common.swing.renderer.DefaultCellRenderer;


public class DimensionRenderer extends DefaultCellRenderer {

	private static final long serialVersionUID = -777052685333950693L;

	@Override
	protected String convertToString(Object value) {
		Dimension d = (Dimension) value;
		NumberFormat format = NumberFormat.getInstance();
		String w = format.format(d.width);
		String h = format.format(d.height);
		return String.format(getLocale(), "%s \u00D7 %s", w, h);
	}

}
