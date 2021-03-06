/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.crosstab.property;

import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabColumnGroup;

import org.eclipse.swt.widgets.Composite;

import com.jaspersoft.studio.components.crosstab.messages.Messages;
import com.jaspersoft.studio.properties.view.TabbedPropertySheetPage;
import com.jaspersoft.studio.property.section.AbstractSection;

public class CrosstabColumnGroupSection extends AbstractSection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ITabbedPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		parent = getWidgetFactory().createSection(parent, "Column", false, 2);

		createWidget4Property(parent,
				JRDesignCrosstabColumnGroup.PROPERTY_POSITION);
		createWidget4Property(parent,
				JRDesignCrosstabColumnGroup.PROPERTY_HEIGHT);

	}
	
	@Override
	protected void initializeProvidedProperties() {
		super.initializeProvidedProperties();
		addProvidedProperties(JRDesignCrosstabColumnGroup.PROPERTY_POSITION, Messages.MColumnGroup_column_position);
		addProvidedProperties(JRDesignCrosstabColumnGroup.PROPERTY_HEIGHT, Messages.common_height);
	}
}
