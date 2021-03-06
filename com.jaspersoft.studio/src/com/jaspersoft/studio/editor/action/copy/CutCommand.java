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
package com.jaspersoft.studio.editor.action.copy;

import org.eclipse.gef.ui.actions.Clipboard;

import com.jaspersoft.studio.model.ANode;
import com.jaspersoft.studio.model.ICopyable;

public class CutCommand extends CopyCommand {

	@Override
	public void execute() {
		if (canExecute()) {
			for (ICopyable n : list)
				((ANode) n).setCut(true);
			Clipboard.getDefault().setContents(list);
		}
	}

}
