/*
 * Copyright (C) 2024 CrowdWare
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

import kotlinx.coroutines.CoroutineDispatcher
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

expect fun ioDispatcher(): CoroutineDispatcher

expect fun getMatchRange(matchGroup: MatchGroup?): IntRange

expect fun createCodeBlockRegex(): Regex
