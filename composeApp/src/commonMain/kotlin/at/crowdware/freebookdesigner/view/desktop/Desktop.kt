/*
 * Copyright (C) 2025 CrowdWare
 *
 * This file is part of FreeBookDesigner.
 *
 *  FreeBookDesigner is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  FreeBookDesigner is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeBookDesigner.  If not, see <http://www.gnu.org/licenses/>.
 */

package at.crowdware.freebookdesigner.view.desktop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import at.crowdware.nocode.model.NodeType
import at.crowdware.nocode.model.TreeNode
import at.crowdware.nocode.theme.ExtendedTheme
import at.crowdware.nocode.view.desktop.mobilePreview
import at.crowdware.nocode.view.desktop.projectStructure
import at.crowdware.nocode.view.desktop.propertyPanel
import at.crowdware.nocode.view.desktop.syntaxEditor
import at.crowdware.nocode.viewmodel.GlobalProjectState


@Composable
fun desktop() {
    val currentProject = GlobalProjectState.projectState
    var textFieldValue by remember { mutableStateOf(currentProject?.currentFileContent ?: "") }

    LaunchedEffect(currentProject?.currentFileContent) {
        textFieldValue = currentProject?.currentFileContent ?: ""
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = MaterialTheme.colors.primary)
    ) {
        toolbar(currentProject)
        if (currentProject?.isProjectStructureVisible == true || currentProject?.extension == "md")
            projectStructure(currentProject)
        //else
        //widgetPalette(currentProject)
        syntaxEditor(
            currentProject, textFieldValue = textFieldValue as TextFieldValue
        ) { newValue ->
            textFieldValue = newValue
            currentProject?.currentFileContent = newValue
        }
        mobilePreview(currentProject)
        propertyPanel(currentProject)
    }
}