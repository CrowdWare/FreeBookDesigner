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

package at.crowdware.freebookdesigner.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import at.crowdware.freebookdesigner.theme.ExtendedTheme
import at.crowdware.freebookdesigner.viewmodel.GlobalAppState
import at.crowdware.freebookdesigner.viewmodel.GlobalProjectState
import at.crowdware.freebookdesigner.viewmodel.LicenseType


@Composable
fun createCourseDialog(
    folder: TextFieldValue,
    onFolderChange: (TextFieldValue) -> Unit,
    onDismissRequest: () -> Unit,
    onCreateRequest: () -> Unit
) {
    if(GlobalAppState.appState?.licenseType == LicenseType.UNDEFINED) {
        AlertDialog(
            onDismissRequest = onDismissRequest,
            title = {
                Text(text = "License")
            },
            text = {
                Column {
                    Text(text = "No License key entered.\nPlease open settings and enter a valid license key.\nYou can get the license key on our website.")
                    ClickableText(text = "https://freebook.crowdware.at/abo.html", url = "https://freebook.crowdware.at/abo.html")
                }
            },
            confirmButton = {
                Button(
                    onClick = onDismissRequest
                ) {
                    Text("Cancel")
                }
            })
    } else {
        AlertDialog(
            onDismissRequest = onDismissRequest,
            title = {
                Text(text = "Create Course")
            },
            text = {
                InputRow(label = "Folder:", value = folder, onValueChange = onFolderChange, hasIcon = true)
            },
            confirmButton = {
                Button(
                    onClick = onDismissRequest
                ) {
                    Text("Cancel")
                }
                Button(
                    enabled = folder.text.isNotEmpty(),
                    onClick = onCreateRequest,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = ExtendedTheme.colors.accentColor,
                        contentColor = ExtendedTheme.colors.onAccentColor
                    )
                ) {
                    Text("Create")
                }
            }
        )
    }
}